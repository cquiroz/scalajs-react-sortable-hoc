package react.semanticui.elements.list

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class ListDescription(
  as:                    js.UndefOr[AsC]       = js.undefined,
  child:                 js.UndefOr[VdomNode]  = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  clazz:                 js.UndefOr[Css]       = js.undefined,
  content:               js.UndefOr[VdomNode]  = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericFnComponentPC[ListDescription.ListDescriptionProps] {
  override def cprops = ListDescription.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    ListDescription.component(ListDescription.props(this))
}

object ListDescription {
  @js.native
  @JSImport("semantic-ui-react", "ListDescription")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ListDescriptionProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native
  }

  def props(
    q: ListDescription
  ): ListDescriptionProps =
    rawprops(q.as, q.child, q.className, q.clazz, q.content)

  def rawprops(
    as:        js.UndefOr[AsC]      = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    clazz:     js.UndefOr[Css]      = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined
  ): ListDescriptionProps = {
    val p = (new js.Object).asInstanceOf[ListDescriptionProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p
  }

  private val component =
    JsFnComponent[ListDescriptionProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): ListDescription = new ListDescription(children = content)
}