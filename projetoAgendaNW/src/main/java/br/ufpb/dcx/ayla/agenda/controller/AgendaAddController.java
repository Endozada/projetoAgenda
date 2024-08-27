package br.ufpb.dcx.ayla.agenda.controller;

import br.ufpb.dcx.ayla.agenda.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaAddController implements ActionListener {
    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaAddController(Agenda agenda, JFrame janela){
        this.agenda = agenda;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,"Qual o nome do aniversariante ?");
        int dia = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"Qual o dia do mes em que nasceu ? [1-31]"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o mes em que nasceu ? [1-12"));
        boolean cadastrou = agenda.cadastraContato(nome, dia, mes);
        if(cadastrou){
            JOptionPane.showMessageDialog(janelaPrincipal,"Anivesariante cadastrado");
        }else{
            JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariante nao foi cadastrado."+"Verifique se ja nao existia");
        }
    }
}
