package mochila;

import java.util.ArrayList;
import java.util.List;

public class Instancia
{
	private int _capacidad;
	private List<Objeto> _objetos;
	
	public Instancia(int capacidad)
	{
		_capacidad = capacidad;
		_objetos = new ArrayList<Objeto>();
	}
	
	public void agregar(Objeto obj)
	{
		_objetos.add(obj);
	}
	
	public int getCapacidad()
	{
		return _capacidad;
	}
	
	public List<Objeto> getObjetos()
	{
		List<Objeto> ret = new ArrayList<Objeto>();
		for(Objeto obj: _objetos)
			ret.add(obj);
		
		return ret;
	}
	public int beneficioActual(){
		int beneficio = 0;
		for(Objeto obj : _objetos) {
			beneficio += obj.getBeneficio();
		}
		return beneficio;
	}
	
	public int pesoActual(){
		int peso = 0;
		for(Objeto obj : _objetos) {
			peso += obj.getPeso();
		}
		return peso;
	}
	
	public void remove(String nombre) {
		int i = 0;
		for(Objeto obj : _objetos) {
			if(obj.getNombre().equals(nombre)) {
				_objetos.remove(i);
				return;
			}
				
			i++;
		}
	}
	public String toString() {
		String instancia = "";
		for(Objeto obj : _objetos) {
			instancia += obj.getNombre() + "   peso: " + String.valueOf(obj.getPeso())
			+ "   beneficio: " + String.valueOf(obj.getBeneficio()) + "\n";
		}
		return instancia;
	}
}






