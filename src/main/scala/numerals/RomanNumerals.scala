package numerals

object RomanNumerals {
  def convert(number: Int) = {
    val allIs = "I" * number
    allIs.
      replaceAll("IIIII", "V").
      replaceAll("VV", "X").
      replaceAll("IIII", "IV").
      replaceAll("VIV", "IX")
  }

}
