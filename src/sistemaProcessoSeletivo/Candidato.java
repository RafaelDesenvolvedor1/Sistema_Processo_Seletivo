package sistemaProcessoSeletivo;

public class Candidato {
    private String nome;
    private double salarioPretendido;
    private String telefone;
    private boolean selecionado;
    private boolean atendeu;
    
    public Candidato(){}
    
    public Candidato(String n, String tel){
        this.nome = n;
        this.telefone = tel;
    }
    
    public void ligar(){
        
    }
    
    public String imprimirDadosCandidato() {
        
    return "Candidato \n" + 
            "nome: " + nome + 
            "\nsalarioPretendido: " + salarioPretendido +
            "\ntelefone: " + telefone + 
            "\nselecionado: " + selecionado + 
            "\n ----------";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioPretendido() {
        return salarioPretendido;
    }

    public void setSalarioPretendido(double salarioPretendido) {
        if(salarioPretendido < 0){
            this.salarioPretendido = 0;
        }else{
            this.salarioPretendido = salarioPretendido;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }

    public boolean isAtendeu() {
        return atendeu;
    }

    public void setAtendeu(boolean atendeu) {
        this.atendeu = atendeu;
    }
    
    
}
