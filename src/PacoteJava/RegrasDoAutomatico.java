package PacoteJava;

/**
 *
 * @author cesilva
 */
public class RegrasDoAutomatico {

    public void RegraOitoHoras() {
        Main.AtendimentoExterno.clear();
        Main.AtendimentoGrupo.clear();

        for (int i = 0; i < Main.Funcionarios.size(); i++) {
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("08") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoGrupo.add(Main.Funcionarios.get(i));
            }
        }
        AtualizarTXT atTXT = new AtualizarTXT();
        atTXT.AtualizaTXTAtendimentoExterno();
        atTXT.AtualizaTXTAtendimentoGrupo();
    }

    public void RegraOnzeHoras() {
        Main.AtendimentoExterno.clear();
        Main.AtendimentoGrupo.clear();

        for (int i = 0; i < Main.Funcionarios.size(); i++) {
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("08") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoExterno.add(Main.Funcionarios.get(i));
            }
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("11") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoGrupo.add(Main.Funcionarios.get(i));
            }
        }
        AtualizarTXT atTXT = new AtualizarTXT();
        atTXT.AtualizaTXTAtendimentoExterno();
        atTXT.AtualizaTXTAtendimentoGrupo();
    }

    public void RegraDozeHoras() {
        Main.AtendimentoExterno.clear();
        Main.AtendimentoGrupo.clear();

        for (int i = 0; i < Main.Funcionarios.size(); i++) {
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("08") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")
                    || Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("11") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoExterno.add(Main.Funcionarios.get(i));
            }
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("12") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoGrupo.add(Main.Funcionarios.get(i));
            }
        }
        AtualizarTXT atTXT = new AtualizarTXT();
        atTXT.AtualizaTXTAtendimentoExterno();
        atTXT.AtualizaTXTAtendimentoGrupo();
    }

    public void RegraQuatorzeHoras() {
        Main.AtendimentoExterno.clear();
        Main.AtendimentoGrupo.clear();

        for (int i = 0; i < Main.Funcionarios.size(); i++) {
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("11") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")
                    || Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("12") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoExterno.add(Main.Funcionarios.get(i));
            }
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("14") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoGrupo.add(Main.Funcionarios.get(i));
            }
        }
        AtualizarTXT atTXT = new AtualizarTXT();
        atTXT.AtualizaTXTAtendimentoExterno();
        atTXT.AtualizaTXTAtendimentoGrupo();
    }

    public void RegraDezesseteHoras() {
        Main.AtendimentoExterno.clear();
        Main.AtendimentoGrupo.clear();

        for (int i = 0; i < Main.Funcionarios.size(); i++) {
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("12") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoExterno.add(Main.Funcionarios.get(i));
            }
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("14") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoGrupo.add(Main.Funcionarios.get(i));
            }
        }
        AtualizarTXT atTXT = new AtualizarTXT();
        atTXT.AtualizaTXTAtendimentoExterno();
        atTXT.AtualizaTXTAtendimentoGrupo();
    }

    public void RegraDezoitoHoras() {
        Main.AtendimentoExterno.clear();
        Main.AtendimentoGrupo.clear();

        for (int i = 0; i < Main.Funcionarios.size(); i++) {
            if (Main.Funcionarios.get(i).getHorEntrada().equalsIgnoreCase("14") && Main.Funcionarios.get(i).getStatus().equalsIgnoreCase("Ativo")) {
                Main.AtendimentoExterno.add(Main.Funcionarios.get(i));
            }
        }
        AtualizarTXT atTXT = new AtualizarTXT();
        atTXT.AtualizaTXTAtendimentoExterno();
        atTXT.AtualizaTXTAtendimentoGrupo();
    }
    public void RegraForaHorario() {
        Main.AtendimentoExterno.clear();
        Main.AtendimentoGrupo.clear();
        
        Funcionarios fun = new Funcionarios();
        fun.setNome("Fora do Horario de Atendimento.<br>Horario: 08:00h as 20:00h");
        
        AtualizarTXT atTXT = new AtualizarTXT();
        atTXT.AtualizaTXTAtendimentoExterno();
        atTXT.AtualizaTXTAtendimentoGrupo();
    }
}