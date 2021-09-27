package GunAbstractclass;

public class TestAbstactGeometric {
    public static void main(String[] args){
//        GeometricObject obj1=new GeometricObject();
        ShotgunsObject obj1=new ShotgunsObject("Model 680","40");
        displayArea(obj1);
        System.out.println(obj1.getTotal());
    }
    public static void displayArea(GunsObject obj){
        System.out.println("The are of the object is"+obj.toString());
    }
}
