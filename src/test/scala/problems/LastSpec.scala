package problems

import org.scalatest._

class LastSpec extends FlatSpec with Matchers {
  "The last function" should "return the last element" in {
    Last.last(List(1,2,3)) shouldEqual Some(3)
  }

  it should "return None if the list if empty" in {
    Last.last(List()) shouldEqual None
  }
}
