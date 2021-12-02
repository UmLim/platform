import java.util.Arrays;
import java.util.Scanner;
public class PrimeNumberMain {

    public static void main(String[] args){
        System.out.print("Enter a number:");

        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.close();

        for(int i=2; i<=num; i++){
            System.out.println("Prime Numbers less than or equal to "
                    + i + " = " + Arrays.toString(getPrimeNumber(i)));

        }
    }
    private static Integer[] getPrimeNumber(final int n) {
        Integer[] array1 = new Integer[9];
        int index = 0;


        for (int i = 2; i <= n; i++) {
            int flag=1;
            for (int j = 2; j < i; j++)
                if (i % j == 0) flag = 0;
            if (flag == 1) {
                    array1[index] = i;
                    index++;
            }
        }
        Integer[] array2 = new Integer[index];
    System.arraycopy(array1,0,array2,0,index);
    return array2;
    }
}
