

public class Ex08 {
	
	public static void execute(Integer ii){
		char[] c = String.valueOf(ii).toCharArray();
		int j = 0;
		
		for(char cc : c){
			int i = Integer.parseInt(String.valueOf(cc));
			if(i > j)
				j = 1;
			else
				j--;
		}
		System.out.println(j);
	}

}
