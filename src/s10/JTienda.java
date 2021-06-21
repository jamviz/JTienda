package s10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTienda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTienda frame = new JTienda();
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
	public JTienda() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 394);
		setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Montserrat Black", Font.PLAIN, 14));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setFont(new Font("Montserrat", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nuevo");
		mntmNewMenuItem.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\new.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Guardar");
		mntmNewMenuItem_1.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\save.png"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Salir");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\exit.png"));
		buttonGroup.add(mntmNewMenuItem_2);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Ventas");
		mnNewMenu_1.setFont(new Font("Montserrat", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Productos");
		mntmNewMenuItem_3.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\store.png"));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Inventario");
		mntmNewMenuItem_4.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\inventario.png"));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu_1.add(separator_1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Reporte de ventas y pagos");
		mntmNewMenuItem_8.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\reporte.png"));
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_2 = new JMenu("Registros");
		mnNewMenu_2.setFont(new Font("Montserrat", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Registro Clientes");
		mntmNewMenuItem_5.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\cliente.png"));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Registro Proveedores");
		mntmNewMenuItem_6.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\proveedor.png"));
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_3 = new JMenu("Acerca de");
		mnNewMenu_3.setFont(new Font("Montserrat", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Nosotros");
		mntmNewMenuItem_9.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\about.png"));
		mnNewMenu_3.add(mntmNewMenuItem_9);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\Eclipse IDE\\Workspace\\Menus\\src\\images\\Copia de Copia de Minimal Patterns Sound Waves Wallpaper (1).png"));
		lblNewLabel.setBounds(0, 0, 604, 341);
		contentPane.add(lblNewLabel);
	}
}
