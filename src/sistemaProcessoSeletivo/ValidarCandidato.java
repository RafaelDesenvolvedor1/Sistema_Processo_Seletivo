package sistemaProcessoSeletivo;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ValidarCandidato {

    public static void main(String[] args) {
        ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
        
        candidatos.add(new Candidato("Rafael Santos", "11 991427214"));
        candidatos.add(new Candidato("Cleiton Santos", "11 996578912"));
        candidatos.add(new Candidato("Miguel Diaz", "11 11111111"));
        candidatos.add(new Candidato("Max Vianna", "11 11111111"));
        candidatos.add(new Candidato("Ramon Bueno", "11 11111111"));
        candidatos.add(new Candidato("Madara Uchiha", "11 11111111"));
        candidatos.add(new Candidato("Mano Menezes", "11 11111111"));
        candidatos.add(new Candidato("Abel Ferreira", "11 11111111"));
        
        for(Candidato candidatoSelecionado : candidatos){
            candidatoSelecionado.setSalarioPretendido(valorPretendido());
        }
        
        selecaoCandidatos(candidatos, 2000.0);
    }
    
    static void selecaoCandidatos(ArrayList<Candidato> candidatosList, double salarioBase){
        
        ArrayList<Candidato> candidatosSelecionados = new ArrayList<Candidato>();
        
        for(Candidato candidatoAtual : candidatosList){
            String candidatoNome = candidatoAtual.getNome();
            double salarioPretendido = candidatoAtual.getSalarioPretendido();
            
            System.out.println("O candidato " + candidatoNome +
                    " Solicitou este valor de salario " + String.format("%.2f", salarioPretendido));
            
            if(salarioBase >= salarioPretendido && candidatosSelecionados.size() < 5){
                System.out.println("O candidato " + candidatoNome + " foi selecionado para a vaga");
                candidatosSelecionados.add(candidatoAtual);
            }
        }
        
    }
    
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
    
}
