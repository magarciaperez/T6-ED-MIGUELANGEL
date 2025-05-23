/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6.ed.pkg09769811d;

/**
 *
 * @author migarci3
 */
import java.util.logging.Logger;

public class Tarea6EDClase {
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        if (numProductos > 3)
            precioProducto -= DESCUENTO_POR_CANTIDAD;

        if (numProductos > 0) {
            Total = precioProducto * DESCUENTO_GENERAL;
            imprimirTotal(Total);
        } else {
            Total = precioProducto * DESCUENTO_POCOS_PRODUCTOS;
            imprimirTotal(Total);
        }
    }
    private static final double DESCUENTO_POCOS_PRODUCTOS = 0.95;
    private static final double DESCUENTO_GENERAL = 0.8;
    private static final int DESCUENTO_POR_CANTIDAD = 5;

    private void imprimirTotal(double Total) {
        System.out.println("El total que hay que pagar es:" + Total);
        System.out.println("Enviado");
    }
}


