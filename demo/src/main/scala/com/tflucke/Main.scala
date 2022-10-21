package com.tflucke

import com.tflucke.sortable.Sortable
import org.scalajs.dom.document
import org.scalajs.dom.raw.HTMLInputElement
import scala.concurrent.ExecutionContext.global
import scala.scalajs.js.timers.setTimeout

object Main {
  implicit val ctx = global

  def main(args: Array[String]): Unit = {
    simple()
  }

  def simple() = {
    Sortable.create(document.getElementById("simple-sortable"))
  }
}
