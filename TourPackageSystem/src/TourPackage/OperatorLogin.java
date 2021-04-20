package TourPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class OperatorLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNa;
	private JButton btnLogin;
	Connection conn;
	String db="jdbc:mysql://localhost/tourpackagedb";
	String username="root";
	String password="root";
	java.sql.Statement stmt;
	String sql;
	ResultSet rs;
	private JPasswordField txtPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorLogin frame = new OperatorLogin();
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
	public OperatorLogin() {
		setTitle("Login Form for Operators");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 360);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 222, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginForm = new JLabel("Login Form");
		lblLoginForm.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblLoginForm.setBounds(213, 11, 92, 25);
		contentPane.add(lblLoginForm);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblName.setBounds(83, 69, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblPassword.setBounds(83, 112, 73, 14);
		contentPane.add(lblPassword);
		
		txtNa = new JTextField();
		txtNa.setBackground(new Color(211, 211, 211));
		txtNa.setBounds(252, 67, 153, 20);
		contentPane.add(txtNa);
		txtNa.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(244, 164, 96));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogin.setBounds(316, 162, 89, 23);
		contentPane.add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(76, 204, 346, 106);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JRadioButton rdbtnPa = new JRadioButton("Go to Package Information Page");
		rdbtnPa.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		rdbtnPa.setBackground(new Color(255, 182, 193));
		rdbtnPa.setBounds(6, 7, 243, 23);
		panel.add(rdbtnPa);
		
		JRadioButton rdbtnIn = new JRadioButton("Go to Information Page");
		rdbtnIn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		rdbtnIn.setBackground(new Color(255, 182, 193));
		rdbtnIn.setBounds(6, 46, 243, 23);
		panel.add(rdbtnIn);
		
		ButtonGroup group=new ButtonGroup();
		group.add(rdbtnPa);
		group.add(rdbtnIn);
		
		JButton button = new JButton("OK");
		button.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button.setBackground(new Color(244, 164, 96));
		button.setBounds(239, 76, 89, 23);
		panel.add(button);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 160, 122));
		btnBack.setBounds(83, 163, 89, 23);
		contentPane.add(btnBack);
		
		txtPwd = new JPasswordField();
		txtPwd.setBackground(new Color(211, 211, 211));
		txtPwd.setBounds(252, 110, 153, 20);
		contentPane.add(txtPwd);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\@Sue\\year2\\first semeter\\assignment\\Java\\between-two-worlds-background-sky-water-morph-light11.jpg"));
		label.setBounds(0, 0, 507, 321);
		contentPane.add(label);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean flag=false;
				try {
					createDB();
					stmt=conn.createStatement();
					sql="select * from operatortb";
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						if((txtNa.getText().equals(rs.getString("oname"))) && 
								(txtPwd.getText().equals(rs.getString("opwd")))) {
							flag=true;
							panel.setVisible(true);
						}
					}
					if(!flag) {
						JOptionPane.showMessageDialog(null, "Operator's name and Password aren't match!!\nPlease Right again!!");
						OperatorLogin frame=new OperatorLogin();
						frame.setVisible(true);
					}

					stmt.close();
					conn.close();
				}catch(Exception e1) {
					System.out.println("Error"+e1);
				}
			}
		});
		

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String type=null;
				if(rdbtnPa.isSelected())
					type="Pa";
				if(rdbtnIn.isSelected())
					type="In";
				
				if(type=="Pa") {
					Package frame=new Package();
					frame.setVisible(true);
				}
				else {
					Information frame=new Information();
					frame.setVisible(true);
				}
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
