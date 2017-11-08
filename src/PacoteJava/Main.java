/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJava;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author cesilva
 */
public final class Main extends javax.swing.JFrame {

    public static String Caminho = "local na rede";
    public static String Caminho2 = "C:\\Program Files\\Fluxo de Atendimento NII - Gerenciador\\";

    static ArrayList<Funcionarios> Funcionarios = new ArrayList<>();
    static ArrayList<Funcionarios> AtendimentoGrupo = new ArrayList<>();
    static ArrayList<Funcionarios> AtendimentoExterno = new ArrayList<>();

    public String MostraHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String recebehora = sdf.format(System.currentTimeMillis());
        return recebehora;
    }

    public int MostraHoraInt() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        String recebehora = sdf.format(System.currentTimeMillis());
        int recebehoraint = Integer.parseInt(recebehora);
        return recebehoraint;
    }

    public void IniciarAppVerificaHora(int horaint) {
        if (horaint >= 8 && horaint < 11) {
            RegrasDoAutomatico regauto = new RegrasDoAutomatico();
            regauto.RegraOitoHoras();
        } else if (horaint >= 11 && horaint < 12) {
            RegrasDoAutomatico regauto = new RegrasDoAutomatico();
            regauto.RegraOnzeHoras();
        } else if (horaint >= 12 && horaint < 14) {
            RegrasDoAutomatico regauto = new RegrasDoAutomatico();
            regauto.RegraDozeHoras();
        } else if (horaint >= 14 && horaint < 17) {
            RegrasDoAutomatico regauto = new RegrasDoAutomatico();
            regauto.RegraQuatorzeHoras();
        } else if (horaint >= 17 && horaint < 18) {
            RegrasDoAutomatico regauto = new RegrasDoAutomatico();
            regauto.RegraDezesseteHoras();
        } else if (horaint >= 18 && horaint < 20) {
            RegrasDoAutomatico regauto = new RegrasDoAutomatico();
            regauto.RegraDezoitoHoras();
        } else if (horaint >= 20 && horaint < 8) {
            RegrasDoAutomatico regauto = new RegrasDoAutomatico();
            regauto.RegraForaHorario();
        }
    }

    public static final long TEMPO = (1000); // atualiza o site a cada 1 segundo

    public void ManterHoraAtualizada() {
        Timer timer = null;
        if (timer == null) {
            timer = new Timer();
            TimerTask tarefa = new TimerTask() {
                @Override
                public void run() {
                    try {
                        //chamar metodo
                        jHorario.setText(MostraHora());
                        if (jAutomatico.isSelected()) {
                            if (MostraHora().equalsIgnoreCase("08:00:00")) {
                                RegrasDoAutomatico regauto = new RegrasDoAutomatico();
                                regauto.RegraOitoHoras();
                            } else if (MostraHora().equalsIgnoreCase("11:00:00")) {
                                RegrasDoAutomatico regauto = new RegrasDoAutomatico();
                                regauto.RegraOnzeHoras();
                            } else if (MostraHora().equalsIgnoreCase("12:00:00")) {
                                RegrasDoAutomatico regauto = new RegrasDoAutomatico();
                                regauto.RegraDozeHoras();
                            } else if (MostraHora().equalsIgnoreCase("14:00:00")) {
                                RegrasDoAutomatico regauto = new RegrasDoAutomatico();
                                regauto.RegraQuatorzeHoras();
                            } else if (MostraHora().equalsIgnoreCase("17:00:00")) {
                                RegrasDoAutomatico regauto = new RegrasDoAutomatico();
                                regauto.RegraDezesseteHoras();
                            } else if (MostraHora().equalsIgnoreCase("18:00:00")) {
                                RegrasDoAutomatico regauto = new RegrasDoAutomatico();
                                regauto.RegraDezoitoHoras();
                            } else if (MostraHora().equalsIgnoreCase("20:00:00")) {
                                RegrasDoAutomatico regauto = new RegrasDoAutomatico();
                                regauto.RegraForaHorario();
                            }
                        }

                    } catch (Exception e) {
                    }
                }
            };
            timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
        }
    }

    /**
     * Creates new form Main
     */
    public Main() {

        AtualizarTXT atTXT = new AtualizarTXT();
        atTXT.IniciarAplicacaoCarregaTXT();

        initComponents();
        IniciarAppVerificaHora(MostraHoraInt());
        ManterHoraAtualizada();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHorario = new javax.swing.JTextField();
        jAutomatico = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fluxo Atendimento NII");

        jHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jHorario.setEnabled(false);

        jAutomatico.setText("Automatico");
        jAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAutomaticoActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenu5.setText("Executar Regras");

        jMenuItem6.setText("08:00 Horas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("11:00 Horas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("12:00 Horas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("14:00 Horas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("17:00 Horas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("18:00 Horas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenu1.add(jMenu5);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Funcionarios");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem5.setText("Listar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Atendimento Grupo");

        jMenuItem3.setText("Gerenciar Usuarios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Atendimento Externo");

        jMenuItem4.setText("Gerenciar Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAutomatico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAutomatico))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastrarFuncionarios CadFun = new CadastrarFuncionarios();
        CadFun.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar o programa");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        GerenciarGrupo InsGrupo = new GerenciarGrupo();
        InsGrupo.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        GerenciarExterno InsExterno = new GerenciarExterno();
        InsExterno.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ListaDeFuncionarios ListFun = new ListaDeFuncionarios();
        ListFun.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAutomaticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAutomaticoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RegrasDoAutomatico regauto = new RegrasDoAutomatico();
        regauto.RegraOitoHoras();
        JOptionPane.showMessageDialog(this, "Regra das 08:00h executada com Sucesso", "Sucesso", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        RegrasDoAutomatico regauto = new RegrasDoAutomatico();
        regauto.RegraOnzeHoras();
        JOptionPane.showMessageDialog(this, "Regra das 11:00h executada com Sucesso", "Sucesso", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        RegrasDoAutomatico regauto = new RegrasDoAutomatico();
        regauto.RegraDozeHoras();
        JOptionPane.showMessageDialog(this, "Regra das 12:00h executada com Sucesso", "Sucesso", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        RegrasDoAutomatico regauto = new RegrasDoAutomatico();
        regauto.RegraQuatorzeHoras();
        JOptionPane.showMessageDialog(this, "Regra das 14:00h executada com Sucesso", "Sucesso", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        RegrasDoAutomatico regauto = new RegrasDoAutomatico();
        regauto.RegraDezesseteHoras();
        JOptionPane.showMessageDialog(this, "Regra das 17:00h executada com Sucesso", "Sucesso", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        RegrasDoAutomatico regauto = new RegrasDoAutomatico();
        regauto.RegraDezoitoHoras();
        JOptionPane.showMessageDialog(this, "Regra das 18:00h executada com Sucesso", "Sucesso", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jAutomatico;
    public javax.swing.JTextField jHorario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
