package is.ru.stringcalculator;

public class Calculator{

  public static int add(String text){

    if (text == ""){
      return 0;
    }
    else{
      if (text.contains(",")){
        int sum = 0;
        String numbers[] = text.split(",");
        for (int i = 0; i<numbers.length; i++){
        sum += Integer.parseInt(numbers[i]);
      }
      return sum;
      }
      return Integer.parseInt(text);
  }
  }
}
