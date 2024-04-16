class first {
    void demo() {
        System.out.println(" this is the demo function in first class");
    }
}
public class single extends first {

    void show() {
        System.out.println("this is the demo of the child class");
    }
    public static void main(String args[]) {
        single s = new single();
        s.demo();
        s.show();
    }
}
