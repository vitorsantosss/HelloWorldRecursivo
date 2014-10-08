import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] linha = sc.nextLine().split(" ");
		int q = Integer.parseInt(linha[0]);
		int t = Integer.parseInt(linha[1]);
		int s = Integer.parseInt(linha[2]);
		String[] variaveis = sc.nextLine().split(" ");
		String[] terminais = sc.nextLine().split(" ");
		Map<String, ArrayList<String>> regras = new HashMap<String, ArrayList<String>>();
		for(int i = 0; i < s; i++){
			String[] regra = sc.nextLine().split(" ");
			if(!regras.containsKey(regra[0])){
				regras.put(regra[0], new ArrayList<String>());
			}
			for(int j = 2; j < regra.length; j++){
				regras.get(regra[0]).add(regra[j]);
			}	
		}
	}
	
	public static void printList(ArrayList<?> array){
		for(int i = 0; i < array.size(); i++){
			if(array.get(i) instanceof ArrayList){
				printList((ArrayList) array.get(i));
				System.out.println();
			}else{
				System.out.print(array.get(i));
			}
		}
	}
	
	public static <T> void printVetor(T[] a){
		for(T b : a){
			System.out.print(b + " ");
		}
		System.out.println();
	}
}
