/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2p1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author planl
 */
public class Semana2p1 {
    public static ArrayList<Producto> tienda = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tienda.add(new Producto("manzana", 10, 1, 5000));
        tienda.add(new Producto("yogurt", 15, 2, 3000));
        tienda.add(new Producto("papas", 10, 3, 2000));
        tienda.add(new Producto("gaseosa", 9, 4, 3000));
        tienda.add(new Producto("pan", 20, 5, 1500));
        
       
        
        String continuar = "si";
        
        
        while(continuar.equals("si")){
            
           int hacer =  Integer.parseInt(JOptionPane.showInputDialog("que sea hacer,\n digite 1: ingresar venta \n"+" digite 2: mostrar cantidad de productos en la tienda \n"
                    +" digite 3: mostrar cantidad de un producto \n"
                    +" digite 4: ingresar nuevo producto "));
            try{
            switch (hacer) {
                case 1:
                    boolean encontrado = true;
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("digite el codigo del producto"));
                    
                    for(int i=0;i < tienda.size();i++){
                        if(codigo == tienda.get(i).getCod()){
                            encontrado = false;
                            int pd = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantos productos vendio"));
                            if(pd>tienda.get(i).getCantidad()){
                                JOptionPane.showMessageDialog(null,"esa cantidad es superior a la cantidad del inventario ingrese otra cantidad");
                            }else{
                                double venta = pd*tienda.get(i).getPrecio();
                                int inventario = tienda.get(i).getCantidad() - pd;
                                tienda.get(i).setCantidad(inventario);
                                JOptionPane.showMessageDialog(null,"usted vendio "+pd+" "
                                        +tienda.get(i).getNombre()+" \n por un valor de "+venta+"\n su nueva cantidad en inventario es de "+inventario);
                            }
                        }
                    }
                    
                    if(encontrado){
                        JOptionPane.showMessageDialog(null,"el codigo del producto no existe");
                    }
                    
                    break;
                  case 2:
                      int cantidad = 0;
                      String msg = "";
                      for(int i=0;i<tienda.size();i++){
                          msg = msg + "\n" +"el producto " +tienda.get(i).getNombre()+" tiene en total "+tienda.get(i).getCantidad()+" unidades";
                          cantidad = cantidad + tienda.get(i).getCantidad();
                                  
                      }
                      
                      JOptionPane.showMessageDialog(null,msg + "\n" + " para un total de " + cantidad + " unidades");
                      
                    
                    break;
                    
                    case 3:
                    boolean find = true;
                    int cod = Integer.parseInt(JOptionPane.showInputDialog("digite el codigo del producto"));
                    
                    for(int i=0;i < tienda.size();i++){
                        if(cod == tienda.get(i).getCod()){
                            find = false;
                            
                                JOptionPane.showMessageDialog(null,"el producto "+tienda.get(i).getNombre()
                                       +" tiene en inventario "+tienda.get(i).getCantidad()+" unidades");
                            }
                        
                    }
                    
                    if(find){
                        JOptionPane.showMessageDialog(null,"el codigo del producto no existe");
                    }
                    
                    break;
                    
                    case 4:
                    boolean encuentra = true;
                    int cd = Integer.parseInt(JOptionPane.showInputDialog("digite el codigo del nuevo producto"));
                    for(int i=0;i < tienda.size();i++){
                        if(cd == tienda.get(i).getCod()){
                            encuentra = false;
                            
                                JOptionPane.showMessageDialog(null,"ese codigo ya existe debe ingresar un codigo nuevo");
                            }
                        
                    }
                    
                    if(encuentra){
                        String nom = JOptionPane.showInputDialog("digite el nombre del nuevo producto");
                        int inven = Integer.parseInt(JOptionPane.showInputDialog("la cantidad del producto nuevo"));
                        double price = Double.parseDouble(JOptionPane.showInputDialog("digite el precio del producto nuevo"));
                        
                        tienda.add(new Producto(nom, inven, cd, price));
                        
                        JOptionPane.showMessageDialog(null,"producto agregado");
                        
                    }
                    
                    break;
  
                 
                default:
                    throw new AssertionError();
            }
            }catch(AssertionError e){
                
                 JOptionPane.showMessageDialog(null,"no digito una opcion viable");
            }
            
            
            continuar = JOptionPane.showInputDialog("digite si para continuar");
            
        }
       
      
    }
    
}
