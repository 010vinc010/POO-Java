public class SquareRoot {
    public static void printResult (double value) {
        if (value != 1 && value > 0){
          System.out.println(Math.sqrt(value) / (value - 1));
        }
        else {
          System.out.println("Résultat non calculable"); 
        }
      }
}