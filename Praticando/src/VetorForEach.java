
public class VetorForEach {

	public static void main(String[] args) {
		
		
		String[] vetor = new String[]{"Weslley", "Clarice", "Nicooly", "Gabriela"};

		for (String string : vetor) {
			System.out.println(string);
		}
		
		System.out.println("------------------ ");
		
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
