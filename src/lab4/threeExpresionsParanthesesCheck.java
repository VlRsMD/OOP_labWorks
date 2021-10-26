package lab4;

public class threeExpresionsParanthesesCheck {
    public static void main(String[] args) {
        correctParanthesis corr = new correctParanthesis();
        String exp1 = "2x - 3y + 25 / (2+5)*12 - ((29*4-2) + 32) -14";
        String exp2 = "2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12";
        String exp3 = "((((((((((((((((((((2x-4y * 98 )))))))))))))))))))))";
        System.out.println(corr.corrParen(exp1));
        System.out.println(corr.corrParen(exp2));
        System.out.println(corr.corrParen(exp3));
    }
}
