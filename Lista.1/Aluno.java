public class Aluno {
    public int numAluno, idade;
    public String nome;
    public float p1, p2;

    public Aluno(int numAluno, String nome, int idade, float p1, float p2) {
        this.numAluno = numAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return (p1 + p2) / 2;
    }
    public void dadosAluno(){
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nNumero do aluno: " + this.numAluno + "\nResultado: " + resultado() + "\n");
    }

  /*  public void resultado(){
        if (notaFinal() > 6){
            System.out.println("Passou");
        }
        else{
            System.out.println("Não passou");
        }
    }
    */
  public String resultado(){
      if (notaFinal() > 6){
          return "Passou";
      }
      else{
          return "Não passou";
      }
  }
}
