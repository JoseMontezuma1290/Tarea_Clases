/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg24.pkg07.pkg23;

public class persona{
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    public persona(int id, String nombre, String apellidos, int edad){
        this.id =id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad =  edad;  
    }
    //Metodos Get Set
    public void setid(int id){this.id=id;}
    public void setnombre(String nombre){this.nombre=nombre;}
    public void setapellidos(String apellidos){this.apellidos=apellidos;}
    public void setedad(int edad){this.edad=edad;}
    
    public String getdata(){
        return "Id: "+id+" Name: "+nombre+" LastName: "+apellidos+" edad: "+edad;
    }
     
}