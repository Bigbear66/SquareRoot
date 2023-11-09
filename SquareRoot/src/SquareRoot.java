import javax.swing.JOptionPane;
public class SquareRoot
{
    //-----------------------------------------------------------------
    // Determines square root of a number.
    // Uses multiple dialog boxes for user interaction.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        String numStr, result; int num, again;
        do {
            numStr = JOptionPane.showInputDialog("Enter an integer: ");
            num = Integer.parseInt(numStr);
            result = "Square Root of the number is " + Math.sqrt(num);
            JOptionPane.showMessageDialog(null, result);
            again = JOptionPane.showConfirmDialog(null, "Do Another?");
        }
        while (again == JOptionPane.YES_OPTION); }
}