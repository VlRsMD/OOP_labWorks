package lab9;
import java.awt.*;

class LearnAWT extends Frame {
    TextField n1;
    TextField n2;
    Label l1;
    Button b;
    LearnAWT() {
        setTitle("Divider");
        n1 = new TextField();
        n1.setBounds(100, 50, 85, 20);
        n2 = new TextField();
        n2.setBounds(100, 100, 85, 20);
        b = new Button("Divide");
        b.setBounds(110,220,60,40);
        l1 = new Label("");
        l1.setBounds(100, 120, 85, 20);
        add(b);
        add(n1);
        add(n2);
        add(l1);
        setSize(300,300);
        setVisible(true);

        b.addActionListener(e -> {
            float a = Float.parseFloat(n1.getText());
            float b = Float.parseFloat(n2.getText());
            float c = a/b;
            l1.setText("The result of division of first number by the second = " + c);
        });

        try
        {
            Float.parseFloat(n1.getText());
        }
        catch (Exception e)
        {
            System.out.println(n1.getText() + " is not a valid number");
        }

        if (Float.parseFloat(n2.getText()) == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        class Exc13 extends Exception {
            public void main(String[] args) throws Exception {
               if (Float.parseFloat(n1.getText()) == 13 || Float.parseFloat(n2.getText()) == 13)
                   throw new Exception("You use number 13");
            }
        }
    }
    public static void main(String []args) {
        new LearnAWT();
    }
}