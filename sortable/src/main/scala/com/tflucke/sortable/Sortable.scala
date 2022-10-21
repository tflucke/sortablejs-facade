package com.tflucke.sortable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobal,JSName}
import org.scalajs.dom.raw._
import org.querki.jsext._

object SortableTypes {
  /** Represents the javascript string value, 'clone'
    */
  @js.native
  sealed trait Clone extends js.Object
  @scala.inline
  def Clone: Clone = "clone".asInstanceOf[Clone]

  /** Represents the javascript number value, -1
    */
  @js.native
  sealed trait `-1` extends js.Object
  @scala.inline
  def `-1` = -1.asInstanceOf[`-1`]

  /** Represents the javascript number value, 1
    */
  @js.native
  sealed trait `1` extends js.Any
  @scala.inline
  def `1` = 1.asInstanceOf[`1`]
}

import SortableTypes._

@js.native
@JSGlobal
object Sortable extends js.Object {
  /** Create new instance.
    */
  def create(elm: Element, options: SortableOptions = js.native): Sortable =
    js.native
  @JSName("create")
  def apply(elm: Element, options: SortableOptions = js.native): Sortable =
    js.native

  /** The active Sortable instance.
    */
  def active: Sortable| Null = js.native

  /** The element being dragged.
    */
  def dragged: HTMLElement | Null = js.native

  /** The ghost element.
    */
  def ghost: HTMLElement | Null = js.native

  /** The clone element.
    */
  @JSName("clone")
  def _clone: HTMLElement | Null = js.native

  /** Get the Sortable instance on an element.
    */
  def get(element: HTMLElement): Sortable = js.native

  /** Mounts a plugin to Sortable.
    */
  //def mount(plugin: js.Array[SortablePlugin] | SortablePlugin*)
}

@js.native
trait Sortable extends js.Object {

  /** For each element in the set, get the first element that matches the selector
    * by testing the element itself and traversing up through its ancestors in the
    * DOM tree.
    * 
    * @param element an HTMLElement or selector string.
    */
  def closest(element: HTMLElement): HTMLElement | Null = js.native
  def closest(element: HTMLElement, selector: String): HTMLElement | Null =
    js.native

  /** Removes the sortable functionality completely.
    */
  def destroy(): Unit = js.native
  
  var el: HTMLElement = js.native
}

@js.native
trait SortableEvent extends Event {

  @JSName("clone")
  var _clone: HTMLElement = js.native
  
  /** previous list
    */
  var from: HTMLElement = js.native
  
  /** dragged element
    */
  var item: HTMLElement = js.native
  
  /** New index within parent, only counting draggable elements
    */
  var newDraggableIndex: js.UndefOr[Int] = js.native
  
  /** new index within parent
    */
  var newIndex: js.UndefOr[Int] = js.native
  
  /** When MultiDrag is used to sort, this holds a HTMLElement and newIndex for
    * each item.
    *
    * `oldIndicies[number]` is directly related to `newIndicies[number]`
    *
    * If MultiDrag is not used to sort, this array will be empty.
    */
  var newIndicies: js.Array[Int] = js.native
  
  /** Old index within parent, only counting draggable elements
    */
  var oldDraggableIndex: js.UndefOr[Int] = js.native
  
  /** Old index within parent
    */
  var oldIndex: js.UndefOr[Int] = js.native
  
  /** When MultiDrag is used to sort, this holds a HTMLElement and oldIndex for
    * each item selected.
    *
    * `oldIndicies[number]` is directly related to `newIndicies[number]`
    *
    * If MultiDrag is not used to sort, this array will be empty.
    */
  var oldIndicies: js.Array[Int] = js.native
  
  /** Pull mode if dragging into another sortable
    */
  var pullMode: js.UndefOr[Clone | Boolean] = js.native
  
  /** When Swap is used to sort, this will contain the dragging item that was
    * dropped on.
    */
  var swapItem: HTMLElement | Null = js.native

  @JSName("target")
  var _target: HTMLElement = js.native
  
  /** list, in which moved element.
    */
  var to: HTMLElement = js.native
}

@js.native
trait MoveEvent extends Event {
  
  var dragged: HTMLElement = js.native
  
  var draggedRect: DOMRect = js.native
  
  var from: HTMLElement = js.native
  
  /**
    * element on which have guided
    */
  var related: HTMLElement = js.native
  
  var relatedRect: DOMRect = js.native
  
  var to: HTMLElement = js.native
  
  var willInsertAfter: js.UndefOr[Boolean] = js.native
}

@js.native
trait DOMRect extends js.Object {
  var bottom: Double = js.native
  var height: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}
