package com.tflucke.sortable

import scala.scalajs.js
import scala.scalajs.js.`|`
import org.querki.jsext._
import SortableTypes._

@js.native
trait GroupOptions extends js.Object {
  import GroupOptions.Allowable

  /** Group name
    */
  var name: String = js.native

  /** Ability to move from the list. clone — copy the item, rather than move. Or a
    * array of group names which the elements may be put in. Defaults to true.
    */
  var pull: Allowable | js.Function2[Sortable, Sortable, Allowable] = js.native

  /** Whether elements can be added from other lists, or an array of group names
    * from which elements can be added.
    */
  var put: Allowable | js.Function1[Sortable, Allowable] = js.native

  /** Revert cloned element to initial position after moving to a another list.
    */
  var revertClone: Boolean = js.native
}

object GroupOptions extends GroupOptionsBuilder(noOpts) {
  type Allowable = Boolean | js.Array[String] | Clone
}

class GroupOptionsBuilder(val dict: OptMap) extends
    JSOptionBuilder[GroupOptions, GroupOptionsBuilder](
  new GroupOptionsBuilder(_)
) {
  import GroupOptions.Allowable

  def name(v: String) = jsOpt("name", v)
  def pull(v: Allowable | js.Function2[Sortable, Sortable, Allowable]) =
    jsOpt("pull", v)
  def put(v: Allowable | js.Function1[Sortable, Allowable]) = jsOpt("put", v)
  def revertClone(v: Boolean) = jsOpt("revertClone", v)
}
