public class TestaCliente {
    public static void main(String[] args){
        Cliente obj1 = new Cliente(286594, "Samuel", 1700, 54983);
        Cliente obj2 = new Cliente(548963, "Luiz", 26236, 31734);

        System.out.println(obj1.dadosCliente());
        obj1.realizarDeposito(300);
        System.out.println(obj1.dadosCliente());
        System.out.println(obj2.dadosCliente());
        obj1.realizarSaque(236);
        System.out.println(obj2.dadosCliente());
    }
}
