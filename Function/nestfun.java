package Function;

class first {
    void show() {
        System.out.println(" this is the show function ");
        abc();
    }
    void abc() {
        System.out.println(" this is the nested function ");
    }
}
public class nestfun {
    void abc() {
        System.out.println("this is the abc function ");
    }
    public static void main(String args[]) {
        nestfun n = new nestfun();
        first f = new first();

        f.show();
        n.abc();
        
    }
}

