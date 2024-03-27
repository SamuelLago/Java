public class TestaAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(24791, "Samuel", 18, 7,8.5f);
        Aluno obj2 = new Aluno(24754, "Batarra", 17, 4,6);
        System.out.println("Nota: " + obj1.notaFinal());
        obj1.dadosAluno();
        System.out.println("Nota: " + obj2.notaFinal());
        obj2.dadosAluno();
    }
}
