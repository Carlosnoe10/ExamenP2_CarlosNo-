/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlp2_carlosnoé;

import java.io.Serializable;

/**
 *
 * @author cd507
 */
public class Carro implements Serializable{

    public String Marca;
    public String Modelo;
    public int Velocidad;

    public Carro(String Marca, String Modelo, int Velocidad) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    @Override
    public String toString() {
        return Marca + " " + Modelo;
    }

}
