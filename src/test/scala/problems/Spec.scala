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


class Problem3Spec extends FlatSpec with Matchers {
  "The nth function" should "return the n-th element in the list" in {
    Problem3.nth(2, List(1, 3, 5, 7, 9)) shouldEqual Some(5)
  }
}

class Problem4Spec extends FlatSpec with Matchers {
  "The length function" should "return the number of elements in the list" in {
    Problem4.length(List(1, 3, 5, 7, 9)) shouldEqual 5
  }

  it should "return 0 if the list if empty" in {
    Problem4.length(List()) shouldEqual 0
  }

  it should "return 1 if the list has 1 element" in {
    Problem4.length(List(1)) shouldEqual 1
  }
}