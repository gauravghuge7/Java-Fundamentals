class demo {
    int a,b;
    void show(int a, int b) {
        this.a = a;
        this.b = b;

        System.out.println(" this is the a pointer "+a);

        System.out.println(" this is the  b pointer"+b);

    }

    void display() {
        System.out.println("the number are"+a+" "+b);
    }
}


public class demoThis {
    public static void main(String args[]) {
        demo d = new demo();
        d.show(15,20);
        d.display();
    }
}