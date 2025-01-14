/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculartienda;

/**
 *
 * @author jordan
 */
public class CalcularTienda {

    /**
     * Calcula el precio total de la compra sin IVA.
     * 
     * @param precioUnitario El precio unitario del producto.
     * @param cantidad La cantidad de productos comprados.
     * @return El precio total sin IVA.
     */
    public double calcularPrecioFinal(double precioUnitario, int cantidad) {
        return precioUnitario * cantidad;
    }

    /**
     * Calcula el precio total con IVA (21%) aplicado.
     * 
     * @param precioFinal El precio final de la compra sin IVA.
     * @return El precio total con IVA incluido.
     */
    public double calcularPrecioConIVA(double precioFinal) {
        double iva = 0.21;
        return precioFinal * (1 + iva);
    }
    
}
