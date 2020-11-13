package banco;

public class Banco
{
    public static void main(String[] args)
    {
        //isntanciando a classe frmLogin no objeto frmlogin
        Apresentacao.frmLogin frmlogin = new Apresentacao.frmLogin(null, true);
        
        //tornando o objeto frmlogin visvel ao usuario
        frmlogin.setVisible(true);
    }   
}
