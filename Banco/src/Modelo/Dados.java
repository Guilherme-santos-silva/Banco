package Modelo;

public class Dados 
{
    //definindo os atributos
    private String cpf;
    private String cpf2;
    public static String Nome;
    private int saldo;
    private int saque;
    private int deposito;
    private int transferenciaMenos;
    private int transferenciaMais;
  
    //criando nossos metodos get e set para acessar os atributos
    public int getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(int saldo) 
    {
        this.saldo = saldo;
    }

    public int getSaque() 
    {
        return saque;
    }

    public void setSaque(int saque) 
    {
        this.saque = saque;
    }

    public int getDeposito() 
    {
        return deposito;
    }

    public void setDeposito(int deposito) 
    {
        this.deposito = deposito;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public String getNome() 
    {
        return Nome;
    }

    public void setNome(String Nome) 
    {
        this.Nome = Nome;
    }

    public int getTransferenciaMenos() 
    {
        return transferenciaMenos;
    }

    public void setTransferenciaMenos(int transferenciaMenos) 
    {
        this.transferenciaMenos = transferenciaMenos;
    }

    public int getTransferenciaMais() 
    {
        return transferenciaMais;
    }

    public void setTransferenciaMais(int transferenciaMais) 
    {
        this.transferenciaMais = transferenciaMais;
    }

    public String getCpf2() 
    {
        return cpf2;
    }

    public void setCpf2(String cpf2) 
    {
        this.cpf2 = cpf2;
    }

}