class first {
    void demo() {
        System.out.println("this is the demo function ");
    }
}
public class superSecond extends first {
    superSecond() {
        super();
        System.out.println(" this is the super seconod class ");
    }

    public static void main(String args[]) {
        superSecond s = new superSecond();
        s.demo();
    }
}
