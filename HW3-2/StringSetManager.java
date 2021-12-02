import java.util.*;

enum StringCommand{ADD,REMOVE,CLEAN,SORT,QUIT,INVALID};
public class StringSetManager {

    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];
        while(true){
            final StringCommand command = getCommand(scanner);
            if(command == StringCommand.QUIT){
                System.out.println("BYE!");
                break;
            }

            switch(command){
                case ADD:
                    final String str_a = getString(scanner);
                    stringSet =add(stringSet,str_a);
                    break;
                case SORT:
                    final String str_s = getString(scanner);
                    sort(stringSet,str_s);
                    break;
                case REMOVE:
                    final String str_r = getString(scanner);
                    stringSet = remove(stringSet,str_r);
                    break;
                case CLEAN:
                    stringSet = clean(stringSet);
                    break;
                default:
                    break;

            }
            System.out.print("Element.size: "+stringSet.length);
            System.out.println(" VALUES = "+ Arrays.toString(stringSet));
        }

    }

    private static StringCommand getCommand(Scanner scanner){
        String in = scanner.next();
        StringCommand com;
        try{
            com = StringCommand.valueOf(in.toUpperCase());
        }catch(Exception e){
            com = StringCommand.INVALID;
        }
        return com;
    }

    private static String getString(Scanner scanner){
        String in = scanner.nextLine();
        return in;
    }
    private static String[] add(String[] set, String str){
        List<String> list = new ArrayList<String>();

        for(String s : set){
            if(s!=null)
                list.add(s);
        }
        if(list.indexOf(str)==-1)
            list.add(str);

        set = list.toArray(new String[list.size()]);
        return set;
    }
    private static void sort(String[] set, String order){
        if(" ASC".equals(order)){
            Arrays.sort(set);
        }else if(" DESC".equals(order)){
            Arrays.sort(set, Collections.reverseOrder());
        }
    }
    private static String[] remove(String[] set, String str){
        List<String> list = new ArrayList<String>();
        for(String s : set){
                list.add(s);
        }
        if(list.indexOf(str)!=-1)
            list.remove(str);

        set = list.toArray(new String[list.size()]);
        return set;
    }
    private static String[] clean(String[] set){
        List<String> list = new ArrayList<String>();

        list.clear();

        set = list.toArray(new String[list.size()]);
        return set;
    }
}
