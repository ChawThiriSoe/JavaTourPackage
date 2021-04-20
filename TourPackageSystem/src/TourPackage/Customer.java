package TourPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class Customer extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtDob;
	private JTextField txtNrc;
	private JTextField txtPhno;
	private JTextField txtEmail;
	Connection conn;
	String db="jdbc:mysql://localhost/tourpackagedb";
	String username="root";
	String password="root";
	java.sql.Statement stmt;
	String sql;
	ResultSet rs;
	private JTextField txtAddr;
	private JTextField txtCpwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer();
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
	public Customer() {
		setTitle("Customer Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 222, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCutomerId = new JLabel("Cutomer ID");
		lblCutomerId.setForeground(new Color(255, 255, 255));
		lblCutomerId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblCutomerId.setBounds(58, 27, 91, 14);
		contentPane.add(lblCutomerId);
		
		JLabel lblCutomerName = new JLabel("Name");
		lblCutomerName.setForeground(new Color(255, 255, 255));
		lblCutomerName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblCutomerName.setBounds(58, 69, 115, 14);
		contentPane.add(lblCutomerName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setForeground(new Color(255, 255, 255));
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblDateOfBirth.setBounds(58, 114, 91, 14);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(new Color(255, 255, 255));
		lblPhoneNumber.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblPhoneNumber.setBounds(58, 245, 115, 14);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblEmail.setBounds(58, 288, 91, 14);
		contentPane.add(lblEmail);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblGender.setBounds(58, 159, 91, 14);
		contentPane.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(255, 255, 255));
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblAddress.setBounds(58, 334, 91, 14);
		contentPane.add(lblAddress);
		
		JLabel lblNrc = new JLabel("NRC");
		lblNrc.setForeground(new Color(255, 255, 255));
		lblNrc.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNrc.setBounds(58, 203, 91, 14);
		contentPane.add(lblNrc);
		
		JLabel lblid = new JLabel("");
		lblid.setBounds(246, 27, 115, 14);
		contentPane.add(lblid);
		
		txtName = new JTextField();
		txtName.setBackground(new Color(216, 191, 216));
		txtName.setBounds(246, 67, 219, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtDob = new JTextField();
		txtDob.setColumns(10);
		txtDob.setBackground(new Color(216, 191, 216));
		txtDob.setBounds(246, 112, 219, 20);
		contentPane.add(txtDob);
		
		txtNrc = new JTextField();
		txtNrc.setColumns(10);
		txtNrc.setBackground(new Color(216, 191, 216));
		txtNrc.setBounds(246, 201, 219, 20);
		contentPane.add(txtNrc);
		
		txtPhno = new JTextField();
		txtPhno.setBackground(new Color(216, 191, 216));
		txtPhno.setColumns(10);
		txtPhno.setBounds(246, 243, 219, 20);
		contentPane.add(txtPhno);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(216, 191, 216));
		txtEmail.setColumns(10);
		txtEmail.setBounds(246, 286, 219, 20);
		contentPane.add(txtEmail);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(new Color(216, 191, 216));
		rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnMale.setBounds(246, 156, 91, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(new Color(216, 191, 216));
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnFemale.setBounds(350, 156, 91, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup group=new ButtonGroup();
		group.add(rdbtnMale);
		group.add(rdbtnFemale);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBackground(new Color(255, 160, 122));
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnRegister.setBounds(344, 423, 121, 23);
		contentPane.add(btnRegister);
		
		txtAddr = new JTextField();
		txtAddr.setColumns(10);
		txtAddr.setBackground(new Color(216, 191, 216));
		txtAddr.setBounds(246, 332, 219, 20);
		contentPane.add(txtAddr);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(128, 128, 128));
		lblPassword.setBackground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblPassword.setBounds(58, 378, 91, 14);
		contentPane.add(lblPassword);
		
		txtCpwd = new JTextField();
		txtCpwd.setColumns(10);
		txtCpwd.setBackground(new Color(216, 191, 216));
		txtCpwd.setBounds(246, 376, 219, 20);
		contentPane.add(txtCpwd);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 160, 122));
		btnBack.setBounds(60, 423, 89, 23);
		contentPane.add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\@Sue\\year2\\first semeter\\assignment\\Java\\between-two-worlds-background-sky-water-morph-light11.jpg"));
		label.setBounds(0, 0, 569, 461);
		contentPane.add(label);
		
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					createDB();
					stmt=conn.createStatement();
					sql="select MAX(cid) from customertb";
					rs=stmt.executeQuery(sql);
					
					while(rs.next()) {
						int count=rs.getInt(1);
						lblid.setText(String.valueOf(count+1));
					}
				}catch(Exception e1) {
					System.out.println("Error"+e1);
				}
				
				try {
					createDB();
					
					String gender=null;
					if(rdbtnMale.isSelected())
						gender="Male";
					if(rdbtnFemale.isSelected())
						gender="Female";
					stmt=conn.createStatement();					
					
					//============Insert===============

					String sqlinsert="INSERT INTO customertb VALUES ("+Integer.parseInt(lblid.getText())+",'"
							+txtName.getText()+"','"+txtDob.getText()+"','"+txtPhno.getText()+"','"
							+txtEmail.getText()+"','"+gender+"','"+txtAddr.getText()+"','"+txtNrc.getText()+"','"
							+txtCpwd.getText()+"')";
					stmt.executeUpdate(sqlinsert);
					JOptionPane.showMessageDialog(null, "Register Successful !!");
					CustomerLogin frame=new CustomerLogin();
					frame.setVisible(true);
					
							
				} catch (SQLException e) {
					e.printStackTrace();
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
