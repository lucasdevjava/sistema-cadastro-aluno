public class Aluno extends Pessoa {

    private static int contadorMatricula;
    private int matricula;
    private String situacao;
    private double media;

    public Aluno(String nome,int idade) {

        super(nome,idade);
        contadorMatricula +=1;
        this.matricula = contadorMatricula;
        

    }
    public void calcularMedia(double somaTotal, int quantidade) {

        this.media = somaTotal/quantidade;
        
    }
    public int getMatricula() {

        return this.matricula;

    }
    public double getMedia() {

        return this.media;

    }
    public String getSituacao() {

        if (getMedia()>=7 && getMedia()<=10) {

            this.situacao = "Aprovado com %.2f".formatted(getMedia());
            return this.situacao;

        }
        else if (getMedia()>=4) {

            double pontosAprovacao = 7 - getMedia();
            this.situacao = "Em recuperação com %.2f \nFalta de %.2f pontos para alcançar a média de 7 pontos".formatted(getMedia(),pontosAprovacao);
            return this.situacao;

        }
        else if (getMedia()<4 && getMedia()>=0) {

            this.situacao ="Reprovado com %.2f pontos".formatted(getMedia()); 
            return this.situacao;

        }
        else {

            return "Erro, nota inválida, inferior a 0 ou superior a 10";

        }}

        @Override 
        public String toString() {

            return "Nome %s \nIdade: %d \nMatricula %d\nMedia %.2f \nSituação: %s".formatted(getNome(),getIdade(),getMatricula(),getMedia(),getSituacao());

        }

    }
    

