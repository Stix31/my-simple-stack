package deqo.twsh.mysimplestack;

public class Item {

    private String nomItem;
    private int num;

    public String getNom() {
        return this.nomItem;
    }

    public int getNumero() {
        return this.num;
    }

    public void setNom (String nom) {
        this.nomItem = nom;
    }

    public void setNumero(int numero) {
        this.num = numero;
    }
}
