package employ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
public class Employee {

	private JFrame frame;
	private JTextField jtxtEmpID;
	private JTable table;
	private JTextField jtxtFirstName;
	private JTextField jtxtLastName;
	private JTextField jtxtGender;
	private JTextField jtxtDOB;
	private JTextField Qualification;
	private JTextField jtxtStartDate;
	private JTextField jtxtEndDate;
	private JTextField jtxtInstitution;
	private JTextField jtxtAddress;
	private JTextField jtxtPercentage;
	private JTextField jtxtRelationship;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee window = new Employee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EmpID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(27, 10, 186, 33);
		frame.getContentPane().add(lblNewLabel);
		
		jtxtEmpID = new JTextField();
		jtxtEmpID.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtEmpID.setBounds(203, 10, 259, 33);
		frame.getContentPane().add(jtxtEmpID);
		jtxtEmpID.setColumns(10);
		
		JButton btnNewButton = new JButton("Add New");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(39, 608, 294, 54);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(511, 10, 723, 506);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"EmpID", "FirstName", "LastName", "Gender", "DOB", "Qualification", "StartDate", "EndDate", "Institution", "Addresss", "Percentage", "Reatioship"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		scrollPane.setViewportView(table);
		
		JLabel lblFirsrname = new JLabel("FirsrName");
		lblFirsrname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFirsrname.setBounds(27, 53, 186, 33);
		frame.getContentPane().add(lblFirsrname);
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLastname.setBounds(27, 97, 186, 33);
		frame.getContentPane().add(lblLastname);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDob.setBounds(27, 183, 186, 33);
		frame.getContentPane().add(lblDob);
		
		JLabel lblQualification = new JLabel("Qualification");
		lblQualification.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQualification.setBounds(27, 226, 186, 33);
		frame.getContentPane().add(lblQualification);
		
		JLabel lblStartdate = new JLabel("StartDate");
		lblStartdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStartdate.setBounds(27, 269, 186, 33);
		frame.getContentPane().add(lblStartdate);
		
		JLabel lblEnddate = new JLabel("EndDate");
		lblEnddate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnddate.setBounds(27, 313, 186, 33);
		frame.getContentPane().add(lblEnddate);
		
		JLabel lblInstitution = new JLabel("Institution");
		lblInstitution.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInstitution.setBounds(27, 356, 186, 33);
		frame.getContentPane().add(lblInstitution);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(27, 400, 186, 33);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPercentage.setBounds(27, 443, 186, 33);
		frame.getContentPane().add(lblPercentage);
		
		JLabel lblRelationship = new JLabel("Relationship");
		lblRelationship.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRelationship.setBounds(27, 486, 186, 33);
		frame.getContentPane().add(lblRelationship);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGender.setBounds(27, 140, 186, 33);
		frame.getContentPane().add(lblGender);
		
		jtxtFirstName = new JTextField();
		jtxtFirstName.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtFirstName.setColumns(10);
		jtxtFirstName.setBounds(203, 53, 259, 33);
		frame.getContentPane().add(jtxtFirstName);
		
		jtxtLastName = new JTextField();
		jtxtLastName.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtLastName.setColumns(10);
		jtxtLastName.setBounds(203, 96, 259, 33);
		frame.getContentPane().add(jtxtLastName);
		
		jtxtGender = new JTextField();
		jtxtGender.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtGender.setColumns(10);
		jtxtGender.setBounds(203, 140, 259, 33);
		frame.getContentPane().add(jtxtGender);
		
		jtxtDOB = new JTextField();
		jtxtDOB.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtDOB.setColumns(10);
		jtxtDOB.setBounds(203, 183, 259, 33);
		frame.getContentPane().add(jtxtDOB);
		
		Qualification = new JTextField();
		Qualification.setFont(new Font("Tahoma", Font.BOLD, 18));
		Qualification.setColumns(10);
		Qualification.setBounds(203, 226, 259, 33);
		frame.getContentPane().add(Qualification);
		
		jtxtStartDate = new JTextField();
		jtxtStartDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtStartDate.setColumns(10);
		jtxtStartDate.setBounds(203, 269, 259, 33);
		frame.getContentPane().add(jtxtStartDate);
		
		jtxtEndDate = new JTextField();
		jtxtEndDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtEndDate.setColumns(10);
		jtxtEndDate.setBounds(203, 312, 259, 33);
		frame.getContentPane().add(jtxtEndDate);
		
		jtxtInstitution = new JTextField();
		jtxtInstitution.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtInstitution.setColumns(10);
		jtxtInstitution.setBounds(203, 356, 259, 33);
		frame.getContentPane().add(jtxtInstitution);
		
		jtxtAddress = new JTextField();
		jtxtAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtAddress.setColumns(10);
		jtxtAddress.setBounds(203, 399, 259, 33);
		frame.getContentPane().add(jtxtAddress);
		
		jtxtPercentage = new JTextField();
		jtxtPercentage.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtPercentage.setColumns(10);
		jtxtPercentage.setBounds(203, 443, 259, 33);
		frame.getContentPane().add(jtxtPercentage);
		
		jtxtRelationship = new JTextField();
		jtxtRelationship.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtRelationship.setColumns(10);
		jtxtRelationship.setBounds(203, 486, 259, 33);
		frame.getContentPane().add(jtxtRelationship);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPrint.setBounds(396, 608, 294, 54);
		frame.getContentPane().add(btnPrint);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(747, 608, 294, 54);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(1083, 608, 294, 54);
		frame.getContentPane().add(btnExit);
	}
}
