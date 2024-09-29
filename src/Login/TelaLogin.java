package Login;


import java.awt.Font; //Trabalhar com fontes
import java.awt.SystemColor; //Trabalhar com cores
import javax.swing.JButton; //Trabalhar com botões
import javax.swing.JFrame;//Trabalhar com frames
import javax.swing.JLabel;//Trabalhar com labels
import javax.swing.JPanel;//Trabalhar com paineis
import javax.swing.JPasswordField;//Trabalhar com campos de senha
import javax.swing.JTextField;//Trabalhar com campos de texto

public class TelaLogin extends JFrame{
   
    //tela Objeto JPanel (tela em si)
    private final JPanel panelTela;
    
    //txtusuario Objeto JTextFIeld (campo na tela)
    private final JTextField txtUsuario;
    
    //pswSenha Objeto PasswordField (campo na tela)
    private final JPasswordField pswSenha;
    
    //Método construtor
    public TelaLogin () {
        //coloca o objeto na referencia do centro da tela
        setLocationRelativeTo(null);
        
        //não permite que o objeto seja expandido
        setResizable(false);
        
        //coloca titulo na caixa JFrame
        setTitle("Login - Senac");
        
        //Quando clicado no X eu encerro todo o programa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //define posicionamento e tamanho
        //         x    y  width height
        setBounds(500, 200, 426, 212);
        
        //Crio um objeto JPanel e atribuo ele a variável tela
        panelTela = new JPanel ();
        
        //Define a cor de fundo do JPanel (tela)
        panelTela.setBackground(SystemColor.gray);
        setContentPane(panelTela);
        
        //Vou utilizar o meu panel sem utilizar o padrão
        panelTela.setLayout (null);
        
        //Adicionando elementos na tela:
        //Criando um objeto do tipo JLabel e atribuindo o valor ao atributo
        JLabel lblIdentificacao = new JLabel("IDENTIFICAÇÃO");
        
        //Localização na tela
        lblIdentificacao.setBounds (144, 0, 160, 39);
        
        //Definindo a Fonte
        lblIdentificacao.setFont(new Font("Arial", 3, 19));
        
        //Adicionando o meu label ao meu Panel
        panelTela.add(lblIdentificacao);
        
        //Identificacao e Posicionamento dos labels
        JLabel lblUsuario = new JLabel ("Usuario");
        lblUsuario.setBounds(24, 65, 70, 15);
        panelTela.add(lblUsuario);
        
        JLabel lblSenha = new JLabel ("Senha");
        lblSenha.setBounds(24, 92, 70, 15);
        
        //Identificação e Posicionamento dos texts fields
        txtUsuario = new JTextField();
        txtUsuario.setBounds(112, 63, 219, 19);
        panelTela.add(txtUsuario);
        txtUsuario.setColumns(10);
        
        pswSenha = new JPasswordField();
        pswSenha.setBounds(112, 90, 219, 19);
        panelTela.add(pswSenha);
        
        //Identificação e Posicionamento dos botões
        JButton btnEntrar = new JButton ("Entrar");
        btnEntrar.setBounds(200, 136, 117, 25);
        panelTela.add(btnEntrar);
        
        JButton btnCdastrar = new JButton("Cadastrar");
        btnCdastrar.setBounds(50, 136, 117, 25);
        panelTela.add(btnCdastrar);
    }
    public void abreTela(){
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
    }
}
