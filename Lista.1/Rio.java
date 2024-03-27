public class Rio {
    public float nivel;
    public String nome;
    public boolean poluido;

    public Rio(){}

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x){
        if (x > 0) {
            this.nivel += x;
        }
    }
    public void ensolarar(float x) {
        if (x > 0) {
            if (this.nivel - x > 0) {
                this.nivel -= x;
            }
        }
    }
    public void limpar(boolean x){
        this.poluido = true;
    }
    public void sujar(boolean x){
        this.poluido = false;
    }
    public String mostrar(){
        return "Nome do rio: " + this.nome + "\nNível do rio: " + this.nivel + "\nSituação do rio: " + this.poluido + "\n";
    }
}
