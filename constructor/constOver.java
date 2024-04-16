class demo {
    demo(int a) {
        System.out.println(a);
    }

    demo(float b) {
        System.out.println(b);
    }

    demo(String name) {
        System.out.println(name);
    }
}


public class constOver {
    public static void main(String args[]) {
        demo d = new demo("gaurav");
        demo d1 = new demo(35.2f);
        demo d2 = new demo(35);

    }
}
