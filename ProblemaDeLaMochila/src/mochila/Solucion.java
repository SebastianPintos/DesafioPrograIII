package mochila;

import java.util.ArrayList;
import java.util.List;

public class Solucion
{
	private Instancia _instancia;
	private List<Objeto> _objetos;
	
	public Solucion(Instancia instancia)
	{
		_instancia = instancia;
		_objetos = new ArrayList<Objeto>();
	}

	public int peso()
	{
		int ret = 0;
		for(Objeto obj: _objetos)
			ret += obj.getPeso();
		
		return ret;
	}
	
	public boolean acepta(Objeto obj)
	{
		return this.peso() + obj.getPeso() <= _instancia.getCapacidad();
	}
	
	public void agregar(Objeto obj)
	{
		_objetos.add(obj);
	}
	
	public boolean contiene(String nombre)
	{
		for(Objeto obj: _objetos) if( obj.getNombre().equals(nombre))
			return true;
		
		return false;
	}
	
	public int cantidad()
	{
		return _objetos.size();
	}
	public int beneficio() {
		int beneficio = 0;
		for(Objeto obj : _objetos) {
			beneficio += obj.getBeneficio();
		}
		return beneficio;
	}
	
	public String toString() {
		int beneficio = 0;
		for(Objeto obj : _objetos) {
			beneficio += obj.getBeneficio();
		}
		return String.valueOf(beneficio);
	}
}











