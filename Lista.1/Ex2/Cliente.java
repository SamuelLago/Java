public class Cliente {
    public int numConta, numAgencia;
    public String nome;
    public float saldo;

    public Cliente(int numConta, String nome, int saldo, int numAgencia){
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
        this.numAgencia = numAgencia;
    }

    public void realizarDeposito(float valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }
    public void realizarSaque(float valor){
        if(this.saldo - valor < 0){
            this.saldo -= valor;
        }
    }

    public String dadosCliente(){
        return "\nNúmero da conta: " + this.numConta + "\nNome: " + this.nome + "\nSaldo: " + this.saldo + "\nNúmero da Agencia: " + this.numAgencia;
    }
}
