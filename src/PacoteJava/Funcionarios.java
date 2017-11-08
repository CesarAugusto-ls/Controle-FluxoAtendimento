package PacoteJava;

/**
 *
 * @author cesilva
 */
public class Funcionarios {
    
    private int ID;
    private String Nome;
    private String HorEntrada;
    private String HorSaida;
    private String Status;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getHorEntrada() {
        return HorEntrada;
    }

    public void setHorEntrada(String HorEntrada) {
        this.HorEntrada = HorEntrada;
    }

    public String getHorSaida() {
        return HorSaida;
    }

    public void setHorSaida(String HorSaida) {
        this.HorSaida = HorSaida;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public int GerarID(){
        int id = 1;
        for (int i = 0; i < Main.Funcionarios.size(); i++) {
            id = Main.Funcionarios.get(i).getID() + 1;
        }
        return id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    
}
