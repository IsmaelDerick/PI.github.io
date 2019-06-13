package Classes;

import java.util.List;

public class BemRN {

	public void excluir(Bem bem) {
		new BemDAO().delete(bem);
	}

	public void gravar(Bem bem) {
		if (bem.getId() == null) {
			new BemDAO().insert2(bem);;
		} else {
			new BemDAO().update2(bem);
		}
	}
	public void editar(Bem bem) {				

			new BemDAO().update1(bem);		
	}
	public void baixa(Bem bem) {
		if (bem.getId() == null) {
			new BemDAO().insert(bem);;
		} else {
			new BemDAO().update(bem);
		}
	}

	public List<Bem> selectAll() {
		return new BemDAO().selectAll();
	}
	
}
