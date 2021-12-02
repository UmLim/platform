import java.util.Scanner;
import java.util.Arrays;
public class MathMain {
    public static void main(String[] args){
        System.out.print("Enter N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputs = new int[n];
        for(int i=0; i<n; i++)
            inputs[i] = scanner.nextInt();

        scanner.close();

        int max = getMax(inputs);
        System.out.printf("Max element : %d in %s%n",max,Arrays.toString(inputs));
        int min = getMin(inputs);
        System.out.printf("Min element : %d in %s%n",min,Arrays.toString(inputs));
    }

    public static int getMax(int[] a){
        int max=a[0];
        for(int i=1; i<a.length; i++)
            if(max<a[i]) max=a[i];
        return max;
    }
    public static int getMin(int[] a){
        int min=a[0];
        for(int i=1; i<a.length; i++)
            if(min>a[i]) min=a[i];
        return min;
    }
}
