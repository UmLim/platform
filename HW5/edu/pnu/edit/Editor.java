package edu.pnu.edit;
import edu.pnu.shape.*;
import java.util.ArrayList;
import java.util.List;
public class Editor {
    private List<Shape> shapes = new ArrayList<>();
    public void add(Shape shape){
        shapes.add(shape);
    }
    public void clear() {
        shapes.clear();
    }
    public void list(){
        int cnt =0;
        System.out.print("[");
        for(Shape s: shapes){
            cnt++;
            System.out.print(s);
            if(cnt!=shapes.size())
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
