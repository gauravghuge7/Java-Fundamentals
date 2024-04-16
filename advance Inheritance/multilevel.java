class first {
    first() {
        System.out.println(" this is the default constructor");
    }
}

class second extends first {
    second() {
        System.out.println(" this is the default constructor");
    }
}

class third extends second {
    third() {
        System.out.println(" this is the default constructor");
    }
}
class fourth extends third {
    fourth() {
        System.out.println(" this is the default constructor");
    }
}

public class multilevel extends fourth {
    public static void main(String args[]) {
        multilevel m = new multilevel();

    }
        
}
