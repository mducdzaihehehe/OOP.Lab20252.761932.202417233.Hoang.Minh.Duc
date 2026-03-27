import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog(
                null,
                "Choose an option:\n"
                        + "1. Solve first-degree equation (ax + b = 0)\n"
                        + "2. Solve system of first-degree equations (2 variables)\n"
                        + "3. Solve second-degree equation (ax^2 + bx + c = 0)",
                "Equation Solver",
                JOptionPane.INFORMATION_MESSAGE
        );

        if (choice == null) {
            System.exit(0);
        }

        switch (choice) {
            case "1":
                solveLinearEquation();
                break;
            case "2":
                solveLinearSystem();
                break;
            case "3":
                solveQuadraticEquation();
                break;
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid choice!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
        }

        System.exit(0);
    }

    public static void solveLinearEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b:"));

        String result;
        double eps = 1e-10;

        if (Math.abs(a) < eps) {
            if (Math.abs(b) < eps) {
                result = "The equation has infinitely many solutions.";
            } else {
                result = "The equation has no solution.";
            }
        } else {
            double x = -b / a;
            result = "The equation has one solution:\nx = " + x;
        }

        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b2:"));

        double d = a11 * a22 - a21 * a12;
        double d1 = b1 * a22 - b2 * a12;
        double d2 = a11 * b2 - a21 * b1;

        String result;
        double eps = 1e-10;

        if (Math.abs(d) < eps) {
            if (Math.abs(d1) < eps && Math.abs(d2) < eps) {
                result = "The system has infinitely many solutions.";
            } else {
                result = "The system has no solution.";
            }
        } else {
            double x1 = d1 / d;
            double x2 = d2 / d;
            result = "The system has one solution:\n"
                    + "x1 = " + x1 + "\n"
                    + "x2 = " + x2;
        }

        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void solveQuadraticEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c:"));

        String result;
        double eps = 1e-10;

        if (Math.abs(a) < eps) {
            if (Math.abs(b) < eps) {
                if (Math.abs(c) < eps) {
                    result = "The equation has infinitely many solutions.";
                } else {
                    result = "The equation has no solution.";
                }
            } else {
                double x = -c / b;
                result = "This becomes a first-degree equation.\n"
                        + "The equation has one solution:\n"
                        + "x = " + x;
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < -eps) {
                result = "The equation has no real solution.";
            } else if (Math.abs(delta) < eps) {
                double x = -b / (2 * a);
                result = "The equation has a double root:\n"
                        + "x1 = x2 = " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "The equation has two distinct real roots:\n"
                        + "x1 = " + x1 + "\n"
                        + "x2 = " + x2;
            }
        }

        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}