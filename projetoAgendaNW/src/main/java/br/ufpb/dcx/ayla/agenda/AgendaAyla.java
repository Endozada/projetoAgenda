package br.ufpb.dcx.ayla.agenda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class AgendaAyla implements Agenda {

    private HashMap<String,Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaAyla() {
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {
        if (!contatos.containsKey(nome)) {
            Contato c = new Contato(nome, dia, mes);
            contatos.put(nome, c);
            return true;
        }
        return false;
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        Collection<Contato> aniversariantes = new ArrayList<>();
        for(Contato c: contatos.values()){
            if(c.getDiaAniversario() == dia && c.getMesAniversario() == mes){
                aniversariantes.add(c);
            }
        } return aniversariantes;
    }

    @Override
    public boolean removeContato(String nome) {
        for(Contato c: contatos.values()){
            if(c.getNome().equals(nome)){
                contatos.remove(nome, c);
                return true;
            }
        } return false;
    }

    @Override
    public void salvarDados() throws IOException {

    }

    @Override
    public void recuperarDados() throws IOException {

    }
}
