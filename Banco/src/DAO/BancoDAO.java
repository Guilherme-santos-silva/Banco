package DAO;
import Modelo.Dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BancoDAO
{
    
    public void CadastroDAO(Dados a)
    {
        Connection con = ConexaoSQL.getConnection();        
        PreparedStatement stmt = null;
    
        try 
        {
            stmt = con.prepareStatement("insert into banco (cpf, nome, saldo) values (?,?,'0')");            
            stmt.setString(1, a.getCpf());            
            stmt.setString(2, a.getNome());            
            stmt.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Muito bem, sua conta foi aberta com sucesso ! \n"
                    + "Obrigador por abrir uma conta no nosso banco !!");
                    
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Esse cadastro ja existe"+ex);
        }        
        finally
        {
            ConexaoSQL.fecharConexao(con, stmt);
        }
    }
    
    public void ApagarContaDAO(Dados a)
    {
             
        Connection con = ConexaoSQL.getConnection();        
        PreparedStatement stmt = null;
    
        try 
        {
            String valorCampo = "";
            stmt = con.prepareStatement("select saldo, cpf from banco where cpf = ?");            
            stmt.setString(1, a.getCpf());
            ResultSet rs = null;
            rs = stmt.executeQuery();

            while(rs.next())
            {
                a.setSaldo(rs.getInt("saldo"));
                valorCampo = (rs.getString("cpf"));
                System.err.println(a.getSaldo());
                System.err.println(valorCampo);
            }
            if(a.getCpf().equals(valorCampo) )
            {
            
                if(a.getSaldo() >= 0)
                {
                    stmt = con.prepareStatement("DELETE FROM banco WHERE cpf = ?");            
                    stmt.setString(1, a.getCpf());            
                    stmt.executeUpdate();            
                    JOptionPane.showMessageDialog(null, "conta apagada");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "você esta devendo, nao pode apagar essa conta \n");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "essa conta não existe \n");
            }
                    
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "conta nao localizada" +ex);
        }
        
        finally
        {
            ConexaoSQL.fecharConexao(con, stmt);
        }
    }
    
    public void DepositoDAO(Dados a)
    {
        
        Connection con = ConexaoSQL.getConnection();        
        PreparedStatement stmt = null;

        try 
        {
            String valorCampo = "";
            stmt = con.prepareStatement("select cpf from banco where cpf = ?");
            stmt.setString(1, a.getCpf());
            ResultSet rs = null;
            rs = stmt.executeQuery();

            while(rs.next())
            {
                //a.setSaldo(rs.getInt("saldo"));
                valorCampo = (rs.getString("cpf"));
            }
            
            if(a.getCpf().equals(valorCampo))
            {
                stmt = con.prepareStatement("UPDATE banco  SET saldo = saldo + ?  WHERE cpf = ?");
                stmt.setInt(1, a.getDeposito());
                stmt.setString(2, a.getCpf());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Deposito feito");  
            }
            else
            {
                JOptionPane.showMessageDialog(null,"esta conta não existe");
            }

        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "falha ao depositar" +ex);
        }
        finally
        {
            ConexaoSQL.fecharConexao(con, stmt);
        }

    }
    
    public void SaqueDAO(Dados a)
    {
        //this.mensagem="";
        Connection con = ConexaoSQL.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
        try 
        {
            String valorCampo = "";
            stmt = con.prepareStatement("select saldo,cpf from banco where cpf = ?");
            stmt.setString(1, a.getCpf());
            rs = stmt.executeQuery();

            while(rs.next())
            {
                a.setSaldo(rs.getInt("saldo"));
                valorCampo = (rs.getString("cpf"));
            }

            if(a.getCpf().equals(valorCampo))
            {

                        if(a.getSaque() < a.getSaldo())
                        {

                                stmt = con.prepareStatement("UPDATE banco  SET saldo = saldo - ?  WHERE cpf = ?");
                                stmt.setInt(1, a.getSaque());
                                stmt.setString(2, a.getCpf());
                                stmt.executeUpdate();
                                JOptionPane.showMessageDialog(null, "saque realizado");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"você não tem esse valor para sacar seu saldo é " +a.getSaldo()+"");
                            
                        }
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"esta conta não existe");
           }


        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "nao alterado" +ex);
        }
        finally
        {
            ConexaoSQL.fecharConexao(con, stmt, rs);
        }

    }
    
    public void SaldoDAO(Dados a)
    {
        Connection con = ConexaoSQL.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
        try 
        {
            String valorCampo = "";
            stmt = con.prepareStatement("select * from banco where cpf = ?");            
            stmt.setString(1, a.getCpf());
            rs = stmt.executeQuery();

            while(rs.next())
            {
                valorCampo = (rs.getString("cpf"));
            } 
            
            if(a.getCpf().equals(valorCampo))
            {
                stmt = con.prepareStatement("select saldo from banco where cpf = ?");
                stmt.setString(1, a.getCpf());
                ResultSet rss = null;
                rss = stmt.executeQuery();

                while(rss.next())
                {
                    a.setSaldo(rss.getInt("saldo"));
                    System.out.println(a.getSaldo());
                }
                rss.close(); 
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "a conta referente a este Cpf não existe");
            }                    
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "conta nao localizada" +ex);
        }
        
        finally
        {
            ConexaoSQL.fecharConexao(con, stmt, rs);
        }
    }
    
    public boolean LoginDAO(Dados a)
    {

        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean Login = false;

            try {
                stmt = con.prepareStatement("select * from banco where cpf = ? and nome = ?");
                stmt.setString(1, a.getCpf());
                stmt.setString(2, a.getNome());
                rs = stmt.executeQuery();

                if(rs.next())
                {
                    Login = true;
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "seu nome ou cpf esta errado ou seu cadastro não existe \n");
                }
                //System.out.println(Login);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "erro BD \n");
            } 
            finally
            {
                ConexaoSQL.fecharConexao(con, stmt, rs);
                
            }

            return Login;  
    }
    
    public void TransferenciaDAO(Dados a)
    {
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
        try 
        {
            String cpf = "";
            stmt = con.prepareStatement("select cpf from banco where cpf = ?");
            stmt.setString(1, a.getCpf());
            ResultSet rs2 = null;
            rs2 = stmt.executeQuery();

            while(rs2.next())
            {
                cpf = (rs2.getString("cpf"));
            }
            
            rs2.close();
            
            if(a.getCpf().equals(cpf))
            {

                
                String cpf2 = "";
                    stmt = con.prepareStatement("select cpf from banco where cpf = ?");
                    stmt.setString(1, a.getCpf2());
                    ResultSet rs3 = null;
                    rs3 = stmt.executeQuery();

                    while(rs3.next())
                    {
                        cpf2 = (rs3.getString("cpf"));
                    }
                    
                    rs3.close();

                if(a.getCpf2().equals(cpf2))
                {

                        stmt = con.prepareStatement("select saldo from banco where cpf = ?");
                        stmt.setString(1, a.getCpf());
                        
                        rs = stmt.executeQuery();

                        while(rs.next())
                        {
                            a.setSaldo(rs.getInt("saldo"));
                        }

                        if(a.getSaldo() > a.getTransferenciaMenos())
                        {

                            stmt = con.prepareStatement("UPDATE banco  SET saldo = saldo - ?  WHERE cpf = ? UPDATE banco  SET saldo = ( saldo + ? -1 ) WHERE cpf = ? ");
                            stmt.setInt(1, a.getTransferenciaMenos());
                            stmt.setString(2, a.getCpf());
                            stmt.setInt(3, a.getTransferenciaMais());
                            stmt.setString(4, a.getCpf2());
                            stmt.executeUpdate();
                            JOptionPane.showMessageDialog(null, "valor trasnferido");

                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "você não tem saldo para essa trasnferencia, seu saldo é " +a.getSaldo()+"\n");
                        }
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "o seu cpf destinado a trasnferencia esta errado ");
                }
            }
                
            else
            {
                JOptionPane.showMessageDialog(null, "o seu cpf esta errado,confira ");
            }

        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "valor insuficiente" +ex);
        }
        finally
        {
            ConexaoSQL.fecharConexao(con, stmt, rs);
        }

    }
}
