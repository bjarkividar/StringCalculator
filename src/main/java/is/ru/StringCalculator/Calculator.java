package is.ru.stringcalculator;

public class Calculator{

  public static int add(String text){

    if (text == ""){
      return 0;
    }
    else{
      if (text.contains(",") || text.contains("\n")){
        int sum = 0;
        String numbers[] = text.split(",|\\\n");
        for (int i = 0; i<numbers.length; i++){
        sum += ToInt(numbers[i]);
        }
      return sum;
      }
      return ToInt(text);
  }
  }
  private static int ToInt(String number) {
    int num;
    try {
            num = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Illegal input",e);
        }
    return num;
  }
}
