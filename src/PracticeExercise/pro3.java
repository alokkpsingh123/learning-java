package Practice;

public class pro3 {
    public static void main(String args[]){
        car ob1 = new car(1,"bmw");
//        car ob2 = new car(1,"bmw");
        car ob2 = ob1;

        System.out.println(ob1==ob2);
        System.out.println(ob1.equals(ob2));
    }
}
class car{
    int carno;
    String carname;
    car(int c, String n){
        this.carno = c;
        this.carname = n;
    }
}
