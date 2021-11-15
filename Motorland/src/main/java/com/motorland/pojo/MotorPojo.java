package com.motorland.pojo;

import com.motorland.model.Motor;

public class MotorPojo {
    private String modelo;
    private String fabricante;
    private int potencia;
    private double peso;
    private int cantidad;
    private boolean optimo;
    
    public MotorPojo() {
        this.modelo = "";
        this.fabricante = "";
        this.potencia = 0;
        this.peso = 0.0;
        this.cantidad = 0;
        this.optimo = false;
    }
    
    public MotorPojo(Motor motor) {
        this.modelo = motor.getModelo();
        this.fabricante = motor.getFabricante();
        this.potencia = motor.getPotencia();
        this.peso = motor.getPeso();
        this.cantidad = motor.getCantidad();
        this.optimo = (this.peso >= 0 && potencia > 0 && ((peso/potencia) < 10));
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
    
    public void setOptimo(boolean optimo) {
        this.optimo = optimo;
    }
    
    public boolean getOptimo() {
        return this.optimo;
    }
}

