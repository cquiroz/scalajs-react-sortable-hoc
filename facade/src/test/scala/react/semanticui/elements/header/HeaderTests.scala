package react.semanticui.elements.header

import utest._
import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._

object HeaderTests extends TestSuite {
  val tests = Tests {
    'render - {
      val header = Header()
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<div class="ui header"></div>""")
      }
    }
    'renderAs - {
      val header = Header(as = "a")
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(mountNode.innerHTML == """<a class="ui header"></a>""")
      }
    }
    'subheader - {
      val header =
        Header(subheader = HeaderSubheader("abc"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        header.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="ui header"><div class="sub header">abc</div></div>"""
        )
      }
    }
  }
}
