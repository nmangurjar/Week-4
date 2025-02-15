package junit.basicjunit.testingcalculatorclass;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();


        System.out.println("Addition Result :"+  c.add(10,2));
        System.out.println("Addition Result :"+  c.subtract(10,2));
        System.out.println("Addition Result :"+  c.multiply(10,2));
        System.out.println("Addition Result :"+  c.divide(10,2));

    }
}
