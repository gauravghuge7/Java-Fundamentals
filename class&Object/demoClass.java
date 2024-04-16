class first {
    void show() {
        System.out.println("i am in the show function");
    }
}
public class demoClass {
    void abc() {
        System.out.println(" i am in the abc function ");
    }
    public static void main(String args[]) {
        
        demoClass d = new demoClass();
        first f = new first();
        
        f.show();

        // this is use in the inheritance
        // d.show();
        // f.abc();

        d.abc();


        
    }
    
}
