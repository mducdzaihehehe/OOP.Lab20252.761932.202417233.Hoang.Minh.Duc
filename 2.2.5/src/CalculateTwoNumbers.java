import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        String message;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number:",
                "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number:",
                "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        message = "Sum: " + (num1 + num2)
                + "\nDifference: " + (num1 - num2)
                + "\nProduct: " + (num1 * num2);

        if (num2 != 0) {
            message += "\nQuotient: " + (num1 / num2);
        } else {
            message += "\nQuotient: cannot divide by zero";
        }

        JOptionPane.showMessageDialog(null,
                message,
                "Result",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}