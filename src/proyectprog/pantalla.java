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
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ForkJoinPool;

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
import javax.swing.JComponent;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputVerifier;
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
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Dimension;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class pantalla {

	ControladorLogic controladorlg = new ControladorLogic();
	Conn conn = new Conn();
	Connection connection = conn.connectToMySQL();
	private JFrame contentPane;
	private CardLayout cardLayout;
	private CardLayout cardLayoutt;
	private CardLayout cardLayouttt;
	private JTextField textField;
	private JTextField txtAs;
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
	private JTextField textField_1;
	private JTextField textField_48;

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
		contentPane.setUndecorated(true);
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		contentPane.getContentPane().setBackground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setResizable(false);
		contentPane.setBounds(289, 96, 800, 600);
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.getContentPane().setLayout(null);

		JPanel panelMaster = new JPanel();
		panelMaster.setBounds(180, 44, 620, 556);
		contentPane.getContentPane().add(panelMaster);
		panelMaster.setLayout(new CardLayout(0, 0));
		cardLayout = (CardLayout) panelMaster.getLayout();
		controladorlg.actualizarDeAño();

		JPanel login = new JPanel();
		panelMaster.add(login, "panelRegister");
		login.setLayout(null);

		JLabel lblPasw = new JLabel("Contrase\u00F1a");
		lblPasw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasw.setFont(new Font("Arial", Font.PLAIN, 25));
		lblPasw.setBounds(57, 226, 187, 38);
		login.add(lblPasw);

		textField_3 = new JPasswordField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(243, 226, 273, 38);
		login.add(textField_3);
		textField_3.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_3.getText().length() == 20)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		JLabel lblMail = new JLabel("C.I");
		lblMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblMail.setFont(new Font("Arial", Font.PLAIN, 25));
		lblMail.setBounds(57, 180, 187, 38);
		login.add(lblMail);

		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Una cedula de identidad no contiene letras, solo numeros",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null,
							"No se admiten caracteres especiales en una cedula de identidad", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_4.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_4.getText().length() == 8)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(243, 180, 273, 38);
		login.add(textField_4);

		JButton btnNewButton_2_1 = new JButton("Iniciar Sesion");

		btnNewButton_2_1.setBounds(226, 275, 168, 33);
		login.add(btnNewButton_2_1);

		JLabel lblCodigo_3_4_2_1_2_1 = new JLabel("Iniciar sesi\u00F3n");
		lblCodigo_3_4_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1_2_1.setBounds(10, 74, 600, 91);
		login.add(lblCodigo_3_4_2_1_2_1);

		JPanel darAltaUsuario = new JPanel();
		panelMaster.add(darAltaUsuario, "DISCHANGE_USER");
		darAltaUsuario.setLayout(null);

		JButton btnNewButton = new JButton("Estudiante");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));

		btnNewButton.setBounds(185, 245, 250, 43);
		darAltaUsuario.add(btnNewButton);

		JButton btnAltaDocente = new JButton("Docente");
		btnAltaDocente.setFont(new Font("Tahoma", Font.PLAIN, 30));

		btnAltaDocente.setBounds(185, 299, 250, 43);
		darAltaUsuario.add(btnAltaDocente);

		JButton btnAltaFuncionario = new JButton("Funcionario");
		btnAltaFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 30));

		btnAltaFuncionario.setBounds(185, 353, 250, 43);
		darAltaUsuario.add(btnAltaFuncionario);

		JLabel lblCodigo_3_4_2_1_1 = new JLabel("Seleccione tipo de usuario");
		lblCodigo_3_4_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_1.setFont(new Font("Cambria", Font.PLAIN, 50));
		lblCodigo_3_4_2_1_1.setBounds(10, 93, 600, 141);
		darAltaUsuario.add(lblCodigo_3_4_2_1_1);

		JPanel darAltaMateria = new JPanel();
		panelMaster.add(darAltaMateria, "DISCHANGE_SUBJECT");
		darAltaMateria.setLayout(null);

		textField = new JTextField();
		textField.setBounds(140, 174, 187, 41);
		darAltaMateria.add(textField);
		textField.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 174, 126, 41);
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 25));
		darAltaMateria.add(lblNombre);

		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(10, 220, 126, 41);
		lblCodigo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 25));
		darAltaMateria.add(lblCodigo);

		txtAs = new JTextField();
		txtAs.setBounds(140, 226, 187, 41);
		txtAs.setColumns(10);
		darAltaMateria.add(txtAs);
		txtAs.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (txtAs.getText().length() == 9)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		JLabel lblCodigo_1 = new JLabel("Generacion");
		lblCodigo_1.setBounds(10, 324, 156, 41);
		lblCodigo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_1.setFont(new Font("Arial", Font.PLAIN, 25));
		darAltaMateria.add(lblCodigo_1);

		JButton btnNewButton_3 = new JButton("Crear Materia");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(384, 432, 226, 41);

		darAltaMateria.add(btnNewButton_3);

		JLabel lblCodigo_3_4_2_2 = new JLabel("Alta a una materia");
		lblCodigo_3_4_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_2.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_2.setBounds(10, 44, 600, 120);
		darAltaMateria.add(lblCodigo_3_4_2_2);

		JComboBox comboBox_1_4 = new JComboBox();
		comboBox_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] { " ", "TIC", "ADM", "TICYADM" }));
		comboBox_1_4.setBounds(165, 278, 162, 32);
		darAltaMateria.add(comboBox_1_4);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { " ", "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox_5.setBounds(165, 332, 156, 32);
		darAltaMateria.add(comboBox_5);

		JLabel lblNewLabel_7 = new JLabel("Orientacion");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(10, 272, 156, 41);
		darAltaMateria.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("CI del Docente que la Dicta");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(10, 376, 320, 41);
		darAltaMateria.add(lblNewLabel_8);

		textField_33 = new JTextField();
		textField_33.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		textField_33.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_33.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_33.getText().length() == 8)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		textField_33.setBounds(329, 376, 187, 41);
		darAltaMateria.add(textField_33);
		textField_33.setColumns(10);

		JPanel altaInasistencia = new JPanel();
		panelMaster.add(altaInasistencia, "DISCHANGE_ABSENCE");
		altaInasistencia.setLayout(null);

		JLabel lblNewLabel = new JLabel("Crear Inasistencia");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblNewLabel.setBounds(10, 23, 600, 131);
		altaInasistencia.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cantidad de Horas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 204, 218, 22);
		altaInasistencia.add(lblNewLabel_1);

		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_5.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_5.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_5.getText().length() == 2)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		textField_5.setBounds(238, 204, 187, 28);
		altaInasistencia.add(textField_5);
		textField_5.setColumns(10);

		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setBounds(86, 237, 148, 28);
		altaInasistencia.add(dateChooser_5);

		JLabel lblNewLabel_2 = new JLabel("Fecha");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(10, 237, 84, 20);
		altaInasistencia.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("ID Materia");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(10, 276, 124, 22);
		altaInasistencia.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Tipo de Inasistencia");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(10, 309, 236, 22);
		altaInasistencia.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("CI Estudiante");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(10, 165, 156, 28);
		altaInasistencia.add(lblNewLabel_5);

		JButton btnNewButton_2 = new JButton("Crear");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setBounds(433, 304, 177, 33);
		altaInasistencia.add(btnNewButton_2);

		textField_14 = new JTextField();
		textField_14.setBounds(134, 276, 148, 28);
		altaInasistencia.add(textField_14);
		textField_14.setColumns(10);

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_6.setModel(
				new DefaultComboBoxModel(new String[] { " ", "JUSTIFICADA", "INJUSTIFICADA", "LLEGADA_TARDE" }));
		comboBox_6.setBounds(238, 308, 151, 28);
		altaInasistencia.add(comboBox_6);

		textField_16 = new JTextField();
		textField_16.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_16.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_16.getText().length() == 8)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		textField_16.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_16.setBounds(176, 165, 187, 28);
		altaInasistencia.add(textField_16);
		textField_16.setColumns(10);

		JPanel consultarUsuario = new JPanel();
		panelMaster.add(consultarUsuario, "CONSULT_USER");
		consultarUsuario.setLayout(null);

		JLabel lblCodigo_3_4_2_5 = new JLabel("Consultar usuario");
		lblCodigo_3_4_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_5.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_5.setBounds(0, 0, 620, 71);
		consultarUsuario.add(lblCodigo_3_4_2_5);

		JLabel lblCodigo_3_8_1_1 = new JLabel("C.I del usuario");
		lblCodigo_3_8_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_8_1_1.setBounds(10, 82, 176, 37);
		consultarUsuario.add(lblCodigo_3_8_1_1);

		textField_25 = new JTextField();
		textField_25.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_25.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_25.getText().length() == 8)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		textField_25.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_25.setColumns(10);
		textField_25.setBounds(180, 85, 176, 32);
		consultarUsuario.add(textField_25);

		JButton btnNewButton_5 = new JButton("Consultar");

		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_5.setBounds(366, 85, 176, 34);
		consultarUsuario.add(btnNewButton_5);

		JLabel lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setBounds(10, 130, 59, 19);
		consultarUsuario.add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);

		JLabel lblNewLabel_10 = new JLabel("Apellido");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setBounds(10, 157, 59, 19);
		consultarUsuario.add(lblNewLabel_10);
		lblNewLabel_10.setVisible(false);

		JLabel lblNewLabel_11 = new JLabel("Cedula de Identidad");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(10, 192, 130, 19);
		consultarUsuario.add(lblNewLabel_11);
		lblNewLabel_11.setVisible(false);

		JLabel lblNewLabel_12 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(10, 222, 139, 19);
		consultarUsuario.add(lblNewLabel_12);
		lblNewLabel_12.setVisible(false);

		JLabel lblNewLabel_13 = new JLabel("Contrase\u00F1a");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(10, 282, 81, 19);
		consultarUsuario.add(lblNewLabel_13);
		lblNewLabel_13.setVisible(false);

		JLabel lblNewLabel_14 = new JLabel("Correo");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_14.setBounds(10, 252, 53, 19);
		consultarUsuario.add(lblNewLabel_14);
		lblNewLabel_14.setVisible(false);

		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.LEFT);
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_26.setBounds(75, 124, 221, 26);
		consultarUsuario.add(textField_26);
		textField_26.setColumns(10);
		textField_26.setVisible(false);
		textField_26.setEditable(false);

		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.LEFT);
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_27.setBounds(75, 155, 219, 26);
		consultarUsuario.add(textField_27);
		textField_27.setColumns(10);
		textField_27.setVisible(false);
		textField_27.setEditable(false);

		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.LEFT);
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_28.setBounds(150, 186, 177, 26);
		consultarUsuario.add(textField_28);
		textField_28.setColumns(10);
		textField_28.setVisible(false);
		textField_28.setEditable(false);

		textField_29 = new JTextField();
		textField_29.setHorizontalAlignment(SwingConstants.LEFT);
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_29.setBounds(150, 216, 177, 26);
		consultarUsuario.add(textField_29);
		textField_29.setColumns(10);
		textField_29.setVisible(false);
		textField_29.setEditable(false);

		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.LEFT);
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_30.setBounds(73, 248, 210, 26);
		consultarUsuario.add(textField_30);
		textField_30.setColumns(10);
		textField_30.setVisible(false);
		textField_30.setEditable(false);

		textField_31 = new JPasswordField();
		textField_31.setHorizontalAlignment(SwingConstants.LEFT);
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_31.setBounds(101, 279, 221, 26);
		consultarUsuario.add(textField_31);
		textField_31.setColumns(10);
		textField_31.setVisible(false);
		textField_31.setEditable(false);

		JButton btnNewButton_6 = new JButton("Modificar");
		btnNewButton_6.setVisible(false);

		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_6.setBounds(434, 312, 176, 26);
		consultarUsuario.add(btnNewButton_6);

		textField_39 = new JTextField();
		textField_39.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_39.setBounds(304, 124, 176, 26);
		consultarUsuario.add(textField_39);
		textField_39.setColumns(10);
		textField_39.setVisible(false);

		textField_40 = new JTextField();
		textField_40.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_40.setBounds(304, 155, 176, 26);
		consultarUsuario.add(textField_40);
		textField_40.setColumns(10);
		textField_40.setVisible(false);

		textField_43 = new JTextField();
		textField_43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_43.setBounds(293, 247, 176, 24);
		consultarUsuario.add(textField_43);
		textField_43.setColumns(10);
		textField_43.setVisible(false);

		textField_44 = new JPasswordField();
		textField_44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_44.setBounds(335, 277, 176, 24);
		consultarUsuario.add(textField_44);
		textField_44.setColumns(10);
		textField_44.setVisible(false);

		JDateChooser dateChooser_6 = new JDateChooser();
		dateChooser_6.setBounds(337, 216, 176, 24);
		consultarUsuario.add(dateChooser_6);

		JLabel lblNewLabel_20 = new JLabel("Tipo de Usuario");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_20.setBounds(10, 312, 110, 26);
		consultarUsuario.add(lblNewLabel_20);
		lblNewLabel_20.setVisible(false);

		textField_42 = new JTextField();
		textField_42.setBounds(130, 312, 130, 26);
		consultarUsuario.add(textField_42);
		textField_42.setColumns(10);
		textField_42.setEditable(false);

		JLabel lblNewLabel_21 = new JLabel("Agregar Materias a Estudiante");
		lblNewLabel_21.setVisible(false);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setBounds(10, 349, 289, 32);
		consultarUsuario.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("Modificar materias que dicta Docente");
		lblNewLabel_22.setVisible(false);
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_22.setBounds(269, 349, 289, 32);
		consultarUsuario.add(lblNewLabel_22);

		textField_45 = new JTextField();
		textField_45.setVisible(false);
		textField_45.setBounds(140, 392, 86, 20);
		consultarUsuario.add(textField_45);
		textField_45.setColumns(10);
		textField_45.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_45.getText().length() == 8)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		textField_45.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JLabel lblNewLabel_23 = new JLabel("ID de Materia");
		lblNewLabel_23.setVisible(false);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23.setBounds(44, 393, 97, 14);
		consultarUsuario.add(lblNewLabel_23);

		textField_46 = new JTextField();
		textField_46.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_46.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_46.getText().length() == 2)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		textField_46.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_46.setVisible(false);
		textField_46.setBounds(140, 420, 86, 20);
		consultarUsuario.add(textField_46);
		textField_46.setColumns(10);

		JLabel lblNewLabel_24 = new JLabel("Nota");
		lblNewLabel_24.setVisible(false);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_24.setBounds(44, 418, 86, 19);
		consultarUsuario.add(lblNewLabel_24);

		JButton btnNewButton_13 = new JButton("Agregar");

		btnNewButton_13.setVisible(false);
		btnNewButton_13.setBounds(87, 451, 89, 23);
		consultarUsuario.add(btnNewButton_13);

		JLabel lblNewLabel_25 = new JLabel("ID Materia a la que esta dictando el docente");
		lblNewLabel_25.setVisible(false);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_25.setBounds(242, 391, 300, 19);
		consultarUsuario.add(lblNewLabel_25);

		textField_47 = new JTextField();
		textField_47.setVisible(false);
		textField_47.setBounds(540, 392, 70, 20);
		consultarUsuario.add(textField_47);
		textField_47.setColumns(10);
		textField_46.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_46.getText().length() == 9)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		JButton btnNewButton_14 = new JButton("Modificar");

		btnNewButton_14.setVisible(false);
		btnNewButton_14.setBounds(381, 451, 89, 23);
		consultarUsuario.add(btnNewButton_14);

		JLabel lblNewLabel_26 = new JLabel("ID Materia a la cual quieres que dicte");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_26.setBounds(283, 422, 249, 18);
		consultarUsuario.add(lblNewLabel_26);
		lblNewLabel_26.setVisible(false);

		textField_1 = new JTextField();
		textField_1.setBounds(529, 420, 86, 20);
		consultarUsuario.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		textField_42.setVisible(false);

		dateChooser_6.setVisible(false);

		JPanel consultarMateria = new JPanel();
		panelMaster.add(consultarMateria, "CONSULT_SUBJECT");
		consultarMateria.setLayout(null);

		JLabel lblCodigo_3_4_2_3 = new JLabel("Consultar materia");
		lblCodigo_3_4_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_3.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_3.setBounds(0, 0, 620, 121);
		consultarMateria.add(lblCodigo_3_4_2_3);

		JLabel lblCodigo_3_8_1_1_1 = new JLabel("Nombre o c\u00F3digo de materia");
		lblCodigo_3_8_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCodigo_3_8_1_1_1.setBounds(10, 126, 205, 49);
		consultarMateria.add(lblCodigo_3_8_1_1_1);

		textField_32 = new JTextField();
		textField_32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_32.setColumns(10);
		textField_32.setBounds(195, 132, 218, 38);
		consultarMateria.add(textField_32);
		textField_32.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton btnNewButton_5_1 = new JButton("Consultar");
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_5_1.setBounds(423, 132, 148, 38);
		consultarMateria.add(btnNewButton_5_1);

		JLabel lblNewLabel_15 = new JLabel("Nombre");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(10, 190, 109, 38);
		consultarMateria.add(lblNewLabel_15);
		lblNewLabel_15.setVisible(false);

		JLabel lblNewLabel_16 = new JLabel("Codigo");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(10, 237, 97, 31);
		consultarMateria.add(lblNewLabel_16);
		lblNewLabel_16.setVisible(false);

		JLabel lblNewLabel_17 = new JLabel("Orientacion");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_17.setBounds(10, 279, 141, 31);
		consultarMateria.add(lblNewLabel_17);
		lblNewLabel_17.setVisible(false);

		JLabel lblNewLabel_18 = new JLabel("Generacion");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_18.setBounds(10, 321, 141, 31);
		consultarMateria.add(lblNewLabel_18);
		lblNewLabel_18.setVisible(false);

		JLabel lblNewLabel_19 = new JLabel("Cantidad de Inscriptos");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_19.setBounds(10, 363, 264, 31);
		consultarMateria.add(lblNewLabel_19);

		textField_34 = new JTextField();
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_34.setBounds(123, 190, 218, 35);
		consultarMateria.add(textField_34);
		textField_34.setColumns(10);
		textField_34.setVisible(false);
		textField_34.setEditable(false);

		textField_35 = new JTextField();
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_35.setBounds(117, 239, 224, 29);
		consultarMateria.add(textField_35);
		textField_35.setColumns(10);
		textField_35.setVisible(false);
		textField_35.setEditable(false);

		textField_36 = new JTextField();
		textField_36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_36.setBounds(161, 279, 180, 31);
		consultarMateria.add(textField_36);
		textField_36.setColumns(10);
		textField_36.setVisible(false);
		textField_36.setEditable(false);

		textField_37 = new JTextField();
		textField_37.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_37.setBounds(161, 321, 180, 31);
		consultarMateria.add(textField_37);
		textField_37.setColumns(10);
		textField_37.setVisible(false);
		textField_37.setEditable(false);

		textField_38 = new JTextField();
		textField_38.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_38.setBounds(272, 363, 68, 31);
		consultarMateria.add(textField_38);
		textField_38.setColumns(10);
		textField_38.setEditable(false);

		textField_41 = new JTextField();
		textField_41.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_41.setBounds(351, 190, 218, 35);
		consultarMateria.add(textField_41);
		textField_41.setColumns(10);
		textField_41.setVisible(false);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { " ", "TIC", "ADM", "TICYADM" }));
		comboBox_2.setBounds(351, 279, 218, 31);
		consultarMateria.add(comboBox_2);
		comboBox_2.setVisible(false);

		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] { " ", "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox_8.setBounds(351, 321, 220, 31);
		consultarMateria.add(comboBox_8);
		comboBox_8.setVisible(false);

		JButton btnNewButton_12 = new JButton("Modificar");
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_12.setBounds(423, 407, 148, 38);
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
		lblCodigo_3_4_2_4.setBounds(10, 0, 600, 97);
		consultarInasistencia.add(lblCodigo_3_4_2_4);

		JLabel lblCodigo_3_3_2 = new JLabel("Inicio");
		lblCodigo_3_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_3_2.setBounds(20, 108, 82, 33);
		consultarInasistencia.add(lblCodigo_3_3_2);

		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(95, 108, 148, 33);
		consultarInasistencia.add(dateChooser_3);

		JLabel lblCodigo_3_3_3 = new JLabel("Fin");
		lblCodigo_3_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_3.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_3_3.setBounds(253, 108, 52, 33);
		consultarInasistencia.add(lblCodigo_3_3_3);

		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(299, 108, 148, 33);
		consultarInasistencia.add(dateChooser_4);

		JButton btnNewButton_9 = new JButton("Consultar");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_9.setBounds(462, 108, 148, 33);
		consultarInasistencia.add(btnNewButton_9);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 148, 600, 332);
		consultarInasistencia.add(scrollPane_3);

		table_6 = new JTable();
		scrollPane_3.setViewportView(table_6);

		JButton btnNewButton_7 = new JButton("Eliminar");

		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.setBounds(475, 492, 135, 33);
		consultarInasistencia.add(btnNewButton_7);

		JPanel listarFuncionario = new JPanel();
		panelMaster.add(listarFuncionario, "LIST_TEACHERS");
		listarFuncionario.setLayout(null);

		JLabel lblCodigo_3_4_2_6_1 = new JLabel("Listar funcionario");
		lblCodigo_3_4_2_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_1.setBounds(0, 11, 610, 140);
		listarFuncionario.add(lblCodigo_3_4_2_6_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 162, 600, 361);
		listarFuncionario.add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);

		JPanel listarExamenes = new JPanel();
		panelMaster.add(listarExamenes, "LIST_SUBJECTS");
		listarExamenes.setLayout(null);

		JLabel lblCodigo_3_4_2_6_2 = new JLabel("Estudiantes con pendientes");
		lblCodigo_3_4_2_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_2.setFont(new Font("Cambria", Font.PLAIN, 50));
		lblCodigo_3_4_2_6_2.setBounds(0, 0, 610, 166);
		listarExamenes.add(lblCodigo_3_4_2_6_2);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 177, 600, 346);
		listarExamenes.add(scrollPane_5);

		table_3 = new JTable();
		scrollPane_5.setViewportView(table_3);

		JPanel random = new JPanel();
		panelMaster.add(random, "random");
		random.setLayout(null);

		JLabel lblCodigo_3_4_2_1_2_3 = new JLabel("Seleccione opci\u00F3n en el men\u00FA");
		lblCodigo_3_4_2_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_2_3.setFont(new Font("Cambria", Font.PLAIN, 45));
		lblCodigo_3_4_2_1_2_3.setBounds(10, 184, 600, 187);
		random.add(lblCodigo_3_4_2_1_2_3);

		JPanel altaEstudiante = new JPanel();
		panelMaster.add(altaEstudiante, "altaUsuario");
		altaEstudiante.setLayout(null);

		JLabel lblCodigo_3 = new JLabel("Nombre");
		lblCodigo_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3.setBounds(10, 134, 103, 35);
		altaEstudiante.add(lblCodigo_3);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(123, 134, 137, 31);
		altaEstudiante.add(textField_6);

		JLabel lblCodigo_3_1 = new JLabel("CI");
		lblCodigo_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_1.setBounds(10, 218, 46, 35);
		altaEstudiante.add(lblCodigo_3_1);

		textField_7 = new JTextField();

		textField_7.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_7.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null,
							"No se admiten caracteres especiales en una cedula de identidad", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_7.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_7.getText().length() == 8)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(66, 218, 137, 31);
		altaEstudiante.add(textField_7);

		JLabel lblCodigo_3_2 = new JLabel("Mail");
		lblCodigo_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_2.setBounds(10, 264, 68, 33);
		altaEstudiante.add(lblCodigo_3_2);

		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 45 || e.getKeyChar() == 47
						|| e.getKeyChar() >= 58 && e.getKeyChar() <= 64 || e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(66, 264, 137, 30);
		altaEstudiante.add(textField_8);

		JLabel lblCodigo_3_3 = new JLabel("Nacimiento");
		lblCodigo_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_3.setBounds(10, 308, 137, 35);
		altaEstudiante.add(lblCodigo_3_3);

		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(112, 176, 137, 31);
		altaEstudiante.add(textField_12);

		JLabel lblCodigo_3_4 = new JLabel("Apellido");
		lblCodigo_3_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_4.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_4.setBounds(10, 177, 103, 29);
		altaEstudiante.add(lblCodigo_3_4);

		textField_13 = new JPasswordField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(157, 354, 137, 31);
		altaEstudiante.add(textField_13);

		JLabel lblCodigo_3_5 = new JLabel("Contrase\u00F1a");
		lblCodigo_3_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_5.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_5.setBounds(10, 355, 137, 29);
		altaEstudiante.add(lblCodigo_3_5);

		JLabel lblCodigo_3_7 = new JLabel("Orientacion");
		lblCodigo_3_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_7.setBounds(10, 396, 137, 31);
		altaEstudiante.add(lblCodigo_3_7);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(157, 308, 137, 35);
		altaEstudiante.add(dateChooser);

		JButton btnNewButton_4 = new JButton("Crear Estudiante");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setForeground(Color.DARK_GRAY);

		btnNewButton_4.setBounds(414, 478, 196, 33);
		altaEstudiante.add(btnNewButton_4);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { " ", "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox.setBounds(157, 478, 137, 31);
		altaEstudiante.add(comboBox);
		comboBox.setVisible(false);

		JLabel lblCodigo_3_7_1 = new JLabel("Generacion");
		lblCodigo_3_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_7_1.setBounds(10, 478, 137, 35);
		altaEstudiante.add(lblCodigo_3_7_1);
		lblCodigo_3_7_1.setVisible(false);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { " ", "TIC", "ADM" }));
		comboBox_1.setBounds(154, 396, 137, 31);
		altaEstudiante.add(comboBox_1);

		JLabel lblCodigo_3_4_2 = new JLabel("Alta a un estudiante");
		lblCodigo_3_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2.setBounds(0, 0, 624, 123);
		altaEstudiante.add(lblCodigo_3_4_2);

		JLabel lblNewLabel_6 = new JLabel("Estado");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_6.setBounds(10, 438, 86, 35);
		altaEstudiante.add(lblNewLabel_6);

		JComboBox comboBox_7 = new JComboBox();

		comboBox_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { " ", "ACTIVO", "EGRESADO", "DESVINCULADO" }));
		comboBox_7.setBounds(106, 439, 137, 31);
		altaEstudiante.add(comboBox_7);

		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(
				new String[] { " ", "@anima.edu.uy", "@gmail.com", "@hotmail.com", "@outlook.com", "@yahoo.com" }));
		comboBox_9.setBounds(213, 264, 137, 30);
		altaEstudiante.add(comboBox_9);

		JPanel altaDocente = new JPanel();
		panelMaster.add(altaDocente, "Alta docente");
		altaDocente.setLayout(null);

		JLabel lblCodigo_3_8 = new JLabel("Nombre");
		lblCodigo_3_8.setBounds(10, 138, 106, 38);
		lblCodigo_3_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_8);

		textField_2 = new JTextField();
		textField_2.setBounds(126, 138, 167, 33);
		textField_2.setColumns(10);
		altaDocente.add(textField_2);

		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_9.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null,
							"No se admiten caracteres especiales en una cedula de identidad", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_9.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_9.getText().length() == 8)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		textField_9.setBounds(126, 232, 167, 33);
		textField_9.setColumns(10);
		altaDocente.add(textField_9);

		JLabel lblCodigo_3_1_1 = new JLabel("C.I");
		lblCodigo_3_1_1.setBounds(10, 232, 106, 38);
		lblCodigo_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_1_1);

		JLabel lblCodigo_3_2_1 = new JLabel("Mail");
		lblCodigo_3_2_1.setBounds(10, 276, 66, 38);
		lblCodigo_3_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_2_1);

		textField_10 = new JTextField();
		textField_10.setBounds(126, 276, 86, 33);
		textField_10.setColumns(10);
		altaDocente.add(textField_10);
		textField_10.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 45 || e.getKeyChar() == 47
						|| e.getKeyChar() >= 58 && e.getKeyChar() <= 64 || e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(278, 330, 167, 33);
		altaDocente.add(dateChooser_2);

		JLabel lblCodigo_3_3_1 = new JLabel("Fecha De Nacimiento");
		lblCodigo_3_3_1.setBounds(10, 325, 258, 38);
		lblCodigo_3_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_3_1);

		JLabel lblCodigo_3_4_1 = new JLabel("Apellido");
		lblCodigo_3_4_1.setBounds(10, 187, 106, 38);
		lblCodigo_3_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_4_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_4_1);

		textField_11 = new JTextField();
		textField_11.setBounds(126, 188, 167, 33);
		textField_11.setColumns(10);
		altaDocente.add(textField_11);

		textField_15 = new JPasswordField();
		textField_15.setBounds(162, 374, 167, 33);
		textField_15.setColumns(10);
		altaDocente.add(textField_15);

		JLabel lblCodigo_3_5_1 = new JLabel("Contrase\u00F1a");
		lblCodigo_3_5_1.setBounds(10, 374, 142, 38);
		lblCodigo_3_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_5_1.setFont(new Font("Arial", Font.PLAIN, 25));
		altaDocente.add(lblCodigo_3_5_1);

		JButton btnNewButton_4_1 = new JButton("Crear Docente");
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_4_1.setBounds(376, 469, 234, 38);
		altaDocente.add(btnNewButton_4_1);

		JLabel lblCodigo_3_4_2_1 = new JLabel("Alta a un docente");
		lblCodigo_3_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1.setBounds(0, 0, 620, 127);
		altaDocente.add(lblCodigo_3_4_2_1);

		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(
				new String[] { " ", "@anima.edu.uy", "@gmail.com", "@hotmail.com", "@outlook.com", "@yahoo.com" }));
		comboBox_10.setBounds(222, 276, 121, 33);
		altaDocente.add(comboBox_10);

		JLabel lblNewLabel_27 = new JLabel("ID Materia la cual Dicta");
		lblNewLabel_27.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_27.setBounds(10, 423, 269, 22);
		altaDocente.add(lblNewLabel_27);

		textField_48 = new JTextField();
		textField_48.setBounds(289, 418, 167, 30);
		altaDocente.add(textField_48);
		textField_48.setColumns(10);
		textField_48.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_48.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_48.getText().length() == 9)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		JPanel altaExamen = new JPanel();
		panelMaster.add(altaExamen, "altaExamen");
		altaExamen.setLayout(null);

		JLabel lblCodigo_3_4_2_1_3 = new JLabel("Alta a un examen");
		lblCodigo_3_4_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_3.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1_3.setBounds(0, 0, 620, 142);
		altaExamen.add(lblCodigo_3_4_2_1_3);

		JLabel lblCodigo_3_2_1_1 = new JLabel("C.I Estudiante");
		lblCodigo_3_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblCodigo_3_2_1_1.setBounds(10, 153, 179, 47);
		altaExamen.add(lblCodigo_3_2_1_1);

		textField_17 = new JTextField();
		textField_17.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_17.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_17.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_17.getText().length() == 8)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_17.setColumns(10);
		textField_17.setBounds(199, 163, 168, 29);
		altaExamen.add(textField_17);

		JLabel lblCodigo_3_3_1_1 = new JLabel("Fecha");
		lblCodigo_3_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblCodigo_3_3_1_1.setBounds(10, 190, 86, 38);
		altaExamen.add(lblCodigo_3_3_1_1);

		JLabel lblCodigo_3_2_1_1_1 = new JLabel("Nota");
		lblCodigo_3_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblCodigo_3_2_1_1_1.setBounds(10, 239, 121, 29);
		altaExamen.add(lblCodigo_3_2_1_1_1);

		textField_18 = new JTextField();
		textField_18.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_18.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_18.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_18.getText().length() == 2)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_18.setColumns(10);
		textField_18.setBounds(89, 239, 168, 29);
		altaExamen.add(textField_18);

		JLabel lblCodigo_3_7_4 = new JLabel("Codigo Materia");
		lblCodigo_3_7_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_4.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblCodigo_3_7_4.setBounds(10, 279, 179, 29);
		altaExamen.add(lblCodigo_3_7_4);

		JDateChooser dateChooser_1 = new JDateChooser();

		JButton btnNewButton_4_1_1 = new JButton("Guardar cambios");
		btnNewButton_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_4_1_1.setBounds(394, 276, 216, 38);
		altaExamen.add(btnNewButton_4_1_1);

		dateChooser_1.setBounds(89, 199, 168, 29);
		altaExamen.add(dateChooser_1);

		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_22.setBounds(199, 279, 168, 29);
		altaExamen.add(textField_22);
		textField_22.setColumns(10);
		textField_22.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_22.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_22.getText().length() == 9)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		JPanel altaFuncionario = new JPanel();
		panelMaster.add(altaFuncionario, "altaFuncionario");
		altaFuncionario.setLayout(null);

		JLabel lblCodigo_3_4_2_1_4 = new JLabel("Alta a un funcionario");
		lblCodigo_3_4_2_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_1_4.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_1_4.setBounds(0, 0, 620, 157);
		altaFuncionario.add(lblCodigo_3_4_2_1_4);

		JLabel lblCodigo_3_8_1 = new JLabel("Nombre");
		lblCodigo_3_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_8_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_8_1.setBounds(10, 168, 96, 42);
		altaFuncionario.add(lblCodigo_3_8_1);

		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_19.setColumns(10);
		textField_19.setBounds(116, 174, 135, 31);
		altaFuncionario.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_20.setColumns(10);
		textField_20.setBounds(70, 260, 181, 31);
		altaFuncionario.add(textField_20);
		textField_20.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Solo ingresar Numeros", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_20.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47 || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField_20.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e4) {
				if (textField_20.getText().length() == 8)

					e4.consume();

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		JLabel lblCodigo_3_1_1_1 = new JLabel("C.I");
		lblCodigo_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_1_1_1.setBounds(10, 261, 50, 30);
		altaFuncionario.add(lblCodigo_3_1_1_1);

		JLabel lblCodigo_3_2_1_2 = new JLabel("Mail");
		lblCodigo_3_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_2_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_2_1_2.setBounds(10, 302, 68, 31);
		altaFuncionario.add(lblCodigo_3_2_1_2);

		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_21.setColumns(10);
		textField_21.setBounds(70, 302, 96, 31);
		altaFuncionario.add(textField_21);
		textField_21.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() >= 32 && e.getKeyChar() <= 45 || e.getKeyChar() == 47
						|| e.getKeyChar() >= 58 && e.getKeyChar() <= 64 || e.getKeyChar() >= 91 && e.getKeyChar() <= 96
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 126
						|| e.getKeyChar() >= 161 && e.getKeyChar() <= 255) {
					e.consume();
					JOptionPane.showMessageDialog(null, "No se admiten caracteres especiales", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JDateChooser dateChooser_2_2 = new JDateChooser();
		dateChooser_2_2.setBounds(256, 344, 154, 31);
		altaFuncionario.add(dateChooser_2_2);

		JLabel lblCodigo_3_3_1_2 = new JLabel("Fecha de Nacimiento");
		lblCodigo_3_3_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_3_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_3_1_2.setBounds(10, 344, 241, 31);
		altaFuncionario.add(lblCodigo_3_3_1_2);

		JButton btnNewButton_4_1_2 = new JButton("Crear Funcionario");
		btnNewButton_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton_4_1_2.setBounds(380, 386, 230, 31);
		altaFuncionario.add(btnNewButton_4_1_2);

		textField_23 = new JPasswordField();
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_23.setColumns(10);
		textField_23.setBounds(150, 386, 135, 31);
		altaFuncionario.add(textField_23);

		JLabel lblCodigo_3_5_1_1 = new JLabel("Contraseña");
		lblCodigo_3_5_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_5_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_5_1_1.setBounds(10, 386, 130, 31);
		altaFuncionario.add(lblCodigo_3_5_1_1);

		JLabel lblCodigo_3_4_1_1 = new JLabel("Apellido");
		lblCodigo_3_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_4_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCodigo_3_4_1_1.setBounds(10, 213, 96, 36);
		altaFuncionario.add(lblCodigo_3_4_1_1);

		textField_24 = new JTextField();
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_24.setColumns(10);
		textField_24.setBounds(116, 216, 135, 31);
		altaFuncionario.add(textField_24);

		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(
				new String[] { " ", "@anima.edu.uy", "@gmail.com", "@hotmail.com", "@outlook.com", "@yahoo.com" }));
		comboBox_11.setBounds(176, 302, 109, 31);
		altaFuncionario.add(comboBox_11);

		JPanel listarDocente = new JPanel();
		panelMaster.add(listarDocente, "listarDocente");
		listarDocente.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1 = new JLabel("Listar docente");
		lblCodigo_3_4_2_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_3_1.setBounds(0, 0, 610, 166);
		listarDocente.add(lblCodigo_3_4_2_6_3_1);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 177, 600, 348);
		listarDocente.add(scrollPane_2);

		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);

		JPanel listarMateria = new JPanel();
		panelMaster.add(listarMateria, "listarMateria");
		listarMateria.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1 = new JLabel("Listar materia");
		lblCodigo_3_4_2_6_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_3_1_1.setBounds(0, 0, 610, 177);
		listarMateria.add(lblCodigo_3_4_2_6_3_1_1);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 188, 600, 332);
		listarMateria.add(scrollPane_4);

		table_4 = new JTable();
		scrollPane_4.setViewportView(table_4);

		JPanel listarInasistencias = new JPanel();
		panelMaster.add(listarInasistencias, "listarInasistencias");
		listarInasistencias.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1_1 = new JLabel("Listar inasistencias");
		lblCodigo_3_4_2_6_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_3_1_1_1.setBounds(0, 0, 610, 104);
		listarInasistencias.add(lblCodigo_3_4_2_6_3_1_1_1);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 173, 600, 347);
		listarInasistencias.add(scrollPane_6);

		table_5 = new JTable();
		scrollPane_6.setViewportView(table_5);

		JLabel lblNewLabel_28 = new JLabel("Orientacion");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_28.setBounds(10, 115, 114, 34);
		listarInasistencias.add(lblNewLabel_28);

		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] { " ", "TIC", "ADM" }));
		comboBox_12.setBounds(134, 115, 114, 34);
		listarInasistencias.add(comboBox_12);

		JLabel lblNewLabel_31 = new JLabel("Generacion");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_31.setBounds(258, 115, 105, 34);
		listarInasistencias.add(lblNewLabel_31);

		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] { " ", "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox_13.setBounds(373, 115, 114, 34);
		listarInasistencias.add(comboBox_13);

		JButton btnNewButton_15 = new JButton("Listar");

		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_15.setBounds(497, 115, 114, 34);
		listarInasistencias.add(btnNewButton_15);

		JPanel reporteEstadisticas = new JPanel();
		panelMaster.add(reporteEstadisticas, "reporteEstadisticas");
		reporteEstadisticas.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1_1_1 = new JLabel("Reporte de estad\u00EDsticas");
		lblCodigo_3_4_2_6_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 60));
		lblCodigo_3_4_2_6_3_1_1_1_1.setBounds(0, 0, 620, 139);
		reporteEstadisticas.add(lblCodigo_3_4_2_6_3_1_1_1_1);

		JLabel lblNewLabel_29 = new JLabel("Indice de inasistencias");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_29.setBounds(10, 193, 212, 66);
		reporteEstadisticas.add(lblNewLabel_29);

		textField_50 = new JTextField();
		textField_50.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField_50.setBounds(232, 193, 363, 66);
		reporteEstadisticas.add(textField_50);
		textField_50.setColumns(10);
		textField_50.setEditable(false);

		JLabel lblNewLabel_30 = new JLabel("Materia con mas inasistencias");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_30.setBounds(10, 280, 281, 66);
		reporteEstadisticas.add(lblNewLabel_30);

		textField_51 = new JTextField();
		textField_51.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField_51.setBounds(482, 284, 113, 66);
		reporteEstadisticas.add(textField_51);
		textField_51.setColumns(10);
		textField_51.setEditable(false);

		textField_52 = new JTextField();
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField_52.setBounds(301, 284, 172, 66);
		reporteEstadisticas.add(textField_52);
		textField_52.setColumns(10);
		textField_52.setEditable(false);

		JPanel listarEstudiantes = new JPanel();
		panelMaster.add(listarEstudiantes, "listarEstudiantes");
		listarEstudiantes.setLayout(null);

		JLabel lblCodigo_3_4_2_6_3_1_1_1_1_1 = new JLabel("Listar estudiantes");
		lblCodigo_3_4_2_6_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo_3_4_2_6_3_1_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 45));
		lblCodigo_3_4_2_6_3_1_1_1_1_1.setBounds(10, 11, 359, 141);
		listarEstudiantes.add(lblCodigo_3_4_2_6_3_1_1_1_1_1);

		JLabel lblCodigo_3_7_1_1 = new JLabel("Generacion");
		lblCodigo_3_7_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCodigo_3_7_1_1.setBounds(379, 13, 104, 35);
		listarEstudiantes.add(lblCodigo_3_7_1_1);

		JLabel lblCodigo_3_7_1_2 = new JLabel("Orientacion");
		lblCodigo_3_7_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo_3_7_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCodigo_3_7_1_2.setBounds(379, 59, 104, 37);
		listarEstudiantes.add(lblCodigo_3_7_1_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(10, 163, 600, 362);
		listarEstudiantes.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JComboBox comboBox_3 = new JComboBox();

		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { " ", "TIC", "ADM", "TICYADM" }));
		comboBox_3.setBounds(493, 62, 117, 37);
		listarEstudiantes.add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox();

		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { " ", "PRIMERO", "SEGUNDO", "TERCERO" }));
		comboBox_4.setBounds(493, 15, 117, 37);
		listarEstudiantes.add(comboBox_4);

		JButton btnNewButton_11 = new JButton("Buscar");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_11.setBounds(493, 107, 117, 37);
		listarEstudiantes.add(btnNewButton_11);

		JPanel menutop = new JPanel();
		menutop.setBackground(Color.LIGHT_GRAY);
		menutop.setBounds(180, 0, 620, 45);
		contentPane.getContentPane().add(menutop);
		menutop.setLayout(new CardLayout(0, 0));
		cardLayouttt = (CardLayout) menutop.getLayout();

		JPanel men = new JPanel();
		men.setBackground(Color.LIGHT_GRAY);
		menutop.add(men, "name_514521331277200");
		men.setLayout(null);

		JLabel lblNewLabel_33 = new JLabel("X");
		lblNewLabel_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_33.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33.setBounds(564, 11, 46, 23);
		men.add(lblNewLabel_33);

		JPanel crear = new JPanel();
		crear.setBackground(Color.LIGHT_GRAY);
		menutop.add(crear, "CREAR_TIPO");
		crear.setLayout(null);

		JLabel lblNewLabel_33_1 = new JLabel("X");
		lblNewLabel_33_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_33_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_33_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_33_1.setBounds(564, 11, 46, 23);
		crear.add(lblNewLabel_33_1);

		JLabel lblNewLabel_36 = new JLabel("Usuario");
		lblNewLabel_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panelMaster, "DISCHANGE_USER");
			}
		});
		lblNewLabel_36.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_36.setBounds(10, 11, 75, 23);
		crear.add(lblNewLabel_36);

		JLabel lblNewLabel_36_1 = new JLabel("Materia");
		lblNewLabel_36_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panelMaster, "DISCHANGE_SUBJECT");
			}
		});
		lblNewLabel_36_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_36_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_1.setBounds(95, 11, 75, 23);
		crear.add(lblNewLabel_36_1);

		JLabel lblNewLabel_36_2 = new JLabel("Inasistencia");
		lblNewLabel_36_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panelMaster, "DISCHANGE_ABSENCE");
			}
		});
		lblNewLabel_36_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_36_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_2.setBounds(180, 11, 112, 23);
		crear.add(lblNewLabel_36_2);

		JLabel lblNewLabel_36_3 = new JLabel("Examen");
		lblNewLabel_36_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panelMaster, "altaExamen");
			}
		});
		lblNewLabel_36_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_36_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_3.setBounds(302, 11, 87, 23);
		crear.add(lblNewLabel_36_3);

		JPanel consultar = new JPanel();
		consultar.setBackground(Color.LIGHT_GRAY);
		menutop.add(consultar, "consultaar");
		consultar.setLayout(null);

		JLabel lblNewLabel_33_2 = new JLabel("X");
		lblNewLabel_33_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_33_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_33_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_33_2.setBounds(564, 11, 46, 23);
		consultar.add(lblNewLabel_33_2);

		JLabel lblNewLabel_36_4 = new JLabel("Usuario");
		lblNewLabel_36_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panelMaster, "CONSULT_USER");
			}
		});
		lblNewLabel_36_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_36_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_4.setBounds(10, 11, 75, 23);
		consultar.add(lblNewLabel_36_4);

		JLabel lblNewLabel_36_5 = new JLabel("Materia");
		lblNewLabel_36_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panelMaster, "CONSULT_SUBJECT");
			}
		});
		lblNewLabel_36_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_36_5.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_5.setBounds(95, 11, 75, 23);
		consultar.add(lblNewLabel_36_5);

		JLabel lblNewLabel_36_6 = new JLabel("Inasistencia");
		lblNewLabel_36_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panelMaster, "CONSULT_ABSENCE");
			}
		});
		lblNewLabel_36_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_36_6.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_6.setBounds(180, 11, 112, 23);
		consultar.add(lblNewLabel_36_6);

		JPanel listar = new JPanel();
		listar.setBackground(Color.LIGHT_GRAY);
		menutop.add(listar, "LISTAR");
		listar.setLayout(null);

		JLabel lblNewLabel_33_3 = new JLabel("X");
		lblNewLabel_33_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_33_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_33_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_33_3.setBounds(564, 11, 46, 23);
		listar.add(lblNewLabel_33_3);

		JLabel lblNewLabel_36_4_1 = new JLabel("Estudiante");
		lblNewLabel_36_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panelMaster, "listarEstudiantes");
			}
		});
		lblNewLabel_36_4_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_36_4_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_4_1.setBounds(10, 11, 60, 23);
		listar.add(lblNewLabel_36_4_1);

		JLabel lblNewLabel_36_4_2 = new JLabel("Docente");

		lblNewLabel_36_4_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_36_4_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_4_2.setBounds(80, 11, 54, 23);
		listar.add(lblNewLabel_36_4_2);

		JLabel lblNewLabel_36_4_3 = new JLabel("Funcionario");
		lblNewLabel_36_4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		lblNewLabel_36_4_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_36_4_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_4_3.setBounds(144, 11, 60, 23);
		listar.add(lblNewLabel_36_4_3);

		JLabel lblNewLabel_36_4_4 = new JLabel("Estudiantes con pendientes");
		lblNewLabel_36_4_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

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
		lblNewLabel_36_4_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_36_4_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_4_4.setBounds(214, 11, 133, 23);
		listar.add(lblNewLabel_36_4_4);

		JLabel lblNewLabel_36_4_5 = new JLabel("Materia");

		lblNewLabel_36_4_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_36_4_5.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_4_5.setBounds(357, 11, 46, 23);
		listar.add(lblNewLabel_36_4_5);

		JLabel lblNewLabel_36_4_6 = new JLabel("Inasistencia");
		lblNewLabel_36_4_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panelMaster, "listarInasistencias");
			}
		});
		lblNewLabel_36_4_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_36_4_6.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_36_4_6.setBounds(413, 11, 60, 23);
		listar.add(lblNewLabel_36_4_6);

		JPanel menu = new JPanel();
		menu.setBackground(Color.BLACK);
		menu.setBounds(0, 0, 180, 600);
		contentPane.getContentPane().add(menu);
		menu.setLayout(new CardLayout(0, 0));
		cardLayoutt = (CardLayout) menu.getLayout();

		JPanel Bienvenido = new JPanel();
		Bienvenido.setBackground(Color.BLACK);
		menu.add(Bienvenido, "name_514010230618200");
		Bienvenido.setLayout(null);

		JLabel lblNewLabel_32 = new JLabel("B");
		lblNewLabel_32.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32.setForeground(Color.WHITE);
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32.setBounds(67, 11, 46, 31);
		Bienvenido.add(lblNewLabel_32);

		JLabel lblNewLabel_32_1 = new JLabel("i");
		lblNewLabel_32_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_1.setForeground(Color.WHITE);
		lblNewLabel_32_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32_1.setBounds(67, 53, 46, 39);
		Bienvenido.add(lblNewLabel_32_1);

		JLabel lblNewLabel_32_2 = new JLabel("e");
		lblNewLabel_32_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_2.setForeground(Color.WHITE);
		lblNewLabel_32_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32_2.setBounds(67, 103, 46, 39);
		Bienvenido.add(lblNewLabel_32_2);

		JLabel lblNewLabel_32_3 = new JLabel("n");
		lblNewLabel_32_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_3.setForeground(Color.WHITE);
		lblNewLabel_32_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32_3.setBounds(67, 153, 46, 39);
		Bienvenido.add(lblNewLabel_32_3);

		JLabel lblNewLabel_32_4 = new JLabel("v");
		lblNewLabel_32_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_4.setForeground(Color.WHITE);
		lblNewLabel_32_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32_4.setBounds(67, 203, 46, 39);
		Bienvenido.add(lblNewLabel_32_4);

		JLabel lblNewLabel_32_5 = new JLabel("e");
		lblNewLabel_32_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_5.setForeground(Color.WHITE);
		lblNewLabel_32_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32_5.setBounds(67, 253, 46, 39);
		Bienvenido.add(lblNewLabel_32_5);

		JLabel lblNewLabel_32_6 = new JLabel("n");
		lblNewLabel_32_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_6.setForeground(Color.WHITE);
		lblNewLabel_32_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32_6.setBounds(67, 303, 46, 39);
		Bienvenido.add(lblNewLabel_32_6);

		JLabel lblNewLabel_32_7 = new JLabel("i");
		lblNewLabel_32_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_7.setForeground(Color.WHITE);
		lblNewLabel_32_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32_7.setBounds(67, 353, 46, 39);
		Bienvenido.add(lblNewLabel_32_7);

		JLabel lblNewLabel_32_8 = new JLabel("d");
		lblNewLabel_32_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_8.setForeground(Color.WHITE);
		lblNewLabel_32_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32_8.setBounds(67, 403, 46, 39);
		Bienvenido.add(lblNewLabel_32_8);

		JLabel lblNewLabel_32_8_1 = new JLabel("o");
		lblNewLabel_32_8_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_8_1.setForeground(Color.WHITE);
		lblNewLabel_32_8_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_32_8_1.setBounds(67, 453, 46, 31);
		Bienvenido.add(lblNewLabel_32_8_1);

		JLabel lblNewLabel_32_8_2 = new JLabel("Proyecto Prog 2020");
		lblNewLabel_32_8_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_32_8_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_8_2.setForeground(Color.WHITE);
		lblNewLabel_32_8_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_32_8_2.setBounds(25, 495, 130, 43);
		Bienvenido.add(lblNewLabel_32_8_2);

		JPanel menuu = new JPanel();
		menuu.setBackground(Color.BLACK);
		menu.add(menuu, "menuu");
		menuu.setLayout(null);

		JLabel lblNewLabel_34 = new JLabel("Menu");
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_34.setForeground(Color.WHITE);
		lblNewLabel_34.setBounds(25, 11, 130, 54);
		menuu.add(lblNewLabel_34);

		JLabel lblNewLabel_35 = new JLabel("Dar de alta...");
		lblNewLabel_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayouttt.show(menutop, "CREAR_TIPO");
			}
		});
		lblNewLabel_35.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_35.setForeground(Color.WHITE);
		lblNewLabel_35.setBounds(10, 76, 160, 43);
		menuu.add(lblNewLabel_35);

		JLabel lblNewLabel_35_1 = new JLabel("Consultar...");
		lblNewLabel_35_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayouttt.show(menutop, "consultaar");
			}
		});
		lblNewLabel_35_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_35_1.setForeground(Color.WHITE);
		lblNewLabel_35_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_35_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_35_1.setBounds(10, 130, 160, 43);
		menuu.add(lblNewLabel_35_1);

		JLabel lblNewLabel_35_2 = new JLabel("Listar...");
		lblNewLabel_35_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayouttt.show(menutop, "LISTAR");
			}
		});
		lblNewLabel_35_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_35_2.setForeground(Color.WHITE);
		lblNewLabel_35_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_35_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_35_2.setBounds(10, 184, 160, 43);
		menuu.add(lblNewLabel_35_2);

		JLabel lblNewLabel_35_3 = new JLabel("Reporte de estadisticas");
		lblNewLabel_35_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		lblNewLabel_35_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_35_3.setForeground(Color.WHITE);
		lblNewLabel_35_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_35_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_35_3.setBounds(10, 238, 160, 43);
		menuu.add(lblNewLabel_35_3);

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
		btnAltaFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelMaster, "altaFuncionario");
			}
		});

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().isEmpty() || txtAs.getText().isEmpty() || textField_33.getText().isEmpty()
						|| comboBox_1_4.getSelectedItem() == " " || comboBox_5.getSelectedItem() == " "
						|| comboBox_1_4.getSelectedItem() == null || comboBox_5.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Alguna casilla esta vacia, revise bien", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {

					String nombre = textField.getText();
					String codigo = txtAs.getText();
					String ciDoc = textField_33.getText();
					String oriM = comboBox_1_4.getSelectedItem().toString();
					String genM = comboBox_5.getSelectedItem().toString();

					Materia mat = new Materia(nombre, codigo, Orientacion.valueOf(oriM), Generacion.valueOf(genM));

					try {
						controladorlg.crearMateria(mat, ciDoc);
						controladorlg.crearDictaMat(codigo, ciDoc);
						JOptionPane.showMessageDialog(null, "Materia creada con exito con su docente dictadola!");
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					textField.setText(null);
					txtAs.setText(null);
					textField_33.setText(null);
					comboBox_5.setSelectedItem(null);
					comboBox_1_4.setSelectedItem(null);

				}
			}

		});

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date datee = dateChooser_5.getDate();

				if (textField_5.getText().isEmpty() || datee == null || textField_14.getText().isEmpty()
						|| textField_16.getText().isEmpty() || comboBox_6.getSelectedItem() == " "
						|| comboBox_6.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Alguna casilla esta vacia, revise", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int cantHorass = Integer.parseInt(textField_5.getText());
					if (cantHorass == 0 || cantHorass > 24) {
						JOptionPane.showMessageDialog(null, "El dia tiene 24hs", "Error", JOptionPane.ERROR_MESSAGE);
					} else {
						Integer cantHoras = Integer.parseInt(textField_5.getText());
						LocalDate date2 = LocalDate.parse(sdft.format(dateChooser_5.getDate()));
						String idMateria = textField_14.getText();
						String ciEstudiante = textField_16.getText();
						String tipoIna = comboBox_6.getSelectedItem().toString();

						Inasistencia ina = new Inasistencia(ciEstudiante, idMateria, date2, cantHoras,
								TipoInasistencia.valueOf(tipoIna));
						try {
							controladorlg.crearInasistencia(ina);
							JOptionPane.showMessageDialog(null, "Inasistencia creada con exito!");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						textField_16.setText(null);
						textField_5.setText(null);
						dateChooser_5.setDate(null);
						textField_14.setText(null);
						comboBox_6.setSelectedItem(null);

					}
				}
			}
		});

		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date daate = dateChooser_1.getDate();
				if (textField_17.getText().isEmpty() || textField_22.getText().isEmpty() || daate == null
						|| textField_18.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Alguna casilla esta vacia, revise", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int nota = Integer.parseInt(textField_18.getText());
					if (nota > 12 || nota < 1) {
						JOptionPane.showMessageDialog(null, "La nota es del 1 al 12", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						String ci = textField_17.getText();
						String codM = textField_22.getText();
						LocalDate date5 = LocalDate.parse(sdft.format(dateChooser_1.getDate()));
						Integer nta = Integer.parseInt(textField_18.getText());
						Examen exa = new Examen(ci, codM, date5, nta);
						try {
							controladorlg.crearExamen(exa);
							JOptionPane.showMessageDialog(null, "Examen creado con exito!");
						} catch (Exception e3) {
							e3.printStackTrace();
						}
						textField_17.setText(null);
						textField_22.setText(null);
						dateChooser_1.setDate(null);
						textField_18.setText(null);
					}
				}
			}
		});

		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date date = dateChooser.getDate();
				if (comboBox_7.getSelectedItem() == null || comboBox_7.getSelectedItem() == "EGRESADO"
						|| comboBox_7.getSelectedItem() == "DESVINCULADO") {
					comboBox.setEnabled(false);
					if (textField_6.getText().isEmpty() || textField_7.getText().isEmpty()
							|| textField_8.getText().isEmpty() || date == null || textField_12.getText().isEmpty()
							|| textField_13.getText().isEmpty() || comboBox_7.getSelectedItem() == null
							|| comboBox_1.getSelectedItem() == null || comboBox_9.getSelectedItem() == null) {
						JOptionPane.showMessageDialog(null, "Alguna casilla esta vacia, revise", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						String nameE = textField_6.getText();
						String ciE = textField_7.getText();
						String mailE = textField_8.getText() + comboBox_9.getSelectedItem();
						System.out.println(mailE);
						LocalDate nacE = LocalDate.parse(sdft.format(dateChooser.getDate()));
						String apeE = textField_12.getText();
						String psswE = textField_13.getText();
						String esE = comboBox_7.getSelectedItem().toString();
						String oriE = comboBox_1.getSelectedItem().toString();
						String genE = "NO_TIENE";

						Estudiante est = new Estudiante(ciE, Estado.valueOf(esE), Orientacion.valueOf(oriE),
								Generacion.valueOf(genE), psswE, nameE, apeE, mailE, nacE);
						try {
							controladorlg.crearEstudiante(est);
							JOptionPane.showMessageDialog(null, "Estudiante creado con exito!");
						} catch (Exception e6) {
							JOptionPane.showMessageDialog(null, "Este estudiante ya esta registrado con esa CI",
									"Error", JOptionPane.ERROR_MESSAGE);
							e6.printStackTrace();
						}
						comboBox_1.setSelectedItem(null);
						comboBox_7.setSelectedItem(null);
						comboBox.setSelectedItem(null);
						comboBox_9.setSelectedItem(null);
						dateChooser.setDate(null);
						textField_6.setText(null);
						textField_7.setText(null);
						textField_8.setText(null);
						textField_9.setText(null);
						textField_12.setText(null);
						textField_13.setText(null);
					}
				}
				if (comboBox_7.getSelectedItem() == "ACTIVO") {

					if (textField_6.getText().isEmpty() || textField_7.getText().isEmpty()
							|| textField_8.getText().isEmpty() || date == null || textField_12.getText().isEmpty()
							|| textField_13.getText().isEmpty() || comboBox_7.getSelectedItem() == null
							|| comboBox_1.getSelectedItem() == null || comboBox.getSelectedItem() == null
							|| comboBox_9.getSelectedItem() == null) {
						JOptionPane.showMessageDialog(null, "Alguna casilla esta vacia, revise", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						comboBox.setEnabled(true);
						String nameE = textField_6.getText();
						String ciE = textField_7.getText();
						String mailE = textField_8.getText() + comboBox_9.getSelectedItem();
						System.out.println(mailE);
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
							JOptionPane.showMessageDialog(null, "Estudiante creado con exito!");
						} catch (Exception e6) {
							JOptionPane.showMessageDialog(null, "Este estudiante ya esta registrado con esa CI",
									"Error", JOptionPane.ERROR_MESSAGE);
							e6.printStackTrace();
						}
						comboBox_1.setSelectedItem(null);
						comboBox_7.setSelectedItem(null);
						comboBox.setSelectedItem(null);
						comboBox_9.setSelectedItem(null);
						dateChooser.setDate(null);
						textField_6.setText(null);
						textField_7.setText(null);
						textField_8.setText(null);
						textField_9.setText(null);
						textField_12.setText(null);
						textField_13.setText(null);

					}
				}
				if (comboBox_7.getSelectedItem() == " ") {
					if (textField_6.getText().isEmpty() || textField_7.getText().isEmpty()
							|| textField_8.getText().isEmpty() || date == null || textField_12.getText().isEmpty()
							|| textField_13.getText().isEmpty() || comboBox_7.getSelectedItem() == null
							|| comboBox_1.getSelectedItem() == null || comboBox.getSelectedItem() == null
							|| comboBox_9.getSelectedItem() == null) {
						JOptionPane.showMessageDialog(null, "Alguna casilla esta vacia, revise", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}

		});

		btnNewButton_4_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Date ddate = dateChooser_2.getDate();
				if (textField_2.getText().isEmpty() || textField_9.getText().isEmpty()
						|| textField_10.getText().isEmpty() || textField_11.getText().isEmpty()
						|| textField_15.getText().isEmpty() || ddate == null || comboBox_10.getSelectedItem() == null
						|| comboBox_10.getSelectedItem() == " " || textField_48.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Alguna casilla esta vacia, revise", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					String nomD = textField_2.getText();
					String ciD = textField_9.getText();
					String mailD = textField_10.getText() + comboBox_10.getSelectedItem();
					String apD = textField_11.getText();
					String psswD = textField_15.getText();
					LocalDate nacD = LocalDate.parse(sdft.format(dateChooser_2.getDate()));
					String idmatt = textField_48.getText();

					Docente doc = new Docente(ciD, psswD, nomD, apD, mailD, nacD);

					try {
						controladorlg.crearDocente(doc);
						try {
							controladorlg.crearDictaDoc(ciD, idmatt);
							JOptionPane.showMessageDialog(null, "Docente creado con exito");
						} catch (Exception e76) {
							JOptionPane.showMessageDialog(null, "Ya existe un docente con la CI ingresada", "Error",
									JOptionPane.ERROR_MESSAGE);
							e76.printStackTrace();
						}
					} catch (Exception e7) {
						e7.printStackTrace();
					}
					textField_2.setText(null);
					textField_9.setText(null);
					textField_10.setText(null);
					textField_11.setText(null);
					textField_15.setText(null);
					dateChooser_2.setDate(null);
					comboBox_10.setSelectedItem(null);
					textField_48.setText(null);

				}
			}
		});

		btnNewButton_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date datte = dateChooser_2_2.getDate();
				if (textField_19.getText().isEmpty() || textField_20.getText().isEmpty()
						|| textField_21.getText().isEmpty() || textField_24.getText().isEmpty()
						|| textField_23.getText().isEmpty() || datte == null || comboBox_11.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Alguna casilla sin rellenar, revise", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					String nomF = textField_19.getText();
					String ciF = textField_20.getText();
					String mailF = textField_21.getText() + comboBox_11.getSelectedItem();
					String apF = textField_24.getText();
					String psswF = textField_23.getText();
					LocalDate nacF = LocalDate.parse(sdft.format(dateChooser_2_2.getDate()));

					Funcionario fun = new Funcionario(ciF, psswF, nomF, apF, mailF, nacF);

					try {
						controladorlg.crearFuncionario(fun);
						JOptionPane.showMessageDialog(null, "Funcionario creado con exito!");
					} catch (Exception e8) {
						JOptionPane.showMessageDialog(null, "Ya existe un funcionario con la CI ingresada", "Error",
								JOptionPane.ERROR_MESSAGE);
						e8.printStackTrace();
					}
					textField_19.setText(null);
					textField_20.setText(null);
					textField_21.setText(null);
					textField_24.setText(null);
					textField_23.setText(null);
					dateChooser_2_2.setDate(null);
					comboBox_11.setSelectedItem(null);
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
				if (oriCOM == " " && genCOM == " ") {
					JOptionPane.showMessageDialog(null, "No deje ambas casillas vacias, almenos seleccione 1", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

			}

		});

		btnNewButton_9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Date dateI = dateChooser_3.getDate();
				Date dateF = dateChooser_4.getDate();

				if (dateI == null || dateF == null) {
					JOptionPane.showMessageDialog(null, "Revise las casillas de fecha inicio o fecha fin", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					LocalDate dateInicio = LocalDate.parse(sdft.format(dateChooser_3.getDate()));
					LocalDate dateFin = LocalDate.parse(sdft.format(dateChooser_4.getDate()));
					if (dateInicio.isBefore(dateFin)) {

						DefaultTableModel model = new DefaultTableModel() {
							/**
							 * 
							 */
							private static final long serialVersionUID = 1L;

							public boolean isCellEditable(int row, int column) {
								return false;
							}
						};
						model.addColumn("Nombre de la Materia");
						model.addColumn("Nombre del Estudiante");
						model.addColumn("Fecha");
						model.addColumn("Tipo inasistencia");
						model.addColumn("Cantidad de horas");

						String[] dato = new String[5];
						try {
							ResultSet result9 = controladorlg.consultarInasistenciaIF(dateInicio, dateFin);
							while (result9.next()) {
								String ciEstudiante = result9.getString(4);
								String idMateriaa = result9.getString(5);
								ResultSet resss = controladorlg.traerNombreEstudiante(ciEstudiante);
								ResultSet r = controladorlg.traerNombreMateria(idMateriaa);
								while (resss.next() && r.next()) {
									dato[0] = r.getString(1);
									dato[1] = resss.getString(1);
									dato[2] = result9.getString(2);
									dato[3] = result9.getString(3);
									dato[4] = result9.getString(1);
									model.addRow(dato);

								}
							}

							table_6.setModel(model);
						}

						catch (Exception e3) {
							e3.printStackTrace();
						}

						dateChooser_3.setDate(null);
						dateChooser_4.setDate(null);
					} else {
						if (dateInicio.isAfter(dateFin)) {
							DefaultTableModel model = new DefaultTableModel() {
								/**
								 * 
								 */
								private static final long serialVersionUID = 1L;

								public boolean isCellEditable(int row, int column) {
									return false;
								}
							};
							model.addColumn("Nombre de la Materia");
							model.addColumn("Nombre del Estudiante");
							model.addColumn("Fecha");
							model.addColumn("Tipo inasistencia");
							model.addColumn("Cantidad de horas");

							String[] dato = new String[5];
							try {
								ResultSet result9 = controladorlg.consultarInasistenciaFI(dateInicio, dateFin);
								while (result9.next()) {
									String ciEstudiante = result9.getString(4);
									String idMateriaa = result9.getString(5);
									ResultSet resss = controladorlg.traerNombreEstudiante(ciEstudiante);
									ResultSet r = controladorlg.traerNombreMateria(idMateriaa);
									while (resss.next() && r.next()) {
										dato[0] = r.getString(1);
										dato[1] = resss.getString(1);
										dato[2] = result9.getString(2);
										dato[3] = result9.getString(3);
										dato[4] = result9.getString(1);
										model.addRow(dato);

									}
								}

								table_6.setModel(model);
							}

							catch (Exception e3) {
								e3.printStackTrace();
							}
							dateChooser_3.setDate(null);
							dateChooser_4.setDate(null);
						} else {
							if (dateInicio.equals(dateFin)) {
								DefaultTableModel model = new DefaultTableModel() {
									/**
									 * 
									 */
									private static final long serialVersionUID = 1L;

									public boolean isCellEditable(int row, int column) {
										return false;
									}
								};
								model.addColumn("Nombre de la Materia");
								model.addColumn("Nombre del Estudiante");
								model.addColumn("Fecha");
								model.addColumn("Tipo inasistencia");
								model.addColumn("Cantidad de horas");

								String[] dato = new String[5];
								try {
									ResultSet result9 = controladorlg.consultarInasistenciaIequalsF(dateInicio,
											dateFin);
									while (result9.next()) {
										String ciEstudiante = result9.getString(4);
										String idMateriaa = result9.getString(5);
										ResultSet resss = controladorlg.traerNombreEstudiante(ciEstudiante);
										ResultSet r = controladorlg.traerNombreMateria(idMateriaa);
										while (resss.next() && r.next()) {
											dato[0] = r.getString(1);
											dato[1] = resss.getString(1);
											dato[2] = result9.getString(2);
											dato[3] = result9.getString(3);
											dato[4] = result9.getString(1);
											model.addRow(dato);

										}
									}

									table_6.setModel(model);
								}

								catch (Exception e3) {
									e3.printStackTrace();
								}

								dateChooser_3.setDate(null);
								dateChooser_4.setDate(null);
							}

						}
					}
				}

			}
		});

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField_25.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ingrese algo en la casilla 'CI del usuario'", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
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
								lblNewLabel_25.setVisible(true);
								textField_47.setVisible(true);
								lblNewLabel_26.setVisible(true);
								textField_1.setVisible(true);
								lblNewLabel_21.setVisible(false);
								lblNewLabel_23.setVisible(false);
								textField_45.setVisible(false);
								lblNewLabel_24.setVisible(false);
								textField_46.setVisible(false);
								btnNewButton_13.setVisible(false);

							} else {
								textField_42.setText("FUNCIONARIO");
								lblNewLabel_21.setVisible(false);
								lblNewLabel_23.setVisible(false);
								textField_45.setVisible(false);
								lblNewLabel_24.setVisible(false);
								textField_46.setVisible(false);
								btnNewButton_13.setVisible(false);
								lblNewLabel_22.setVisible(false);
								lblNewLabel_25.setVisible(false);
								textField_47.setVisible(false);
								btnNewButton_14.setVisible(false);
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
				Date feh = dateChooser_6.getDate();
				if (textField_39.getText().isEmpty() || textField_40.getText().isEmpty()
						|| textField_28.getText().isEmpty() || feh == null || textField_43.getText().isEmpty()
						|| textField_44.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Casillas vacias, revise", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
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
										JOptionPane.showMessageDialog(null,
												"Error, rellene bien la seccion Orientacion");
									} else {
										if (comboBox_8.getSelectedItem() == " ") {
											JOptionPane.showMessageDialog(null,
													"Error, rellene bien la seccion Generacion");
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
											comboBox_2.setSelectedItem(null);
											comboBox_8.setSelectedItem(null);
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
				if (textField_45.getText().isEmpty() || textField_46.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Revise si las casillas estan vacias", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int notamat = Integer.parseInt(textField_46.getText());
					if (notamat > 12 || notamat < 1) {
						JOptionPane.showMessageDialog(null, "Nota tiene que ser del 1 al 12", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						String ciestudiante = textField_28.getText();
						String idMateria = textField_45.getText();
						String notaMateria = textField_46.getText();
						try {
							controladorlg.crearCursa(ciestudiante, idMateria, notaMateria);
							JOptionPane.showMessageDialog(null, "Materia agregada al estudiante con exito!");
						} catch (Exception e43) {

							e43.printStackTrace();
						}
					}
				}
				textField_45.setText(null);
				textField_46.setText(null);
			}
		});

		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String idMateriaa = textField_47.getText();
				String idMateriaModificar = textField_1.getText();
				String ciDocente = textField_28.getText();

				try {
					ResultSet res65 = controladorlg.consultarSiDicta(idMateriaa, ciDocente);
					if (res65.next() == false) {
						JOptionPane.showMessageDialog(null, "Este docente no dicta la materia ingresada", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						try {
							controladorlg.modificarDicta(idMateriaa, idMateriaModificar, ciDocente);
							JOptionPane.showMessageDialog(null, "Dicta modificada con exito!");
						} catch (Exception e56) {
							e56.printStackTrace();
						}
					}
				} catch (Exception e45) {
					e45.printStackTrace();
				}
				textField_47.setText(null);
				textField_1.setText(null);

			}
		});

		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table_6.getModel();
				int idFila = table_6.getSelectedRow();

				if (idFila >= 0) {
					String fecha = model.getValueAt(idFila, 1).toString();
					String materia = model.getValueAt(idFila, 2).toString();
					String ciEstudiante = model.getValueAt(idFila, 4).toString();
					model.removeRow(idFila);
					try {
						controladorlg.eliminarInasistencia(fecha, materia, ciEstudiante);
					} catch (Exception e54) {
						e54.printStackTrace();
					}
				} else {
					if (idFila < 0) {
						JOptionPane.showMessageDialog(null, "Fila no seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
					}

				}
			}
		});

		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ciDos = textField_4.getText();
				String psswdDos = textField_3.getText();
				if (textField_4.getText().length() < 8) {
					JOptionPane.showMessageDialog(null, "Una CI lleva 8 caracteres", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (textField_4.getText().isEmpty() || textField_3.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Alguna de las dos casillas esta vacia, revise", "Error",
								JOptionPane.ERROR_MESSAGE);
						textField_4.setText(ciDos);
						textField_3.setText(psswdDos);
					} else {
						String ciLogin = textField_4.getText();
						String psswdLogin = textField_3.getText();

						try {
							ResultSet res344 = controladorlg.login(ciLogin, psswdLogin);
							if (res344.next() == true) {
								ResultSet res34 = controladorlg.datosLogin(ciLogin);
								cardLayout.show(panelMaster, "random");
								cardLayoutt.show(menu, "menuu");
								if (res34.next() == true) {
									JOptionPane.showMessageDialog(null, "Logeado con Exito! Bienvenido: "
											+ res34.getString("nombre") + " " + res34.getString("apellido"));
								}
							} else {
								JOptionPane.showMessageDialog(null, "Error Usuario no registrado");
							}
						} catch (Exception e393) {
							e393.printStackTrace();
						}
						textField_3.setText(null);
						textField_4.setText(null);

					}
				}
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_1.setSelectedItem(null);
				comboBox_7.setSelectedItem(null);
				comboBox.setSelectedItem(null);
				comboBox_9.setSelectedItem(null);
				dateChooser.setDate(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);

			}
		});
		btnAltaDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_15.setText(null);
				dateChooser_2.setDate(null);
			}
		});
		btnAltaFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_19.setText(null);
				textField_20.setText(null);
				textField_21.setText(null);
				textField_24.setText(null);
				textField_23.setText(null);
				dateChooser_2_2.setDate(null);
			}
		});
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox_12.getSelectedItem() == null || comboBox_12.getSelectedItem() == " "
						|| comboBox_13.getSelectedItem() == null || comboBox_13.getSelectedItem() == " ") {
					JOptionPane.showMessageDialog(null, "Rellene bien las casillas de orientacion y generacion");
				} else {
					String oriIna = comboBox_12.getSelectedItem().toString();
					String genIna = comboBox_13.getSelectedItem().toString();

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
						ResultSet result6 = controladorlogic.listarInasistencias(oriIna, genIna);

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
			}
		});
		lblNewLabel_36_4_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		lblNewLabel_36_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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

	}
}
