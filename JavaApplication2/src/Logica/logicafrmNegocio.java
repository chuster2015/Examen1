/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import Negocio.Mascota;
import accesoDatos.DbMascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Chuster
 */
//Esta clase sirve para la comunicación de la Interfaz con la clase Lista (DbMascota)
public class logicafrmNegocio {
   
    //--------------------------------------------------------------------------
    //Comunica el JInternalFrame de Agregar con la clase DbMascota
    public ArrayList<Mascota> AgregarMascota(Mascota m){ //Obtiene los datos que se ingresaron
        ArrayList<Mascota> listaMascota=new ArrayList<>();
        try{
            //LLama al método Agregar de la Lista y le envía la mascota
            listaMascota=DbMascota.AgregarMascota(m);
        }
        catch(Exception ex){//Si se pasa del rango de la tabla
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally{
            return listaMascota;
        }
    }
    //--------------------------------------------------------------------------
    //Comunica el JInternalFrame de Mostrar con la clase DbMascota
    public ArrayList<Mascota> mostrar(){
        ArrayList<Mascota> listaMascota=new ArrayList<>();
        try{
            listaMascota=DbMascota.mostrar(); //LLama al método Mostrar de la Lista
        }
        catch(Exception ex){//Si se pasa del rango de la tabla
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally{
            return listaMascota;
        }
    }
    //--------------------------------------------------------------------------
    //Comunica el JInternalFrame de Buscar con la clase DbMascota
    public Mascota buscarMascota(String id){ //Obtiene el ID que el usuario ingresó
        //LLama al método Buscar en la Lista con el ID que debe buscar
       Mascota m=DbMascota.buscar(id);
       return m;
    }
    //--------------------------------------------------------------------------
    //Comunica el JInternalFrame de Eliminar con la clase DbMascota
    public ArrayList<Mascota> EliminarMascota(String id){ //Obtiene el ID que el usuario ingresó
        ArrayList<Mascota> listaMascota=new ArrayList<>();
        try{
            //LLama al método Eliminar en la Lista con el ID que debe eliminar
            listaMascota=DbMascota.Eliminar(id);
        }
        catch(Exception ex){//Si se pasa del rango de la tabla
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally{
            return listaMascota;
        }
    }
    //--------------------------------------------------------------------------
    //Comunica el JInternalFrame de Modificar con la clase DbMascota
    public ArrayList<Mascota> ModificarMascota(Mascota m,String id){ //Obtiene los datos que se ingresaron
        ArrayList<Mascota> listaMascota=new ArrayList<>();
        try{
//LLama al método Modificar en la Lista con el ID que debe buscar y con la información de la nueva mascota
            listaMascota=DbMascota.Modificar(m,id);
        }
        catch(Exception ex){//Si se pasa del rango de la tabla
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally{
            return listaMascota;
        }
 //-----------------------------------------------------------------------------
    }
}
