package TourPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class CustomerLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNa;
	private JLabel lblDontHaveAn;
	private JButton btnReg;
	private JButton btnLogin;
	Connection conn;
	String db="jdbc:mysql://localhost/tourpackagedb";
	String username="root";
	String password="root";
	java.sql.Statement stmt;
	String sql;
	ResultSet rs;
	private JButton btnBack;
	private JPasswordField txtPw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLogin frame = new CustomerLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerLogin() {
		setTitle("Login Form for Customers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 273);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 222, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginForm = new JLabel("Login Form");
		lblLoginForm.setFont(new Font("Pristina", Font.BOLD, 22));
		lblLoginForm.setBounds(191, 21, 144, 25);
		contentPane.add(lblLoginForm);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblName.setBounds(83, 69, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblPassword.setBounds(83, 112, 73, 14);
		contentPane.add(lblPassword);
		
		txtNa = new JTextField();
		txtNa.setBackground(new Color(211, 211, 211));
		txtNa.setBounds(252, 67, 153, 20);
		contentPane.add(txtNa);
		txtNa.setColumns(10);
		
		lblDontHaveAn = new JLabel("Don't have an account?");
		lblDontHaveAn.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblDontHaveAn.setBounds(334, 161, 137, 14);
		contentPane.add(lblDontHaveAn);
		
		btnReg = new JButton("Register here");
		btnReg.setForeground(new Color(25, 25, 112));
		btnReg.setBackground(new Color(244, 164, 96));
		btnReg.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnReg.setBounds(337, 176, 114, 23);
		contentPane.add(btnReg);
		
		btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(244, 164, 96));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogin.setBounds(83, 176, 89, 23);
		contentPane.add(btnLogin);
		
		btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 160, 122));
		btnBack.setBounds(213, 177, 89, 23);
		contentPane.add(btnBack);
		
		txtPw = new JPasswordField();
		txtPw.setBackground(new Color(211, 211, 211));
		txtPw.setBounds(252, 110, 153, 20);
		contentPane.add(txtPw);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\@Sue\\year2\\first semeter\\assignment\\Java\\between-two-worlds-background-sky-water-morph-light11.jpg"));
		label.setBounds(0, 0, 507, 234);
		contentPane.add(label);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean flag=false;
				try {
					createDB();
					stmt=conn.createStatement();
					sql="select * from customertb";
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						if((txtNa.getText().equals(rs.getString("cname"))) && 
								(txtPw.getText().equals(rs.getString("cpwd")))) {
							Booking frame=new Booking();
							frame.setVisible(true);
							flag=true;
						}
					}
					if(!flag) {
						JOptionPane.showMessageDialog(null, "Customer name and Password aren't match!!\nPlease Right again!!");
						CustomerLogin frame=new CustomerLogin();
						frame.setVisible(true);
					}

					stmt.close();
					conn.close();
				}catch(Exception e1) {
					System.out.println("Error"+e1);
				}
			}
		});
		

		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Customer frame=new Customer();
				frame.setVisible(true);
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BeforeLogin frame=new BeforeLogin();
				frame.setVisible(true);
			}
		});
		
	}
	void createDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(db, username, password);
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
