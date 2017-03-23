package numerals

object RomanNumerals {
  def convert(number: Int) = {
    val allIs = "I" * number
    allIs.
      replaceAll("IIIII", "V").
      replaceAll("VV", "X").
      replaceAll("IIII", "IV").
      replaceAll("VIV", "IX").
      replaceAll("XXXXXXXXXX", "C").
      replaceAll("XXXXXXXXX", "XC").
      replaceAll("XXXXX", "L").
      replaceAll("XXXX", "XL")
  }
}
