package quizgui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class GUI extends JFrame {

	public static JPanel contentPane;
	public static JTextField tname;
	public static JTextField tage;
	public static JTable table;
	public static final ButtonGroup buttonGroup = new ButtonGroup();
	public static JComboBox cmbdept;
	public static JRadioButton rbtnMess;
	public static JRadioButton rdbtnEncoder;
	public static JRadioButton rdbtnTechnician;
	public static JRadioButton rdbtnProgrammer;
	public static JButton btnPrint;
	public static JTextField tfHourswork;
	public static JLabel lbhourswork;
	private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	@SuppressWarnings("unchecked")
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1110, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel.setBounds(28, 45, 492, 304);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(21, 84, 81, 14);
		panel.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblAge.setBounds(21, 108, 81, 18);
		panel.add(lblAge);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblDepartment.setBounds(231, 108, 81, 18);
		panel.add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Choose Position:");
		lblPosition.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblPosition.setBounds(10, 154, 127, 18);
		panel.add(lblPosition);
		
		cmbdept = new JComboBox();
		cmbdept.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		cmbdept.setModel(new DefaultComboBoxModel(new String[] {"DOH", "Electrical", "Civil","Education","Engeneering"}));
		cmbdept.setToolTipText("");
		cmbdept.setBounds(341, 106, 109, 22);
		panel.add(cmbdept);
		
		rbtnMess = new JRadioButton("Messenger");
		rbtnMess.setBackground(new Color(255, 255, 255));
		rbtnMess.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		buttonGroup.add(rbtnMess);
		rbtnMess.setBounds(92, 173, 94, 23);
		panel.add(rbtnMess);
		
		rdbtnEncoder = new JRadioButton("Encoder");
		rdbtnEncoder.setBackground(new Color(255, 255, 255));
		rdbtnEncoder.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		buttonGroup.add(rdbtnEncoder);
		rdbtnEncoder.setBounds(281, 173, 81, 23);
		panel.add(rdbtnEncoder);
		
		rdbtnTechnician = new JRadioButton("Technician");
		rdbtnTechnician.setBackground(new Color(255, 255, 255));
		rdbtnTechnician.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		buttonGroup.add(rdbtnTechnician);
		rdbtnTechnician.setBounds(92, 204, 109, 23);
		panel.add(rdbtnTechnician);
		
		rdbtnProgrammer = new JRadioButton("Programmer");
		rdbtnProgrammer.setBackground(new Color(255, 255, 255));
		rdbtnProgrammer.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		buttonGroup.add(rdbtnProgrammer);
		rdbtnProgrammer.setBounds(281, 204, 119, 23);
		panel.add(rdbtnProgrammer);
		
		tname = new JTextField();
		tname.setBounds(78, 78, 96, 20);
		panel.add(tname);
		tname.setColumns(10);
		
		tage = new JTextField();
		tage.setColumns(10);
		tage.setBounds(78, 109, 96, 20);
		panel.add(tage);
		
		tfHourswork = new JTextField();
		tfHourswork.setColumns(10);
		tfHourswork.setBounds(341, 78, 109, 20);
		panel.add(tfHourswork);
		
		lbhourswork = new JLabel("Hours Worked");
		lbhourswork.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lbhourswork.setBounds(231, 82, 94, 18);
		panel.add(lbhourswork);
		
		btnPrint = new JButton("RUN PROGRAM");
		btnPrint.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnPrint.setBounds(176, 245, 134, 28);
		panel.add(btnPrint);
		
		lblNewLabel_1 = new JLabel("Employee Informations");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(176, 32, 156, 13);
		panel.add(lblNewLabel_1);
		btnPrint.addActionListener(new EventDataPrint());
	
		
		
	}

}
