package uy.edu.cei.generala.client.ui.frames;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class IndexFrame extends JFrame {

	private JPanel contentPane;
	private BufferedImage imagen;
	private JTextField txtName;
	private JTextField txtMail;
	private JTextField txtUser;
	private JTextField textField;
	private JTextField textField_1;
	private JLayeredPane layeredPane;
	private JPasswordField passwordField;
	private JLabel lblTuFotoAparecer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexFrame frame = new IndexFrame();
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
	public IndexFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit myscreen = Toolkit.getDefaultToolkit();
		Dimension d = myscreen.getScreenSize();
		int heightP = d.height;
		int widthP = d.width;
		setSize(widthP / 2, heightP / 2);
		setLocation(widthP / 4, heightP / 4);
		setTitle("Generala Mattel®");
		Image miIcono = myscreen.getImage("src/main/resources/assets/iconDie.png");
		setIconImage(miIcono);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(255, 255, 255));
		contentPane.add(layeredPane, "name_270800366837098");
		// layeredPane.removeAll();

		JPanel login = new JPanel();
		login.setBackground(new Color(255, 255, 255));
		login.setBounds(75, 88, 500, 246);
		layeredPane.add(login);
		SpringLayout sl_login = new SpringLayout();
		login.setLayout(sl_login);

		textField = new JTextField();
		sl_login.putConstraint(SpringLayout.WEST, textField, -155, SpringLayout.EAST, login);
		sl_login.putConstraint(SpringLayout.SOUTH, textField, -198, SpringLayout.SOUTH, login);
		sl_login.putConstraint(SpringLayout.EAST, textField, -15, SpringLayout.EAST, login);
		login.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		sl_login.putConstraint(SpringLayout.NORTH, textField_1, 11, SpringLayout.SOUTH, textField);
		sl_login.putConstraint(SpringLayout.WEST, textField_1, -156, SpringLayout.EAST, login);
		sl_login.putConstraint(SpringLayout.EAST, textField_1, -16, SpringLayout.EAST, login);
		textField_1.setColumns(10);
		login.add(textField_1);

		JTextArea txtrUsuario_1 = new JTextArea();
		sl_login.putConstraint(SpringLayout.EAST, txtrUsuario_1, -26, SpringLayout.WEST, textField);
		txtrUsuario_1.setForeground(new Color(255, 0, 0));
		txtrUsuario_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		txtrUsuario_1.setText("Usuario");
		login.add(txtrUsuario_1);

		JTextArea Contrasena = new JTextArea();
		sl_login.putConstraint(SpringLayout.SOUTH, txtrUsuario_1, -10, SpringLayout.NORTH, Contrasena);
		sl_login.putConstraint(SpringLayout.NORTH, Contrasena, 59, SpringLayout.NORTH, login);
		sl_login.putConstraint(SpringLayout.EAST, Contrasena, -7, SpringLayout.WEST, textField_1);
		Contrasena.setText("Contraseña");
		Contrasena.setForeground(Color.RED);
		Contrasena.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		login.add(Contrasena);

		JLabel lblNewLabel_1 = new JLabel("");
		sl_login.putConstraint(SpringLayout.WEST, lblNewLabel_1, 5, SpringLayout.WEST, login);
		sl_login.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -2, SpringLayout.SOUTH, login);
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\Sofi\\Desktop\\GeneralaRepo\\generala\\generala-client\\src\\main\\resources\\assets\\flame.gif"));
		login.add(lblNewLabel_1);

		JButton btnLoginConf = new JButton("Iniciar sesión");
		btnLoginConf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// ACA VA LA VALIDACION DE LA CONTRASEÑA
				RoomsFrame gotoroom = new RoomsFrame();
			}
		});
		sl_login.putConstraint(SpringLayout.NORTH, btnLoginConf, 13, SpringLayout.SOUTH, textField_1);
		sl_login.putConstraint(SpringLayout.EAST, btnLoginConf, -17, SpringLayout.EAST, login);
		btnLoginConf.setForeground(Color.WHITE);
		btnLoginConf.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnLoginConf.setBackground(Color.ORANGE);
		login.add(btnLoginConf);

		JPanel info = new JPanel();
		info.setBackground(new Color(255, 255, 255));
		info.setBounds(75, 88, 500, 246);
		layeredPane.add(info);
		SpringLayout sl_info = new SpringLayout();
		info.setLayout(sl_info);
		info.setVisible(false);

		JPanel register = new JPanel();
		register.setBackground(new Color(255, 255, 255));
		register.setBounds(75, 88, 500, 246);
		layeredPane.add(register);
		SpringLayout sl_register = new SpringLayout();
		register.setLayout(sl_register);
		register.setVisible(false);

		JTextArea txtrcadaJugadorDispone = new JTextArea();
		sl_info.putConstraint(SpringLayout.NORTH, txtrcadaJugadorDispone, 4, SpringLayout.NORTH, info);
		sl_info.putConstraint(SpringLayout.WEST, txtrcadaJugadorDispone, 6, SpringLayout.WEST, info);
		sl_info.putConstraint(SpringLayout.SOUTH, txtrcadaJugadorDispone, 242, SpringLayout.NORTH, info);
		sl_info.putConstraint(SpringLayout.EAST, txtrcadaJugadorDispone, 497, SpringLayout.WEST, info);
		txtrcadaJugadorDispone.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 11));
		txtrcadaJugadorDispone.setText(
				"-Cada jugador dispone de cinco dados, que podrá tirar tres veces por turno.\r\n-Luego deberá seleccionar una jugada disponible en el cartón de juego.\r\n\r\nJugadas posibles:\r\n\r\n-Par (2 iguales): 5 puntos\r\n-Trío (3 iguales): 10 puntos\r\n-Poker (4 iguales): 20 puntos\r\n-Full (1 par + 1 trío): 15 puntos\r\n-Escalera corta (4 en secuencia): 30 puntos\r\n-Escalera larga (5 en secuencia): 40 puntos\r\n-Generala (5 iguales): 50 puntos\r\n-Sumas de 1: Sumas todas las caras que tengan 1\r\n-Sumas de 2: Sumas todas las caras que tengan 2\r\n-Sumas de 3: Sumas todas las caras que tengan 3\r\n-Sumas de 4: Sumas todas las caras que tengan 4\r\n-Sumas de 5: Sumas todas las caras que tengan 5\r\n-Sumas de 6: Sumas todas las caras que tengan 6\r\n-Comodín: Es solo la suma de los dados. Se puede usar cuando el jugador lo desee.\r\n");
		info.add(txtrcadaJugadorDispone);

		JButton btnIniciarSesin = new JButton("Iniciar sesión");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				register.setVisible(false);
				info.setVisible(false);
				login.setVisible(true);

			}
		});
		btnIniciarSesin.setForeground(Color.WHITE);
		btnIniciarSesin.setBackground(Color.ORANGE);
		btnIniciarSesin.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnIniciarSesin.setBounds(179, 42, 123, 35);
		layeredPane.add(btnIniciarSesin);

		JButton btnCrearCuenta = new JButton("Crear cuenta");
		btnCrearCuenta.setForeground(new Color(255, 255, 255));
		btnCrearCuenta.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnCrearCuenta.setBackground(new Color(0, 191, 255));
		btnCrearCuenta.setBounds(312, 42, 123, 35);
		layeredPane.add(btnCrearCuenta);
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				register.setVisible(true);
				info.setVisible(false);
				login.setVisible(false);

			}
		});

		JButton btncmoJugar = new JButton("¿Cómo jugar?");
		btncmoJugar.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btncmoJugar.setForeground(new Color(255, 255, 255));
		btncmoJugar.setBackground(new Color(50, 205, 50));
		btncmoJugar.setBounds(445, 42, 123, 35);
		layeredPane.add(btncmoJugar);
		btncmoJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				register.setVisible(false);
				info.setVisible(true);
				login.setVisible(false);

			}
		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\Sofi\\Desktop\\GeneralaRepo\\generala\\generala-client\\src\\main\\resources\\assets\\logoM.png"));
		lblNewLabel.setBounds(75, 0, 94, 86);
		layeredPane.add(lblNewLabel);

		txtName = new JTextField();
		sl_register.putConstraint(SpringLayout.WEST, txtName, -176, SpringLayout.EAST, register);
		sl_register.putConstraint(SpringLayout.SOUTH, txtName, -208, SpringLayout.SOUTH, register);
		sl_register.putConstraint(SpringLayout.EAST, txtName, -20, SpringLayout.EAST, register);
		register.add(txtName);
		txtName.setColumns(10);

		txtMail = new JTextField();
		sl_register.putConstraint(SpringLayout.NORTH, txtMail, 6, SpringLayout.SOUTH, txtName);
		sl_register.putConstraint(SpringLayout.WEST, txtMail, 323, SpringLayout.WEST, register);
		sl_register.putConstraint(SpringLayout.EAST, txtMail, -21, SpringLayout.EAST, register);
		register.add(txtMail);
		txtMail.setColumns(10);

		txtUser = new JTextField();
		sl_register.putConstraint(SpringLayout.NORTH, txtUser, 6, SpringLayout.SOUTH, txtMail);
		sl_register.putConstraint(SpringLayout.WEST, txtUser, 324, SpringLayout.WEST, register);
		sl_register.putConstraint(SpringLayout.EAST, txtUser, -20, SpringLayout.EAST, register);
		register.add(txtUser);
		txtUser.setColumns(10);

		JTextArea txtrNombre = new JTextArea();
		sl_register.putConstraint(SpringLayout.WEST, txtrNombre, 237, SpringLayout.WEST, register);
		sl_register.putConstraint(SpringLayout.SOUTH, txtrNombre, -207, SpringLayout.SOUTH, register);
		sl_register.putConstraint(SpringLayout.EAST, txtrNombre, -18, SpringLayout.WEST, txtName);
		txtrNombre.setForeground(new Color(255, 0, 0));
		txtrNombre.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		txtrNombre.setEditable(false);
		txtrNombre.setText("Nombre");
		register.add(txtrNombre);

		JTextArea mail = new JTextArea();
		sl_register.putConstraint(SpringLayout.NORTH, mail, 1, SpringLayout.SOUTH, txtrNombre);
		sl_register.putConstraint(SpringLayout.WEST, mail, 237, SpringLayout.WEST, register);
		sl_register.putConstraint(SpringLayout.EAST, mail, -17, SpringLayout.WEST, txtMail);
		mail.setText("Email");
		mail.setForeground(Color.RED);
		mail.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		mail.setEditable(false);
		register.add(mail);

		JTextArea txtrUsuario = new JTextArea();
		sl_register.putConstraint(SpringLayout.WEST, txtrUsuario, 237, SpringLayout.WEST, register);
		sl_register.putConstraint(SpringLayout.EAST, txtrUsuario, -18, SpringLayout.WEST, txtUser);
		txtrUsuario.setText("Usuario");
		txtrUsuario.setForeground(Color.RED);
		txtrUsuario.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		txtrUsuario.setEditable(false);
		register.add(txtrUsuario);

		JTextArea txtrContrasea = new JTextArea();
		sl_register.putConstraint(SpringLayout.WEST, txtrContrasea, 236, SpringLayout.WEST, register);
		sl_register.putConstraint(SpringLayout.EAST, txtrContrasea, -177, SpringLayout.EAST, register);
		sl_register.putConstraint(SpringLayout.SOUTH, txtrUsuario, -4, SpringLayout.NORTH, txtrContrasea);
		sl_register.putConstraint(SpringLayout.NORTH, txtrContrasea, 94, SpringLayout.NORTH, register);
		txtrContrasea.setText("Contraseña");
		txtrContrasea.setForeground(Color.RED);
		txtrContrasea.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		txtrContrasea.setEditable(false);
		register.add(txtrContrasea);

		JButton btnRegistrarme = new JButton("Registrarme");
		sl_register.putConstraint(SpringLayout.NORTH, btnRegistrarme, 39, SpringLayout.SOUTH, txtUser);
		sl_register.putConstraint(SpringLayout.SOUTH, btnRegistrarme, -82, SpringLayout.SOUTH, register);
		btnRegistrarme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (passwordField.getText() != null && txtUser != null && txtMail != null
						&& txtName.getText() != null) {
					// aca va el control de que no existe otro user con ese nickname
					JOptionPane.showMessageDialog(null, "Te registraste exitosamente! Ahora debes iniciar sesión.");
					register.setVisible(false);
					info.setVisible(false);
					login.setVisible(true);
					passwordField.setText("");
					txtUser.setText("");
					txtName.setText("");
					txtMail.setText("");

				} else {
					JOptionPane.showMessageDialog(null, "Verifique los datos ingresados");
				}
			}
		});
		sl_register.putConstraint(SpringLayout.WEST, btnRegistrarme, -145, SpringLayout.EAST, register);
		sl_register.putConstraint(SpringLayout.EAST, btnRegistrarme, -23, SpringLayout.EAST, register);
		btnRegistrarme.setForeground(Color.WHITE);
		btnRegistrarme.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnRegistrarme.setBackground(new Color(0, 191, 255));
		register.add(btnRegistrarme);

		JButton btnExaminar = new JButton("Examinar mi foto");
		btnExaminar.setBackground(new Color(0, 153, 153));
		btnExaminar.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnExaminar.setForeground(Color.WHITE);
		sl_register.putConstraint(SpringLayout.NORTH, btnExaminar, 120, SpringLayout.NORTH, register);
		btnExaminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				file.setCurrentDirectory(new File(System.getProperty("user.home")));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
				file.addChoosableFileFilter(filter);
				int result = file.showSaveDialog(null);
				if(result== JFileChooser.APPROVE_OPTION){
				File selectedFile = file.getSelectedFile();
				String path = selectedFile.getAbsolutePath();
				lblTuFotoAparecer.setIcon(ResizeImage(path));
				}

				else if(result==JFileChooser.CANCEL_OPTION){
				JOptionPane.showMessageDialog(null, "No seleccionaste ninguna imagen");
				}
			}
		});
		sl_register.putConstraint(SpringLayout.WEST, btnExaminar, 42, SpringLayout.WEST, register);
		register.add(btnExaminar);

		lblTuFotoAparecer = new JLabel("Sube tu foto!");
		sl_register.putConstraint(SpringLayout.NORTH, lblTuFotoAparecer, 0, SpringLayout.NORTH, txtName);
		sl_register.putConstraint(SpringLayout.SOUTH, lblTuFotoAparecer, 0, SpringLayout.SOUTH, txtrContrasea);
		sl_register.putConstraint(SpringLayout.WEST, lblTuFotoAparecer, 47, SpringLayout.WEST, register);
		sl_register.putConstraint(SpringLayout.EAST, lblTuFotoAparecer, 152, SpringLayout.WEST, register);
		register.add(lblTuFotoAparecer);
		

		passwordField = new JPasswordField();
		sl_register.putConstraint(SpringLayout.NORTH, passwordField, 6, SpringLayout.SOUTH, txtUser);
		sl_register.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, txtName);
		sl_register.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, txtName);
		register.add(passwordField);

	}

	public ImageIcon ResizeImage(String ImagePath) {
		ImageIcon MyImage = new ImageIcon(ImagePath);
		Image img = MyImage.getImage();
		Image newImg = img.getScaledInstance(lblTuFotoAparecer.getWidth(), lblTuFotoAparecer.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		return image;
	}
	

}
