/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import Logica.logicafrmNegocio;
import Negocio.Mascota;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chuster
 */
public class Eliminar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Eliminar");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Digite el ID de la mascota que desea eliminar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 320, 17);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(340, 60, 130, 30);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 110, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar mascota por ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 0, 340, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Datos de la mascota a eliminar:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 160, 200, 15);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre", "Edad", "Especie", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 500, 50);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 260, 110, 30);

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(220, 300, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------
//Botón para buscar e imprimir la información
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id=jTextField1.getText();//Variable que obtiene el ID que digitó el usuario
        Mascota m;
        //Valida que la casilla del ID no esté vacía
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID para buscar una mascoa específica...");
            limpiar();
        }
        else{
            //Obtiene el resultado (si encontró o no el ID)
            m=new logicafrmNegocio().buscarMascota(id);
            //Crea el modelo de la Tabla si encontró la Mascota en la Lista
            if(m!=null){
                JOptionPane.showMessageDialog(null, "Se ha encontrado una mascota con ID: "+id);
                DefaultTableModel modeloTabla=new DefaultTableModel();
                modeloTabla.addColumn("Identificación");
                modeloTabla.addColumn("Nombre");
                modeloTabla.addColumn("Edad");
                modeloTabla.addColumn("Especie");
                modeloTabla.addColumn("Sexo");
                //Recorre la Lista e imprime la mascota que encontró
                Object[] datos={m.getId(),m.getNombre(),m.getEdad(),m.getEspecie(),m.getSexo()};
                modeloTabla.addRow(datos);
                jTable1.setModel(modeloTabla);
            }
            //Si no encontró la mascota en la Lista
            else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado una mascota con ID: "+id);
                limpiar();
                limpiarTabla();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

//------------------------------------------------------------------------------
//Botón para eliminar la Mascota de la lista
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id=jTextField1.getText();//Variable que obtiene el ID de que ingresó el usuaio
        Mascota m;
        //Valida que la casilla del ID no esté vacía
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID para buscar una mascoa específica...");
            limpiar();
        }
        else{
            //Obtiene el resultado (si encontró o no el ID)
            m=new logicafrmNegocio().buscarMascota(id);
            //Si encontró la Mascota en la Lista
            if(m!=null){
                int opcion = JOptionPane.showConfirmDialog (this, "¿Está seguro que desea eliminar la mascota con ID "+id+"?", "Eliminar Mascota", JOptionPane.YES_NO_OPTION);
                if(opcion == JOptionPane.YES_OPTION){ //Si eligió si
                    //Elimina la mascota de la Lista
                    new logicafrmNegocio().EliminarMascota(id);
                    JOptionPane.showMessageDialog(null, "Se ha eliminado la mascota...");
                    limpiar();
                    limpiarTabla();
                }
                else{
                    limpiar();
                    limpiarTabla();
                }
            }
            //Si no encontró una mascota con ID igual al que ingresó el usuario
            else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado una mascota con ID: "+id);
                limpiar();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
//------------------------------------------------------------------------------
//Método que limpia la tabla
     public void limpiarTabla(){
       DefaultTableModel modeloTabla=new DefaultTableModel();
       modeloTabla.addColumn("Identificación");
       modeloTabla.addColumn("Nombre");
       modeloTabla.addColumn("Edad");
       modeloTabla.addColumn("Especie");
       modeloTabla.addColumn("Sexo");
       Object[] datos={"","","","",""};
       modeloTabla.addRow(datos);
       jTable1.setModel(modeloTabla);
    }
//------------------------------------------------------------------------------
//Botón Aceptar
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
//------------------------------------------------------------------------------
//Método para limpiar la pantalla
    public void limpiar(){
        jTextField1.setText("");
    }
//------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
