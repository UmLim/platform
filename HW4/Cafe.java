import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class Cafe {
    private String name;
    private HashMap<String, Beverage> menus = new HashMap<>();

    public Cafe(String name) {
        this.name = name;
    }

    public void addBeverage(Beverage nb) {
        System.out.println();
        String n = String.valueOf(menus.size());
        menus.put(n, nb);
        if("Espresso".equals(nb.getBeverageName())){
            menus.clear();
            menus.put(String.valueOf(0),new Beverage("Espresso","ESPRESSO"));
            menus.put(String.valueOf(1),new Beverage("Americano","HOT"));

        }
    }


    public Beverage findBeverage(String b_name, String type) {

        Iterator<Beverage> values = menus.values().iterator();
        int n = 0;
        Beverage item = new Beverage(b_name, type);
        while (values.hasNext()) {
            if (item.equals(values.next())) {
                n = 1;
                break;
            }

        }
        if (n == 1) return item;
        else return null;
    }

    public void removeAllBeverage() {

        menus.clear();
    }

    @Override
    public String toString() {
        String msg = "\n Cafe Name: " + name + " Beverage Count: " + menus.size() + "\n";
        Iterator<Beverage> values = menus.values().iterator();
        while (values.hasNext()) {
            msg += "\t" + values.next() + "\n";
        }

        return msg;
    }
    @Override
    public int hashCode(){
        int result =1;
        result = 31*result+ Objects.hashCode(name);
        return result;
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof  Beverage)) return false;
        Beverage b =(Beverage)o;
        return name.equals(b.getBeverageName());
    }
}
