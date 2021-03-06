/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJava;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesilva
 */
public class GerenciarGrupo extends javax.swing.JFrame {

    /**
     * Creates new form InserirNoGrupo
     */
    public GerenciarGrupo() {
        initComponents();

        for (int i = 0; i < Main.AtendimentoGrupo.size(); i++) {

            Funcionarios fun = Main.AtendimentoGrupo.get(i);
            String[] dados = new String[4];
            dados[0] = "" + fun.getID();
            dados[1] = fun.getNome();
            dados[2] = fun.getHorEntrada() + "h";
            dados[3] = fun.getHorSaida() + "h";

            DefaultTableModel model = (DefaultTableModel) jTabelaGrupo.getModel();
            model.addRow(dados);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaGrupo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jID = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Usuario no Grupo");

        jTabelaGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Horario Entrada", "Horario Saida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabelaGrupo);

        jLabel1.setText("Usuarios Atuais no Grupo:");

        jLabel2.setText("ID do Funcionario: ");

        jID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jButton1.setText("Inserir Funcionario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remover Funcionario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int verificacao = 0;
        int existeusuario = 0;

        String id = jID.getText();

        if (!id.equalsIgnoreCase("")) {
            int ID = Integer.parseInt(id);
            for (int i = 0; i < Main.Funcionarios.size(); i++) {
                if (ID == Main.Funcionarios.get(i).getID()) {
                    existeusuario = 1;
                }
            }
            if (existeusuario == 1) {
                for (int i = 0; i < Main.AtendimentoGrupo.size(); i++) {
                    if (ID == Main.AtendimentoGrupo.get(i).getID()) {
                        JOptionPane.showMessageDialog(this, "Este usuario já esta neste Grupo", "Error", JOptionPane.ERROR_MESSAGE);
                        verificacao = 1;
                    }
                }

                if (verificacao == 0) {
                    Funcionarios fungrupo = new Funcionarios();
                    for (int i = 0; i < Main.Funcionarios.size(); i++) {
                        if (ID == Main.Funcionarios.get(i).getID()) {
                            fungrupo.setID(Main.Funcionarios.get(i).getID());
                            fungrupo.setNome(Main.Funcionarios.get(i).getNome());
                            fungrupo.setHorEntrada(Main.Funcionarios.get(i).getHorEntrada());
                            fungrupo.setHorSaida(Main.Funcionarios.get(i).getHorSaida());
                            Main.AtendimentoGrupo.add(fungrupo);
                        }
                    }
                    for (int i = 0; i < Main.AtendimentoExterno.size(); i++) {
                        if (ID == Main.AtendimentoExterno.get(i).getID()) {
                            Main.AtendimentoExterno.remove(Main.AtendimentoExterno.get(i));
                        }
                    }
                    AtualizarTXT atTXT = new AtualizarTXT();
                    atTXT.AtualizaTXTAtendimentoExterno();
                    atTXT.AtualizaTXTAtendimentoGrupo();

                    JOptionPane.showMessageDialog(this, "Usuario inserido com Sucesso", "Sucesso", JOptionPane.DEFAULT_OPTION);
                    dispose();
                    GerenciarGrupo InsGrupo = new GerenciarGrupo();
                    InsGrupo.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID invalido ou não localizado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Campo Vazio\nNecessario inserir um ID valido no campo !", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int verificacao = 0;
        int existeusuario = 0;

        String id = jID.getText();

        if (!id.equalsIgnoreCase("")) {
            int ID = Integer.parseInt(id);
            for (int i = 0; i < Main.Funcionarios.size(); i++) {
                if (ID == Main.Funcionarios.get(i).getID()) {
                    existeusuario = 1;
                }
            }
            if (existeusuario == 1) {
                for (int i = 0; i < Main.AtendimentoGrupo.size(); i++) {
                    if (ID == Main.AtendimentoGrupo.get(i).getID()) {
                        Main.AtendimentoGrupo.remove(Main.AtendimentoGrupo.get(i));
                    }
                }
                AtualizarTXT atTXT = new AtualizarTXT();
                atTXT.AtualizaTXTAtendimentoExterno();
                atTXT.AtualizaTXTAtendimentoGrupo();

                JOptionPane.showMessageDialog(this, "Usuario removido com Sucesso", "Sucesso", JOptionPane.DEFAULT_OPTION);
                dispose();
                GerenciarGrupo RemGrupo = new GerenciarGrupo();
                RemGrupo.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaGrupo;
    // End of variables declaration//GEN-END:variables
}
