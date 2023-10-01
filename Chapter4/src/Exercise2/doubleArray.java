
package Exercise2;
import java.util.Scanner;
import java.util.Random;

public class doubleArray {
    public static void main(String[] args){
        double[] arr = new double[51];

      //  double sum = 0;

        Random random = new Random();
        for(int i = 0; i <= 50; i++){
        arr[i] = random.nextDouble();
        }
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("input a value between 0-50. ");
          //  double random1 = input.nextDouble();


            int num = input.nextInt();
            if (num >= 0 && num <51) {
                System.out.println("value is " +num + "." + " Random number generated " + arr[num]);
            }else {
                System.out.println("Value is out of range");
            }

        }catch(ArrayIndexOutOfBoundsException im) {
            System.out.println("input is out of bounds. Please input a value between 0-50. ");
        }
        finally{
            input.close();
            /*if (sum != 0){
                System.out.println(sum);
            }*/

        }
    }
}

