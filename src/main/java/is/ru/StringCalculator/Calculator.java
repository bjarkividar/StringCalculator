package is.ru.stringcalculator;

public class Calculator{

  public static int add(String text){

    if (text == ""){
      return 0;
    }
    else{
      if (text.contains(",") || text.contains("\n")){
        
        String numbers[] = text.split(",|\\\n");
        if ( checkNegative(numbers)){
          throw new IllegalArgumentException ("Negatives not allowed: "+ getNegatives(numbers));
        }
        return sum(numbers);
      }
      return toInt(text);
  }
  }
  private static int toInt(String number) {
    int num;
    try {
            num = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Illegal input",e);
        }
    return num;
  }
  private static int sum(String [] numbers){
    int sum = 0;
    for (int i = 0; i<numbers.length; i++){
      sum += toInt(numbers[i]);
    }
    return sum;
  }
  private static boolean checkNegative(String [] numbers){
    for (int i = 0; i<numbers.length; i++){
      if ( toInt(numbers[i]) < 0){
        return true;
      }
    }
    return false;
  }
  private static String getNegatives(String [] numbers){
    String neg = "";
    for (int i = 0; i<numbers.length; i++){
      if ( toInt(numbers[i]) < 0){
        neg += numbers[i]+",";
      }
    }
    return neg.substring(0, neg.length() - 1);
  }
}
