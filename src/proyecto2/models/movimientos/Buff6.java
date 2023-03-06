package proyecto2.models.movimientos;

import proyecto2.models.MovimientoBase;
import proyecto2.models.Personaje;
import proyecto2.models.Realizable;

public class Buff6 extends MovimientoBase implements Realizable{

	public Buff6() {//mejora def
		super("Resistencia de hierro", "un brillante escudo plateado te envuelve, emitiendo un zumbido metálico profundo "
				+ "que resuena en el aire. El escudo tiene un aspecto resistente e industrial, "
				+ "con remaches y pernos que lo mantienen unido."
				, 40, "buff");
		
	}

	@Override
	public void realizar(Personaje activo, Personaje pasivo) {
		pasivo.setVidaActual(pasivo.getVidaActual().getValorBase()-20);
		
	}

}