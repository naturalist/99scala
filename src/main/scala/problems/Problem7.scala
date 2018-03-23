/*
 * flatMap is like map but the result of the function must consume the
 * GenTraversableOnce trait, so each element must be transformed into a List,
 * Seq etc.
 *
 * What we do here is, we take each of the elements and flatMap them like this:
 * If it's a list, then flatten it (because it may be made of smaller lists) If
 * it's not a list then make it a list (so that flatMap is happy)
 */

object Problem7 {
  def flatten(xs: List[Any]): List[Any] = flatMap {
    case ms: List[_] => flatten(ms)
    case e           => List(e)
  }
}
