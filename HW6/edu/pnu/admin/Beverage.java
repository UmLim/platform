package  edu.pnu.admin;

import edu.pnu.collection.GenericList;

public class Beverage {
    private String type;
    private String name;
    public Beverage(String name, String type){
        this.name = name;
        this.type = type;
    }
    private GenericList<Beverage> students = new GenericList<Beverage>();
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return String.format("["+name + ","+type+"]");
    }
    @Override
    public boolean equals(Object o){
        Beverage b = (Beverage)o;
        return name.equals(b.getName())&&type.equals(b.type);
    }
}
