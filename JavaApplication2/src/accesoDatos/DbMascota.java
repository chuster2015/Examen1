/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;
import Negocio.Mascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Chuster
 */
public class DbMascota {
     static private ArrayList<Mascota> listaMascotas=new ArrayList<Mascota>();// Crea la Lista de Mascotas
 //--------------------------------------------------------------------------
    //Método para agregar Mascotas a la Lista
    public static ArrayList<Mascota> AgregarMascota(Mascota m){
        Mascota mascota=new Mascota();
        mascota.setId(m.getId().toString());
        mascota.setNombre(m.getNombre().toString());
        mascota.setEdad(m.getEdad());
        mascota.setEspecie(m.getEspecie().toString());
        mascota.setSexo(m.getSexo().toString());
        //Agrega la mascota a la Lista
        listaMascotas.add(mascota);       
        return listaMascotas;
    }
    //--------------------------------------------------------------------------
    //Método mostrar de la Lista de Mascotas
   public static ArrayList<Mascota> mostrar(){
       //Si la lista está vacía
       if(esta_vacia()){
           JOptionPane.showMessageDialog(null, "No hay mascotas registradas en el sistema");
       }
       return listaMascotas; //Retorna la lista de Mascotas
    }
    //--------------------------------------------------------------------------
    //Método para buscar Mascotas en la Lista
    public static Mascota buscar(String id){ 
        Mascota m;
        //Si la lista está vacía
        if(esta_vacia()){
           JOptionPane.showMessageDialog(null, "No hay mascotas registradas en el sistema");
       }
        else{
            for(int i=0;i<listaMascotas.size();i++){
                m=listaMascotas.get(i); //Recorre la Lista
                if(m.getId().equals(id)){//Si tienen el mismo ID retorna la mascota
                    return m;
                }
            }
        }
        return null;
    }
    //--------------------------------------------------------------------------
    //Método que retorna si la lista está vacía
   public static boolean esta_vacia()
    {
      return listaMascotas.isEmpty();
    }
   //---------------------------------------------------------------------------
   //Método para Eliminar una mascota de la Lista
   public static ArrayList<Mascota> Eliminar(String id){
       //Si la lista está vacía
       if(esta_vacia()){
           JOptionPane.showMessageDialog(null, "No hay mascotas registradas en el sistema");
       }
       else{
           Mascota m;
           for (int i=0;i<listaMascotas.size();i++){
               m=listaMascotas.get(i);//Recorre la Lista
               if(m.getId().equals(id)) {//Si tienen el mismo ID
                   listaMascotas.remove(listaMascotas.get(i));
               }
           }
       }
       return listaMascotas;
   }
   //---------------------------------------------------------------------------
   //Método para modificar datos de alguna Mascota en la Lista
   public static ArrayList<Mascota> Modificar(Mascota mascota,String id){
       //Si la lista esta vacía
       if(esta_vacia()){
           JOptionPane.showMessageDialog(null, "No hay mascotas registradas en el sistema");
       }
       else{
           Mascota m;
           for (int i=0;i<listaMascotas.size();i++){
               m=listaMascotas.get(i);//Recorre la Lista
               if(m.getId().equals(id)) {//Si tienen el mismo ID
                   //MODIFICA LOS DATOS DE LA MASCOTA
                   m.setId(mascota.getId().toString());
                   m.setNombre(mascota.getNombre().toString());
                   m.setEdad(mascota.getEdad());
                   m.setEspecie(mascota.getEspecie().toString());
                   m.setSexo(mascota.getSexo().toString());
               }
           }
       }
       return listaMascotas;
   }
   //---------------------------------------------------------------------------
}
