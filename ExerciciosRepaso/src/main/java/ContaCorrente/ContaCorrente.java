package ContaCorrente;

public class ContaCorrente {

     String nome;
     String dni;
     double saldo;
     Xestor xestor;



    public String getNome(){
        return nome;
    }

    public String getDni() {
        return dni;
    }

    public double getSaldo(){
        return saldo;
    }

    ContaCorrente(String nome, String dni, double saldo) {
        this.nome = nome;
        this.dni = dni;
        this.saldo = 0;
    }

    void depositar(double cantidade) {
        saldo = saldo + cantidade;
    }

    void retirar(double cantidade){
        if (cantidade > this.saldo){
            System.out.println("Non se pode retirar, saldo insuficiente");
        }else{
            this.saldo = this.saldo - cantidade;
        }
    }
    double saldo() {
        return saldo;
    }

}
