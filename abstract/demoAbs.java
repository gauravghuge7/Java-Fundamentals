abstract class first {
    int a=5, b=7;
    void disp() {
        System.out.println(a);
        System.out.println("i am from non abstract class");
    }
    abstract void print1();
}

class demoAbs extends first {
    void print1() {
        System.out.println(b);
        System.out.println(" i am from anstract class ");
    }
    public static void main(String args[]) {
        demoAbs d = new demoAbs();
        d.disp();
        d.print1();
    }
}