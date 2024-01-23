package com.caneta;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Estado: "+ this.tampada);
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    //Constructor
    public Caneta(String m, String c, float p){
        this.setMedelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampada = true;
    }

    //Getters and Setters
    public String getModelo(){
        return this.modelo;
    }
    public void setMedelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }
}


