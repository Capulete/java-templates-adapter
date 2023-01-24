public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Ints intsCalc = new IntsCalculator(calc);
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
        System.out.println(intsCalc.mult(16, 93));
    }
}