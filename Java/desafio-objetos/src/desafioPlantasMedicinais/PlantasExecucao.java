package desafioPlantasMedicinais;

import java.util.*;
import desafioPlantasMedicinais.Camomila;
import desafioPlantasMedicinais.EspinheiraSanta;
import desafioPlantasMedicinais.Hibisco;
import desafioPlantasMedicinais.Hortela;
import desafioPlantasMedicinais.Plantas;


public class PlantasExecucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Camomila> listarCamomila = new ArrayList<> ();
		List<Hibisco> listarHibisco = new ArrayList<> ();
		List<EspinheiraSanta> listarEspinheiraSanta = new ArrayList<> ();
		List<Hortela> listarHortela = new ArrayList<> ();
		
		Scanner tec = new Scanner (System.in);
		
		String nomePopular="", nomeCientifico="", indicacoes=""; 
		double preco=0;
		int escolha = 0;
		
		System.out.println("======== CENTRAL DAS PLANTAS MEDICINAIS ========");
		System.out.println("Olá, boas vindas ao nosso catálogo para auxiliar sua saúde por meio das plantas medicinais!");
		
		System.out.println("Você tem sentido algo? Espero que realmente não!\nPorém, caso eventualmente sinta algum desses sintomas, selecione a opção e te auxiliaremos.");
		System.out.println("Selecione:\n [1] Ansioso(a) demais? \n [2] Dores chatinhas na cabeça/musculares \n [3] Falta de energia\n [4] Estômago meio borocoxô");
		System.out.print("\n=======> ");
		escolha = tec.nextInt();

		/*
		listarCamomila.add(new Camomila("Camomila, Camomila comum", "Matricaria recutita", 8.00,"Erva Cidreira, Folhas de abacateiro, Jasmin"));
		listarHibisco.add(new Hibisco("Hibisco, Mimo de vênus", "Hibiscus rosa-sinensis", 7.00 ,"Chá verde, chá mate, gengibre"));
		listarEspinheiraSanta.add(new EspinheiraSanta("Espinheira-santa, espinheira-divina ", "Monteverdia truncata", 9.00,"Malva, boldo"));
		listarHortela.add(new Hortela("Hortelã, hortelã de cheiro", "Mentha spicata", 4.00,"Gengibre, cúrcuma, carqueja"));
		*/
		
		Camomila cam = new Camomila ("Camomila, Camomila comum", "Matricaria recutita", 8.00,"Erva Cidreira, Folhas de abacateiro, Jasmin");
		Hibisco hib = new Hibisco ("Hibisco, Mimo de vênus", "Hibiscus rosa-sinensis", 7.00 ,"Chá verde, chá mate, gengibre");
		EspinheiraSanta es = new EspinheiraSanta ("Espinheira-santa, espinheira-divina ", "Monteverdia truncata", 9.00,"Malva, boldo");
		Hortela hor = new Hortela ("Espinheira-santa, espinheira-divina ", "Monteverdia truncata", 9.00,"Malva, boldo");
		
		do {
		
		
		if (escolha == 1) {
			System.out.println("\nVocê selecionou **Ansiedade**");
			System.out.println("\nTe recomendarei uma planta especial e outras informações!");
			
			System.out.println("O nome popular da planta recomendada é "+cam.getNomePopular());
			System.out.println("Nome científico: "+cam.getNomeCientifico());
			System.out.println("Preço aproximado de 100g: "+cam.getPreco());
			System.out.println("Outras plantas utilizadas para o sintoma: "+cam.getIndicacoes());
		
		} else if (escolha == 2) {
			
		System.out.println("\nVocê selecionou **Dores chatinhas na cabeça ou musculares**");
		System.out.println("\nTe recomendarei uma planta especial e outras informações!");
		
		System.out.println("O nome popular da planta recomendada é "+hor.getNomePopular());
		System.out.println("Nome científico: "+hor.getNomeCientifico());
		System.out.println("Preço aproximado de 100g: "+hor.getPreco());
		System.out.println("Outras plantas utilizadas para o sintoma: "+hor.getOutras());
		
		} else if (escolha == 3) {
			
		System.out.println("\nVocê selecionou **Falta de energia!!!**");
		System.out.println("\nTe recomendarei uma planta especial e outras informações!");
			
		System.out.println("O nome popular da planta recomendada é "+hib.getNomePopular());
		System.out.println("Nome científico: "+hib.getNomeCientifico());
		System.out.println("Preço aproximado de 100g: "+hib.getPreco());
		System.out.println("Outras plantas utilizadas para o sintoma: "+hib.getCaracteristicas());
			
		} else if (escolha == 4) {
			
		System.out.println("\nVocê selecionou **Estômogo meio borocoxô**");
		System.out.println("\nTe recomendarei uma planta especial e outras informações!");
			
		System.out.println("O nome popular da planta recomendada é "+es.getNomePopular());
		System.out.println("Nome científico: "+es.getNomeCientifico());
		System.out.println("Preço aproximado de 100g: "+es.getPreco());
		System.out.println("Outras plantas utilizadas para o sintoma: "+es.getCuriosidades());
			
		}
		
		} while (escolha != 1 && escolha != 2 && escolha !=3 && escolha !=4);
		
		System.out.println("\nObrigada por consultar nosso banco de dados das plantas medicinais!");
		System.out.println("Desejamos o melhor para você sempre <3");	
	}

}
