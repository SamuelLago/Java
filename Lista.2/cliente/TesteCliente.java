package cliente;
public class TesteCliente {
    public static void main(String[] args){
        Cliente obj1 = new Cliente("555555-5","4444-4","Samuel",100);

        obj1.realizarDeposito(100);
        obj1.realizarSaque(50);
        System.out.println(obj1.imprimirConta());
    }
}
