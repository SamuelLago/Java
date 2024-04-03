import java.awt.color.ProfileDataException;

public class TestaProduto {
    public static void main(String[] args){
        Produto obj1 = new Produto(352,14,"Lápis",1.50f);
        Produto obj2 = new Produto(744,51,"Borrachas", 2.50f);

        obj1.subirPreco(0.50f);
        obj2.descerPreco(1);
        obj1.comprar(6);
        obj2.vender(1);
        System.out.println(obj1.mostrar());
        System.out.println(obj2.mostrar());
    }
}
