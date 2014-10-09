import java.util.*;
public class Main {
	
	public boolean isChomsky(String [] variaveis, String [] regra){
		if(variaveis[0].equals("S")) return false;
		
		for(int i = 0; i < regra.length; i++) //variavel inicial S nao pode aparecer do lado direito de nenhuma regra
			if(regra[i].endsWith("S")) return false;
		
		for(int i = 1; i < variaveis.length; i++) //somente variavel inicial pode conter regra S->vazio
			if(variaveis[i].contentEquals("S")) return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] linha = sc.nextLine().split(" ");
		int q = Integer.parseInt(linha[0]); //numero de variaveis
		int t = Integer.parseInt(linha[1]); //numero de simbolos terminais
		int s = Integer.parseInt(linha[2]); //numero de regras de substituicao
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
