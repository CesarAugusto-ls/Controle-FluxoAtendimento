package PacoteJava;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author cesilva
 */
public class AtualizarTXT {

    public void IniciarAplicacaoCarregaTXT() {
        try {
            File arquivo = new File(Main.Caminho2 + "Funcionarios.txt");

            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {

                String linha = br.readLine();

                StringTokenizer token = new StringTokenizer(linha, ";-");

                int ID = Integer.parseInt(token.nextToken());
                String nome = token.nextToken();
                String horentrada = token.nextToken();
                String horsaida = token.nextToken();
                String status = token.nextToken();

                Funcionarios fun = new Funcionarios();
                fun.setID(ID);
                fun.setNome(nome);
                fun.setHorEntrada(horentrada);
                fun.setHorSaida(horsaida);
                fun.setStatus(status);

                Main.Funcionarios.add(fun);

            }

            fr.close();
            br.close();

        } catch (IOException | NumberFormatException e) {
        }
        try {
            File arquivo = new File(Main.Caminho2 + "Grupo.txt");

            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {

                String linha = br.readLine();

                StringTokenizer token = new StringTokenizer(linha, ";-");

                int ID = Integer.parseInt(token.nextToken());
                String nome = token.nextToken();
                String horentrada = token.nextToken();
                String horsaida = token.nextToken();
                String status = token.nextToken();

                Funcionarios fungrupo = new Funcionarios();
                fungrupo.setID(ID);
                fungrupo.setNome(nome);
                fungrupo.setHorEntrada(horentrada);
                fungrupo.setHorSaida(horsaida);
                fungrupo.setStatus(status);

                Main.AtendimentoGrupo.add(fungrupo);
            }

            fr.close();
            br.close();

        } catch (IOException | NumberFormatException e) {
        }
        try {
            File arquivo = new File(Main.Caminho2 + "Externo.txt");

            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {

                String linha = br.readLine();

                StringTokenizer token = new StringTokenizer(linha, ";-");

                int ID = Integer.parseInt(token.nextToken());
                String nome = token.nextToken();
                String horentrada = token.nextToken();
                String horsaida = token.nextToken();
                String status = token.nextToken();

                Funcionarios funexterno = new Funcionarios();
                funexterno.setID(ID);
                funexterno.setNome(nome);
                funexterno.setHorEntrada(horentrada);
                funexterno.setHorSaida(horsaida);
                funexterno.setStatus(status);

                Main.AtendimentoExterno.add(funexterno);
            }

            fr.close();
            br.close();

        } catch (IOException | NumberFormatException e) {
        }

    }

    public void AtualizaTXTAtendimentoExterno() {
        try {

            File arquivo = new File(Main.Caminho + "AtendimentoExterno.txt");

            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < Main.AtendimentoExterno.size(); i++) {
                bw.write("<h3><b>" + Main.AtendimentoExterno.get(i).getNome() + "</b></h3>");
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar no TXT - AtendimentoExterno.txt -", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {

            File arquivo = new File(Main.Caminho2 + "Externo.txt");

            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < Main.AtendimentoExterno.size(); i++) {
                bw.write("" + Main.AtendimentoExterno.get(i).getID());
                bw.write(";-");
                bw.write(Main.AtendimentoExterno.get(i).getNome());
                bw.write(";-");
                bw.write(Main.AtendimentoExterno.get(i).getHorEntrada());
                bw.write(";-");
                bw.write(Main.AtendimentoExterno.get(i).getHorSaida());
                bw.write(";-");
                bw.write(Main.AtendimentoExterno.get(i).getStatus());
                bw.write(";-");
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar no TXT - Externo.txt -", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void AtualizaTXTAtendimentoGrupo() {
        try {

            File arquivo = new File(Main.Caminho + "AtendimentoGrupo.txt");

            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < Main.AtendimentoGrupo.size(); i++) {
                bw.write("<h3><b>" + Main.AtendimentoGrupo.get(i).getNome() + "</h3></b>");
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar no TXT - AtendimentoGrupo.txt -", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {

            File arquivo = new File(Main.Caminho2 + "Grupo.txt");

            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < Main.AtendimentoGrupo.size(); i++) {
                bw.write("" + Main.AtendimentoGrupo.get(i).getID());
                bw.write(";-");
                bw.write("" + Main.AtendimentoGrupo.get(i).getNome());
                bw.write(";-");
                bw.write("" + Main.AtendimentoGrupo.get(i).getHorEntrada());
                bw.write(";-");
                bw.write("" + Main.AtendimentoGrupo.get(i).getHorSaida());
                bw.write(";-");
                bw.write("" + Main.AtendimentoGrupo.get(i).getStatus());
                bw.write(";-");
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar no TXT - Grupo.txt -", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AtualizaFuncionarios() {

        try {

            File arquivo = new File(Main.Caminho2 + "Funcionarios.txt");

            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < Main.Funcionarios.size(); i++) {
                bw.write("" + Main.Funcionarios.get(i).getID());
                bw.write(";-");
                bw.write("" + Main.Funcionarios.get(i).getNome());
                bw.write(";-");
                bw.write("" + Main.Funcionarios.get(i).getHorEntrada());
                bw.write(";-");
                bw.write("" + Main.Funcionarios.get(i).getHorSaida());
                bw.write(";-");
                bw.write("" + Main.Funcionarios.get(i).getStatus());
                bw.write(";-");
                bw.newLine();
            }
            bw.close();
            fw.close();
            
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar no TXT - Funcionarios.txt -", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
