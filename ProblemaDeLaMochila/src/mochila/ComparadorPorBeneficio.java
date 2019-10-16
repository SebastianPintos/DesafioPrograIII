package mochila;

import java.util.Comparator;

public class ComparadorPorBeneficio implements Comparator<Objeto>
{
	@Override
	public int compare(Objeto uno, Objeto otro)
	{
		return otro.getBeneficio() - uno.getBeneficio();
	}
}
