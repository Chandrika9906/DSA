import javax.swing.JOptionPane; // Fixed the typo (JOPtionPane -> JOptionPane)

public class example {
    public static void main(String[] args) {
        // Show a popup input dialog
        String name = JOptionPane.showInputDialog("What is your name?");

        // Show a message dialog
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}
