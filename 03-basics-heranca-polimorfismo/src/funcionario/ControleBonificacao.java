package funcionario;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario){
        this.soma = this.soma + funcionario.getBonificacao();
    }

    public double getSoma() {
        return soma;
    }
}

