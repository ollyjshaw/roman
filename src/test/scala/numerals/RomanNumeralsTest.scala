package numerals

import org.scalatest.{FlatSpec, Matchers}

class RomanNumeralsTest extends FlatSpec with Matchers{

  "1" should "I" in {
    val answer = RomanNumerals.convert(1)
    answer shouldBe "I"
  }
  "2" should "be II" in {
    val answer = RomanNumerals.convert(2)
    answer shouldBe "II"
  }
  "3" should "be III" in {
    val answer = RomanNumerals.convert(3)
    answer shouldBe "III"
  }
  "4" should "be IV" in {
    val answer = RomanNumerals.convert(4)
    answer shouldBe "IV"
  }
  "5" should "be V" in {
    val answer = RomanNumerals.convert(5)
    answer shouldBe "V"
  }
  "6" should "be VI" in {
    val answer = RomanNumerals.convert(6)
    answer shouldBe "VI"
  }
  "8" should "be VIII" in {
    val answer = RomanNumerals.convert(8)
    answer shouldBe "VIII"
  }
  "9" should "be IX" in {
    val answer = RomanNumerals.convert(9)
    answer shouldBe "IX"
  }
  "10" should "be X" in {
    val answer = RomanNumerals.convert(10)
    answer shouldBe "X"
  }
  "11" should "be XI" in {
    val answer = RomanNumerals.convert(11)
    answer shouldBe "XI"
  }
  "13" should "be XIII" in {
    val answer = RomanNumerals.convert(13)
    answer shouldBe "XIII"
  }
  "14" should "be XIV" in {
    val answer = RomanNumerals.convert(14)
    answer shouldBe "XIV"
  }
  "19" should "be XIX" in {
    val answer = RomanNumerals.convert(19)
    answer shouldBe "XIX"
  }
  "20" should "be XX" in {
    val answer = RomanNumerals.convert(20)
    answer shouldBe "XX"
  }
  "33" should "be XXXIII" in {
    val answer = RomanNumerals.convert(33)
    answer shouldBe "XXIII"
  }

}
