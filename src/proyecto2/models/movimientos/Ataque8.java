package proyecto2.models.movimientos;

import proyecto2.models.MovimientoBase;
import proyecto2.models.Personaje;
import proyecto2.models.Realizable;

public class Ataque8 extends MovimientoBase implements Realizable{
	/**
	 * 
	 * Este constructor nos encarga de mostrar el nombre de Ataque, con una corta descripcion de lo que hace nuestro ataque
	 * el nivel de ataque  y que nuestro ataque se encarga de quitar vida a diferencia del Buff que no nos quita vida.
	 * 
	 */
	public Ataque8() {
		super("Onda psíquica", " Una ondulante ola de energía de otro mundo emana de ti, "
				+ "doblando la realidad y aplastando las mentes de tus enemigos.",
				60, "ataque");
		
	}
	/**
	 * @param Personaje Activo y Personaje Pasivo
	 * 
	 * Este metodo se encarga de quitarle vida al jugador Pasivo
	 * 
	 */
	@Override
	public void realizar(Personaje activo, Personaje pasivo) {
		pasivo.setVidaActual(pasivo.getVidaActual().getValorBase()-20);
		
	}

}