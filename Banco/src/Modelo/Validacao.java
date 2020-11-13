package Modelo;

public class Validacao
{
    //definindo um atributo mensagem como vazio
    public String mensagem = "";
    
    //validar o login do usuario e setando uma mensaem de erro caso houver
    public void ValidarLoginDAO(Dados a)
    {
        if(!(a.getNome().matches("[A-Z]*[a-z]*")))
        {
            this.mensagem += "digite apenas letras no seu nome \n";
        }
        
        ValidarCPF validarCpf = new ValidarCPF(a.getCpf());
        if(validarCpf.ValidarCPF() == false)
        {
            this.mensagem += "CPF invalido, por favor digite novamente \n";
        }
    }
    
    //validar o cadastro do usuario e setando uma mensaem de erro caso houver
    public void ValidarCadastroDAO(Dados a)
    {
        if(!(a.getNome().matches("[A-Z]*[a-z]*")))
        {
            this.mensagem += "digite apenas letras no seu nome \n";
        }
        
        ValidarCPF validarCpf = new ValidarCPF(a.getCpf());
        if(validarCpf.ValidarCPF() == false)
        {
            this.mensagem += "CPF invalido, por favor digite novamente \n";
        }
    }
    
    //validar o deposito do usuario e setando uma mensaem de erro caso houver
    public void ValidarDepositoDAO(Dados a)
    {
        if(a.getDeposito() < 0)
        {
            this.mensagem += "você não pode depositar valores abaixo de 0 \n";
        }
        
        ValidarCPF validarCpf = new ValidarCPF(a.getCpf());
        if(validarCpf.ValidarCPF() == false)
        {
            this.mensagem += "CPF invalido, por favor digite novamente \n";
        }
    }
    
    //validar o saque do usuario e setando uma mensaem de erro caso houver
    public void ValidarSaqueDAO(Dados a)
    {
        ValidarCPF validarCpf = new ValidarCPF(a.getCpf());
        if(validarCpf.ValidarCPF() == false)
        {
            this.mensagem += "CPF invalido, por favor digite novamente \n";
        }
        
        if(a.getSaque() < 0)
        {
            this.mensagem += "você não pode sacar valores abaixo de 0 \n";
        }
    }
    
    //validar o apagarConta do usuario e setando uma mensaem de erro caso houver
    public void ValidarApagarContaDAO(Dados a)
    {
        ValidarCPF validarCpf = new ValidarCPF(a.getCpf());
        if(validarCpf.ValidarCPF() == false)
        {
            this.mensagem += "CPF invalido, por favor digite novamente \n";
        }
    }
    
    //validar o saldo do usuario e setando uma mensaem de erro caso houver
    public void ValidarSaldoDAO(Dados a)
    {
        ValidarCPF validarCpf = new ValidarCPF(a.getCpf());
        if(validarCpf.ValidarCPF() == false)
        {
            this.mensagem += "CPF invalido, por favor digite novamente \n";
        }
    }
    
    //validar o transferencia do usuario e setando uma mensaem de erro caso houver
    public void ValidarTransferenciaDAO(Dados a)
    {
        ValidarCPF validarCpf = new ValidarCPF(a.getCpf());
        if(validarCpf.ValidarCPF() == false)
        {
            this.mensagem += "CPF invalido, por favor digite novamente \n";
        }
        
        ValidarCPF validarCpf2 = new ValidarCPF(a.getCpf2());
        if(validarCpf2.equals(false))
        {
            this.mensagem += "CPF 2 invalido, por favor digite novamente \n";
        }

        if(a.getCpf().equals(a.getCpf2()))
        {
          this.mensagem += "voce nao pode fazer uma transferencia para a sua propria conta ! \n";
        }  
        
        if(a.getTransferenciaMenos() < 0)
        {
            this.mensagem += "voce nao pode transferir valores abaixo de 0 ! \n";
        }

    }
    
    //nosso metodo de acesso sendo por get
    public String getMensagem() 
    {
        return mensagem;
    }
}
