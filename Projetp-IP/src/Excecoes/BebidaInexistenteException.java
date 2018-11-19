package Excecoes;

public class BebidaInexistenteException extends Exception{
	
	public BebidaInexistenteException() {
		super("Essa bebida não está cadastrada no Sistema!");
	}

}
