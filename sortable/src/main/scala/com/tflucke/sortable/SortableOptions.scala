package com.tflucke.sortable

import scala.scalajs.js
import scala.scalajs.js.`|`
import org.querki.jsext._
import org.scalajs.dom.raw._

import SortableTypes._

@js.native
trait SortableOptions extends js.Object {
  /** To drag elements from one list into another, both lists must have the same
    * group value. You can also define whether lists can give away, give and keep
    * a copy (clone), and receive elements.
    */
  var group: js.UndefOr[String | GroupOptions] = js.native

  /** Allow sorting inside list.
    */
  var sort: js.UndefOr[Boolean] = js.native

  /** Time in milliseconds to define when the sorting should start
    */
  var delay: js.UndefOr[Long] = js.native

  /** Only delay if user is using touch
    */
  var delayOnTouchOnly: js.UndefOr[Boolean] = js.native

  /** How many pixels the point should move before cancelling a delayed drag event
    */
  var touchStartThreshold: js.UndefOr[Int] = js.native

  /** Disables the sortable if set to true.
    */
  var disabled: js.UndefOr[Boolean] = js.native

  /** Saving and restoring of the sort.
    */
  var store: js.UndefOr[SortableStore] = js.native

  /** animation speed in millisectonds moving items when sorting
    * `0` — without animation
    */
  var animation: js.UndefOr[Long] = js.native

  /** Easing for animation. Defaults to null.
    * See https://easings.net/ for examples.
    */
  var easing: js.UndefOr[String] = js.native

  /** Drag handle selector within list items
    */
  var handle: js.UndefOr[String] = js.native

  /** Selectors that do not lead to dragging
    */
  var filter: js.UndefOr[String |
    js.Function3[Sortable, Event | TouchEvent, HTMLElement, Sortable]
  ] = js.native

  /** Call `event.preventDefault()` when triggered `filter`
    */
  var preventOnFilter: js.UndefOr[Boolean] = js.native

  /** Specifies which items inside the element should be draggable
    */
  var draggable: js.UndefOr[String] = js.native

  
  /** HTML attribute that is used by the `toArray()` method
    */
  var dataIdAttr: js.UndefOr[String] = js.native


  /** Class name for the drop placeholder
    */
  var ghostClass: js.UndefOr[String] = js.native

  /** Class name for the chosen item
    */
  var chosenClass: js.UndefOr[String] = js.native

  /** Class name for the dragging item
    */
  var dragClass: js.UndefOr[String] = js.native


  /** Threshold of the swap zone
    */
  var swapThreshold: js.UndefOr[Int] = js.native

  /** Will always use inverted swap zone if set to true
    */
  var invertSwap: js.UndefOr[Boolean] = js.native

  /** Threshold of the inverted swap zone
    * Will be set to swapThreshold value by default
    */
  var invertedSwapThreshold: js.UndefOr[Int] = js.native

  /** Direction of Sortable (will be detected automatically if not given)
    */
  var direction: js.UndefOr[String] = js.native


  /** Ignore the HTML5 DnD behaviour and force the fallback to kick in
    */
  var forceFallback: js.UndefOr[Boolean] = js.native


  /** Class name for the cloned DOM Element when using forceFallback
    */
  var fallbackClass: js.UndefOr[String] = js.native

  /** Appends the cloned DOM Element into the Document's Body
    */
  var fallbackOnBody: js.UndefOr[Boolean] = js.native

  /** Specify in pixels how far the mouse should move before it's considered as a
    * drag.
    */
  var fallbackTolerance: js.UndefOr[Int] = js.native


  var dragoverBubble: js.UndefOr[Boolean] = js.native

  /** Remove the clone element when it is not showing, rather than just hiding it
    */
  var removeCloneOnHide: js.UndefOr[Boolean] = js.native

  /** Distance in pixels mouse must be from empty sortable to insert drag element
    * into it
    */
  var emptyInsertThreshold: js.UndefOr[Int] = js.native


  var setData: js.UndefOr[js.Function2[DataTransfer, HTMLElement, Unit]] =
    js.native


  /** Element is chosen
    */
  var onChoose: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native


  /** Element is unchosen
    */
  var onUnchoose: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native


  /** Element dragging started
    */
  var onStart: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native


  /** Element dragging ended
    */
  var onEnd: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native


  /** Element is dropped into the list from another list
    */
  var onAdd: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native


  /** Changed sorting within list
    */
  var onUpdate: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native


  /** Called by any change to the list (add / update / remove)
    */
  var onSort: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native


  /** Element is removed from the list into another list
    */
  var onRemove: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native


  /** Attempt to drag a filtered element
    */
  var onFilter: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native


  /** Event when you move an item in the list or between lists
    */
  var onMove: js.UndefOr[js.Function2[
    MoveEvent,
    Event,
    Boolean | Unit | `1` | `-1`
  ]] = js.native

  /** Called when creating a clone of element
    */
  var onClone: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native

  /** Called when dragging element changes position
    */
  var onChange: js.UndefOr[js.Function1[SortableEvent, Unit]] = js.native
}

object SortableOptions extends SortableOptionsBuilder(noOpts)

class SortableOptionsBuilder(val dict: OptMap) extends
    JSOptionBuilder[SortableOptions, SortableOptionsBuilder](
  new SortableOptionsBuilder(_)
) {
  def group(v: String | GroupOptions) = jsOpt("group", v)
  def sort(v: Boolean) = jsOpt("sort", v)
  def delay(v: Long) = jsOpt("delay", v)
  def delayOnTouchOnly(v: Boolean) = jsOpt("delayOnTouchOnly", v)
  def touchStartThreshold(v: Int) = jsOpt("touchStartThreshold", v)
  def disabled(v: Boolean) = jsOpt("disabled", v)
  def store(v: SortableStore) = jsOpt("store", v)
  def animation(v: Long) = jsOpt("animation", v)
  def easing(v: String) = jsOpt("easing", v)
  def handle(v: String) = jsOpt("handle", v)
  def filter(
    v: String | js.Function3[Sortable, Event | TouchEvent, HTMLElement, Sortable]
  ) = jsOpt("filter", v)
  def preventOnFilter(v: Boolean) = jsOpt("preventOnFilter", v)
  def draggable(v: String) = jsOpt("draggable", v)
  def dataIdAttr(v: String) = jsOpt("dataIdAttr", v)
  def ghostClass(v: String) = jsOpt("ghostClass", v)
  def chosenClass(v: String) = jsOpt("chosenClass", v)
  def dragClass(v: String) = jsOpt("dragClass", v)
  def swapThreshold(v: Int) = jsOpt("swapThreshold", v)
  def invertSwap(v: Boolean) = jsOpt("invertSwap", v)
  def invertedSwapThreshold(v: Int) = jsOpt("invertedSwapThreshold", v)
  def direction(v: String) = jsOpt("direction", v)
  def forceFallback(v: Boolean) = jsOpt("forceFallback", v)
  def fallbackClass(v: String) = jsOpt("fallbackClass", v)
  def fallbackOnBody(v: Boolean) = jsOpt("fallbackOnBody", v)
  def fallbackTolerance(v: Int) = jsOpt("fallbackTolerance", v)
  def dragoverBubble(v: Boolean) = jsOpt("dragoverBubble", v)
  def removeCloneOnHide(v: Boolean) = jsOpt("removeCloneOnHide", v)
  def emptyInsertThreshold(v: Int) = jsOpt("emptyInsertThreshold", v)
  def setData(v: js.Function2[DataTransfer, HTMLElement, Unit]) =
    jsOpt("setData", v)
  def onChoose(v: js.Function1[SortableEvent, Unit]) = jsOpt("onChoose", v)
  def onUnchoose(v: js.Function1[SortableEvent, Unit]) = jsOpt("onUnchoose", v)
  def onStart(v: js.Function1[SortableEvent, Unit]) = jsOpt("onStart", v)
  def onEnd(v: js.Function1[SortableEvent, Unit]) = jsOpt("onEnd", v)
  def onAdd(v: js.Function1[SortableEvent, Unit]) = jsOpt("onAdd", v)
  def onUpdate(v: js.Function1[SortableEvent, Unit]) = jsOpt("onUpdate", v)
  def onSort(v: js.Function1[SortableEvent, Unit]) = jsOpt("onSort", v)
  def onRemove(v: js.Function1[SortableEvent, Unit]) = jsOpt("onRemove", v)
  def onFilter(v: js.Function1[SortableEvent, Unit]) = jsOpt("onFilter", v)
  def onMove(v: js.Function2[MoveEvent, Event, Boolean | Unit | `1` | `-1`]) =
    jsOpt("onMove", v)
  def onClone(v: js.Function1[SortableEvent, Unit]) = jsOpt("onClone", v)
  def onChange(v: js.Function1[SortableEvent, Unit]) = jsOpt("onChange", v)
}
