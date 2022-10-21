val VersionSuffix = Option(System.getenv("VERSION_SUFFIX")).getOrElse("")

lazy val compileDemo = taskKey[Unit]("Compile a demo web site.")

lazy val root = project.in(file("."))
  .aggregate(
    sortable,
    demo
  ).settings(
    crossScalaVersions := Nil,
    publish / skip := true,
    
    compileDemo := Def.sequential(sortable / fastOptJS, sortabledemo / fastOptJS).value
  )

def commonSettings = Seq(
  organization := "com.tflucke",
  //maintainer := "Thomas Flucke <admin@tflucke.name>",
  scalacOptions ++= Seq(
    "-deprecation",
    "-unchecked",
    "-feature"
  ),
  crossScalaVersions := Seq("2.13.3", "2.12.11")
)

lazy val sortable = (project in file("sortable"))
  .settings(commonSettings)
  .settings(
    name := "sortablejs-facade",
    version := s"1.13.0$VersionSuffix",
    libraryDependencies ++= (if (scalaJSVersion.startsWith("0.6.")) Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.8"
    ) else Seq(
      "org.scala-js" %%% "scalajs-dom" % "1.0.0"
    )),
    libraryDependencies += "org.querki" %%% "querki-jsext" % "0.10"
  ).enablePlugins(ScalaJSPlugin)

lazy val demo = (project in file("demo"))
  .settings(commonSettings)
  .settings(
    scalaJSUseMainModuleInitializer := true,
    name := "sortablejs-facade-demo",
    version := s"0.1.0$VersionSuffix",
    publish / skip := true
  ).dependsOn(sortable)
  .enablePlugins(ScalaJSPlugin)
