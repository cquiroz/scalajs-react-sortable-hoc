package react.semanticui.modules.modal

import scala.scalajs.js
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.syntax._
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class ModalContent(
  as:                    js.UndefOr[AsC]       = js.undefined,
  child:                 js.UndefOr[VdomNode]  = js.undefined,
  className:             js.UndefOr[String]    = js.undefined,
  clazz:                 js.UndefOr[Css]       = js.undefined,
  content:               js.UndefOr[VdomNode]  = js.undefined,
  image:                 js.UndefOr[Boolean]   = js.undefined,
  scrolling:             js.UndefOr[Boolean]   = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericFnComponentPC[ModalContent.ModalContentProps] {
  @inline def renderWith = ModalContent.component(ModalContent.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object ModalContent {
  @js.native
  @JSImport("semantic-ui-react", "ModalContent")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ModalContentProps extends js.Object {
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

    /** A modal can contain image content. */
    var image: js.UndefOr[Boolean] = js.native

    /** A modal can use the entire size of the screen. */
    var scrolling: js.UndefOr[Boolean] = js.native
  }

  def props(q: ModalContent): ModalContentProps =
    rawprops(q.as, q.child, q.className, q.clazz, q.content, q.image, q.scrolling)

  def rawprops(
    as:        js.UndefOr[AsC]      = js.undefined,
    children:  js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String]   = js.undefined,
    clazz:     js.UndefOr[Css]      = js.undefined,
    content:   js.UndefOr[VdomNode] = js.undefined,
    image:     js.UndefOr[Boolean]  = js.undefined,
    scrolling: js.UndefOr[Boolean]  = js.undefined
  ): ModalContentProps = {
    val p = (new js.Object).asInstanceOf[ModalContentProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toJs
    p.image     = image
    p.scrolling = scrolling
    p
  }

  private val component =
    JsFnComponent[ModalContentProps, Children.Varargs](RawComponent)

  def apply(content: VdomNode*): ModalContent =
    new ModalContent(children = content)
}
