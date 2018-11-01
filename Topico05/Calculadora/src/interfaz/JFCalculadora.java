package interfaz;

public class JFCalculadora extends javax.swing.JFrame {

    public JFCalculadora() {
        setVisible(true);
        setResizable(false);
        setLocation(500, 300);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputNum1 = new javax.swing.JTextField();
        inputNum2 = new javax.swing.JTextField();
        btn_resta = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_potencia = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_intercambio = new javax.swing.JButton();
        btn_raiz = new javax.swing.JButton();
        btn_residuo = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        textResultado = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        inputNum1.setName("inputNum1"); // NOI18N

        inputNum2.setName("inputNum2"); // NOI18N

        btn_resta.setText("-");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_multi.setText("x");
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });

        btn_potencia.setText("^");
        btn_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_potenciaActionPerformed(evt);
            }
        });

        btn_limpiar.setText("C");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_intercambio.setText("↑↓");
        btn_intercambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_intercambioActionPerformed(evt);
            }
        });

        btn_raiz.setText("√");
        btn_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raizActionPerformed(evt);
            }
        });

        btn_residuo.setText("%");
        btn_residuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_residuoActionPerformed(evt);
            }
        });

        btn_division.setText("/");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        btn_suma.setText("+");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        textResultado.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setText("Calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_residuo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_intercambio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_multi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_potencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_residuo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_intercambio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        int num1 = Integer.parseInt(inputNum1.getText());
        int num2 = Integer.parseInt(inputNum2.getText());
        
        int resultado = num1 + num2;
        
        textResultado.setText(Integer.toString(resultado));
        inputNum1.setText("");
        inputNum2.setText("");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        int num1 = Integer.parseInt(inputNum1.getText());
        int num2 = Integer.parseInt(inputNum2.getText());
        
        int resultado = num1 - num2;
        
        textResultado.setText(Integer.toString(resultado));
        inputNum1.setText("");
        inputNum2.setText("");
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        int num1 = Integer.parseInt(inputNum1.getText());
        int num2 = Integer.parseInt(inputNum2.getText());
        
        int resultado = num1 * num2;
        
        textResultado.setText(Integer.toString(resultado));
        inputNum1.setText("");
        inputNum2.setText("");
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        double num1 = Integer.parseInt(inputNum1.getText());
        double num2 = Integer.parseInt(inputNum2.getText());
        
        if(num2 != 0){
            double resultado = num1 / num2;
            textResultado.setText(resultado+"");
            inputNum1.setText("");
            inputNum2.setText("");
        }else{
             textResultado.setText("La division por cero no existe");
        }     
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raizActionPerformed
        double num1 = Integer.parseInt(inputNum1.getText());
        double num2 = Integer.parseInt(inputNum2.getText());
        
        float resultado = (float) Math.pow(num1,1/num2);
        
        textResultado.setText(resultado + "");
        inputNum1.setText("");
        inputNum2.setText("");
    }//GEN-LAST:event_btn_raizActionPerformed

    private void btn_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_potenciaActionPerformed
        double num1 = Integer.parseInt(inputNum1.getText());
        double num2 = Integer.parseInt(inputNum2.getText());
        
        float resultado = (float) Math.pow(num1,num2);
        
        textResultado.setText(resultado + "");
        inputNum1.setText("");
        inputNum2.setText("");
    }//GEN-LAST:event_btn_potenciaActionPerformed

    private void btn_residuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_residuoActionPerformed
        int num1 = Integer.parseInt(inputNum1.getText());
        int num2 = Integer.parseInt(inputNum2.getText());
        
        int resultado = (int) num1 % num2;
        
        textResultado.setText(resultado + "");
        inputNum1.setText("");
        inputNum2.setText("");
    }//GEN-LAST:event_btn_residuoActionPerformed

    private void btn_intercambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_intercambioActionPerformed
        String auxStr;
        auxStr = inputNum1.getText();
        inputNum1.setText(inputNum2.getText());       
        inputNum2.setText(auxStr);
    }//GEN-LAST:event_btn_intercambioActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        inputNum1.setText("");       
        inputNum2.setText("");
        textResultado.setText("");        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_intercambio;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_potencia;
    private javax.swing.JButton btn_raiz;
    private javax.swing.JButton btn_residuo;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JTextField inputNum1;
    private javax.swing.JTextField inputNum2;
    private javax.swing.JLabel textResultado;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
