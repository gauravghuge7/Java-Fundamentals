

class excDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            int a[] = {5,6,7},b;
            b=a[25]/0;
            System.out.println(b);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e+"this is the array index exception ");
        }
        catch (ArithmeticException e) {
            System.out.println(e+"this is the arithmetic exception ");
        } 
    }
}