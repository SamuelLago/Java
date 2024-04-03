package aluno;
public class Aluno {
    private int idade;
    private String nome, numeroAluno;
    private float p1, p2;

    public Aluno() {}
    public Aluno(String numeroAluno, int idade, String nome, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }
    public String getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(String numeroAluno) {
        if(numeroAluno.length() == 6) {
            this.numeroAluno = numeroAluno;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 29) {
            this.nome = nome;
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (idade > 0) {
            this.p1 = p1;
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 > 0) {
            this.p2 = p2;
        }
    }
    public float notafinal(){
        return (p1+p2)/2;
    }
    public String dadosAluno() {
        return "Aluno{" + "numeroAluno=" + this.numeroAluno + ", idade=" + this.idade + ", nome='" + this.nome + '\'' + '}';
    }
}
