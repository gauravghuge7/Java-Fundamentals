interface garry {
    
    void accept();

}

class demoInterface implements garry {




    public void accept() {

        int a = 15;
        int b = 20;
        int sum = a + b;

        System.out.println( sum );

    }

    
    public static void main(String args[]) {
        
        demoInterface d = new demoInterface();
        d.accept();
    }
}