
object ScalaVersion {

  def scala213 = "2.13.1"
  def scala212 = "2.12.10"
  def scala211 = "2.11.12"

  val versions = Seq(scala213, scala212, scala211)

  val map = versions
    .map { v =>
      v.split('.').take(2).mkString(".") -> v
    }
    .toMap

}
