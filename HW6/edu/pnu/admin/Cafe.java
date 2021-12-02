package edu.pnu.admin;
import edu.pnu.collection.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class Cafe {
    private String name;
    private GenericList<Beverage> students = new GenericList<Beverage>();

    public Cafe(String name){
        this.name = name;
    }
    public Beverage findBeverage(String name, String type){
        Beverage item = new Beverage(name,type);
        Iterator<Beverage> values = students.List.values().iterator();
        int n=0;
        while(values.hasNext()){
            if(item.equals(values.next())){
                n=1;
                break;
            }
        }
        if(n==1) return item;
        else return null;
    }
    public void addBeverage(Beverage b){
        String n = String.valueOf(students.List.size());
        students.List.put(n,b);
    }
    public void removeAllBeverage(){
        students.List.clear();
    }
    @Override
    public String toString() {
        String msg = "\n Cafe Name: " + name + " Beverage Count: " + students.List.size() + "\n";
        Iterator<Beverage> values = students.List.values().iterator();
        while (values.hasNext()) {
            msg += "\t" + values.next() + "\n";
        }
        return msg;
    }

    @Override
    public boolean equals(Object o) {
       Beverage b =(Beverage) o;
       return name.equals((b.getName()));
    }

    @Override
    public int hashCode() {
        int result =1;
        result = 31*result +Objects.hashCode(name);
        return result;
    }
}
