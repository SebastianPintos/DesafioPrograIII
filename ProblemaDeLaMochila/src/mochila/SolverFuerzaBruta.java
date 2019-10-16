package mochila;

public class SolverFuerzaBruta {

	private Instancia _instancia;
	private Instancia _instanciaActual;
	private int beneficioMaximo;

	public SolverFuerzaBruta(Instancia instancia) {
		_instancia = instancia;
	}

	public int resolver() {

		_instanciaActual = new Instancia(_instancia.getCapacidad());
		beneficioMaximo = 0;
		recursion(0);
		return beneficioMaximo;

	}

	private void recursion(int inicial) {
		
		//Caso base
		
		if (inicial == _instancia.getObjetos().size()) {
			if(_instanciaActual.beneficioActual() > beneficioMaximo && _instanciaActual.pesoActual() <= _instanciaActual.getCapacidad()) {
				beneficioMaximo = _instanciaActual.beneficioActual();
			}
			return;
		}

		// Caso recursivo
		
		_instanciaActual.agregar(_instancia.getObjetos().get(inicial));
		recursion(inicial + 1);
		
		
		_instanciaActual.remove(_instancia.getObjetos().get(inicial).getNombre());
		recursion(inicial + 1);

	}

}
