
class first {
    int x,y;
    void show(int a, int b) {
        System.out.println(x);
        System.out.println(y);
        x=a;
        y=b;
        System.out.println(x);
        System.out.println(y);
    }
    void display() {
        System.out.println(x);
        x=15;
        y=10;
        System.out.println(x);
        System.out.println(y);
    }
}
public class demo {
    public static void main(String args[]) {
        first f = new first();
        f.show(15,25);
        f.display();
    }
}
