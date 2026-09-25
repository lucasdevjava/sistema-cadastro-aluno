import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList();
        Scanner sc = new Scanner(System.in);


       int escolha;
        do {
            
            
            System.out.println("Digite [0] para sair \nDigite [1] para cadastrar aluno \nDigite [2] para listar todos os alunos \nDigite [3] para buscar aluno por matricula \nDigite [4] para remover um aluno");
            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha) {

                case 0: {

                    System.out.println("Sistema foi encerrado.");
                    break;

                }
                case 1: {

                    System.out.println("Digite aqui o nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    System.out.println("Digite aqui a idade do aluno: ");
                    int idadeAluno = sc.nextInt();
                    alunos.add(new Aluno(nomeAluno,idadeAluno));

                    break;

                }
                case 2: {

                    for (Aluno mostrarAlunos:alunos) {

                        System.out.println(mostrarAlunos);

                    }
                    break;

                }
                case 3: {

                    System.out.println("Digite aqui a matricula do aluno para busca:");
                    int matriculaBusca = sc.nextInt();
                    
                    for (Aluno buscaMatricula:alunos) {

                        if (buscaMatricula.getMatricula() == matriculaBusca) {

                            System.out.println(buscaMatricula);
                            break;
                            

                        }                    
                    }
                    break;
                }
                case 4: {

                    System.out.println("Digite a matricula do aluno");
                    int matriculaBusca = sc.nextInt();

                    for(int i = 0; i < alunos.size(); i++) {

                        if (alunos.get(i).getMatricula() == matriculaBusca) {

                            System.out.println("REMOVIDO");
                            System.out.println(alunos.get(i).toString());
                            alunos.remove(i);
                            break;

                        }

                    }
                    break;


                }
                default: {

                    System.out.println("Erro");
                    break;

                }


            } 
            

        } while (escolha != 0);

        


    }
    
}
