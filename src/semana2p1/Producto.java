/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2p1;

/**
 *
 * @author planl
 */
public class Producto {
    
      
    private String nombre;
    private int cantidad;
    private int cod;
    private double precio;

    public Producto(String nombre, int cantidad, int cod, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cod = cod;
        this.precio = precio;
    }
    

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
