import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


public class mainClass extends JFrame {

	private JPanel contentPane;
	private JButton btnAdmin;
	private JButton btnInstructor;
	public mainClass() {
		super("HomePage");
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 465); 
		contentPane = new JPanel();
		
		
		setContentPane(contentPane);
		JLabel lblStudentattendanceManagement = new JLabel("Student attendance Management");
		lblStudentattendanceManagement.setBounds(150, 11, 298, 73);
		lblStudentattendanceManagement.setToolTipText("");
		lblStudentattendanceManagement.setFont(new Font("Baskerville Old Face", Font.BOLD, 23));
		lblStudentattendanceManagement.setLabelFor(this);
		lblStudentattendanceManagement.setForeground(new Color(165, 42, 42));
		lblStudentattendanceManagement.setBackground(new Color(255, 69, 0));
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBounds(100, 102, 153, 200);
		btnAdmin.setForeground(new Color(255, 69, 0));
		btnAdmin.setBackground(new Color(230, 230, 250));
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdmin.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	setVisible(false);
	            	password ob =new password();
	        		ob.setVisible(true);
	            }
	        });
		
		JButton btnInstructor = new JButton("Instructor");
		btnInstructor.setBounds(300, 102, 153, 200);
		btnInstructor.setForeground(new Color(255, 69, 0));
		btnInstructor.setBackground(new Color(230, 230, 250));
		btnInstructor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	setVisible(false);
            	password ob =new password();
        		ob.setVisible(true);
            	}
        });
	
		contentPane.setLayout(null);
		contentPane.add(btnInstructor);
		contentPane.add(btnAdmin);
		contentPane.add(lblStudentattendanceManagement);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Open Sans", Font.PLAIN, 15));
		lblNewLabel.setBounds(0, 0, 654, 441);
		contentPane.add(lblNewLabel);
		setResizable(false);
	}
	
	
public static void main(String[] args) {

	mainClass frame = new mainClass();

	frame.setVisible(true);
}

}
