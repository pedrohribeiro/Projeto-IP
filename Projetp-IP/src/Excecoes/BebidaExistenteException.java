package Excecoes;

public class BebidaExistenteException extends Exception {
	
	public BebidaExistenteException() {
		super("Bebida já cadastrada no Sistema!");
	}

}
