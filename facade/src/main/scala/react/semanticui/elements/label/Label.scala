package react.semanticui.elements.label

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedMapped
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.internal.Effect.Id
import react.semanticui._
import react.semanticui.colors._
import react.semanticui.{ raw => suiraw }
import react.semanticui.sizes._
import react.semanticui.elements.icon.Icon

sealed trait LabelAttached {
  def value: String
}
case object TopAttached extends LabelAttached {
  val value = "top"
}
case object BottomAttached extends LabelAttached {
  val value = "bottom"
}
case object TopRightAttached extends LabelAttached {
  val value = "top right"
}
case object TopLeftAttached extends LabelAttached {
  val value = "top left"
}
case object BottomLeftAttached extends LabelAttached {
  val value = "bottom left"
}
case object BottomRightAttached extends LabelAttached {
  val value = "bottom right"
}

sealed trait LabelCorner {
  def value: Boolean | String
}
case object Corner extends LabelCorner {
  val value = true
}
case object LeftCorner extends LabelCorner {
  val value = "left"
}
case object RightCorner extends LabelCorner {
  val value = "right"
}

sealed trait LabelPointing {
  def value: Boolean | String
}
case object PointingDefault extends LabelPointing {
  val value = true
}
case object PointingAbove extends LabelPointing {
  val value = "above"
}
case object PointingBelow extends LabelPointing {
  val value = "below"
}
case object PointingLeft extends LabelPointing {
  val value = "left"
}
case object PointingRight extends LabelPointing {
  val value = "right"
}

sealed trait LabelRibbon {
  def value: Boolean | String
}
case object DefaultRibbon extends LabelRibbon {
  val value = true
}
case object RightRibbon extends LabelRibbon {
  val value = "right"
}

object Label {

  type OnClick = (ReactMouseEvent, LabelProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "Label")
  object RawComponent extends js.Object

  @js.native
  trait LabelProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    var as: js.UndefOr[js.Any]                               = js.native
    var active: js.UndefOr[Boolean]                          = js.native
    var attached: js.UndefOr[String]                         = js.native
    var basic: js.UndefOr[Boolean]                           = js.native
    var children: js.UndefOr[React.Node]                     = js.native
    var circular: js.UndefOr[Boolean]                        = js.native
    var className: js.UndefOr[String]                        = js.native
    var color: js.UndefOr[suiraw.SemanticCOLORS]             = js.native
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native
    var corner: js.UndefOr[Boolean | String]                 = js.native
    var detail: js.UndefOr[suiraw.SemanticShorthandItem[LabelDetail.LabelDetailProps]] =
      js.native
    var empty: js.UndefOr[js.Any]       = js.native
    var floating: js.UndefOr[Boolean]   = js.native
    var horizontal: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[suiraw.SemanticShorthandItem[Icon.IconProps]] =
      js.native
    var image: js.UndefOr[js.Any] = js.native
    var onClick: js.UndefOr[js.Function2[ReactMouseEvent, LabelProps, Unit]] =
      js.native
    var onRemove: js.UndefOr[js.Function2[ReactMouseEvent, LabelProps, Unit]] =
      js.native
    var pointing: js.UndefOr[Boolean | String] = js.native
    var removeIcon: js.UndefOr[suiraw.SemanticShorthandItem[Icon.IconProps]] =
      js.native
    var ribbon: js.UndefOr[Boolean | String]   = js.native
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native
    var tag: js.UndefOr[Boolean]               = js.native
  }

  def props(
    as:         js.UndefOr[String]                                              = js.undefined,
    active:     js.UndefOr[Boolean]                                             = js.undefined,
    attached:   js.UndefOr[LabelAttached]                                       = js.undefined,
    basic:      js.UndefOr[Boolean]                                             = js.undefined,
    children:   js.UndefOr[React.Node]                                          = js.undefined,
    circular:   js.UndefOr[Boolean]                                             = js.undefined,
    className:  js.UndefOr[String]                                              = js.undefined,
    color:      js.UndefOr[SemanticColor]                                       = js.undefined,
    content:    js.UndefOr[SemanticShortHandContent]                            = js.undefined,
    corner:     js.UndefOr[LabelCorner]                                         = js.undefined,
    detail:     js.UndefOr[SemanticShortHandItem[LabelDetail.LabelDetailProps]] = js.undefined,
    empty:      js.UndefOr[Boolean]                                             = js.undefined,
    floating:   js.UndefOr[Boolean]                                             = js.undefined,
    horizontal: js.UndefOr[Boolean]                                             = js.undefined,
    icon:       js.UndefOr[SemanticShortHandItem[Icon.IconProps]]               = js.undefined,
    image:      js.UndefOr[Boolean]                                             = js.undefined,
    onClick:    js.UndefOr[OnClick]                                             = js.undefined,
    onRemove:   js.UndefOr[OnClick]                                             = js.undefined,
    pointing:   js.UndefOr[LabelPointing]                                       = js.undefined,
    removeIcon: js.UndefOr[SemanticShortHandItem[Icon.IconProps]]               = js.undefined,
    ribbon:     js.UndefOr[LabelRibbon]                                         = js.undefined,
    size:       js.UndefOr[SemanticSize]                                        = js.undefined,
    tag:        js.UndefOr[Boolean]                                             = js.undefined
  ): LabelProps =
    rawprops(
      as.map(_.asInstanceOf[js.Any]),
      active,
      attached.map(_.value),
      basic,
      children,
      circular,
      className,
      color.map(_.value),
      content.toRaw,
      corner.map(_.value),
      detail.toRaw,
      empty.map(_.asInstanceOf[js.Any]),
      floating,
      horizontal,
      icon.toRaw,
      image.map(_.asInstanceOf[js.Any]),
      onClick.map { c => (e, p) =>
        c(e, p).runNow()
      },
      onRemove.map { c => (e, p) =>
        c(e, p).runNow()
      },
      pointing.map(_.value),
      removeIcon.toRaw,
      ribbon.map(_.value),
      size.map(_.value),
      tag
    )

  private[semanticui] def rawprops(
    as:         js.UndefOr[js.Any]                                                     = js.undefined,
    active:     js.UndefOr[Boolean]                                                    = js.undefined,
    attached:   js.UndefOr[String]                                                     = js.undefined,
    basic:      js.UndefOr[Boolean]                                                    = js.undefined,
    children:   js.UndefOr[React.Node]                                                 = js.undefined,
    circular:   js.UndefOr[Boolean]                                                    = js.undefined,
    className:  js.UndefOr[String]                                                     = js.undefined,
    color:      js.UndefOr[suiraw.SemanticCOLORS]                                      = js.undefined,
    content:    js.UndefOr[suiraw.SemanticShorthandContent]                            = js.undefined,
    corner:     js.UndefOr[Boolean | String]                                           = js.undefined,
    detail:     js.UndefOr[suiraw.SemanticShorthandItem[LabelDetail.LabelDetailProps]] = js.undefined,
    empty:      js.UndefOr[js.Any]                                                     = js.undefined,
    floating:   js.UndefOr[Boolean]                                                    = js.undefined,
    horizontal: js.UndefOr[Boolean]                                                    = js.undefined,
    icon:       js.UndefOr[suiraw.SemanticShorthandItem[Icon.IconProps]]               = js.undefined,
    image:      js.UndefOr[js.Any]                                                     = js.undefined,
    onClick:    js.UndefOr[js.Function2[ReactMouseEvent, LabelProps, Unit]]            = js.undefined,
    onRemove:   js.UndefOr[js.Function2[ReactMouseEvent, LabelProps, Unit]]            = js.undefined,
    pointing:   js.UndefOr[Boolean | String]                                           = js.undefined,
    removeIcon: js.UndefOr[suiraw.SemanticShorthandItem[Icon.IconProps]]               = js.undefined,
    ribbon:     js.UndefOr[Boolean | String]                                           = js.undefined,
    size:       js.UndefOr[suiraw.SemanticSIZES]                                       = js.undefined,
    tag:        js.UndefOr[Boolean]                                                    = js.undefined
  ): LabelProps = {
    val p = (new js.Object).asInstanceOf[LabelProps]
    p.as         = as
    p.active     = active
    p.attached   = attached
    p.basic      = basic
    p.children   = children
    p.circular   = circular
    p.className  = className
    p.color      = color
    p.content    = content
    p.corner     = corner
    p.detail     = detail
    p.empty      = empty
    p.floating   = floating
    p.horizontal = horizontal
    p.icon       = icon
    p.image      = image
    p.onClick    = onClick
    p.onRemove   = onRemove
    p.pointing   = pointing
    p.removeIcon = removeIcon
    p.ribbon     = ribbon
    p.size       = size
    p.tag        = tag
    p
  }

  private val component =
    JsComponent[LabelProps, Children.Varargs, Null](RawComponent)

  def apply(p: LabelProps, children: VdomNode*)
    : UnmountedMapped[Id, LabelProps, Null, RawMounted[LabelProps, Null], LabelProps, Null] =
    component(p)(children: _*)
}