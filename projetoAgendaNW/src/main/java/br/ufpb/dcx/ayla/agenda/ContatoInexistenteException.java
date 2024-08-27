package br.ufpb.dcx.ayla.agenda;

public class ContatoInexistenteException extends Exception{
    public ContatoInexistenteException(String ms){
        super(ms);
    }
    public ContatoInexistenteException(){
        super(("Contado inexistente"));
    }
}
