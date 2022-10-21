package com.tflucke.sortable

import scala.scalajs.js
import org.querki.jsext._

@js.native
trait SortableStore extends js.Object {
  /** Get the order of elements. Called once during initialization.
    */
  val get: js.Function1[Sortable, Any]

  /** Save the order of elements. Called onEnd (when the item is dropped).
    */
  val set: js.Function1[Sortable, js.Array[String]]
}
