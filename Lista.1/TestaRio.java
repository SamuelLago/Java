public class TestaRio {
    public static void main(String[] args){
        Rio obj1 = new Rio("Rio Amazonas", 3, true);
        Rio obj2 = new Rio("Rio Negro", 12, false);

        obj1.chover(2);
        obj2.ensolarar(2);
        obj1.sujar(false);
        obj2.limpar(true);
        System.out.println(obj1.mostrar());
        System.out.println(obj2.mostrar());
    }
}
