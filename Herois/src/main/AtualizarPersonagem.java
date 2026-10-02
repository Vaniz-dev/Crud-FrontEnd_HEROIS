/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import main.Interface.*;

public class AtualizarPersonagem extends javax.swing.JFrame {
    public AtualizarPersonagem() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        h1 = new javax.swing.JLabel();
        Formulario = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        txtNomeAntigo = new javax.swing.JTextField();
        cadastroBtn = new javax.swing.JButton();
        nome1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        habilidade = new javax.swing.JLabel();
        txtHabilidade = new javax.swing.JTextField();
        txtFraqueza = new javax.swing.JTextField();
        fraqueza = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        lblCaminho = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        h1.setBackground(new java.awt.Color(255, 255, 255));
        h1.setFont(new java.awt.Font("Swis721 LtCn BT", 3, 48)); // NOI18N
        h1.setText("LIGA DE HEROIS");

        nome.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        nome.setText("NOME ATUAL");

        txtNomeAntigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeAntigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAntigoActionPerformed(evt);
            }
        });

        cadastroBtn.setText("Atualizar");
        cadastroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBtnActionPerformed(evt);
            }
        });

        nome1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        nome1.setText("NOME NOVO");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        habilidade.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        habilidade.setText("HABILIDADE");

        txtHabilidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFraqueza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        fraqueza.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        fraqueza.setText("FRAQUEZA");

        foto.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        foto.setText("FOTO");

        lblCaminho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario);
        Formulario.setLayout(FormularioLayout);
        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(txtNomeAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foto)
                            .addComponent(lblCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fraqueza)
                            .addComponent(txtFraqueza, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habilidade)
                            .addComponent(nome1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(habilidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fraqueza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFraqueza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(voltar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(h1)
                .addGap(238, 238, 238))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBtnActionPerformed
        try {
            Heroi heroi = new Heroi();
            heroi.setNome(txtNome.getText());
            heroi.setHabilidade(txtHabilidade.getText());
            heroi.setFraqueza(txtFraqueza.getText());
            heroi.setFoto(lblCaminho.getText());

            HeroiDAO dao = new HeroiDAO();
            dao.atualizarPorNome(heroi,txtNomeAntigo.getText());
            JOptionPane.showMessageDialog(this, "Herói Atualizado com Sucesso!");
            txtNomeAntigo.setText(""); txtHabilidade.setText("");
            txtFraqueza.setText(""); lblCaminho.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha: " + e.getMessage(), "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastroBtnActionPerformed

    private void txtNomeAntigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAntigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAntigoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Interface i = new Interface();
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarPersonagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulario;
    private javax.swing.JButton cadastroBtn;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel fraqueza;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel habilidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblCaminho;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome1;
    private javax.swing.JTextField txtFraqueza;
    private javax.swing.JTextField txtHabilidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeAntigo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
