package br.ufpb.dcx.ayla.agenda;

import java.io.IOException;
import java.util.Collection;

public interface Agenda {
    public boolean cadastraContato(String nome, int dia, int mes);
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes);
    public boolean removeContato(String nome);
    public void salvarDados() throws IOException;
    public void recuperarDados() throws IOException;
}
