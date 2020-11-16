package proyectprog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.Action;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.RowFilter;

import java.awt.GridLayout;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

import persistencia.Conn;
import persistencia.ControladorBD;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import java.awt.List;
import java.awt.Checkbox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class pantalla {

	ControladorLogic controladorlg = new ControladorLogic();
	TableRowSorter trs;
	Conn conn = new Conn();
	Connection connection = conn.conectarMySQL();
	private JFrame contentPane;
	private CardLayout cardLayout;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_2;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_15;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTable table_4;
	private JTextField textField_32;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_5;
	private JTextField textField_5;
	private JTextField textField_14;
	private JTextField textField_16;
	private JTextField textField_22;
	private JTable table_6;
	private JTextField textField_33;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantalla window = new pantalla();
					window.contentPane.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pantalla() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		SimpleDateFormat sdft = new SimpleDateFormat("yyyy-MM-dd");

		contentPane = new JFrame();
		contentPane.setResizable(false);
		contentPane.setBounds(100, 100, 450, 300);
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.getContentPane().setLayout(null);

		JPanel panelMaster = new JPanel();
		panelMaster.setBounds(0, 0, 442, 273);
		contentPane.getContentPane().add(panelMaster);
		panelMaster.setLayout(new CardLayout(0, 0));
		cardLayout = (CardLayout) panelMaster.getLayout();

		JPanel inicio = new JPanel();
		panelMaster.add(inicio, "MENU");
		inicio.setLayout(null);

		JButton btnNewButton_1 = new JButton("Ingresar");

		btnNewButton_1.setBounds(166, 126, 104, 23);
		inicio.add(btnNewButton_1);

		JLabel lblCodigo_3_4_2_1_2 = new JLabel("Bienvenido");
		lblCodigo_3_4_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_2.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_1_2.setBounds(0, 64, 442, 51);
		inicio.add(lblCodigo_3_4_2_1_2);

		JButton btnNewButton_10 = new JButton("Salir");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_10.setBounds(166, 159, 104, 23);
		inicio.add(btnNewButton_10);

		JPanel login = new JPanel();
		panelMaster.add(login, "panelRegister");
		login.setLayout(null);

		JLabel lblPasw = new JLabel("Contrase\u00F1a");
		lblPasw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasw.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPasw.setBounds(93, 130, 104, 48);
		login.add(lblPasw);

		textField_3 = new JPasswordField();
		textField_3.setColumns(10);
		textField_3.setBounds(207, 145, 109, 20);
		login.add(textField_3);

		JLabel lblMail = new JLabel("C.I");
		lblMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblMail.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMail.setBounds(93, 84, 104, 48);
		login.add(lblMail);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(207, 99, 109, 20);
		login.add(textField_4);

		JButton btnNewButton_2_1 = new JButton("Iniciar Sesion");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(195, 193, 121, 23);
		login.add(btnNewButton_2_1);

		JLabel lblCodigo_3_4_2_1_2_1 = new JLabel("Iniciar sesi\u00F3n");
		lblCodigo_3_4_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_1_2_1.setBounds(0, 29, 442, 51);
		login.add(lblCodigo_3_4_2_1_2_1);

		JButton btnNewButton_8 = new JButton("Atr\u00E1s");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_8.setBounds(93, 193, 89, 23);
		login.add(btnNewButton_8);

		JPanel darAltaUsuario = new JPanel();
		panelMaster.add(darAltaUsuario, "DISCHANGE_USER");
		darAltaUsuario.setLayout(null);

		JButton btnNewButton = new JButton("Estudiante");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(141, 101, 139, 23);
		darAltaUsuario.add(btnNewButton);

		JButton btnAltaDocente = new JButton("Docente");
		btnAltaDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAltaDocente.setBounds(141, 135, 139, 23);
		darAltaUsuario.add(btnAltaDocente);

		JButton btnAltaFuncionario = new JButton("Funcionario");
		btnAltaFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAltaFuncionario.setBounds(141, 169, 139, 23);
		darAltaUsuario.add(btnAltaFuncionario);

		JLabel lblCodigo_3_4_2_1_1 = new JLabel("Seleccione tipo de usuario");
		lblCodigo_3_4_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_1_1.setBounds(0, 23, 442, 51);
		darAltaUsuario.add(lblCodigo_3_4_2_1_1);

		JPanel darAltaMateria = new JPanel();
		panelMaster.add(darAltaMateria, "DISCHANGE_SUBJECT");
		darAltaMateria.setLayout(null);

		textField = new JTextField();
		textField.setBounds(92, 70, 86, 20);
		darAltaMateria.add(textField);
		textField.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(28, 55, 101, 48);
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 15));
		darAltaMateria.add(lblNombre);

		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(28, 101, 101, 41);
		lblCodigo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 15));
		darAltaMateria.add(lblCodigo);

		textField_1 = new JTextField();
		textField_1.setBounds(92, 112, 86, 20);
		textField_1.setColumns(10);
		darAltaMateria.add(textField_1);

		JLabel lblCodigo_1 = new JLabel("Generacion");
		lblCodigo_1.setBounds(188, 101, 132, 41);
		lblCodigo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_1.setFont(new Font("Arial", Font.PLAIN, 15));
		darAltaMateria.add(lblCodigo_1);

		JButton btnNewButton_3 = new JButton("Crear Materia");
		btnNewButton_3.setBounds(137, 197, 160, 23);

		darAltaMateria.add(btnNewButton_3);

		JLabel lblCodigo_3_4_2_2 = new JLabel("Alta a una materia");
		lblCodigo_3_4_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_2.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_2.setBounds(0, 11, 442, 51);
		darAltaMateria.add(lblCodigo_3_4_2_2);

		JComboBox comboBox_1_4 = new JComboBox();
		comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] { "TIC", "ADM" }));
		comboBox_1_4.setBounds(283, 70, 85, 20);
		darAltaMateria.add(comboBox_1_4);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox_5.setBounds(283, 111, 126, 22);
		darAltaMateria.add(comboBox_5);

		JLabel lblNewLabel_7 = new JLabel("Orientacion");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(188, 73, 86, 14);
		darAltaMateria.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("CI del Docente que la Dicta");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(28, 153, 201, 14);
		darAltaMateria.add(lblNewLabel_8);

		textField_33 = new JTextField();
		textField_33.setBounds(239, 151, 118, 20);
		darAltaMateria.add(textField_33);
		textField_33.setColumns(10);

		JPanel altaInasistencia = new JPanel();
		panelMaster.add(altaInasistencia, "DISCHANGE_ABSENCE");
		altaInasistencia.setLayout(null);

		JLabel lblNewLabel = new JLabel("Crear Inasistencia");
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblNewLabel.setBounds(129, 23, 191, 50);
		altaInasistencia.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cantidad de Horas");
		lblNewLabel_1.setBounds(10, 78, 89, 22);
		altaInasistencia.add(lblNewLabel_1);

		textField_5 = new JTextField();
		textField_5.setBounds(109, 79, 86, 20);
		altaInasistencia.add(textField_5);
		textField_5.setColumns(10);

		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setBounds(109, 110, 100, 20);
		altaInasistencia.add(dateChooser_5);

		JLabel lblNewLabel_2 = new JLabel("Fecha");
		lblNewLabel_2.setBounds(10, 110, 89, 20);
		altaInasistencia.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("ID Materia");
		lblNewLabel_3.setBounds(10, 141, 73, 14);
		altaInasistencia.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Tipo de Inasistencia");
		lblNewLabel_4.setBounds(10, 170, 100, 14);
		altaInasistencia.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("CI Estudiante");
		lblNewLabel_5.setBounds(205, 81, 73, 17);
		altaInasistencia.add(lblNewLabel_5);

		JButton btnNewButton_2 = new JButton("Crear");
		btnNewButton_2.setBounds(288, 166, 89, 23);
		altaInasistencia.add(btnNewButton_2);

		textField_14 = new JTextField();
		textField_14.setBounds(109, 138, 86, 20);
		altaInasistencia.add(textField_14);
		textField_14.setColumns(10);

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "JUSTIFICADA", "INJUSTIFICADA", "LLEGADA TARDE" }));
		comboBox_6.setBounds(109, 166, 119, 22);
		altaInasistencia.add(comboBox_6);

		textField_16 = new JTextField();
		textField_16.setBounds(288, 79, 86, 20);
		altaInasistencia.add(textField_16);
		textField_16.setColumns(10);

		JPanel consultarUsuario = new JPanel();
		panelMaster.add(consultarUsuario, "CONSULT_USER");
		consultarUsuario.setLayout(null);

		JLabel lblCodigo_3_4_2_5 = new JLabel("Consultar usuario");
		lblCodigo_3_4_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_5.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_5.setBounds(0, 29, 442, 51);
		consultarUsuario.add(lblCodigo_3_4_2_5);

		JLabel lblCodigo_3_8_1_1 = new JLabel("C.I del usuario");
		lblCodigo_3_8_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_8_1_1.setBounds(110, 117, 109, 18);
		consultarUsuario.add(lblCodigo_3_8_1_1);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(220, 117, 86, 20);
		consultarUsuario.add(textField_25);

		JButton btnNewButton_5 = new JButton("Consultar");
		btnNewButton_5.setBounds(176, 188, 89, 23);
		consultarUsuario.add(btnNewButton_5);

		JPanel consultarMateria = new JPanel();
		panelMaster.add(consultarMateria, "CONSULT_SUBJECT");
		consultarMateria.setLayout(null);

		JLabel lblCodigo_3_4_2_3 = new JLabel("Consultar materia");
		lblCodigo_3_4_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_3.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_3.setBounds(0, 21, 442, 51);
		consultarMateria.add(lblCodigo_3_4_2_3);

		JLabel lblCodigo_3_8_1_1_1 = new JLabel("Nombre o c\u00F3digo de materia");
		lblCodigo_3_8_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_8_1_1_1.setBounds(124, 98, 195, 18);
		consultarMateria.add(lblCodigo_3_8_1_1_1);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(163, 127, 117, 20);
		consultarMateria.add(textField_32);

		JButton btnNewButton_5_1 = new JButton("Consultar");
		btnNewButton_5_1.setBounds(176, 176, 89, 23);
		consultarMateria.add(btnNewButton_5_1);

		JPanel consultarInasistencia = new JPanel();
		panelMaster.add(consultarInasistencia, "CONSULT_ABSENCE");
		consultarInasistencia.setLayout(null);

		JLabel lblCodigo_3_4_2_4 = new JLabel("Consultar inasistencia");
		lblCodigo_3_4_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_4.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_4.setBounds(0, 7, 442, 51);
		consultarInasistencia.add(lblCodigo_3_4_2_4);

		JLabel lblCodigo_3_3_2 = new JLabel("Inicio");
		lblCodigo_3_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_3_2.setBounds(27, 69, 49, 18);
		consultarInasistencia.add(lblCodigo_3_3_2);

		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(71, 69, 95, 20);
		consultarInasistencia.add(dateChooser_3);

		JLabel lblCodigo_3_3_3 = new JLabel("Fin");
		lblCodigo_3_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_3_3.setBounds(176, 69, 33, 18);
		consultarInasistencia.add(lblCodigo_3_3_3);

		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(208, 69, 95, 20);
		consultarInasistencia.add(dateChooser_4);

		JButton btnNewButton_9 = new JButton("Consultar");
		btnNewButton_9.setBounds(326, 69, 89, 20);
		consultarInasistencia.add(btnNewButton_9);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(27, 101, 390, 131);
		consultarInasistencia.add(scrollPane_3);

		table_6 = new JTable();
		scrollPane_3.setViewportView(table_6);

		JPanel listarFuncionario = new JPanel();
		panelMaster.add(listarFuncionario, "LIST_TEACHERS");
		listarFuncionario.setLayout(null);

		JLabel lblCodigo_3_4_2_6_1 = new JLabel("Listar funcionario");
		lblCodigo_3_4_2_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_6_1.setBounds(0, 11, 442, 51);
		listarFuncionario.add(lblCodigo_3_4_2_6_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 73, 422, 155);
		listarFuncionario.add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);

		JPanel listarPendiente = new JPanel();
		panelMaster.add(listarPendiente, "LIST_SUBJECTS");
		listarPendiente.setLayout(null);

		JLabel lblCodigo_3_4_2_6_2 = new JLabel("Listar examenes");
		lblCodigo_3_4_2_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_2.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_6_2.setBounds(0, 11, 442, 51);
		listarPendiente.add(lblCodigo_3_4_2_6_2);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 73, 422, 166);
		listarPendiente.add(scrollPane_5);

		table_3 = new JTable();
		scrollPane_5.setViewportView(table_3);

		JPanel random = new JPanel();
		panelMaster.add(random, "random");
		random.setLayout(null);

		JLabel lblCodigo_3_4_2_1_2_3 = new JLabel("Seleccione opci\u00F3n en el men\u00FA");
		lblCodigo_3_4_2_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_2_3.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_1_2_3.setBounds(0, 90, 442, 51);
		random.add(lblCodigo_3_4_2_1_2_3);

		JPanel altaEstudiante = new JPanel();
		panelMaster.add(altaEstudiante, "altaUsuario");
		altaEstudiante.setLayout(null);

		JLabel lblCodigo_3 = new JLabel("Nombre");
		lblCodigo_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3.setBounds(29, 62, 58, 18);
		altaEstudiante.add(lblCodigo_3);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(97, 62, 86, 20);
		altaEstudiante.add(textField_6);

		JLabel lblCodigo_3_1 = new JLabel("CI");
		lblCodigo_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_1.setBounds(29, 92, 68, 18);
		altaEstudiante.add(lblCodigo_3_1);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(97, 92, 86, 20);
		altaEstudiante.add(textField_7);

		JLabel lblCodigo_3_2 = new JLabel("Mail");
		lblCodigo_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_2.setBounds(29, 124, 68, 18);
		altaEstudiante.add(lblCodigo_3_2);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(97, 123, 86, 20);
		altaEstudiante.add(textField_8);

		JLabel lblCodigo_3_3 = new JLabel("Nac.");
		lblCodigo_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_3.setBounds(29, 159, 68, 18);
		altaEstudiante.add(lblCodigo_3_3);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(322, 62, 86, 20);
		altaEstudiante.add(textField_12);

		JLabel lblCodigo_3_4 = new JLabel("Apellido");
		lblCodigo_3_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_4.setBounds(254, 62, 58, 18);
		altaEstudiante.add(lblCodigo_3_4);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(322, 92, 86, 20);
		altaEstudiante.add(textField_13);

		JLabel lblCodigo_3_5 = new JLabel("Pssw");
		lblCodigo_3_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_5.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_5.setBounds(254, 92, 76, 18);
		altaEstudiante.add(lblCodigo_3_5);

		JLabel lblCodigo_3_7 = new JLabel("Orient.");
		lblCodigo_3_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_7.setBounds(254, 125, 46, 18);
		altaEstudiante.add(lblCodigo_3_7);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(97, 159, 108, 20);
		altaEstudiante.add(dateChooser);

		JButton btnNewButton_4 = new JButton("Guardar cambios");
		btnNewButton_4.setForeground(Color.DARK_GRAY);

		btnNewButton_4.setBounds(254, 200, 154, 23);
		altaEstudiante.add(btnNewButton_4);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox.setBounds(97, 201, 86, 20);
		altaEstudiante.add(comboBox);

		JLabel lblCodigo_3_7_1 = new JLabel("Gen.");
		lblCodigo_3_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_7_1.setBounds(29, 201, 76, 18);
		altaEstudiante.add(lblCodigo_3_7_1);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "TIC", "ADM" }));
		comboBox_1.setBounds(322, 124, 86, 20);
		altaEstudiante.add(comboBox_1);

		JLabel lblCodigo_3_4_2 = new JLabel("Alta a un estudiante");
		lblCodigo_3_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2.setBounds(0, 0, 442, 51);
		altaEstudiante.add(lblCodigo_3_4_2);

		JLabel lblNewLabel_6 = new JLabel("Estado");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(254, 161, 58, 16);
		altaEstudiante.add(lblNewLabel_6);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { "ACTIVO", "EGRESADO", "DESVINCULADO" }));
		comboBox_7.setBounds(322, 158, 86, 22);
		altaEstudiante.add(comboBox_7);

		JPanel altaDocente = new JPanel();
		panelMaster.add(altaDocente, "Alta docente");
		altaDocente.setLayout(null);

		JLabel lblCodigo_3_8 = new JLabel("Nombre");
		lblCodigo_3_8.setBounds(29, 92, 58, 18);
		lblCodigo_3_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8.setFont(new Font("Arial", Font.PLAIN, 15));
		altaDocente.add(lblCodigo_3_8);

		textField_2 = new JTextField();
		textField_2.setBounds(97, 92, 86, 20);
		textField_2.setColumns(10);
		altaDocente.add(textField_2);

		textField_9 = new JTextField();
		textField_9.setBounds(97, 122, 86, 20);
		textField_9.setColumns(10);
		altaDocente.add(textField_9);

		JLabel lblCodigo_3_1_1 = new JLabel("C.I");
		lblCodigo_3_1_1.setBounds(29, 122, 68, 18);
		lblCodigo_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		altaDocente.add(lblCodigo_3_1_1);

		JLabel lblCodigo_3_2_1 = new JLabel("Mail");
		lblCodigo_3_2_1.setBounds(29, 154, 68, 18);
		lblCodigo_3_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		altaDocente.add(lblCodigo_3_2_1);

		textField_10 = new JTextField();
		textField_10.setBounds(97, 153, 86, 20);
		textField_10.setColumns(10);
		altaDocente.add(textField_10);

		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(97, 189, 106, 20);
		altaDocente.add(dateChooser_2);

		JLabel lblCodigo_3_3_1 = new JLabel("Nac.");
		lblCodigo_3_3_1.setBounds(29, 189, 68, 18);
		lblCodigo_3_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
		altaDocente.add(lblCodigo_3_3_1);

		JLabel lblCodigo_3_4_1 = new JLabel("Apellido");
		lblCodigo_3_4_1.setBounds(253, 92, 68, 18);
		lblCodigo_3_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_4_1.setFont(new Font("Arial", Font.PLAIN, 15));
		altaDocente.add(lblCodigo_3_4_1);

		textField_11 = new JTextField();
		textField_11.setBounds(321, 92, 86, 20);
		textField_11.setColumns(10);
		altaDocente.add(textField_11);

		textField_15 = new JTextField();
		textField_15.setBounds(321, 122, 86, 20);
		textField_15.setColumns(10);
		altaDocente.add(textField_15);

		JLabel lblCodigo_3_5_1 = new JLabel("Contrase\u00F1a");
		lblCodigo_3_5_1.setBounds(235, 122, 76, 18);
		lblCodigo_3_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_5_1.setFont(new Font("Arial", Font.PLAIN, 15));
		altaDocente.add(lblCodigo_3_5_1);

		JButton btnNewButton_4_1 = new JButton("Guardar cambios");

		btnNewButton_4_1.setBounds(253, 186, 154, 23);
		altaDocente.add(btnNewButton_4_1);

		JLabel lblCodigo_3_4_2_1 = new JLabel("Alta a un docente");
		lblCodigo_3_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_1.setBounds(0, 22, 442, 51);
		altaDocente.add(lblCodigo_3_4_2_1);

		JPanel altaExamen = new JPanel();
		panelMaster.add(altaExamen, "altaExamen");
		altaExamen.setLayout(null);

		JLabel lblCodigo_3_4_2_1_3 = new JLabel("Alta a un examen");
		lblCodigo_3_4_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_3.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_1_3.setBounds(0, 29, 442, 51);
		altaExamen.add(lblCodigo_3_4_2_1_3);

		JLabel lblCodigo_3_2_1_1 = new JLabel("C.I estud");
		lblCodigo_3_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_2_1_1.setBounds(32, 104, 68, 18);
		altaExamen.add(lblCodigo_3_2_1_1);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(100, 103, 86, 20);
		altaExamen.add(textField_17);

		JLabel lblCodigo_3_3_1_1 = new JLabel("Fecha");
		lblCodigo_3_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_3_1_1.setBounds(32, 139, 68, 18);
		altaExamen.add(lblCodigo_3_3_1_1);

		JLabel lblCodigo_3_2_1_1_1 = new JLabel("Nota");
		lblCodigo_3_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_2_1_1_1.setBounds(255, 103, 68, 18);
		altaExamen.add(lblCodigo_3_2_1_1_1);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(323, 102, 86, 20);
		altaExamen.add(textField_18);

		JLabel lblCodigo_3_7_4 = new JLabel("Codigo Materia");
		lblCodigo_3_7_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_7_4.setBounds(211, 139, 121, 18);
		altaExamen.add(lblCodigo_3_7_4);

		JDateChooser dateChooser_1 = new JDateChooser();

		JButton btnNewButton_4_1_1 = new JButton("Guardar cambios");

		btnNewButton_4_1_1.setBounds(147, 194, 154, 23);
		altaExamen.add(btnNewButton_4_1_1);

		dateChooser_1.setBounds(80, 137, 121, 20);
		altaExamen.add(dateChooser_1);

		textField_22 = new JTextField();
		textField_22.setBounds(323, 139, 86, 20);
		altaExamen.add(textField_22);
		textField_22.setColumns(10);

		JPanel altaFuncionario = new JPanel();
		panelMaster.add(altaFuncionario, "altaFuncionario");
		altaFuncionario.setLayout(null);

		JLabel lblCodigo_3_4_2_1_4 = new JLabel("Alta a un funcionario");
		lblCodigo_3_4_2_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_4.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_1_4.setBounds(0, 22, 442, 51);
		altaFuncionario.add(lblCodigo_3_4_2_1_4);

		JLabel lblCodigo_3_8_1 = new JLabel("Nombre");
		lblCodigo_3_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_8_1.setBounds(29, 92, 58, 18);
		altaFuncionario.add(lblCodigo_3_8_1);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(97, 92, 86, 20);
		altaFuncionario.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(97, 122, 86, 20);
		altaFuncionario.add(textField_20);

		JLabel lblCodigo_3_1_1_1 = new JLabel("C.I");
		lblCodigo_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_1_1_1.setBounds(29, 122, 68, 18);
		altaFuncionario.add(lblCodigo_3_1_1_1);

		JLabel lblCodigo_3_2_1_2 = new JLabel("Mail");
		lblCodigo_3_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_2_1_2.setBounds(29, 154, 68, 18);
		altaFuncionario.add(lblCodigo_3_2_1_2);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(97, 153, 86, 20);
		altaFuncionario.add(textField_21);

		JDateChooser dateChooser_2_2 = new JDateChooser();
		dateChooser_2_2.setBounds(97, 189, 106, 20);
		altaFuncionario.add(dateChooser_2_2);

		JLabel lblCodigo_3_3_1_2 = new JLabel("Nac.");
		lblCodigo_3_3_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_3_1_2.setBounds(29, 189, 68, 18);
		altaFuncionario.add(lblCodigo_3_3_1_2);

		JButton btnNewButton_4_1_2 = new JButton("Guardar cambios");

		btnNewButton_4_1_2.setBounds(253, 186, 154, 23);
		altaFuncionario.add(btnNewButton_4_1_2);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(321, 122, 86, 20);
		altaFuncionario.add(textField_23);

		JLabel lblCodigo_3_5_1_1 = new JLabel("Contraseña");
		lblCodigo_3_5_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_5_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_5_1_1.setBounds(234, 122, 76, 18);
		altaFuncionario.add(lblCodigo_3_5_1_1);

		JLabel lblCodigo_3_4_1_1 = new JLabel("Apellido");
		lblCodigo_3_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_4_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_4_1_1.setBounds(253, 92, 68, 18);
		altaFuncionario.add(lblCodigo_3_4_1_1);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(321, 92, 86, 20);
		altaFuncionario.add(textField_24);

		JPanel listarDocente = new JPanel();
		panelMaster.add(listarDocente, "listarDocente");
		listarDocente.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1 = new JLabel("Listar docente");
		lblCodigo_3_4_2_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_6_3_1.setBounds(0, 11, 442, 51);
		listarDocente.add(lblCodigo_3_4_2_6_3_1);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 73, 422, 160);
		listarDocente.add(scrollPane_2);

		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);

		JPanel listarMateria = new JPanel();
		panelMaster.add(listarMateria, "listarMateria");
		listarMateria.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1 = new JLabel("Listar materia");
		lblCodigo_3_4_2_6_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_6_3_1_1.setBounds(0, 11, 442, 51);
		listarMateria.add(lblCodigo_3_4_2_6_3_1_1);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 61, 422, 177);
		listarMateria.add(scrollPane_4);

		table_4 = new JTable();
		scrollPane_4.setViewportView(table_4);

		JPanel listarInasistencias = new JPanel();
		panelMaster.add(listarInasistencias, "listarInasistencias");
		listarInasistencias.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1_1 = new JLabel("Listar inasistencias");
		lblCodigo_3_4_2_6_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_6_3_1_1_1.setBounds(0, 11, 442, 51);
		listarInasistencias.add(lblCodigo_3_4_2_6_3_1_1_1);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 73, 422, 162);
		listarInasistencias.add(scrollPane_6);

		table_5 = new JTable();
		scrollPane_6.setViewportView(table_5);

		JPanel reporteEstadisticas = new JPanel();
		panelMaster.add(reporteEstadisticas, "reporteEstadisticas");
		reporteEstadisticas.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1_1_1 = new JLabel("Reporte de estad\u00EDsticas");
		lblCodigo_3_4_2_6_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_6_3_1_1_1_1.setBounds(0, 11, 442, 51);
		reporteEstadisticas.add(lblCodigo_3_4_2_6_3_1_1_1_1);

		JPanel consularUsuario1 = new JPanel();
		panelMaster.add(consularUsuario1, "name_588241614652700");
		consularUsuario1.setLayout(null);

		JDateChooser dateChooser_2_2_1 = new JDateChooser();
		dateChooser_2_2_1.setBounds(124, 178, 106, 20);
		consularUsuario1.add(dateChooser_2_2_1);

		JLabel lblCodigo_3_3_1_2_1 = new JLabel("Nac.");
		lblCodigo_3_3_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_3_1_2_1.setBounds(46, 178, 68, 18);
		consularUsuario1.add(lblCodigo_3_3_1_2_1);

		JLabel lblCodigo_3_2_1_2_1 = new JLabel("Constrase\u00F1a");
		lblCodigo_3_2_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_2_1_2_1.setBounds(23, 142, 101, 18);
		consularUsuario1.add(lblCodigo_3_2_1_2_1);

		JLabel lblCodigo_3_1_1_1_1 = new JLabel("C.I");
		lblCodigo_3_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_1_1_1_1.setBounds(56, 111, 68, 18);
		consularUsuario1.add(lblCodigo_3_1_1_1_1);

		JLabel lblCodigo_3_8_1_2 = new JLabel("Mail");
		lblCodigo_3_8_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_8_1_2.setBounds(56, 81, 58, 18);
		consularUsuario1.add(lblCodigo_3_8_1_2);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(124, 81, 86, 20);
		consularUsuario1.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(124, 111, 86, 20);
		consularUsuario1.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(124, 142, 86, 20);
		consularUsuario1.add(textField_28);

		JLabel lblCodigo_3_8_1_2_1 = new JLabel("Nombre");
		lblCodigo_3_8_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_8_1_2_1.setBounds(258, 81, 58, 18);
		consularUsuario1.add(lblCodigo_3_8_1_2_1);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(326, 81, 86, 20);
		consularUsuario1.add(textField_29);

		JLabel lblCodigo_3_1_1_1_1_1 = new JLabel("Apellido");
		lblCodigo_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_1_1_1_1_1.setBounds(258, 111, 68, 18);
		consularUsuario1.add(lblCodigo_3_1_1_1_1_1);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(326, 111, 86, 20);
		consularUsuario1.add(textField_30);

		JButton btnNewButton_6 = new JButton("Modificar");
		btnNewButton_6.setBounds(297, 175, 115, 23);
		consularUsuario1.add(btnNewButton_6);

		JLabel lblCodigo_3_4_2_6_3_1_1_1_1_2 = new JLabel("Informaci\u00F3n del usuario");
		lblCodigo_3_4_2_6_3_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1_1_2.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_6_3_1_1_1_1_2.setBounds(0, 19, 442, 51);
		consularUsuario1.add(lblCodigo_3_4_2_6_3_1_1_1_1_2);

		JPanel consularUsuario2 = new JPanel();
		panelMaster.add(consularUsuario2, "name_588634444258900");
		consularUsuario2.setLayout(null);

		JLabel lblCodigo_3_8_1_2_1_1 = new JLabel("Agregar materia");
		lblCodigo_3_8_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_8_1_2_1_1.setBounds(129, 96, 120, 18);
		consularUsuario2.add(lblCodigo_3_8_1_2_1_1);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(245, 96, 86, 20);
		consularUsuario2.add(textField_31);

		JButton btnNewButton_7 = new JButton("Guardar cambios");
		btnNewButton_7.setBounds(160, 199, 139, 23);
		consularUsuario2.add(btnNewButton_7);

		JLabel lblCodigo_3_8_1_2_1_1_1 = new JLabel("Nota");
		lblCodigo_3_8_1_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_8_1_2_1_1_1.setBounds(266, 140, 38, 18);
		consularUsuario2.add(lblCodigo_3_8_1_2_1_1_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "Ingles" }));
		comboBox_2.setBounds(147, 139, 86, 22);
		consularUsuario2.add(comboBox_2);

		JLabel lblCodigo_3_8_1_2_1_1_1_1 = new JLabel("Materia");
		lblCodigo_3_8_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_2_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_8_1_2_1_1_1_1.setBounds(91, 140, 58, 18);
		consularUsuario2.add(lblCodigo_3_8_1_2_1_1_1_1);

		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_2_1.setBounds(304, 139, 51, 22);
		consularUsuario2.add(comboBox_2_1);

		JLabel lblCodigo_3_4_2_6_3_1_1_1_1_2_1 = new JLabel("Estudiante");
		lblCodigo_3_4_2_6_3_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_6_3_1_1_1_1_2_1.setBounds(0, 22, 442, 51);
		consularUsuario2.add(lblCodigo_3_4_2_6_3_1_1_1_1_2_1);

		JPanel consularUsuario3 = new JPanel();
		panelMaster.add(consularUsuario3, "name_590302103418600");
		consularUsuario3.setLayout(null);

		JPanel listarEstudiantes = new JPanel();
		panelMaster.add(listarEstudiantes, "listarEstudiantes");
		listarEstudiantes.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1_1_1_1 = new JLabel("Listar estudiantes");
		lblCodigo_3_4_2_6_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblCodigo_3_4_2_6_3_1_1_1_1_1.setBounds(10, 21, 223, 51);
		listarEstudiantes.add(lblCodigo_3_4_2_6_3_1_1_1_1_1);

		JLabel lblCodigo_3_7_1_1 = new JLabel("Gen.");
		lblCodigo_3_7_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_7_1_1.setBounds(243, 11, 76, 18);
		listarEstudiantes.add(lblCodigo_3_7_1_1);

		JLabel lblCodigo_3_7_1_2 = new JLabel("Orient.");
		lblCodigo_3_7_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_7_1_2.setBounds(243, 41, 76, 18);
		listarEstudiantes.add(lblCodigo_3_7_1_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 97, 376, 139);
		listarEstudiantes.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JComboBox comboBox_3 = new JComboBox();

		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { " ", "TIC", "ADM" }));
		comboBox_3.setBounds(311, 40, 84, 22);
		listarEstudiantes.add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox();

		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { " ", "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox_4.setBounds(311, 10, 84, 22);
		listarEstudiantes.add(comboBox_4);

		JButton btnNewButton_11 = new JButton("Buscar");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_11.setBounds(311, 70, 84, 23);
		listarEstudiantes.add(btnNewButton_11);

		JMenuBar menuBar = new JMenuBar();
		contentPane.setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mnMenu);
		mnMenu.setVisible(false);

		JMenu mnDischange = new JMenu("Dar de alta");
		mnMenu.add(mnDischange);

		JMenuItem mntmUser = new JMenuItem("Usuario");
		mnDischange.add(mntmUser);

		JMenuItem mntmSubject = new JMenuItem("Materia");
		mnDischange.add(mntmSubject);

		JMenuItem mntmAbsence = new JMenuItem("Inasistencia");
		mnDischange.add(mntmAbsence);

		JMenuItem mntmExamen = new JMenuItem("Examen");
		mntmExamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnDischange.add(mntmExamen);

		JMenu mnConsult = new JMenu("Consultar");
		mnMenu.add(mnConsult);

		JMenuItem mntmUser_1 = new JMenuItem("Usuario");
		mnConsult.add(mntmUser_1);

		JMenuItem mntmSubject_1 = new JMenuItem("Materia");
		mnConsult.add(mntmSubject_1);

		JMenuItem mntmAbsence_1 = new JMenuItem("Inasistencias");
		mnConsult.add(mntmAbsence_1);

		JMenu mnList = new JMenu("Listar");
		mnMenu.add(mnList);

		JMenuItem mntmUsers = new JMenuItem("Estudiantes");
		mnList.add(mntmUsers);

		JMenuItem mntmTeachers = new JMenuItem("Funcionarios");
		mnList.add(mntmTeachers);

		JMenuItem mntmOfficials = new JMenuItem("Docentes");
		mnList.add(mntmOfficials);

		JMenuItem mntmSubjects = new JMenuItem("Estudiantes con pendientes");
		mnList.add(mntmSubjects);

		JMenuItem mntmMaterias = new JMenuItem("Materias");
		mntmMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelMaster, "listarMateria");
				DefaultTableModel model = new DefaultTableModel() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};

				model.addColumn("ID Materia");
				model.addColumn("Nombre");
				model.addColumn("Orientacion");
				model.addColumn("Generacion");

				String[] dato = new String[4];
				try {
					ControladorLogic controladorlogic = new ControladorLogic();
					ResultSet result1 = controladorlogic.listarMaterias();

					while (result1.next()) {
						dato[0] = result1.getString(1);
						dato[1] = result1.getString(2);
						dato[2] = result1.getString(3);
						dato[3] = result1.getString(4);
						model.addRow(dato);
					}
					table_4.setModel(model);
				}

				catch (Exception e3) {
					e3.printStackTrace();
				}

			}
		});
		mnList.add(mntmMaterias);

		JMenuItem mntmInasistencias = new JMenuItem("Inasistencias");
		mntmInasistencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelMaster, "listarInasistencias");

				DefaultTableModel model = new DefaultTableModel() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};

				model.addColumn("Cantidad de Horas");
				model.addColumn("Fecha");
				model.addColumn("ID de Materia");
				model.addColumn("Tipo de Inasistencia");
				model.addColumn("CI de Estudiante");

				String[] dato = new String[5];
				try {
					ControladorLogic controladorlogic = new ControladorLogic();
					ResultSet result6 = controladorlogic.listarInasistencias();

					while (result6.next()) {
						dato[0] = result6.getString(1);
						dato[1] = result6.getString(2);
						dato[2] = result6.getString(3);
						dato[3] = result6.getString(4);
						dato[4] = result6.getString(5);
						model.addRow(dato);
					}
					table_5.setModel(model);
				}

				catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		mnList.add(mntmInasistencias);

		JMenuItem mntmAbsences = new JMenuItem("Reporte de estadisticas");
		mnMenu.add(mntmAbsences);

		JMenuItem mntmAbsences_1 = new JMenuItem("Salir");
		mntmAbsences_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelMaster, "MENU");
				mnMenu.setVisible(false);
			}
		});
		mnMenu.add(mntmAbsences_1);

		mntmAbsences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "reporteEstadisticas");
			}
		});

		mntmUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "listarEstudiantes");

				DefaultTableModel model = new DefaultTableModel() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};

				model.addColumn("Cedula De Identidad");
				model.addColumn("Estado");
				model.addColumn("Orientacion");
				model.addColumn("Generacion");

				String[] dato = new String[4];
				try {
					ControladorLogic controladorlogic = new ControladorLogic();
					ResultSet result2 = controladorlogic.listarEstudiantes();
					while (result2.next()) {
						dato[0] = result2.getString(1);
						dato[1] = result2.getString(2);
						dato[2] = result2.getString(3);
						dato[3] = result2.getString(4);
						model.addRow(dato);
					}
					table.setModel(model);
				}

				catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});

		mntmTeachers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "LIST_TEACHERS");

				DefaultTableModel model = new DefaultTableModel() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};

				model.addColumn("Cedula De Identidad");

				String[] dato = new String[1];
				try {
					ControladorLogic controladorlogic = new ControladorLogic();
					ResultSet result3 = controladorlogic.listarFuncionarios();

					while (result3.next()) {
						dato[0] = result3.getString(1);
						model.addRow(dato);
					}
					table_1.setModel(model);
				}

				catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});

		mntmOfficials.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "listarDocente");

				DefaultTableModel model = new DefaultTableModel() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};

				model.addColumn("Cedula De Identidad");

				String[] dato = new String[1];
				try {
					ControladorLogic controladorlogic = new ControladorLogic();
					ResultSet result4 = controladorlogic.listarDocentes();

					while (result4.next()) {
						dato[0] = result4.getString(1);
						model.addRow(dato);
					}
					table_2.setModel(model);
				}

				catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});

		mntmSubjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "LIST_SUBJECTS");

				DefaultTableModel model = new DefaultTableModel() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};

				model.addColumn("Cedula del Estudiante");
				model.addColumn("ID de Materia");
				model.addColumn("Fecha");
				model.addColumn("Nota");

				String[] dato = new String[4];
				try {
					ControladorLogic controladorlogic = new ControladorLogic();
					ResultSet result5 = controladorlogic.listarPendientes();

					while (result5.next()) {
						dato[0] = result5.getString(1);
						dato[1] = result5.getString(2);
						dato[2] = result5.getString(3);
						dato[3] = result5.getString(4);
						model.addRow(dato);
					}
					table_3.setModel(model);
				}

				catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});

		mntmUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "DISCHANGE_USER");
			}
		});

		mntmSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "DISCHANGE_SUBJECT");

			}
		});

		mntmAbsence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "DISCHANGE_ABSENCE");

			}
		});

		mntmUser_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "CONSULT_USER");

			}
		});

		mntmSubject_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "CONSULT_SUBJECT");

			}
		});

		mntmAbsence_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "CONSULT_ABSENCE");

			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "panelRegister");

			}
		});
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "random");
				mnMenu.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelMaster, "altaUsuario");
			}
		});
		btnAltaDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "Alta docente");
			}
		});
		mntmExamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelMaster, "altaExamen");
			}
		});
		btnAltaFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelMaster, "altaFuncionario");
			}
		});
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelMaster, "MENU");
			}
		});

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nombre = textField.getText();
				String codigo = textField_1.getText();
				String ciDoc = textField_33.getText();
				String oriM = comboBox_1_4.getSelectedItem().toString();
				String genM = comboBox_5.getSelectedItem().toString();

				Materia mat = new Materia(nombre, codigo, Orientacion.valueOf(oriM), Generacion.valueOf(genM));

				try {
					controladorlg.crearMateria(mat, ciDoc);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}

		});

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Integer cantHoras = Integer.parseInt(textField_5.getText());
				LocalDate date2 = LocalDate.parse(sdft.format(dateChooser_5.getDate()));
				String idMateria = textField_14.getText();
				String ciEstudiante = textField_16.getText();
				String tipoIna = comboBox_6.getSelectedItem().toString();

				Inasistencia ina = new Inasistencia(ciEstudiante, idMateria, date2, cantHoras,
						TipoInasistencia.valueOf(tipoIna));
				try {
					controladorlg.crearInasistencia(ina);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String ci = textField_17.getText();
				String codM = textField_22.getText();
				LocalDate date5 = LocalDate.parse(sdft.format(dateChooser_1.getDate()));
				Integer nta = Integer.parseInt(textField_18.getText());
				Examen exa = new Examen(ci, codM, date5, nta);
				try {
					controladorlg.crearExamen(exa);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});

		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nameE = textField_6.getText();
				String ciE = textField_7.getText();
				String mailE = textField_8.getText();
				LocalDate nacE = LocalDate.parse(sdft.format(dateChooser.getDate()));
				String apeE = textField_12.getText();
				String psswE = textField_13.getText();
				String esE = comboBox_7.getSelectedItem().toString();
				String oriE = comboBox_1.getSelectedItem().toString();
				String genE = comboBox.getSelectedItem().toString();

				Estudiante est = new Estudiante(ciE, Estado.valueOf(esE), Orientacion.valueOf(oriE),
						Generacion.valueOf(genE), psswE, nameE, apeE, mailE, nacE);
				try {
					controladorlg.crearEstudiante(est);
				} catch (Exception e6) {
					e6.printStackTrace();
				}

			}
		});

		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nomD = textField_2.getText();
				String ciD = textField_9.getText();
				String mailD = textField_10.getText();
				String apD = textField_11.getText();
				String psswD = textField_15.getText();
				LocalDate nacD = LocalDate.parse(sdft.format(dateChooser_2.getDate()));

				Docente doc = new Docente(ciD, psswD, nomD, apD, mailD, nacD);

				try {
					controladorlg.crearDocente(doc);
				} catch (Exception e7) {
					e7.printStackTrace();
				}
			}
		});

		btnNewButton_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nomF = textField_19.getText();
				String ciF = textField_20.getText();
				String mailF = textField_21.getText();
				String apF = textField_24.getText();
				String psswF = textField_23.getText();
				LocalDate nacF = LocalDate.parse(sdft.format(dateChooser_2_2.getDate()));

				Funcionario fun = new Funcionario(ciF, psswF, nomF, apF, mailF, nacF);

				try {
					controladorlg.crearFuncionario(fun);
				} catch (Exception e8) {
					e8.printStackTrace();
				}
			}
		});

		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String genCOM = comboBox_4.getSelectedItem().toString();
				String oriCOM = comboBox_3.getSelectedItem().toString();

				System.out.println(genCOM + "," + oriCOM);

				if (oriCOM == "ADM" && genCOM == "PRIMERO") {
					DefaultTableModel model = new DefaultTableModel() {
						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public boolean isCellEditable(int row, int column) {
							return false;
						}
					};

					model.addColumn("Cedula De Identidad");
					model.addColumn("Estado");
					model.addColumn("Orientacion");
					model.addColumn("Generacion");

					String[] dato = new String[4];
					try {
						ResultSet rs2;
						rs2 = connection.createStatement().executeQuery(
								"SELECT * FROM estudiante WHERE generacion='PRIMERO' && orientacion ='ADM'");
						while (rs2.next()) {
							dato[0] = rs2.getString(1);
							dato[1] = rs2.getString(2);
							dato[2] = rs2.getString(3);
							dato[3] = rs2.getString(4);
							model.addRow(dato);
						}
						table.setModel(model);
					}

					catch (Exception e3) {
						e3.printStackTrace();
					}
				} else {
					if (oriCOM == "ADM" && genCOM == "SEGUNDO") {
						DefaultTableModel model = new DefaultTableModel() {
							/**
							 * 
							 */
							private static final long serialVersionUID = 1L;

							public boolean isCellEditable(int row, int column) {
								return false;
							}
						};

						model.addColumn("Cedula De Identidad");
						model.addColumn("Estado");
						model.addColumn("Orientacion");
						model.addColumn("Generacion");

						String[] dato = new String[4];
						try {
							ResultSet rs2;
							rs2 = connection.createStatement().executeQuery(
									"SELECT * FROM estudiante WHERE generacion='SEGUNDO' && orientacion ='ADM'");
							while (rs2.next()) {
								dato[0] = rs2.getString(1);
								dato[1] = rs2.getString(2);
								dato[2] = rs2.getString(3);
								dato[3] = rs2.getString(4);
								model.addRow(dato);
							}
							table.setModel(model);
						}

						catch (Exception e3) {
							e3.printStackTrace();
						}
					} else {
						if (oriCOM == "ADM" && genCOM == "TERCERO") {
							DefaultTableModel model = new DefaultTableModel() {
								/**
								 * 
								 */
								private static final long serialVersionUID = 1L;

								public boolean isCellEditable(int row, int column) {
									return false;
								}
							};

							model.addColumn("Cedula De Identidad");
							model.addColumn("Estado");
							model.addColumn("Orientacion");
							model.addColumn("Generacion");

							String[] dato = new String[4];
							try {
								ResultSet rs2;
								rs2 = connection.createStatement().executeQuery(
										"SELECT * FROM estudiante WHERE generacion='TERCERO' && orientacion ='ADM'");
								while (rs2.next()) {
									dato[0] = rs2.getString(1);
									dato[1] = rs2.getString(2);
									dato[2] = rs2.getString(3);
									dato[3] = rs2.getString(4);
									model.addRow(dato);
								}
								table.setModel(model);
							}

							catch (Exception e3) {
								e3.printStackTrace();
							}
						}
					}
				}

				if (oriCOM == "TIC" && genCOM == "PRIMERO") {
					DefaultTableModel model = new DefaultTableModel() {
						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public boolean isCellEditable(int row, int column) {
							return false;
						}
					};

					model.addColumn("Cedula De Identidad");
					model.addColumn("Estado");
					model.addColumn("Orientacion");
					model.addColumn("Generacion");

					String[] dato = new String[4];
					try {
						ResultSet rs2;
						rs2 = connection.createStatement().executeQuery(
								"SELECT * FROM estudiante WHERE generacion ='PRIMERO' && orientacion='TIC'");
						while (rs2.next()) {
							dato[0] = rs2.getString(1);
							dato[1] = rs2.getString(2);
							dato[2] = rs2.getString(3);
							dato[3] = rs2.getString(4);
							model.addRow(dato);
						}
						table.setModel(model);
					}

					catch (Exception e3) {
						e3.printStackTrace();
					}
				} else {
					if (oriCOM == "TIC" && genCOM == "SEGUNDO") {
						DefaultTableModel model = new DefaultTableModel() {
							/**
							 * 
							 */
							private static final long serialVersionUID = 1L;

							public boolean isCellEditable(int row, int column) {
								return false;
							}
						};

						model.addColumn("Cedula De Identidad");
						model.addColumn("Estado");
						model.addColumn("Orientacion");
						model.addColumn("Generacion");

						String[] dato = new String[4];
						try {
							ResultSet rs2;
							rs2 = connection.createStatement().executeQuery(
									"SELECT * FROM estudiante WHERE generacion ='SEGUNDO' && orientacion='TIC'");
							while (rs2.next()) {
								dato[0] = rs2.getString(1);
								dato[1] = rs2.getString(2);
								dato[2] = rs2.getString(3);
								dato[3] = rs2.getString(4);
								model.addRow(dato);
							}
							table.setModel(model);
						}

						catch (Exception e3) {
							e3.printStackTrace();
						}
					} else {
						if (oriCOM == "TIC" && genCOM == "TERCERO") {
							DefaultTableModel model = new DefaultTableModel() {
								/**
								 * 
								 */
								private static final long serialVersionUID = 1L;

								public boolean isCellEditable(int row, int column) {
									return false;
								}
							};

							model.addColumn("Cedula De Identidad");
							model.addColumn("Estado");
							model.addColumn("Orientacion");
							model.addColumn("Generacion");

							String[] dato = new String[4];
							try {
								ResultSet rs2;
								rs2 = connection.createStatement().executeQuery(
										"SELECT * FROM estudiante WHERE generacion ='TERCERO' && orientacion='TIC'");
								while (rs2.next()) {
									dato[0] = rs2.getString(1);
									dato[1] = rs2.getString(2);
									dato[2] = rs2.getString(3);
									dato[3] = rs2.getString(4);
									model.addRow(dato);
								}
								table.setModel(model);
							}

							catch (Exception e3) {
								e3.printStackTrace();
							}
						}
					}
				}

			}

		});
	}
}
