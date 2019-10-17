package mochila;

import java.util.Comparator;

public class ComparadorPorCociente implements Comparator<Objeto>
{
	@Override
	public int compare(Objeto uno, Objeto otro)
	{
		double tasaUno = Double.valueOf(uno.getBeneficio()) / Double.valueOf(uno.getPeso());
		double tasaOtro = Double.valueOf(otro.getBeneficio()) / Double.valueOf(otro.getPeso());

		return (int) Math.signum(tasaOtro - tasaUno);
	}
}
