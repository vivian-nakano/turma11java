package lista6interface_poli;

public class TesteAnimal {

	public static void main(String[] args) {

		Preguica preg = new Preguica ();
		preg.setNome("Sorrisinho");
		preg.setIdade(1);
		preg.setSom("Aaaaaah aaaah");
		preg.setSubirArvore("shiiiiiiiz shiiiiiz");
		
		System.out.println(preg.getNome());
		System.out.println(preg.getSubirArvore());
		System.out.println(preg.getSom());
	
		Cavalo cav = new Cavalo ();
		cav.setNome("Potrinho");
		cav.setIdade(3);
		cav.setSom("Iiiirra iiirra");
		cav.setCorrer("clooop clooop...");
			
		System.out.println(cav.getNome());
		System.out.println(cav.getCorrer());
		System.out.println(cav.getSom());
		
		Cachorro dog = new Cachorro ();
		dog.setNome("Vessy");
		dog.setIdade(14);
		dog.setSom("Au au au");
		dog.setCorrer("tic tic tic...");
			
		System.out.println(cav.getNome());
		System.out.println(cav.getCorrer());
		System.out.println(cav.getSom());
		
		
		}

	}