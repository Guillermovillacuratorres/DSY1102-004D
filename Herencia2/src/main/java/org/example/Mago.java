package org.example;

public class Mago extends Personaje {
    private boolean ataqueMagico;

    public Mago(boolean ataqueMagico) {
        this.ataqueMagico = ataqueMagico;
    }

    public Mago(int danio, int vida, String nombre, boolean ataqueMagico) {
        super(danio, vida, nombre);
        this.ataqueMagico = ataqueMagico;
    }

    public Mago() {
    }

    public boolean isAtaqueMagico() {
        return ataqueMagico;
    }

    public void setAtaqueMagico(boolean ataqueMagico) {
        this.ataqueMagico = ataqueMagico;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "ataqueMagico=" + ataqueMagico +
                ", danio=" + danio +
                ", vida=" + vida +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void caminar() {
        System.out.println("Caminando");
    }
}
