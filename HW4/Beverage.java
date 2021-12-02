import java.util.Objects;

public class Beverage {
    private String type;
    private String name;
    public Beverage(String name,String type){
        this.name = name;
        this.type = type;
    }
    public String getBeverageName(){
        return name;
    }
    public String getBeverageType(){
        return type;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof  Beverage)) return false;
        Beverage b =(Beverage)o;
        return name.equals(b.getBeverageName())&&type.equals(b.getBeverageType());
    }

    @Override
    public String toString(){
       return String.format("["+name+", "+type +"]");

    }
    @Override
    public int hashCode(){
        int result =1;
        result = 31*result+ Objects.hashCode(name);
        result = 31*result+ Objects.hashCode(type);
        return result;
    }


}
