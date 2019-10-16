package mochila;

import java.util.Comparator;

public class ComparadorPorCociente implements Comparator<Objeto>
{
	@Override
	public int compare(Objeto uno, Objeto otro)
	{
		double tasaUno = uno.getBeneficio() / uno.getPeso();
		double tasaOtro = otro.getBeneficio() / otro.getPeso();

		return (int) Math.signum(tasaOtro - tasaUno);
	}
}
