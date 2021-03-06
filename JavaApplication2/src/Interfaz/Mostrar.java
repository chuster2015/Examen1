/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Logica.logicafrmNegocio;
import Negocio.Mascota;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Chuster
 */
public class Mostrar extends javax.swing.JInternalFrame {
    /**
     * Creates new form Mostrar
     */
    public Mostrar() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Mostrar Información");
        getContentPane().setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 80, 560, 210);

        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 30, 100, 40);

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 300, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------
//Boton Mostar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Mascota> listaMascota=new logicafrmNegocio().mostrar(); //Retorna la lista
        //Crea el modelo de la Tabla
        DefaultTableModel modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Identificación");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Especie");
        modeloTabla.addColumn("Sexo");
        //Recorre la Lista y va metiendo los datos en la Tabla
        for(Mascota m:listaMascota){
            Object[] datos={m.getId(),m.getNombre(),m.getEdad(),m.getEspecie(),m.getSexo()};
            modeloTabla.addRow(datos);
        }
        jTable2.setModel(modeloTabla);
    }//GEN-LAST:event_jButton1ActionPerformed
//------------------------------------------------------------------------------
//Botón Aceptar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
//------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
