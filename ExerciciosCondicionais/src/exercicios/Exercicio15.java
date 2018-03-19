package exercicios;

public class Exercicio15 {
	
	
	private String name1;
	private String name2;
	
	
	public String getNome1() {
		return name1;
	}
	
	public void setNome1(String name1) {
		this.name1 = name1;
	}
	
	public String getNome2() {
		return name2;
	}
	
	public void setNome2(String name2) {
		this.name2 = name2;
	}
	
	public void Comparacao(String name1, String name2) {
			char array[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
			String primeiraLetra = name1.substring(0,1);
//			System.out.println(primeiraLetra);
			String primeiraLetra2 = name2.substring(0,1);
			
			for(int i=0; i<=array.length; i++) {
				
//				System.out.println(primeiraLetra);
//				System.out.println(array[i]);
				
				String converteChar = Character.toString(array[i]);
				
//				System.out.println(converteChar);
				
				if(primeiraLetra.equals(converteChar)) {
					
//					System.out.println("cheguei");
					System.out.println(name1);
					System.out.println(name2);
					break;
					// continue;
				}else if(primeiraLetra2.equals(converteChar)){
//					System.out.println(array[i]);
					
					System.out.println(name2);
					System.out.println(name1);
					break;
					// continue;
				}
			}
	}
	

	public static void main(String[] args) {
//		char array[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//		System.out.println(array[0]);
		
		Exercicio15 teste = new Exercicio15();
		
		teste.Comparacao("Amanda", "Zeus");
		
	}

}
