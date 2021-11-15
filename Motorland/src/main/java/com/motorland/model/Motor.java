package com.motorland.model;

/**
 *
 * @author Ana
 */
public class Motor {
    private String modelo;
    private String fabricante;
    private int potencia;
    private double peso;
    private int cantidad;
    
    public Motor() {
        this.modelo = "";
        this.fabricante = "";
        this.potencia = 0;
        this.peso = 0.0;
        this.cantidad = 0;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getFabricante() {
        return this.fabricante;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public int getPotencia() {
        return this.potencia;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
}
