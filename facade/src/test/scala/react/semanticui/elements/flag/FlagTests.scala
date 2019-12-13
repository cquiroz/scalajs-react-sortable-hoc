package react.semanticui.elements.flag

import utest._
import japgolly.scalajs.react.test._

object FlagTests extends TestSuite {
  val tests = Tests {
    'render - {
      val menuItem = Flag(name = "cl")
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<i class="cl flag"></i>""")
      }
    }
    'renderAs - {
      val menuItem = Flag(as = "a", name = "cl")
      ReactTestUtils.withNewBodyElement { mountNode =>
        menuItem.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="cl flag"></a>""")
      }
    }
  }
}
