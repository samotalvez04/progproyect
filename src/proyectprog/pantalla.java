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
import javax.swing.JOptionPane;
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
	Conn conn = new Conn();
	Connection connection = conn.connectToMySQL();
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
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;

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
		contentPane.setBounds(289, 96, 800, 600);
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.getContentPane().setLayout(null);

		JPanel panelMaster = new JPanel();
		panelMaster.setBounds(0, 0, 794, 549);
		contentPane.getContentPane().add(panelMaster);
		panelMaster.setLayout(new CardLayout(0, 0));
		cardLayout = (CardLayout) panelMaster.getLayout();

		JPanel inicio = new JPanel();
		panelMaster.add(inicio, "MENU");
		inicio.setLayout(null);

		JButton btnNewButton_1 = new JButton("Ingresar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));

		btnNewButton_1.setBounds(294, 205, 206, 58);
		inicio.add(btnNewButton_1);

		JLabel lblCodigo_3_4_2_1_2 = new JLabel("Bienvenido");
		lblCodigo_3_4_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_2.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1_2.setBounds(10, 24, 774, 170);
		inicio.add(lblCodigo_3_4_2_1_2);

		JButton btnNewButton_10 = new JButton("Salir");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_10.setBounds(294, 274, 206, 58);
		inicio.add(btnNewButton_10);

		JPanel login = new JPanel();
		panelMaster.add(login, "panelRegister");
		login.setLayout(null);

		JLabel lblPasw = new JLabel("Contrase\u00F1a");
		lblPasw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasw.setFont(new Font("Arial", Font.PLAIN, 25));
		lblPasw.setBounds(57, 226, 187, 38);
		login.add(lblPasw);

		textField_3 = new JPasswordField();
		textField_3.setColumns(10);
		textField_3.setBounds(243, 226, 442, 38);
		login.add(textField_3);

		JLabel lblMail = new JLabel("C.I");
		lblMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblMail.setFont(new Font("Arial", Font.PLAIN, 25));
		lblMail.setBounds(57, 176, 187, 38);
		login.add(lblMail);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(243, 176, 442, 38);
		login.add(textField_4);

		JButton btnNewButton_2_1 = new JButton("Iniciar Sesion");

		btnNewButton_2_1.setBounds(517, 275, 168, 33);
		login.add(btnNewButton_2_1);

		JLabel lblCodigo_3_4_2_1_2_1 = new JLabel("Iniciar sesi\u00F3n");
		lblCodigo_3_4_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1_2_1.setBounds(10, 74, 774, 91);
		login.add(lblCodigo_3_4_2_1_2_1);

		JButton btnNewButton_8 = new JButton("Atr\u00E1s");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_8.setBounds(112, 275, 168, 33);
		login.add(btnNewButton_8);

		JPanel darAltaUsuario = new JPanel();
		panelMaster.add(darAltaUsuario, "DISCHANGE_USER");
		darAltaUsuario.setLayout(null);

		JButton btnNewButton = new JButton("Estudiante");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(272, 245, 250, 43);
		darAltaUsuario.add(btnNewButton);

		JButton btnAltaDocente = new JButton("Docente");
		btnAltaDocente.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAltaDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAltaDocente.setBounds(272, 299, 250, 43);
		darAltaUsuario.add(btnAltaDocente);

		JButton btnAltaFuncionario = new JButton("Funcionario");
		btnAltaFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAltaFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAltaFuncionario.setBounds(272, 353, 250, 43);
		darAltaUsuario.add(btnAltaFuncionario);

		JLabel lblCodigo_3_4_2_1_1 = new JLabel("Seleccione tipo de usuario");
		lblCodigo_3_4_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1_1.setBounds(10, 93, 774, 141);
		darAltaUsuario.add(lblCodigo_3_4_2_1_1);

		JPanel darAltaMateria = new JPanel();
		panelMaster.add(darAltaMateria, "DISCHANGE_SUBJECT");
		darAltaMateria.setLayout(null);

		textField = new JTextField();
		textField.setBounds(239, 175, 187, 41);
		darAltaMateria.add(textField);
		textField.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(109, 175, 126, 41);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 25));
		darAltaMateria.add(lblNombre);

		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(109, 221, 126, 41);
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 25));
		darAltaMateria.add(lblCodigo);

		textField_1 = new JTextField();
		textField_1.setBounds(239, 227, 187, 41);
		textField_1.setColumns(10);
		darAltaMateria.add(textField_1);

		JLabel lblCodigo_1 = new JLabel("Generacion");
		lblCodigo_1.setBounds(109, 325, 156, 41);
		lblCodigo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_1.setFont(new Font("Arial", Font.PLAIN, 25));
		darAltaMateria.add(lblCodigo_1);

		JButton btnNewButton_3 = new JButton("Crear Materia");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(284, 448, 226, 41);

		darAltaMateria.add(btnNewButton_3);

		JLabel lblCodigo_3_4_2_2 = new JLabel("Alta a una materia");
		lblCodigo_3_4_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_2.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_2.setBounds(19, 44, 755, 120);
		darAltaMateria.add(lblCodigo_3_4_2_2);

		JComboBox comboBox_1_4 = new JComboBox();
		comboBox_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] { "TIC", "ADM", "TICYADM" }));
		comboBox_1_4.setBounds(264, 279, 162, 32);
		darAltaMateria.add(comboBox_1_4);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox_5.setBounds(264, 333, 156, 32);
		darAltaMateria.add(comboBox_5);

		JLabel lblNewLabel_7 = new JLabel("Orientacion");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(109, 273, 156, 41);
		darAltaMateria.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("CI del Docente que la Dicta");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(109, 377, 320, 41);
		darAltaMateria.add(lblNewLabel_8);

		textField_33 = new JTextField();
		textField_33.setBounds(439, 381, 187, 41);
		darAltaMateria.add(textField_33);
		textField_33.setColumns(10);

		JPanel altaInasistencia = new JPanel();
		panelMaster.add(altaInasistencia, "DISCHANGE_ABSENCE");
		altaInasistencia.setLayout(null);

		JLabel lblNewLabel = new JLabel("Crear Inasistencia");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblNewLabel.setBounds(10, 23, 774, 131);
		altaInasistencia.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cantidad de Horas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(109, 204, 218, 22);
		altaInasistencia.add(lblNewLabel_1);

		textField_5 = new JTextField();
		textField_5.setBounds(337, 204, 187, 28);
		altaInasistencia.add(textField_5);
		textField_5.setColumns(10);

		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setBounds(185, 237, 148, 28);
		altaInasistencia.add(dateChooser_5);

		JLabel lblNewLabel_2 = new JLabel("Fecha");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(109, 237, 84, 20);
		altaInasistencia.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("ID Materia");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(109, 276, 124, 22);
		altaInasistencia.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Tipo de Inasistencia");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(109, 309, 236, 22);
		altaInasistencia.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("CI Estudiante");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(109, 165, 156, 28);
		altaInasistencia.add(lblNewLabel_5);

		JButton btnNewButton_2 = new JButton("Crear");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setBounds(308, 375, 177, 33);
		altaInasistencia.add(btnNewButton_2);

		textField_14 = new JTextField();
		textField_14.setBounds(233, 276, 148, 28);
		altaInasistencia.add(textField_14);
		textField_14.setColumns(10);

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "JUSTIFICADA", "INJUSTIFICADA", "LLEGADA_TARDE" }));
		comboBox_6.setBounds(337, 308, 151, 28);
		altaInasistencia.add(comboBox_6);

		textField_16 = new JTextField();
		textField_16.setBounds(275, 165, 187, 28);
		altaInasistencia.add(textField_16);
		textField_16.setColumns(10);

		JPanel consultarUsuario = new JPanel();
		panelMaster.add(consultarUsuario, "CONSULT_USER");
		consultarUsuario.setLayout(null);

		JLabel lblCodigo_3_4_2_5 = new JLabel("Consultar usuario");
		lblCodigo_3_4_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_5.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_5.setBounds(0, 0, 794, 71);
		consultarUsuario.add(lblCodigo_3_4_2_5);

		JLabel lblCodigo_3_8_1_1 = new JLabel("C.I del usuario");
		lblCodigo_3_8_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_8_1_1.setBounds(75, 82, 176, 37);
		consultarUsuario.add(lblCodigo_3_8_1_1);

		textField_25 = new JTextField();
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_25.setColumns(10);
		textField_25.setBounds(245, 85, 176, 32);
		consultarUsuario.add(textField_25);

		JButton btnNewButton_5 = new JButton("Consultar");

		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_5.setBounds(431, 85, 176, 34);
		consultarUsuario.add(btnNewButton_5);

		JLabel lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setBounds(75, 130, 59, 19);
		consultarUsuario.add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);

		JLabel lblNewLabel_10 = new JLabel("Apellido");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setBounds(75, 157, 59, 19);
		consultarUsuario.add(lblNewLabel_10);
		lblNewLabel_10.setVisible(false);

		JLabel lblNewLabel_11 = new JLabel("Cedula de Identidad");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(75, 192, 130, 19);
		consultarUsuario.add(lblNewLabel_11);
		lblNewLabel_11.setVisible(false);

		JLabel lblNewLabel_12 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(75, 222, 139, 19);
		consultarUsuario.add(lblNewLabel_12);
		lblNewLabel_12.setVisible(false);

		JLabel lblNewLabel_13 = new JLabel("Contrase\u00F1a");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(75, 282, 81, 19);
		consultarUsuario.add(lblNewLabel_13);
		lblNewLabel_13.setVisible(false);

		JLabel lblNewLabel_14 = new JLabel("Correo");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_14.setBounds(75, 252, 53, 19);
		consultarUsuario.add(lblNewLabel_14);
		lblNewLabel_14.setVisible(false);

		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.LEFT);
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_26.setBounds(140, 124, 221, 26);
		consultarUsuario.add(textField_26);
		textField_26.setColumns(10);
		textField_26.setVisible(false);
		textField_26.setEditable(false);

		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.LEFT);
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_27.setBounds(140, 155, 219, 26);
		consultarUsuario.add(textField_27);
		textField_27.setColumns(10);
		textField_27.setVisible(false);
		textField_27.setEditable(false);

		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.LEFT);
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_28.setBounds(215, 186, 177, 26);
		consultarUsuario.add(textField_28);
		textField_28.setColumns(10);
		textField_28.setVisible(false);
		textField_28.setEditable(false);

		textField_29 = new JTextField();
		textField_29.setHorizontalAlignment(SwingConstants.LEFT);
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_29.setBounds(215, 216, 177, 26);
		consultarUsuario.add(textField_29);
		textField_29.setColumns(10);
		textField_29.setVisible(false);
		textField_29.setEditable(false);

		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.LEFT);
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_30.setBounds(138, 248, 210, 26);
		consultarUsuario.add(textField_30);
		textField_30.setColumns(10);
		textField_30.setVisible(false);
		textField_30.setEditable(false);

		textField_31 = new JPasswordField();
		textField_31.setHorizontalAlignment(SwingConstants.LEFT);
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_31.setBounds(166, 279, 221, 26);
		consultarUsuario.add(textField_31);
		textField_31.setColumns(10);
		textField_31.setVisible(false);
		textField_31.setEditable(false);

		JButton btnNewButton_6 = new JButton("Modificar");
		btnNewButton_6.setVisible(false);

		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_6.setBounds(586, 278, 176, 26);
		consultarUsuario.add(btnNewButton_6);

		textField_39 = new JTextField();
		textField_39.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_39.setBounds(369, 124, 176, 26);
		consultarUsuario.add(textField_39);
		textField_39.setColumns(10);
		textField_39.setVisible(false);

		textField_40 = new JTextField();
		textField_40.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_40.setBounds(369, 155, 176, 26);
		consultarUsuario.add(textField_40);
		textField_40.setColumns(10);
		textField_40.setVisible(false);

		textField_43 = new JTextField();
		textField_43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_43.setBounds(358, 247, 176, 24);
		consultarUsuario.add(textField_43);
		textField_43.setColumns(10);
		textField_43.setVisible(false);

		textField_44 = new JPasswordField();
		textField_44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_44.setBounds(400, 277, 176, 24);
		consultarUsuario.add(textField_44);
		textField_44.setColumns(10);
		textField_44.setVisible(false);

		JDateChooser dateChooser_6 = new JDateChooser();
		dateChooser_6.setBounds(402, 216, 176, 24);
		consultarUsuario.add(dateChooser_6);

		JLabel lblNewLabel_20 = new JLabel("Tipo de Usuario");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_20.setBounds(75, 312, 110, 26);
		consultarUsuario.add(lblNewLabel_20);
		lblNewLabel_20.setVisible(false);

		textField_42 = new JTextField();
		textField_42.setBounds(195, 312, 130, 26);
		consultarUsuario.add(textField_42);
		textField_42.setColumns(10);
		textField_42.setEditable(false);

		JLabel lblNewLabel_21 = new JLabel("Agregar Materias a Estudiante");
		lblNewLabel_21.setVisible(false);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setBounds(85, 349, 289, 32);
		consultarUsuario.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("Modificar materias que dicta Docente");
		lblNewLabel_22.setVisible(false);
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_22.setBounds(384, 349, 289, 32);
		consultarUsuario.add(lblNewLabel_22);

		textField_45 = new JTextField();
		textField_45.setVisible(false);
		textField_45.setBounds(215, 392, 86, 20);
		consultarUsuario.add(textField_45);
		textField_45.setColumns(10);

		JLabel lblNewLabel_23 = new JLabel("ID de Materia");
		lblNewLabel_23.setVisible(false);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23.setBounds(119, 393, 97, 14);
		consultarUsuario.add(lblNewLabel_23);

		textField_46 = new JTextField();
		textField_46.setVisible(false);
		textField_46.setBounds(215, 420, 86, 20);
		consultarUsuario.add(textField_46);
		textField_46.setColumns(10);

		JLabel lblNewLabel_24 = new JLabel("Nota");
		lblNewLabel_24.setVisible(false);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_24.setBounds(119, 418, 86, 19);
		consultarUsuario.add(lblNewLabel_24);

		JButton btnNewButton_13 = new JButton("Agregar");

		btnNewButton_13.setVisible(false);
		btnNewButton_13.setBounds(162, 451, 89, 23);
		consultarUsuario.add(btnNewButton_13);

		JLabel lblNewLabel_25 = new JLabel("ID Materia");
		lblNewLabel_25.setVisible(false);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_25.setBounds(412, 391, 81, 19);
		consultarUsuario.add(lblNewLabel_25);

		textField_47 = new JTextField();
		textField_47.setVisible(false);
		textField_47.setBounds(490, 392, 86, 20);
		consultarUsuario.add(textField_47);
		textField_47.setColumns(10);

		JButton btnNewButton_14 = new JButton("Modificar");

		btnNewButton_14.setVisible(false);
		btnNewButton_14.setBounds(456, 451, 89, 23);
		consultarUsuario.add(btnNewButton_14);
		textField_42.setVisible(false);

		dateChooser_6.setVisible(false);

		JPanel consultarMateria = new JPanel();
		panelMaster.add(consultarMateria, "CONSULT_SUBJECT");
		consultarMateria.setLayout(null);

		JLabel lblCodigo_3_4_2_3 = new JLabel("Consultar materia");
		lblCodigo_3_4_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_3.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_3.setBounds(0, 0, 794, 121);
		consultarMateria.add(lblCodigo_3_4_2_3);

		JLabel lblCodigo_3_8_1_1_1 = new JLabel("Nombre o c\u00F3digo de materia");
		lblCodigo_3_8_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_8_1_1_1.setBounds(25, 132, 320, 49);
		consultarMateria.add(lblCodigo_3_8_1_1_1);

		textField_32 = new JTextField();
		textField_32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_32.setColumns(10);
		textField_32.setBounds(355, 132, 218, 38);
		consultarMateria.add(textField_32);

		JButton btnNewButton_5_1 = new JButton("Consultar");
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_5_1.setBounds(583, 132, 148, 38);
		consultarMateria.add(btnNewButton_5_1);

		JLabel lblNewLabel_15 = new JLabel("Nombre");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(44, 216, 109, 38);
		consultarMateria.add(lblNewLabel_15);
		lblNewLabel_15.setVisible(false);

		JLabel lblNewLabel_16 = new JLabel("Codigo");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(44, 263, 97, 31);
		consultarMateria.add(lblNewLabel_16);
		lblNewLabel_16.setVisible(false);

		JLabel lblNewLabel_17 = new JLabel("Orientacion");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_17.setBounds(44, 305, 141, 31);
		consultarMateria.add(lblNewLabel_17);
		lblNewLabel_17.setVisible(false);

		JLabel lblNewLabel_18 = new JLabel("Generacion");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_18.setBounds(44, 347, 141, 31);
		consultarMateria.add(lblNewLabel_18);
		lblNewLabel_18.setVisible(false);

		JLabel lblNewLabel_19 = new JLabel("Cantidad de Inscriptos");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_19.setBounds(44, 389, 264, 31);
		consultarMateria.add(lblNewLabel_19);

		textField_34 = new JTextField();
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_34.setBounds(157, 216, 218, 35);
		consultarMateria.add(textField_34);
		textField_34.setColumns(10);
		textField_34.setVisible(false);
		textField_34.setEditable(false);

		textField_35 = new JTextField();
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_35.setBounds(151, 265, 224, 29);
		consultarMateria.add(textField_35);
		textField_35.setColumns(10);
		textField_35.setVisible(false);
		textField_35.setEditable(false);

		textField_36 = new JTextField();
		textField_36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_36.setBounds(195, 305, 180, 31);
		consultarMateria.add(textField_36);
		textField_36.setColumns(10);
		textField_36.setVisible(false);
		textField_36.setEditable(false);

		textField_37 = new JTextField();
		textField_37.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_37.setBounds(195, 347, 180, 31);
		consultarMateria.add(textField_37);
		textField_37.setColumns(10);
		textField_37.setVisible(false);
		textField_37.setEditable(false);

		textField_38 = new JTextField();
		textField_38.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_38.setBounds(306, 389, 68, 31);
		consultarMateria.add(textField_38);
		textField_38.setColumns(10);
		textField_38.setEditable(false);

		textField_41 = new JTextField();
		textField_41.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_41.setBounds(385, 216, 218, 35);
		consultarMateria.add(textField_41);
		textField_41.setColumns(10);
		textField_41.setVisible(false);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { " ", "TIC", "ADM", "TICYADM" }));
		comboBox_2.setBounds(385, 305, 218, 31);
		consultarMateria.add(comboBox_2);
		comboBox_2.setVisible(false);

		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] { " ", "PRIMERO", "SEGUNDO", "TERCERO",
				"PRIMERO_SEGUNDO_Y_TERCERO", "PRIMERO_Y_SEGUNDO", "PRIMERO_Y_TERCERO", "SEGUNDO_Y_TERCERO" }));
		comboBox_8.setBounds(385, 347, 346, 31);
		consultarMateria.add(comboBox_8);
		comboBox_8.setVisible(false);

		JButton btnNewButton_12 = new JButton("Modificar");
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_12.setBounds(583, 446, 148, 38);
		consultarMateria.add(btnNewButton_12);
		btnNewButton_12.setVisible(false);

		textField_38.setVisible(false);
		lblNewLabel_19.setVisible(false);

		JPanel consultarInasistencia = new JPanel();
		panelMaster.add(consultarInasistencia, "CONSULT_ABSENCE");
		consultarInasistencia.setLayout(null);

		JLabel lblCodigo_3_4_2_4 = new JLabel("Consultar inasistencia");
		lblCodigo_3_4_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_4.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_4.setBounds(10, 0, 774, 97);
		consultarInasistencia.add(lblCodigo_3_4_2_4);

		JLabel lblCodigo_3_3_2 = new JLabel("Inicio");
		lblCodigo_3_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_3_2.setBounds(97, 108, 82, 33);
		consultarInasistencia.add(lblCodigo_3_3_2);

		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(172, 108, 148, 33);
		consultarInasistencia.add(dateChooser_3);

		JLabel lblCodigo_3_3_3 = new JLabel("Fin");
		lblCodigo_3_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_3.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_3_3.setBounds(330, 108, 52, 33);
		consultarInasistencia.add(lblCodigo_3_3_3);

		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(376, 108, 148, 33);
		consultarInasistencia.add(dateChooser_4);

		JButton btnNewButton_9 = new JButton("Consultar");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_9.setBounds(539, 108, 148, 33);
		consultarInasistencia.add(btnNewButton_9);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(97, 148, 587, 332);
		consultarInasistencia.add(scrollPane_3);

		table_6 = new JTable();
		scrollPane_3.setViewportView(table_6);

		JButton btnNewButton_7 = new JButton("Eliminar");

		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.setBounds(552, 491, 135, 33);
		consultarInasistencia.add(btnNewButton_7);

		JPanel listarFuncionario = new JPanel();
		panelMaster.add(listarFuncionario, "LIST_TEACHERS");
		listarFuncionario.setLayout(null);

		JLabel lblCodigo_3_4_2_6_1 = new JLabel("Listar funcionario");
		lblCodigo_3_4_2_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_1.setBounds(0, 11, 794, 140);
		listarFuncionario.add(lblCodigo_3_4_2_6_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 162, 784, 376);
		listarFuncionario.add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);

		JPanel listarExamenes = new JPanel();
		panelMaster.add(listarExamenes, "LIST_SUBJECTS");
		listarExamenes.setLayout(null);

		JLabel lblCodigo_3_4_2_6_2 = new JLabel("Listar examenes");
		lblCodigo_3_4_2_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_2.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_2.setBounds(0, 0, 794, 166);
		listarExamenes.add(lblCodigo_3_4_2_6_2);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 177, 784, 361);
		listarExamenes.add(scrollPane_5);

		table_3 = new JTable();
		scrollPane_5.setViewportView(table_3);

		JPanel random = new JPanel();
		panelMaster.add(random, "random");
		random.setLayout(null);

		JLabel lblCodigo_3_4_2_1_2_3 = new JLabel("Seleccione opci\u00F3n en el men\u00FA");
		lblCodigo_3_4_2_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_2_3.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1_2_3.setBounds(10, 181, 774, 187);
		random.add(lblCodigo_3_4_2_1_2_3);

		JPanel altaEstudiante = new JPanel();
		panelMaster.add(altaEstudiante, "altaUsuario");
		altaEstudiante.setLayout(null);

		JLabel lblCodigo_3 = new JLabel("Nombre");
		lblCodigo_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3.setBounds(82, 174, 103, 35);
		altaEstudiante.add(lblCodigo_3);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(195, 174, 137, 31);
		altaEstudiante.add(textField_6);

		JLabel lblCodigo_3_1 = new JLabel("CI");
		lblCodigo_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_1.setBounds(82, 220, 46, 35);
		altaEstudiante.add(lblCodigo_3_1);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(138, 220, 137, 31);
		altaEstudiante.add(textField_7);

		JLabel lblCodigo_3_2 = new JLabel("Mail");
		lblCodigo_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_2.setBounds(82, 266, 68, 33);
		altaEstudiante.add(lblCodigo_3_2);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(138, 265, 137, 31);
		altaEstudiante.add(textField_8);

		JLabel lblCodigo_3_3 = new JLabel("Nacimiento");
		lblCodigo_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_3.setBounds(82, 310, 137, 35);
		altaEstudiante.add(lblCodigo_3_3);

		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(501, 174, 137, 31);
		altaEstudiante.add(textField_12);

		JLabel lblCodigo_3_4 = new JLabel("Apellido");
		lblCodigo_3_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_4.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_4.setBounds(391, 174, 103, 29);
		altaEstudiante.add(lblCodigo_3_4);

		textField_13 = new JPasswordField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(534, 214, 137, 31);
		altaEstudiante.add(textField_13);

		JLabel lblCodigo_3_5 = new JLabel("Contrase\u00F1a");
		lblCodigo_3_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_5.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_5.setBounds(391, 220, 137, 29);
		altaEstudiante.add(lblCodigo_3_5);

		JLabel lblCodigo_3_7 = new JLabel("Orientacion");
		lblCodigo_3_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_7.setBounds(391, 266, 137, 31);
		altaEstudiante.add(lblCodigo_3_7);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(229, 310, 137, 35);
		altaEstudiante.add(dateChooser);

		JButton btnNewButton_4 = new JButton("Guardar cambios");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setForeground(Color.DARK_GRAY);

		btnNewButton_4.setBounds(385, 356, 196, 33);
		altaEstudiante.add(btnNewButton_4);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { " ", "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox.setBounds(229, 356, 137, 31);
		altaEstudiante.add(comboBox);
		comboBox.setVisible(false);

		JLabel lblCodigo_3_7_1 = new JLabel("Generacion");
		lblCodigo_3_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_7_1.setBounds(82, 356, 137, 35);
		altaEstudiante.add(lblCodigo_3_7_1);
		lblCodigo_3_7_1.setVisible(false);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { " ", "TIC", "ADM" }));
		comboBox_1.setBounds(534, 267, 137, 31);
		altaEstudiante.add(comboBox_1);

		JLabel lblCodigo_3_4_2 = new JLabel("Alta a un estudiante");
		lblCodigo_3_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2.setBounds(0, 0, 794, 163);
		altaEstudiante.add(lblCodigo_3_4_2);

		JLabel lblNewLabel_6 = new JLabel("Estado");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_6.setBounds(391, 310, 86, 35);
		altaEstudiante.add(lblNewLabel_6);

		JComboBox comboBox_7 = new JComboBox();

		comboBox_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { " ", "ACTIVO", "EGRESADO", "DESVINCULADO" }));
		comboBox_7.setBounds(487, 311, 137, 31);
		altaEstudiante.add(comboBox_7);

		JPanel altaDocente = new JPanel();
		panelMaster.add(altaDocente, "Alta docente");
		altaDocente.setLayout(null);

		JLabel lblCodigo_3_8 = new JLabel("Nombre");
		lblCodigo_3_8.setBounds(132, 138, 106, 38);
		lblCodigo_3_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_8);

		textField_2 = new JTextField();
		textField_2.setBounds(248, 138, 167, 33);
		textField_2.setColumns(10);
		altaDocente.add(textField_2);

		textField_9 = new JTextField();
		textField_9.setBounds(248, 232, 167, 33);
		textField_9.setColumns(10);
		altaDocente.add(textField_9);

		JLabel lblCodigo_3_1_1 = new JLabel("C.I");
		lblCodigo_3_1_1.setBounds(132, 232, 106, 38);
		lblCodigo_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_1_1);

		JLabel lblCodigo_3_2_1 = new JLabel("Mail");
		lblCodigo_3_2_1.setBounds(132, 276, 66, 38);
		lblCodigo_3_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_2_1);

		textField_10 = new JTextField();
		textField_10.setBounds(248, 276, 167, 33);
		textField_10.setColumns(10);
		altaDocente.add(textField_10);

		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(400, 330, 167, 33);
		altaDocente.add(dateChooser_2);

		JLabel lblCodigo_3_3_1 = new JLabel("Fecha De Nacimiento");
		lblCodigo_3_3_1.setBounds(132, 325, 258, 38);
		lblCodigo_3_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_3_1);

		JLabel lblCodigo_3_4_1 = new JLabel("Apellido");
		lblCodigo_3_4_1.setBounds(132, 187, 106, 38);
		lblCodigo_3_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_4_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_4_1);

		textField_11 = new JTextField();
		textField_11.setBounds(248, 188, 167, 33);
		textField_11.setColumns(10);
		altaDocente.add(textField_11);

		textField_15 = new JPasswordField();
		textField_15.setBounds(284, 374, 167, 33);
		textField_15.setColumns(10);
		altaDocente.add(textField_15);

		JLabel lblCodigo_3_5_1 = new JLabel("Contrase\u00F1a");
		lblCodigo_3_5_1.setBounds(132, 374, 142, 38);
		lblCodigo_3_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_5_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_5_1);

		JButton btnNewButton_4_1 = new JButton("Guardar cambios");
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_4_1.setBounds(478, 414, 234, 38);
		altaDocente.add(btnNewButton_4_1);

		JLabel lblCodigo_3_4_2_1 = new JLabel("Alta a un docente");
		lblCodigo_3_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1.setBounds(0, 0, 794, 127);
		altaDocente.add(lblCodigo_3_4_2_1);

		JPanel altaExamen = new JPanel();
		panelMaster.add(altaExamen, "altaExamen");
		altaExamen.setLayout(null);

		JLabel lblCodigo_3_4_2_1_3 = new JLabel("Alta a un examen");
		lblCodigo_3_4_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_3.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1_3.setBounds(0, 0, 794, 142);
		altaExamen.add(lblCodigo_3_4_2_1_3);

		JLabel lblCodigo_3_2_1_1 = new JLabel("C.I Estudiante");
		lblCodigo_3_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblCodigo_3_2_1_1.setBounds(121, 153, 179, 47);
		altaExamen.add(lblCodigo_3_2_1_1);

		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_17.setColumns(10);
		textField_17.setBounds(310, 163, 168, 29);
		altaExamen.add(textField_17);

		JLabel lblCodigo_3_3_1_1 = new JLabel("Fecha");
		lblCodigo_3_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblCodigo_3_3_1_1.setBounds(121, 190, 86, 38);
		altaExamen.add(lblCodigo_3_3_1_1);

		JLabel lblCodigo_3_2_1_1_1 = new JLabel("Nota");
		lblCodigo_3_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblCodigo_3_2_1_1_1.setBounds(121, 239, 121, 29);
		altaExamen.add(lblCodigo_3_2_1_1_1);

		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_18.setColumns(10);
		textField_18.setBounds(200, 239, 168, 29);
		altaExamen.add(textField_18);

		JLabel lblCodigo_3_7_4 = new JLabel("Codigo Materia");
		lblCodigo_3_7_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_4.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblCodigo_3_7_4.setBounds(121, 279, 179, 29);
		altaExamen.add(lblCodigo_3_7_4);

		JDateChooser dateChooser_1 = new JDateChooser();

		JButton btnNewButton_4_1_1 = new JButton("Guardar cambios");
		btnNewButton_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_4_1_1.setBounds(274, 319, 245, 38);
		altaExamen.add(btnNewButton_4_1_1);

		dateChooser_1.setBounds(200, 199, 168, 29);
		altaExamen.add(dateChooser_1);

		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_22.setBounds(310, 279, 168, 29);
		altaExamen.add(textField_22);
		textField_22.setColumns(10);

		JPanel altaFuncionario = new JPanel();
		panelMaster.add(altaFuncionario, "altaFuncionario");
		altaFuncionario.setLayout(null);

		JLabel lblCodigo_3_4_2_1_4 = new JLabel("Alta a un funcionario");
		lblCodigo_3_4_2_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_4.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1_4.setBounds(0, 0, 794, 157);
		altaFuncionario.add(lblCodigo_3_4_2_1_4);

		JLabel lblCodigo_3_8_1 = new JLabel("Nombre");
		lblCodigo_3_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_8_1.setBounds(123, 168, 96, 42);
		altaFuncionario.add(lblCodigo_3_8_1);

		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_19.setColumns(10);
		textField_19.setBounds(229, 174, 135, 31);
		altaFuncionario.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_20.setColumns(10);
		textField_20.setBounds(183, 260, 181, 31);
		altaFuncionario.add(textField_20);

		JLabel lblCodigo_3_1_1_1 = new JLabel("C.I");
		lblCodigo_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_1_1_1.setBounds(123, 261, 50, 30);
		altaFuncionario.add(lblCodigo_3_1_1_1);

		JLabel lblCodigo_3_2_1_2 = new JLabel("Mail");
		lblCodigo_3_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_2_1_2.setBounds(123, 302, 68, 31);
		altaFuncionario.add(lblCodigo_3_2_1_2);

		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_21.setColumns(10);
		textField_21.setBounds(183, 302, 181, 31);
		altaFuncionario.add(textField_21);

		JDateChooser dateChooser_2_2 = new JDateChooser();
		dateChooser_2_2.setBounds(369, 344, 154, 31);
		altaFuncionario.add(dateChooser_2_2);

		JLabel lblCodigo_3_3_1_2 = new JLabel("Fecha de Nacimiento");
		lblCodigo_3_3_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_3_1_2.setBounds(123, 344, 241, 31);
		altaFuncionario.add(lblCodigo_3_3_1_2);

		JButton btnNewButton_4_1_2 = new JButton("Guardar cambios");
		btnNewButton_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_4_1_2.setBounds(282, 440, 230, 31);
		altaFuncionario.add(btnNewButton_4_1_2);

		textField_23 = new JPasswordField();
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_23.setColumns(10);
		textField_23.setBounds(263, 386, 135, 31);
		altaFuncionario.add(textField_23);

		JLabel lblCodigo_3_5_1_1 = new JLabel("Contraseña");
		lblCodigo_3_5_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_5_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_5_1_1.setBounds(123, 386, 130, 31);
		altaFuncionario.add(lblCodigo_3_5_1_1);

		JLabel lblCodigo_3_4_1_1 = new JLabel("Apellido");
		lblCodigo_3_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_4_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_4_1_1.setBounds(123, 213, 96, 36);
		altaFuncionario.add(lblCodigo_3_4_1_1);

		textField_24 = new JTextField();
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_24.setColumns(10);
		textField_24.setBounds(229, 216, 135, 31);
		altaFuncionario.add(textField_24);

		JPanel listarDocente = new JPanel();
		panelMaster.add(listarDocente, "listarDocente");
		listarDocente.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1 = new JLabel("Listar docente");
		lblCodigo_3_4_2_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_3_1.setBounds(0, 0, 794, 166);
		listarDocente.add(lblCodigo_3_4_2_6_3_1);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 177, 784, 361);
		listarDocente.add(scrollPane_2);

		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);

		JPanel listarMateria = new JPanel();
		panelMaster.add(listarMateria, "listarMateria");
		listarMateria.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1 = new JLabel("Listar materia");
		lblCodigo_3_4_2_6_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_3_1_1.setBounds(0, 0, 794, 177);
		listarMateria.add(lblCodigo_3_4_2_6_3_1_1);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 188, 784, 350);
		listarMateria.add(scrollPane_4);

		table_4 = new JTable();
		scrollPane_4.setViewportView(table_4);

		JPanel listarInasistencias = new JPanel();
		panelMaster.add(listarInasistencias, "listarInasistencias");
		listarInasistencias.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1_1 = new JLabel("Listar inasistencias");
		lblCodigo_3_4_2_6_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_3_1_1_1.setBounds(0, 0, 794, 162);
		listarInasistencias.add(lblCodigo_3_4_2_6_3_1_1_1);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(0, 173, 784, 365);
		listarInasistencias.add(scrollPane_6);

		table_5 = new JTable();
		scrollPane_6.setViewportView(table_5);

		JPanel reporteEstadisticas = new JPanel();
		panelMaster.add(reporteEstadisticas, "reporteEstadisticas");
		reporteEstadisticas.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1_1_1 = new JLabel("Reporte de estad\u00EDsticas");
		lblCodigo_3_4_2_6_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_3_1_1_1_1.setBounds(0, 0, 794, 139);
		reporteEstadisticas.add(lblCodigo_3_4_2_6_3_1_1_1_1);

		JLabel lblNewLabel_29 = new JLabel("Indice de inasistencias");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_29.setBounds(91, 194, 212, 66);
		reporteEstadisticas.add(lblNewLabel_29);

		textField_50 = new JTextField();
		textField_50.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField_50.setBounds(313, 194, 386, 66);
		reporteEstadisticas.add(textField_50);
		textField_50.setColumns(10);
		textField_50.setEditable(false);

		JLabel lblNewLabel_30 = new JLabel("Materia con mas inasistencias");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_30.setBounds(91, 281, 281, 66);
		reporteEstadisticas.add(lblNewLabel_30);

		textField_51 = new JTextField();
		textField_51.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField_51.setBounds(598, 285, 101, 66);
		reporteEstadisticas.add(textField_51);
		textField_51.setColumns(10);
		textField_51.setEditable(false);

		textField_52 = new JTextField();
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField_52.setBounds(382, 285, 206, 66);
		reporteEstadisticas.add(textField_52);
		textField_52.setColumns(10);
		textField_52.setEditable(false);

		JPanel listarEstudiantes = new JPanel();
		panelMaster.add(listarEstudiantes, "listarEstudiantes");
		listarEstudiantes.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1_1_1_1 = new JLabel("Listar estudiantes");
		lblCodigo_3_4_2_6_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 50));
		lblCodigo_3_4_2_6_3_1_1_1_1_1.setBounds(10, 11, 439, 141);
		listarEstudiantes.add(lblCodigo_3_4_2_6_3_1_1_1_1_1);

		JLabel lblCodigo_3_7_1_1 = new JLabel("Generacion");
		lblCodigo_3_7_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_7_1_1.setBounds(459, 21, 143, 35);
		listarEstudiantes.add(lblCodigo_3_7_1_1);

		JLabel lblCodigo_3_7_1_2 = new JLabel("Orientacion");
		lblCodigo_3_7_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_7_1_2.setBounds(459, 67, 143, 37);
		listarEstudiantes.add(lblCodigo_3_7_1_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 163, 774, 375);
		listarEstudiantes.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JComboBox comboBox_3 = new JComboBox();

		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { " ", "TIC", "ADM", "TICYADM" }));
		comboBox_3.setBounds(612, 67, 172, 37);
		listarEstudiantes.add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox();

		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { " ", "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox_4.setBounds(612, 19, 172, 37);
		listarEstudiantes.add(comboBox_4);

		JButton btnNewButton_11 = new JButton("Buscar");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_11.setBounds(612, 115, 172, 37);
		listarEstudiantes.add(btnNewButton_11);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		contentPane.setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mnMenu);
		mnMenu.setVisible(false);

		JMenu mnDischange = new JMenu("Dar de alta");
		mnDischange.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnMenu.add(mnDischange);

		JMenuItem mntmUser = new JMenuItem("Usuario");
		mntmUser.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnDischange.add(mntmUser);

		JMenuItem mntmSubject = new JMenuItem("Materia");
		mntmSubject.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnDischange.add(mntmSubject);

		JMenuItem mntmAbsence = new JMenuItem("Inasistencia");
		mntmAbsence.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnDischange.add(mntmAbsence);

		JMenuItem mntmExamen = new JMenuItem("Examen");
		mntmExamen.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mntmExamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnDischange.add(mntmExamen);

		JMenu mnConsult = new JMenu("Consultar");
		mnConsult.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnMenu.add(mnConsult);

		JMenuItem mntmUser_1 = new JMenuItem("Usuario");
		mntmUser_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnConsult.add(mntmUser_1);

		JMenuItem mntmSubject_1 = new JMenuItem("Materia");
		mntmSubject_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnConsult.add(mntmSubject_1);

		JMenuItem mntmAbsence_1 = new JMenuItem("Inasistencias");
		mntmAbsence_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnConsult.add(mntmAbsence_1);

		JMenu mnList = new JMenu("Listar");
		mnList.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnMenu.add(mnList);

		JMenuItem mntmUsers = new JMenuItem("Estudiantes");
		mntmUsers.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnList.add(mntmUsers);

		JMenuItem mntmTeachers = new JMenuItem("Funcionarios");
		mntmTeachers.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnList.add(mntmTeachers);

		JMenuItem mntmOfficials = new JMenuItem("Docentes");
		mntmOfficials.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnList.add(mntmOfficials);

		JMenuItem mntmSubjects = new JMenuItem("Examenes");
		mntmSubjects.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnList.add(mntmSubjects);

		JMenuItem mntmMaterias = new JMenuItem("Materias");
		mntmMaterias.setFont(new Font("Segoe UI", Font.PLAIN, 20));
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
		mntmInasistencias.setFont(new Font("Segoe UI", Font.PLAIN, 20));
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
		mntmAbsences.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnMenu.add(mntmAbsences);

		JMenuItem mntmAbsences_1 = new JMenuItem("Salir");
		mntmAbsences_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mntmAbsences_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelMaster, "MENU");
				mnMenu.setVisible(false);
			}
		});
		mnMenu.add(mntmAbsences_1);

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

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "panelRegister");

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
				textField.setText(null);
				textField_1.setText(null);
				textField_33.setText(null);

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

				textField_16.setText(null);
				textField_5.setText(null);
				dateChooser_5.setDate(null);
				textField_14.setText(null);

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

				comboBox_1.setSelectedItem(0);
				comboBox_7.setSelectedItem(0);
				comboBox.setSelectedItem(0);
				dateChooser.setDate(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);

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
				if (oriCOM == "TICYADM" && genCOM == "PRIMERO") {
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
								"SELECT * FROM estudiante WHERE generacion='PRIMERO' && orientacion ='TICYADM'");
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
					if (oriCOM == "TICYADM" && genCOM == "SEGUNDO") {
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
									"SELECT * FROM estudiante WHERE generacion='SEGUNDO' && orientacion ='TICYADM'");
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
						if (oriCOM == "TICYADM" && genCOM == "TERCERO") {
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
										"SELECT * FROM estudiante WHERE generacion='TERCERO' && orientacion ='TICYADM'");
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

				if (oriCOM == "TIC" && genCOM == " ") {
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
						rs2 = connection.createStatement()
								.executeQuery("SELECT * FROM estudiante WHERE orientacion ='TIC'");
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

				if (oriCOM == "ADM" && genCOM == " ") {
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
						rs2 = connection.createStatement()
								.executeQuery("SELECT * FROM estudiante WHERE orientacion ='ADM'");
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
				if (oriCOM == " " && genCOM == "PRIMERO") {
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
						rs2 = connection.createStatement()
								.executeQuery("SELECT * FROM estudiante WHERE generacion='PRIMERO'");
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

				if (oriCOM == " " && genCOM == "SEGUNDO") {
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
						rs2 = connection.createStatement()
								.executeQuery("SELECT * FROM estudiante WHERE generacion='SEGUNDO'");
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
				if (oriCOM == " " && genCOM == "TERCERO") {
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
						rs2 = connection.createStatement()
								.executeQuery("SELECT * FROM estudiante WHERE generacion='TERCERO'");
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

		});

		mntmAbsence_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "CONSULT_ABSENCE");

			}
		});

		btnNewButton_9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				LocalDate dateInicio = LocalDate.parse(sdft.format(dateChooser_3.getDate()));
				LocalDate dateFin = LocalDate.parse(sdft.format(dateChooser_4.getDate()));
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
				model.addColumn("Codigo de la Materia");
				model.addColumn("Tipo de inasistencia");
				model.addColumn("Cedula del Estudiante");

				String[] dato = new String[5];
				try {
					ResultSet result9 = controladorlg.consultarInasistencia(dateInicio, dateFin);
					while (result9.next()) {
						dato[0] = result9.getString(1);
						dato[1] = result9.getString(2);
						dato[2] = result9.getString(3);
						dato[3] = result9.getString(4);
						dato[4] = result9.getString(5);
						model.addRow(dato);
					}

					table_6.setModel(model);
				}

				catch (Exception e3) {
					e3.printStackTrace();
				}

				dateChooser_3.setDate(null);
				dateChooser_4.setDate(null);

			}
		});

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ResultSet res13 = controladorlg.consultarUsuario(textField_25.getText());
					if (res13.next() == true) {
						textField_26.setText(res13.getString("nombre"));
						textField_27.setText(res13.getString("apellido"));
						textField_28.setText(res13.getString("ci"));
						textField_29.setText(res13.getString("fechaDeNacimiento"));
						textField_30.setText(res13.getString("correo"));
						textField_31.setText(res13.getString("passwd"));

					} else {
						JOptionPane.showMessageDialog(null, "Error no existe este Usuario con esta CI");
					}
				} catch (Exception e4) {
					e4.printStackTrace();
				}
				try {
					ResultSet res77 = controladorlg.consultarSiEsEstudiante(textField_25.getText());
					ResultSet res99 = controladorlg.consultarSiEsDocente(textField_25.getText());
					if (res77.next() == true) {
						textField_42.setText("ESTUDIANTE");
						lblNewLabel_21.setVisible(true);
						lblNewLabel_23.setVisible(true);
						textField_45.setVisible(true);
						lblNewLabel_24.setVisible(true);
						textField_46.setVisible(true);
						btnNewButton_13.setVisible(true);
						lblNewLabel_22.setVisible(false);
						lblNewLabel_25.setVisible(false);
						textField_47.setVisible(false);
						btnNewButton_14.setVisible(false);
					} else {
						if (res99.next() == true) {
							textField_42.setText("DOCENTE");
							lblNewLabel_22.setVisible(true);
							lblNewLabel_25.setVisible(true);
							textField_47.setVisible(true);
							btnNewButton_14.setVisible(true);
							lblNewLabel_21.setVisible(false);
							lblNewLabel_23.setVisible(false);
							textField_45.setVisible(false);
							lblNewLabel_24.setVisible(false);
							textField_46.setVisible(false);
							btnNewButton_13.setVisible(false);
						} else {
							textField_42.setText("FUNCIONARIO");
						}
					}

				} catch (Exception e45) {
					e45.printStackTrace();
				}
				lblNewLabel_9.setVisible(true);
				lblNewLabel_10.setVisible(true);
				lblNewLabel_11.setVisible(true);
				lblNewLabel_12.setVisible(true);
				lblNewLabel_13.setVisible(true);
				lblNewLabel_14.setVisible(true);
				textField_26.setVisible(true);
				textField_27.setVisible(true);
				textField_28.setVisible(true);
				textField_29.setVisible(true);
				textField_30.setVisible(true);
				textField_31.setVisible(true);
				textField_39.setVisible(true);
				textField_40.setVisible(true);
				dateChooser_6.setVisible(true);
				textField_43.setVisible(true);
				textField_44.setVisible(true);
				btnNewButton_6.setVisible(true);
				textField_25.setText(null);
				textField_42.setVisible(true);
				lblNewLabel_20.setVisible(true);

			}
		});

		btnNewButton_5_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (textField_32.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, ingrese un nombre o una id de materia");
					lblNewLabel_15.setVisible(false);
					lblNewLabel_16.setVisible(false);
					lblNewLabel_17.setVisible(false);
					lblNewLabel_18.setVisible(false);
					lblNewLabel_19.setVisible(false);
					textField_34.setVisible(false);
					textField_35.setVisible(false);
					textField_36.setVisible(false);
					textField_37.setVisible(false);
					textField_38.setVisible(false);
					textField_41.setVisible(false);
					comboBox_2.setVisible(false);
					comboBox_8.setVisible(false);
					btnNewButton_12.setVisible(false);
				} else {
					try {
						ResultSet res15 = controladorlg.cantidadIns(textField_32.getText());
						ResultSet res14 = controladorlg.consultarMateria(textField_32.getText());
						if (res14.next()) {
							textField_34.setText(res14.getString("nombre"));
							textField_35.setText(res14.getString("id"));
							textField_36.setText(res14.getString("orientacion"));
							textField_37.setText(res14.getString("generacion"));
							res15.next();
							textField_38.setText(res15.getString(1));

						} else {
							JOptionPane.showMessageDialog(null,
									"Error no existe esta Materia con este Nombre o esta ID");
						}
					} catch (Exception e4) {
						e4.printStackTrace();
					}
					lblNewLabel_15.setVisible(true);
					lblNewLabel_16.setVisible(true);
					lblNewLabel_17.setVisible(true);
					lblNewLabel_18.setVisible(true);
					lblNewLabel_19.setVisible(true);
					textField_34.setVisible(true);
					textField_35.setVisible(true);
					textField_36.setVisible(true);
					textField_37.setVisible(true);
					textField_38.setVisible(true);
					textField_41.setVisible(true);
					comboBox_2.setVisible(true);
					comboBox_8.setVisible(true);
					btnNewButton_12.setVisible(true);
					textField_32.setText(null);
				}

			}
		});

		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nom = textField_39.getText();
				String apell = textField_40.getText();
				String ci = textField_28.getText();
				LocalDate fech = LocalDate.parse(sdft.format(dateChooser_6.getDate()));
				String mail = textField_43.getText();
				String psswd = textField_44.getText();
				try {
					controladorlg.modificarUsuario(nom, apell, ci, fech, mail, psswd);
					JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente");

				} catch (Exception e99) {
					e99.printStackTrace();
				}
				textField_26.setText(null);
				textField_27.setText(null);
				textField_28.setText(null);
				textField_29.setText(null);
				textField_30.setText(null);
				textField_31.setText(null);
				textField_39.setText(null);
				textField_40.setText(null);
				dateChooser_6.setDate(null);
				textField_43.setText(null);
				textField_44.setText(null);

			}
		});

		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombreMat = textField_41.getText();
				String oriMat = comboBox_2.getSelectedItem().toString();
				String geneMat = comboBox_8.getSelectedItem().toString();
				String idMat = textField_35.getText();
				if (nombreMat.isEmpty() && comboBox_2.getSelectedItem() == " " && comboBox_8.getSelectedItem() == " ") {
					JOptionPane.showMessageDialog(null, "Error, rellene bien todos los casilleros a modificar");
				} else {
					if (nombreMat.isEmpty() && comboBox_2.getSelectedItem() == " ") {
						JOptionPane.showMessageDialog(null, "Error, rellene bien la seccion Nombre y Orientacion");
					} else {
						if (nombreMat.isEmpty() && comboBox_8.getSelectedItem() == " ") {
							JOptionPane.showMessageDialog(null, "Error, rellene bien la seccion Nombre y Generacion");
						} else {
							if (comboBox_2.getSelectedItem() == " " && comboBox_8.getSelectedItem() == " ") {
								JOptionPane.showMessageDialog(null,
										"Error, rellene bien la seccion Orientacion y Generacion");
							} else {
								if (nombreMat.isEmpty()) {
									JOptionPane.showMessageDialog(null, "Error, rellene bien la seccion Nombre");
								} else {
									if (comboBox_2.getSelectedItem() == " ") {
										JOptionPane.showMessageDialog(null, "Error, rellene bien la seccion Orientacion");
									} else {
										if (comboBox_8.getSelectedItem() == " ") {
											JOptionPane.showMessageDialog(null, "Error, rellene bien la seccion Generacion");
										} else {
											try {
												controladorlg.modificarMateria(idMat, nombreMat, oriMat, geneMat);
												System.out.println(
														idMat + "," + nombreMat + "," + oriMat + "," + geneMat);
												JOptionPane.showMessageDialog(null, "Materia modificada exitosamente!");
											} catch (Exception e88) {
												e88.printStackTrace();
											}

											textField_34.setText(null);
											textField_35.setText(null);
											textField_36.setText(null);
											textField_37.setText(null);
											textField_38.setText(null);
											textField_41.setText(null);
										}
									}
								}
							}

						}
					}

				}

			}

		});

		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ciestudiante = textField_28.getText();
				String idMateria = textField_45.getText();
				String notaMateria = textField_46.getText();
				try {
					controladorlg.crearCursa(ciestudiante, idMateria, notaMateria);
				} catch (Exception e43) {
					e43.printStackTrace();
				}
			}
		});

		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String idmateria = textField_47.getText();
				String cidocente = textField_28.getText();
				try {
					controladorlg.modificarDicta(idmateria, cidocente);
				} catch (Exception e54) {
					e54.printStackTrace();
				}

			}
		});

		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table_6.getModel();
				int idFila = table_6.getSelectedRow();

				if (idFila >= 0) {
					String selected = model.getValueAt(idFila, 0).toString();
					model.removeRow(idFila);
					try {
						controladorlg.eliminarInasistencia(selected);
					} catch (Exception e54) {
						e54.printStackTrace();
					}
				} else {
					if (idFila < 0) {
						JOptionPane.showMessageDialog(null, "Error, fila no seleccionada");
					}

				}
			}
		});

		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String ciLogin = textField_4.getText();
				String psswdLogin = textField_3.getText();

				try {
					ResultSet res344 = controladorlg.login(ciLogin, psswdLogin);
					if (res344.next() == true) {
						cardLayout.show(panelMaster, "random");
						mnMenu.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Error Usuario no registrado");
					}
				} catch (Exception e393) {
					e393.printStackTrace();
				}
				textField_3.setText(null);
				textField_4.setText(null);

			}
		});

		mntmAbsences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMaster, "reporteEstadisticas");
				ResultSet res456;
				ResultSet res65;

				Long inaCount = null;
				Long estuCount = null;
				int materiasRepetidas = 0;
				String nombreMateriaRepetida = null;

				res456 = controladorlg.reporteEstadisticasInasistenciaIndice();
				res65 = controladorlg.reporteEstadisticasEstudiante();

				try {
					if (res456.next()) {
						inaCount = res456.getLong(1);
					}
				} catch (Exception e456) {
					e456.printStackTrace();
				}

				try {
					if (res65.next()) {
						estuCount = res65.getLong(1);
					}

				} catch (Exception e65) {
					e65.printStackTrace();
				}

				double indiceInasistencia = ((double) inaCount / estuCount);
				String indiceInasistenciaa = Double.toString(indiceInasistencia);
				textField_50.setText(indiceInasistenciaa);

				ResultSet res67;
				res67 = controladorlg.materiasRepetidas();

				try {
					if (res67.next()) {
						nombreMateriaRepetida = res67.getString(1);
						materiasRepetidas = Integer.parseInt(res67.getString(2));
					}

				} catch (Exception e67) {
					e67.printStackTrace();
				}
				String materiasRepetidass = Integer.toString(materiasRepetidas);
				textField_52.setText(nombreMateriaRepetida);
				textField_51.setText(materiasRepetidass);

			}
		});

		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox_7.getSelectedItem() == "ACTIVO") {
					lblCodigo_3_7_1.setVisible(true);
					comboBox.setVisible(true);
				} else {
					if (comboBox_7.getSelectedItem() == "EGRESADO") {
						lblCodigo_3_7_1.setVisible(false);
						comboBox.setVisible(false);

					} else {
						if (comboBox_7.getSelectedItem() == "DESVINCULADO") {
							lblCodigo_3_7_1.setVisible(false);
							comboBox.setVisible(false);
						} else {
							lblCodigo_3_7_1.setVisible(false);
							comboBox.setVisible(false);
						}
					}
				}
			}
		});

	}
}
