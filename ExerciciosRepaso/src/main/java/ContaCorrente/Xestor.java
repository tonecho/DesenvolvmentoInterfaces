package ContaCorrente;

public class Xestor {

    public String nome;
    private String telefono;
    double importeMaximo;

    public Xestor(String nome, String telefono, double importeMaximo) {
        this.nome = nome;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    public Xestor(String nome, String telefono) {
        this(nome, telefono, 10000.00);
    }

    public String getTelefono() {
        return telefono;
    }

    void mostrarInformacion(){
        System.out.println("Nombre: " + nome);
        System.out.println("Telefono: " + telefono);
        System.out.println("ImporteMaximo: " + importeMaximo);
    }

}


