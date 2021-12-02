import java.util.Collections;
import java.util.Scanner;
enum Command{ArrayEnum,ADD,LIST,SRTA,SRTD,QUIT,SUM,INVALID};
enum Order{ASC,DEC};
public class ArrayEnum {
    public static void main(String[] args){
        int index=0;
        int[] values = new int[100];
        final Scanner scanner = new Scanner(System.in);

        while(true){
            final Command command = getCommand(scanner);
            if(command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch(command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values,index);
                    break;
                case SRTA:
                    printList(sort(values,index,Order.ASC),index);
                    break;
                case SRTD:
                    printList(sort(values,index,Order.DEC),index);
                    break;
                case SUM:
                    System.out.println(sum(values,index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
    private static int[] sort(int[] values,int index,Order or) {
        int[] copy = new int[100];
        for(int i=0; i<values.length; i++)
            copy[i]=values[i];
        if (or.toString().equals("ASC")) {
            int temp;
            for (int j = index - 1; j > -0; j--)
                for (int k = 0; k < j; k++)
                    if (copy[k] > copy[k + 1]) {
                        temp = copy[k];
                        copy[k] = copy[k + 1];
                        copy[k + 1] = temp;
                    }
        } else if (or.toString().equals("DEC")) {
            int temp;
            for (int j = index - 1; j > -0; j--)
                for (int k = 0; k < j; k++)
                    if (copy[k] < copy[k + 1]) {
                        temp = copy[k];
                        copy[k] = copy[k + 1];
                        copy[k + 1] = temp;
                    }
        }
        return copy;
    }
    private static Command getCommand(Scanner scanner){
            String in = scanner.next();
            Command com;
            try{
                com = Command.valueOf(in.toUpperCase());
            }catch(Exception e){
                com = Command.INVALID;
            }
            return com;
        }
    private static int getValue(Scanner scanner){
        int n= scanner.nextInt();
        String s = scanner.nextLine();
        return n;
    }

    private static void printList(int[] values,int index){
        for(int i=0; i<index; i++)
            System.out.print(values[i]+" ");
        System.out.println();
    }

    private static int sum(int[] values,int index){
        int result=0;
        for(int i=0; i<index; i++)
            result+=values[i];
        return result;
    }
        }
