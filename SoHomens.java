

public class SoHomens implements Verificador<Pessoa> {

	@Override
	public boolean verifica(Pessoa p) {
		if (p.getSexo() == Sexo.MASC) {
			return true;
		}else {
		    return false;
		}
	}
}
