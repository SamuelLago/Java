package cliente;
public class Cliente {
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    public Cliente(){}
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.length() == 8 && numeroConta.charAt(6) == '-') {
            this.numeroConta = numeroConta;
        }
        else{
            this.numeroConta = "Error";
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-'){
            this.numeroAgencia = numeroAgencia;
        }
        else {
            this.numeroAgencia = "Error";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        }
        else {
            this.nome = "Error";
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo > 0) {
            this.saldo = saldo;
        }
    }

    public void realizarDeposito(float x){
        if(x > 0){
            this.saldo += x;
        }
    }
    public void realizarSaque(float x){
        if(x > 0){
            if(this.saldo - x > 0){
                this.saldo -= x;
            }
        }
    }

    public String imprimirConta(){
        return "Número da conta: " + this.numeroConta + "\nNúmero da Agencia: " + this.numeroAgencia + "\nNome: " + this.nome + "\nSaldo: " + this.saldo;
    }
}
