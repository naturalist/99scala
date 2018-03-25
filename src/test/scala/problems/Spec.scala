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

class Problem5Spec extends FlatSpec with Matchers {
  "The reverse function" should "reverse a list" in {
    Problem5.reverse(List(1,2,3)) shouldEqual List(3, 2, 1)
  }

  it should "return an empty list if the list was empty" in {
    Problem5.reverse(List()) shouldEqual List()
  }

  it should "return the same list if the list is 1 element" in {
    Problem5.reverse(List(4)) shouldEqual List(4)
  }
}

class Problem6Spec extends FlatSpec with Matchers {
  "The isPalindrome function" should "detect a palindrome" in {
    Problem6.isPalindrome("meataem") shouldEqual true
  }
}

class Problem7Spec extends FlatSpec with Matchers {
  "The flatten function" should "flatten a list" in {
    Problem7.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldEqual List(1, 1, 2, 3, 5, 8)
  }
}

class Problem8Spec extends FlatSpec with Matchers {
  "The compressRecursive function" should "compress a list" in {
    Problem8.compressRecursive(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List('a, 'b, 'c, 'a, 'd, 'e)
  }

  "The compressFunc function" should "compress a list" in {
    Problem8.compressFunc(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List('a, 'b, 'c, 'a, 'd, 'e)
  }
}
