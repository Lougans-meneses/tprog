package ada.tech.exemplo;

public class Animal {

    private String especie;
    private boolean podeSaltar;
    private boolean podeNadar;

    public Animal(String nomeDaEspecie, boolean saltador, boolean nadador){
        especie = nomeDaEspecie;
        podeSaltar = saltador;
        podeNadar = nadador;
    }

    public boolean podeSaltar() { return podeSaltar; }
    public boolean podeNadar() { return podeNadar; }
    public String toString() { return especie; }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
