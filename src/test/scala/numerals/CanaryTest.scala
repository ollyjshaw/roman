package numerals

import org.scalatest.{FlatSpec, Matchers}

class RomanNumeralsInverseTest extends FlatSpec with Matchers{

  "I" should "be 1" in {
    val answer = RomanNumeralsInverse.convert("I")
    answer shouldBe 1
  }
  "II" should "be 2" in {
    val answer = RomanNumeralsInverse.convert("II")
    answer shouldBe 2
  }

}
