package Modelo;

public class Controle
{
    //definindo atributo mensagem
    private String mensagem;
    
    //definind atributo Login responsavel pelo login ao banco
    public boolean Login = false;
    
    //responsavel pelo controle do login
    public boolean ControleLoginDAO(Dados a)
    {
        
        Validacao validacao = new Validacao();
        validacao.ValidarLoginDAO(a);
        if(validacao.getMensagem().equals(""))
        {
            DAO.BancoDAO bancoDao = new DAO.BancoDAO(); 
            a.setCpf(a.getCpf());
            a.setNome(a.getNome());
            bancoDao.LoginDAO(a);
            this.Login= true;
        }
        else
        {
            this.mensagem = validacao.getMensagem();
            //System.out.println(mensagem);
        }
        return Login;
    }
    
    //responsavel pelo controle do cadastro
    public void ControleCadastroDAO(Dados a)
    {
        Validacao validacao = new Validacao();
        validacao.ValidarCadastroDAO(a);
        if(validacao.getMensagem().equals(""))
        {
            DAO.BancoDAO bancoDao = new DAO.BancoDAO();
            a.setCpf(a.getCpf());
            a.setNome(a.getNome());
            bancoDao.CadastroDAO(a);
            
        }
        else
        {
            this.mensagem = validacao.getMensagem();
            //System.out.println(mensagem);
        }
    
    }
    
    //responsavel pelo controle do deposito
    public void ControleDepositoDAO(Dados a)
    {
        Validacao validacao = new Validacao();
        validacao.ValidarDepositoDAO(a);
        if(validacao.getMensagem().equals(""))
        {
            DAO.BancoDAO bancoDao = new DAO.BancoDAO();
            a.setDeposito(a.getDeposito());
            a.setCpf(a.getCpf());            
            bancoDao.DepositoDAO(a);
        }
        else
        {
            this.mensagem = validacao.getMensagem();
            //System.out.println(mensagem);
        }
    
    }
    
    //responsavel pelo controle do saque
    public void ControleSaqueDAO(Dados a)
    {
        Validacao validacao = new Validacao();
        validacao.ValidarSaqueDAO(a);
        if(validacao.getMensagem().equals(""))
        {

            DAO.BancoDAO bancoDao = new DAO.BancoDAO();
            a.setSaque(a.getSaque());
            a.setCpf(a.getCpf());
            bancoDao.SaqueDAO(a);

        }
        else
        {
            this.mensagem = validacao.getMensagem();
            //System.out.println(mensagem);
        }
    
    }
    
    //responsavel pelo controle do saldo
    public void ControleSaldoDAO(Dados a)
    {
        Validacao validacao = new Validacao();
        validacao.ValidarSaldoDAO(a);
        if(validacao.getMensagem().equals(""))
        {
            DAO.BancoDAO bancoDao = new DAO.BancoDAO();
            a.setCpf(a.getCpf());
            bancoDao.SaldoDAO(a);
        }
        else
        {
            this.mensagem = validacao.getMensagem();
            //System.out.println(mensagem);
        }
    
    }
    
    //responsavel pelo controle do apagar conta
     public void ControleApagarContaDAO(Dados a)
    {
        Validacao validacao = new Validacao();
        validacao.ValidarApagarContaDAO(a);
        if(validacao.getMensagem().equals(""))
        {
            DAO.BancoDAO bancoDao = new DAO.BancoDAO();
            a.setCpf(a.getCpf());
            bancoDao.ApagarContaDAO(a);
        }
        else
        {
            this.mensagem = validacao.getMensagem();
            //System.out.println(mensagem);
        }
    
    }
    
     //responsavel pelo controle da transferencia
    public void ControleTransferenciaDAO(Dados a)
    {
        Validacao validacao = new Validacao();
        validacao.ValidarTransferenciaDAO(a);
        if(validacao.getMensagem().equals(""))
        {
            DAO.BancoDAO bancoDao = new DAO.BancoDAO();
            a.setTransferenciaMenos(a.getTransferenciaMenos());
            a.setCpf(a.getCpf());
            a.setTransferenciaMais(a.getTransferenciaMenos());
            a.setCpf2(a.getCpf2());
            bancoDao.TransferenciaDAO(a);
        }
        else
        {
            this.mensagem = validacao.getMensagem();
            //System.out.println(mensagem);
        }
    
    }
    
    //nossos metodos de acesso sendo por get
    public String getMensagem() 
    {
        return mensagem;
    }

    public boolean isCheck() 
    {
        return Login;
    }
}
