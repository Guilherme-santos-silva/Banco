package Apresentacao;

import javax.swing.JOptionPane;

public class frmTelaPrincipal extends javax.swing.JDialog
{

    public frmTelaPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
         //instanciano a classe dadados no objeto a 
        Modelo.Dados a = new Modelo.Dados();
        
        //setando um novo valor ao lblNome usamos a.getNome() para pegar o valor da tela de |Login
        //Nome é um atributo estatico entao seu valor pode ser visto e usado por qualquer parte do codigo
        //estando somente private, seu valor era restrito a partes do codigo que ele era usado e setado um valor
        lblNome.setText("bem vindo " + a.getNome());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnSacar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTrasnferencia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSaldo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnApagarConta = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");

        btnSacar.setText("Sacar");
        btnSacar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSacarActionPerformed(evt);
            }
        });

        jLabel12.setText("Aperte no botão abaixo para fechar sua conta");

        txtValor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtValorActionPerformed(evt);
            }
        });

        lblNome.setText("*Saudação ao usuario*");

        jLabel7.setText("Apos inserir as informaçoes necessarias");

        jLabel1.setText("Nestea tela te fornecemos as opções de saque e de deposito");

        jLabel8.setText("Caso queira fazer uma trasnsferencia, consultar seu saldo ou fechar sua conta");

        jLabel2.setText("Basta uma confirmação do seu CPF e o valor a ser sacado ou depositado");

        jLabel9.setText("Aperte nos respectivos botões abaixo");

        jLabel3.setText("que fazmos todo o resto para você");

        btnTrasnferencia.setText("Transferencia");
        btnTrasnferencia.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTrasnferenciaActionPerformed(evt);
            }
        });

        jLabel4.setText("Insira seu CPF:");

        jLabel10.setText("Aperte no botao abaixo para uma trasnferencia");

        jLabel5.setText("Insira o Valor:");

        btnSaldo.setText("Consultar Saldo");
        btnSaldo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaldoActionPerformed(evt);
            }
        });

        jLabel6.setText("Escolha a operação a ser realizada");

        btnApagarConta.setText("Apagar Conta");
        btnApagarConta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnApagarContaActionPerformed(evt);
            }
        });

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDepositarActionPerformed(evt);
            }
        });

        jLabel11.setText("Aperte no botão abaixo para consultar seu saldo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(lblNome))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel6))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                            .addComponent(txtCpf)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnTrasnferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel12)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnApagarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositar)
                    .addComponent(btnSacar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(btnTrasnferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaldo)
                .addGap(9, 9, 9)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagarConta)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSacarActionPerformed
    {//GEN-HEADEREND:event_btnSacarActionPerformed
        //iniciando a logica do botao sacar
        Modelo.Dados dados = new Modelo.Dados();
        dados.setCpf(txtCpf.getText());
        try
        {
            dados.setSaque(Integer.parseInt(txtValor.getText()));
            Modelo.Controle controle = new Modelo.Controle();
            controle.ControleSaqueDAO(dados);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(rootPane,"Digite apenas numeros nesse campo");
        }

    }//GEN-LAST:event_btnSacarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtValorActionPerformed
    {//GEN-HEADEREND:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnTrasnferenciaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTrasnferenciaActionPerformed
    {//GEN-HEADEREND:event_btnTrasnferenciaActionPerformed
        //tornando a classe frmApagarConta visisivel ao botao trasnferencia ser ativado
        frmTrasnferencia transferencia = new frmTrasnferencia(null, true);
        this.setVisible(false);
        transferencia.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnTrasnferenciaActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaldoActionPerformed
    {//GEN-HEADEREND:event_btnSaldoActionPerformed
        //tornando a classe frmApagarConta visisivel ao botao saldo ser ativado
        frmConsultarSaldo controlesultarsaldo = new frmConsultarSaldo(null, true);
        this.setVisible(false);
        controlesultarsaldo.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnApagarContaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnApagarContaActionPerformed
    {//GEN-HEADEREND:event_btnApagarContaActionPerformed
        //tornando a classe frmApagarConta visisivel ao botao apagar conta ser ativado
        frmApagarConta fecharcontroleta = new frmApagarConta(null, true);
        this.setVisible(false);
        fecharcontroleta.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnApagarContaActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDepositarActionPerformed
    {//GEN-HEADEREND:event_btnDepositarActionPerformed
        //iniciando a logica do botao apagar depositar
        Modelo.Dados dados = new Modelo.Dados();
        dados.setCpf(txtCpf.getText());
        try
        {
            dados.setDeposito(Integer.parseInt(txtValor.getText()));
            Modelo.Controle controle = new Modelo.Controle();
            controle.ControleDepositoDAO(dados);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(rootPane,"Digite apenas numeros nesse campo");
        }

    }//GEN-LAST:event_btnDepositarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmTelaPrincipal dialog = new frmTelaPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarConta;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnTrasnferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
