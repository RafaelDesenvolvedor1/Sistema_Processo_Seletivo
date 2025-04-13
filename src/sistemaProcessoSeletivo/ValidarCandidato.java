package sistemaProcessoSeletivo;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ValidarCandidato {

    public static void main(String[] args) {
        ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
        
        Candidato c1 = new Candidato("Rafael Santos", "11 991427214");
        Candidato c2 = new Candidato("Cleiton Santos", "11 996578912");
        Candidato c3 = new Candidato("Miguel Diaz", "11 11111111");
        Candidato c4 = new Candidato("Max Vianna", "11 11111111");
        
        candidatos.add(c1);
        candidatos.add(c2);
        candidatos.add(c3);
        candidatos.add(c4);
        
        for(Candidato candidatoSelecionado : candidatos){
            candidatoSelecionado.setSalarioPretendido(valorPretendido());
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
