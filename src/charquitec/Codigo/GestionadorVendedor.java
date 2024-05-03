/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charquitec.Codigo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestionadorVendedor {
    ArrayList<Producto>arregloPro=new ArrayList<>();
    ArrayList<Vendedor>arregloVendedor=new ArrayList<>();
    public void RegistrarProducto(Producto unproducto){
        arregloPro.add(unproducto);
        
    }
    public void RegistrarVendedor(Vendedor unvendedor){
        arregloVendedor.add(unvendedor);
    }
    public void MostrarProducto(){
       for(int i=0;i<arregloPro.size();i++){
           System.out.println(arregloPro.toString());
       }
    }
}
