package br.ufpb.dcx.ayla.agenda.gui;

import br.ufpb.dcx.ayla.agenda.Agenda;
import br.ufpb.dcx.ayla.agenda.AgendaAyla;
import br.ufpb.dcx.ayla.agenda.controller.AgendaAddController;
import br.ufpb.dcx.ayla.agenda.controller.AgendaRemoveController;
import br.ufpb.dcx.ayla.agenda.controller.AgendaSearchController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaGUIV3 extends JFrame{
    JLabel linha1, linha2;
    ImageIcon boloIm = new ImageIcon("./imgs/icone.jpg");
    ImageIcon addImg = new ImageIcon("./imgs/add_person.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/search_person.png");
    ImageIcon removeImg= new ImageIcon("./imgs/remove_person.png");
    JButton botaoAdicionar, botaoRemover, botaoPesquisar;
    Agenda agenda = new AgendaAyla();
    public AgendaGUIV3(){
        setTitle("Agenda de Aniversario");
        setSize(1000, 800);
        setLocation(150,150);
        setResizable(true);
        getContentPane().setBackground(Color.WHITE);
        linha1 = new JLabel("Minha Agenda de Aniversario",JLabel.CENTER);
        linha1.setForeground(Color.BLACK);
        linha1.setFont(new Font("Serif",Font.BOLD,26));
        linha2 = new JLabel(boloIm,JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar",addImg);
        botaoAdicionar.addActionListener(new AgendaAddController(agenda, this));
        botaoPesquisar = new JButton("Pesquisar",pesqImg);
        botaoPesquisar.addActionListener(new AgendaSearchController(agenda, this));
        botaoRemover = new JButton("Remover", removeImg);
        botaoRemover.addActionListener(new AgendaRemoveController(agenda, this));
        setLayout(new GridLayout(3, 2));
        add(linha1);
        add(botaoAdicionar);
        add(linha2);
        add(botaoPesquisar);
        add(new JLabel());
        add(botaoRemover);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUIV3();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }
}
