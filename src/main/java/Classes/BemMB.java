package Classes;

import java.io.Serializable;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "bemMB")
@RequestScoped
public class BemMB implements Serializable {

    private static final long serialVersionUID = 1L;
    private Bem bem = new Bem();
    private List<Bem> listaBems = null;

    public String actionNovo() {
        this.bem = new Bem();
        return "Gravar";
    }

    public String actionExcluir() {
        new BemRN().excluir(bem);
        this.listaBems = null;
        return "Lista";
    }

    public String actionVoltar() {
        return "Lista";
    }

    public String actionCalc() {
        return "Depreciacao";
    }

    public String actionGravar() {
        new BemRN().gravar(bem);
        this.listaBems = null;
        return "Lista";
    }

    public String actionVender() {
        new BemRN().baixa(bem);
        this.listaBems = null;
        return "Lista";
    }

    public String actionEditar() {
        new BemRN().editar(bem);
        this.listaBems = null;
        return "Lista";
    }

    public List<Bem> getSelectAll() {
        if (this.listaBems == null) {
            this.listaBems = new BemRN().selectAll();
        }
        return this.listaBems;
    }

    public Bem getBem() {
        return bem;
    }

    public void setBem(Bem bem) {
        this.bem = bem;
    }
}
