public class Ex04 {
	public static char[] vet;

	public static void execute(Integer num) {
		// Cada dígito vai para uma posição do vetor de char
		char[] charVet = String.valueOf(num).toCharArray();
		vet = new char[charVet.length * 2];
		for (int i = 0; i < charVet.length; i++) {
			vet[i] = charVet[i];
		}

		for (int i = 0; i < charVet.length; i++) {
			vet[i + charVet.length] = charVet[i];
		}

		char[] result = new char[charVet.length / 2];
		for (int i = 0; i < result.length; i++) {
			result[i] = vet[i * 2];
		}
		for(char c : result){
			System.out.println(c);
		}
		System.err.println("");
	}
	
	public static void main(String[] args) {
		Ex04.execute(169436);
	}

}
