/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charquitec.Codigo;

/**
 *
 * @author Usuario
 */
public class Vendedor extends Persona {
    
    public Vendedor(String nombre,String apellido, String codigo) {
        super(nombre,apellido, codigo);
    }

    @Override
    public String toString() {
        return "Vendedor:"+nombre+"\nApellido:"+apellido+"\nCodigo:"+codigo;
    }
    
}
