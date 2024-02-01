public class Aluno {
//Atributos
    public String nome, materia;
    public int fone;

//Eu sei que não precisa, mas vou por um constructor aqui pra ficar legal
    public Aluno(String nome, String materia, int fone) {
        this.nome = nome;
        setMateria(materia);
        this.fone = fone;
    }

    //Métodos
    public void estudar(){
        System.out.println("Olá, eu sou "+ nome +" e estou estutando " + getMateria() + "!");
    }

//Getters e os Setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }
}
