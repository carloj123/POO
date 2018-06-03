

import java.util.ArrayList;
import java.util.List;

public class Testes {

	public static void impRelatorio(List<Pessoa> lst,Verificador<Pessoa> v) {
		for(int i=0;i<lst.size();i++) {
			if (v.verifica(lst.get(i)) == true) {
				System.out.println(lst.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		List<Pessoa> lst = new ArrayList(20);
		lst.add(new Pessoa("Huguinho", 21, Sexo.MASC));
		lst.add(new Pessoa("Fefo", 19, Sexo.MASC));
		lst.add(new Pessoa("Gabriela", 17, Sexo.FEM));
		lst.add(new Pessoa("Henrique", 18, Sexo.MASC));
		lst.add(new Pessoa("Madu", 20, Sexo.FEM));
		lst.add(new Pessoa("Gesiel", 36, Sexo.FEM));

		System.out.println("Todos os homens");
		impRelatorio(lst,new SoHomens());
		
		System.out.println("Todos as mulheres");
		impRelatorio(lst,new Verificador<Pessoa>(){
			public boolean verifica(Pessoa p) {
				if (p.getSexo() == Sexo.FEM) {
					return true;
				}else {
					return false;
				}
			}
		});

		System.out.println("Todos maior de 18");
		impRelatorio(lst,new Verificador<Pessoa>(){
			public boolean verifica(Pessoa p) {
				if (p.getIdade() > 18) {
					return true;
				}else {
					return false;
				}
			}
		});
		
		
		// Usando lambdas
		System.out.println("\nMenores de 25 usando lambda");
		impRelatorio(lst,(Pessoa p)->p.getIdade()<25);
		
		System.out.println("\nMeninas maiores de 18 usando lambda");
		impRelatorio(lst,(Pessoa p)->p.getIdade()>18 && p.getSexo() == Sexo.FEM);
		
	}

}
