package _03_exception._02_processing;

public class Factorial {
    public static int getFactorial(int number) { //throws Exception {
        var result = 1;
        try {
            if (number < 0) throw new Exception("Number must be more than 0.");
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        return result;
    }
}
