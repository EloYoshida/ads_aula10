package ads.pipoca.model.entity;

import java.util.Date;

public class Compra {
	private Date dataCompra;
	private String usuario;
	private Filme filme;
	
	public Date getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Compra [dataCompra=" + dataCompra + ", usuario=" + usuario +", "+this.filme +"]";
	}
}
