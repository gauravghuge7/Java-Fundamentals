
class five {
    void two() {
        System.out.println(" this is the function");
    }
}

class two {
    void five() {
        System.out.println(" five function ");
    }
}

class three {

    void two() {
        System.out.println(" two function ");
    }
}
public class multiple implements two, three, five {
    public static void main(String args[]) {
        multiple m = new multiple();
        m.two();
    }
}
