package Bebidas;

import java.util.*;

import Excecoes.BebidaExistenteException;
import Excecoes.BebidaInexistenteException;

public class mainTeste {

	public static void main(String[] args) throws BebidaExistenteException, BebidaInexistenteException {
		NegocioBebidas negA = new NegocioBebidas(1); 
		NegocioBebidas negL = new NegocioBebidas(0);
		
		
		Bebidas teste = new Bebidas("Tequila", "12 anos", 'G', 10 );
		Bebidas teste1 = new Bebidas("Tequila", "12 anos", 'G', -1);
		
		negL.inserir(teste);
		negL.atualizar(teste1);
		Bebidas b = negL.procurar(teste);
		System.out.println(b.getPreco());
		
		

			
//			System.out.println("Digite o Tipo:");
//			auxTipo = in.next();
//			
//			System.out.println("Digite o Sabor:");
//			auxSabor = in.next();
//			
//			System.out.println("Digite o Tamanho:");
//			auxTam = (in.next().charAt(0));
//			
//			System.out.println("Digite o Preco:");
//			auxPreco = in.nextInt();
			
			
			//Bebidas aux = new Bebidas();
		}
	
	}


