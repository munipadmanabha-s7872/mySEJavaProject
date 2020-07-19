import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;


public class password extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;


	/**
	 * Create the frame.
	 */
	
	public password() {
		super("password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEnterPassword = new JLabel("ENTER");
		lblEnterPassword.setForeground(new Color(51, 51, 51));
		lblEnterPassword.setBounds(30, 69, 145, 31);
		lblEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBounds(207, 108, 139, 31);
		getContentPane().add(passwordField);
		
		JButton btnOk = new JButton("OK");		
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOk.setForeground(new Color(0, 0, 0));
		btnOk.setBackground(new Color(230, 230, 250));
		btnOk.setBounds(226, 182, 104, 31);
		btnOk.addActionListener(new java.awt.event.ActionListener() {
            @SuppressWarnings("deprecation")
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String pass=passwordField.getText();
    		    if(passwordField.getText().trim().isEmpty())	{
    		    	JOptionPane.showMessageDialog(null, "Please enter the password First!!!!");
    		    	}
    		    else if(pass.equals("secret")) {
        		    	setVisible(false);
        				
        		    }else {
        				JOptionPane.showMessageDialog(null, "Wrong Password.....!!!");
        			}   
    		    }     
        });
		contentPane.setLayout(null);
		contentPane.add(passwordField);
		contentPane.add(lblEnterPassword);
		contentPane.add(btnOk);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 456, 312);
		contentPane.add(lblNewLabel);
		setResizable(false);
	
	}

public static void main(String[] args) {
    password frame = new password();

	frame.setVisible(true);
}
}




