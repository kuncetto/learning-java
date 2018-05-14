public class Program {
    public static void main(String[] args) {
        int a = 5, b = 6;

        System.out.format("%d + %d = %d\n", a, b, Operators.add(a, b));
        System.out.format("%d - %d = %d\n", a, b, Operators.sub(a, b));
        System.out.format("%d * %d = %d\n", a, b, Operators.mult(a, b));
        System.out.format("%d / %d = %d\n", a, b, Operators.add(a, b));
        System.out.format("%d %% %d = %d\n", a, b, Operators.mod(a, b));

        System.out.format(a  + " < " + b + " is " + Operators.lessThan(a, b) + "\n");
        System.out.format(a  + " = " + b + " is " + Operators.equalsTo(a, b) + "\n");
        System.out.format(a  + " > " + b + " is " + Operators.greatearThan(a, b) + "\n");
    }
}
