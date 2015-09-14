/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Logica.logicafrmNegocio;
import Negocio.Mascota;
import javax.swing.JOptionPane;
/**
 *
 * @author Chuster
 */
public class Agregar extends javax.swing.JInternalFrame {
    /**
     * Creates new form Agregar
     */
    public Agregar() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agregar");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar  Mascotas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 30, 250, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Identificación:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 100, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 80, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 180, 70, 15);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 90, 110, 30);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 130, 110, 30);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 170, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Especie:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 100, 60, 15);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Mamífero", "Reptil", "Ave", "Anfibio", "Pez" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(340, 100, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 160, 50, 15);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setText("Macho");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(340, 150, 90, 23);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2.setText("Hembra");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(340, 180, 90, 23);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 230, 110, 30);

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 270, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------
//Botón Agregar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id=jTextField1.getText();
        //Valida que no hayan espacios sin completar
        if(jTextField1.getText().equals("")||jTextField2.getText().equals("")||jTextField3.getText().equals("")||jComboBox1.getSelectedItem().equals("...")||(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false)){
            JOptionPane.showMessageDialog(null, "No se permiten espacios en blanco...Por favor complete la información que se le solicita");
        }
        else{
            Mascota m=new Mascota();
            m.setId(jTextField1.getText());
            m.setNombre(jTextField2.getText());
            m.setEdad(Integer.parseInt(jTextField3.getText()));
            m.setEspecie(jComboBox1.getSelectedItem().toString());
            if(jRadioButton1.isSelected()){
                m.setSexo("M"); 
            }
            if(jRadioButton2.isSelected()){
                m.setSexo("H"); 
            }
            //Agrega la mascota a la Lista con los datos ingresados por el usuario
            new logicafrmNegocio().AgregarMascota(m);
            JOptionPane.showMessageDialog(null, "Mascota agregada exitosamente");
            limpiar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//------------------------------------------------------------------------------
//Botón Aceptar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        esconderRadios();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        esconderRadios();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
        if(c<'0'  || c>'9'){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Digite solamente números ");
        }//permite solo ingresar numeros
    }//GEN-LAST:event_jTextField3KeyTyped
 //-----------------------------------------------------------------------------
    //Método que limpia la pantala
    public void limpiar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedItem("...");
        jRadioButton1.setSelected(false);
        jRadioButton1.setVisible(true);
        jRadioButton2.setSelected(false);
        jRadioButton2.setVisible(true);
    }
//------------------------------------------------------------------------------
//Valida que solo permita elegir un RaddioButton
    public void esconderRadios(){
        if(jRadioButton1.isSelected()){
            jRadioButton2.setVisible(false);
        }
        else{
           jRadioButton2.setVisible(true); 
        }
        if(jRadioButton2.isSelected()){
            jRadioButton1.setVisible(false);
        }
        else{
            jRadioButton1.setVisible(true);
        }
    }
    //--------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}