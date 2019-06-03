package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroCliente extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCep;
	private JTextField txtMunicipio;
	private JTextField txtEstado;
	private JTextField txtTelefone;
	private JTextField textField;
	private JTextField txtCelular;
	private JTextField txtCpfCnpj;
	private JTextField txtDataNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setClosable(true);
		setTitle("Cadastro de Clientes");
		setBounds(100, 100, 459, 387);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(33, 11, 46, 14);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(78, 8, 346, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o :");
		lblEndereco.setBounds(16, 47, 63, 14);
		getContentPane().add(lblEndereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(78, 44, 346, 20);
		getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro :");
		lblBairro.setBounds(33, 84, 46, 14);
		getContentPane().add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(78, 81, 183, 20);
		getContentPane().add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP :");
		lblCep.setBounds(297, 84, 32, 14);
		getContentPane().add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBounds(334, 81, 90, 20);
		getContentPane().add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblMunicpio = new JLabel("Munic\u00EDpio :");
		lblMunicpio.setBounds(16, 124, 56, 14);
		getContentPane().add(lblMunicpio);
		
		txtMunicipio = new JTextField();
		txtMunicipio.setBounds(78, 121, 183, 20);
		getContentPane().add(txtMunicipio);
		txtMunicipio.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado :");
		lblEstado.setBounds(283, 124, 46, 14);
		getContentPane().add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(334, 121, 90, 20);
		getContentPane().add(txtEstado);
		txtEstado.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone :");
		lblTelefone.setBounds(16, 157, 56, 14);
		getContentPane().add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(78, 154, 183, 20);
		getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(33, 190, 46, 14);
		getContentPane().add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(78, 187, 186, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular :");
		lblCelular.setBounds(283, 157, 46, 14);
		getContentPane().add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(334, 156, 90, 20);
		getContentPane().add(txtCelular);
		txtCelular.setColumns(10);
		
		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ:");
		lblCpfcnpj.setBounds(273, 190, 56, 14);
		getContentPane().add(lblCpfcnpj);
		
		txtCpfCnpj = new JTextField();
		txtCpfCnpj.setBounds(334, 190, 90, 20);
		getContentPane().add(txtCpfCnpj);
		txtCpfCnpj.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento :");
		lblDataDeNascimento.setBounds(24, 223, 113, 14);
		getContentPane().add(lblDataDeNascimento);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(136, 220, 125, 20);
		getContentPane().add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(129, 270, 89, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(230, 270, 89, 23);
		getContentPane().add(btnCancelar);

	}
}