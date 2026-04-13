package bankApplication;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankApplication {
	private static double balance = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Balance Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
        }

    private static void placeComponents(JPanel panel) {
        // GUI objects
    	JButton balanceButton = new JButton("Balance");
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JTextField amountField = new JTextField(20);
        JLabel balanceLabel = new JLabel("Balance: $");

        // GUI layout
        panel.setLayout(null);
        panel.add(balanceButton);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(amountField);
        panel.add(balanceLabel);
        
        // GUI object sizes (reminder: left, down, size, width) 
        balanceButton.setBounds(250, 80, 80, 25);
        depositButton.setBounds(40, 80, 80, 25);
        withdrawButton.setBounds(140, 80, 90, 25);
        amountField.setBounds(40, 20, 300, 25);
        balanceLabel.setBounds(40, 120, 300, 25);
        
        // action listener for depositing
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                balance += Double.parseDouble(amountField.getText());
                amountField.setText("Deposited");
            }
        });
        
        // action listener for withdrawing
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                balance -= Double.parseDouble(amountField.getText());
                amountField.setText("Withdrawn");
            }
        }); 
        
        // action listener for checking balance
        balanceButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		amountField.setText("Checking Balance");
        		balanceLabel.setText("Balance: $" + String.format("%.2f", balance));
        	}
        });
    }
}
