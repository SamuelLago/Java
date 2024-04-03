public class Produto {
    public int id, qtdd;
    public String descricao;
    public float preco;

    public Produto() {
    }

    public Produto(int id, int qtdd, String descricao, float preco) {
        this.id = id;
        this.qtdd = qtdd;
        this.descricao = descricao;
        this.preco = preco;
    }
    public void comprar(int x){
        if(x > 0){
            qtdd += x;
        }
    }
    public void vender(int x){
        if (qtdd - x > 0){
            qtdd -= x;
        }
    }

    public void subirPreco(float x){
        if(x > 0){
            preco += x;
        }
    }
    public void descerPreco(float x){
        if(preco - x > 0){
            preco -= x;
        }
    }
    public String mostrar(){
        return "ID: " + this.id + "\nQuantidade: " + this.qtdd + "\nDescrição: " + this.descricao + "\nPreço: R$" + this.preco;
    }
}
