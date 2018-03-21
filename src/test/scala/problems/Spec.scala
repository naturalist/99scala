package problems

import org.scalatest._

class Problem1Spec extends FlatSpec with Matchers {
  "The last function" should "return the last element" in {
    Problem1.last(List(1,2,3)) shouldEqual Some(3)
  }

  it should "return None if the list if empty" in {
    Problem1.last(List()) shouldEqual None
  }
}

class Problem2Spec extends FlatSpec with Matchers {
  "The penultimate function" should "return the second to the last element" in {
    Problem2.penultimate(List(1,2,3)) shouldEqual Some(2)
  }

  it should "return None if the elements are less than 2" in {
    Problem2.penultimate(List(1)) shouldEqual None
  }
}
