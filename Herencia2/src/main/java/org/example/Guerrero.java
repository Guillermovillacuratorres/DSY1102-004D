package org.example;

public class Guerrero extends Personaje{
    private boolean ataqueCuerpoACuerpo;


    public Guerrero(boolean ataqueCuerpoACuerpo) {
        this.ataqueCuerpoACuerpo = ataqueCuerpoACuerpo;
    }

    public Guerrero(int danio, int vida, String nombre, boolean ataqueCuerpoACuerpo) {
        super(danio, vida, nombre);
        this.ataqueCuerpoACuerpo = ataqueCuerpoACuerpo;
    }

    public Guerrero() {
    }


    public boolean isAtaqueCuerpoACuerpo() {
        return ataqueCuerpoACuerpo;
    }

    public void setAtaqueCuerpoACuerpo(boolean ataqueCuerpoACuerpo) {
        this.ataqueCuerpoACuerpo = ataqueCuerpoACuerpo;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "ataqueCuerpoACuerpo=" + ataqueCuerpoACuerpo +
                ", danio=" + danio +
                ", vida=" + vida +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void caminar() {
        System.out.println("Caminando");
    }


    @Override
    public void saludar() {
        System.out.println("Hola, soy un guerrero!!!!");
    }



}
