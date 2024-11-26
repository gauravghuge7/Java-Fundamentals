class first {

    void demo(int a) {
        System.out.println("this are one parameter function "+a);
    }

    void demo(int a, int b) {
        System.out.println("these are two parameter function "+a+" "+b);
    }

}


class demo {
    public static void main(String args[]) {
        first f = new first();
        f.demo(5);
        f.demo(10,20);
        
    }
}

