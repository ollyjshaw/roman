package numerals

object RomanNumeralsInverse {
  def convert(input: String) = {
    input.map(char => {
      char match {
        case 'I' => 1
      }
    }).size
  }

}
