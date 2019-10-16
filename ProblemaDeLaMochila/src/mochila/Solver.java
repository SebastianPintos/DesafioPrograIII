package mochila;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solver
{
	private Instancia _instancia;
	private Comparator<Objeto> _comparador;
	
	public Solver(Instancia instancia, Comparator<Objeto> comparador)
	{
		_instancia = instancia;
		_comparador = comparador;
	}
	
	public int ejecutar()
	{
		Solucion solucion = new Solucion(_instancia);
		for(Objeto obj: ordenarObjetos())
		{
			if( solucion.acepta(obj) )
				solucion.agregar(obj);
		}
		
		return solucion.beneficio();
	}

	private List<Objeto> ordenarObjetos()
	{
		List<Objeto> objetos = _instancia.getObjetos();
		Collections.sort(objetos, _comparador);
		return objetos;
	}
}









