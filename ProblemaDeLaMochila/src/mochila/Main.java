package mochila;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Instancia instancia;
		Random pesoRandom = new Random();
		Random beneficioRandom = new Random();
		int optimo = 0;
		int spp = 0;
		int spb = 0;
		int spc = 0;

		while (true) {
			instancia = new Instancia(10);

			instancia.agregar(new Objeto("Lapiz", pesoRandom.nextInt(10) + 1, beneficioRandom.nextInt(10) + 1));
			instancia.agregar(new Objeto("Cuchillo", pesoRandom.nextInt(10) + 1, beneficioRandom.nextInt(10) + 1));
			instancia.agregar(new Objeto("Carpa", pesoRandom.nextInt(10) + 1, beneficioRandom.nextInt(10) + 1));
			instancia.agregar(new Objeto("Celular", pesoRandom.nextInt(10) + 1, beneficioRandom.nextInt(10) + 1));
			instancia.agregar(new Objeto("Mapa", pesoRandom.nextInt(10) + 1, beneficioRandom.nextInt(10) + 1));
			SolverFuerzaBruta solver = new SolverFuerzaBruta(instancia);
			optimo = solver.resolver();

			Solver solver1 = new Solver(instancia, new ComparadorPorPeso());
			spp = solver1.ejecutar();

			Solver solver2 = new Solver(instancia, new ComparadorPorBeneficio());
			spb = solver2.ejecutar();

			Solver solver3 = new Solver(instancia, new ComparadorPorCociente());
			spc = solver3.ejecutar();

			if (optimo > spp && optimo > spb && optimo > spc)
				break;
		}

		System.out.println(instancia);
		System.out.println("OPTIMO: " + String.valueOf(optimo));
		System.out.println("SPP: " + String.valueOf(spp));
		System.out.println("SPC: " + String.valueOf(spc));
		System.out.println("SPB: " + String.valueOf(spb));

	}
}
