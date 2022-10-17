package fixacao;

import java.util.ArrayList;

public class AnimalMain {
	
	public static void main(String[] args) {
		
	
	
	ArrayList<cachorro> dogs = new ArrayList<>();
		
		cachorro cachorro1 = new cachorro();
		cachorro1.setNome("cachorro 1");
		cachorro1.setNumeroDePatas(4);
		cachorro1.setRaça("alemao");
		cachorro1.setEcossistema("casa");
		cachorro1.setCor("marrom");
		cachorro1.setComprimento(25.0f);
		
		dogs.add(cachorro1);

		
		cachorro cachorro2 = new cachorro();
		cachorro2.setNome("cachorro 2");
		cachorro2.setNumeroDePatas(4);
		cachorro2.setRaça("pincher");
		cachorro2.setEcossistema("casa");
		cachorro2.setCor("marrom");
		cachorro2.setComprimento(9.0f);
		
		dogs.add(cachorro2);

		
		cachorro cachorro3 = new cachorro();
		cachorro3.setNome("cachorro 3");
		cachorro3.setNumeroDePatas(2);
		cachorro3.setRaça("lulu");
		cachorro3.setEcossistema("casa");
		cachorro3.setCor("branco");
		cachorro3.setComprimento(11.0f);
		
		dogs.add(cachorro3);
		
		ArrayList<gato> gatinhos = new ArrayList<>();
		
		gato gato1 = new gato();
		gato1.setNome("Gato 1");
		gato1.setNumeroDePatas(3);
		gato1.setRaça("persa");
		gato1.setEcossistema("casa");
		gato1.setCor("laranja");
		gato1.setComprimento(25.0f);
		
		gatinhos.add(gato1);
		
		gato gato2 = new gato();
		gato2.setNome("Gato 2");
		gato2.setNumeroDePatas(4);
		gato2.setRaça("branco");
		gato2.setEcossistema("casa");
		gato2.setCor("branco");
		gato2.setComprimento(20.0f);
		
		gatinhos.add(gato2);

		
		gato gato3 = new gato();
		gato3.setNome("Gato 3");
		gato3.setNumeroDePatas(2);
		gato3.setRaça("preto");
		gato3.setEcossistema("rua");
		gato3.setCor("preto");
		gato3.setComprimento(19.0f);

		gatinhos.add(gato3);
		
		
			
		for (cachorro cachorro : dogs) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getNumeroDePatas());
			System.out.println(cachorro.getRaça());
			System.out.println(cachorro.getEcossistema());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getComprimento());
			cachorro.late();
			
			
			for (gato gato : gatinhos) {
				System.out.println(gato.getNome());
				System.out.println(gato.getNumeroDePatas());
				System.out.println(gato.getRaça());
				System.out.println(gato.getEcossistema());
				System.out.println(gato.getCor());
				System.out.println(gato.getComprimento());
				gato.mia();
				
		}

	}
	
	}
	
}
