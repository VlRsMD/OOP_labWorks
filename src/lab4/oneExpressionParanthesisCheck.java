package lab4;

public class oneExpressionParanthesisCheck {
    public static void main(String[] args) {
        String exp = "2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15))";
        correctParanthesis cor = new correctParanthesis();
        System.out.println(cor.corrParen(exp));
    }
}
