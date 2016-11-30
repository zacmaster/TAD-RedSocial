package tp2.parte2;


public class Prueba {
	public static void main(String[] args) {
//	------------------------RED ASIMETRICA-------------------------------------------------
		System.out.println("------------------------RED ASIMETRICA---------------------------------------");
		RedAsimetrica<String,String> redAsimetrica = new RedAsimetrica<String,String>();
		redAsimetrica.agregarRelacion("Leibniz", "Kant");
		redAsimetrica.agregarRelacion("Leibniz", "Hume");
		redAsimetrica.agregarRelacion("Kant", "Bergson");
		redAsimetrica.agregarRelacion("Hume", "Deleuze");
		redAsimetrica.agregarRelacion("Hume", "Kant");
		redAsimetrica.agregarRelacion("Bergson", "Deleuze");
		redAsimetrica.agregarRelacion("Spinoza", "Leibniz");
		redAsimetrica.agregarRelacion("Spinoza", "Nietzsche");
		redAsimetrica.agregarRelacion("Spinoza", "Deleuze");
		redAsimetrica.agregarRelacion("Nietzsche","Deleuze");
		System.out.println(redAsimetrica);
//		
//		
////		Consultas a la Red
		System.out.println("Total de personas en la red Asimetrica: "+redAsimetrica.totalPersonas());
		System.out.println("Total de relaciones en la red Asimetrica: "+redAsimetrica.totalRelaciones());
//		
////		Comprobar la red de influencia
		System.out.println("La cantidad de relaciones de Spinoza es "+redAsimetrica.numRelaciones("Spinoza"));
		System.out.println("La red de Influencia de Spinoza es "+redAsimetrica.relacionesDeA("Spinoza")+"\n");
//		Red inversa:
		System.out.println(">>>RED INVERSA<<<");
		System.out.println(redAsimetrica.inversa());
		
//	
//	------------------------RED SIMETRICA-------------------------------------------------
		System.out.println("\n"+"\n");
		System.out.println("------------------------RED SIMETRICA---------------------------------------");
		RedSimetrica<String,String> redSimetrica = new RedSimetrica<String,String>();
		redSimetrica.agregarRelacion("Leibniz", "Kant");
		redSimetrica.agregarRelacion("Leibniz", "Hume");
		redSimetrica.agregarRelacion("Kant", "Bergson");
		redSimetrica.agregarRelacion("Hume", "Deleuze");
		redSimetrica.agregarRelacion("Hume", "Kant");
		redSimetrica.agregarRelacion("Bergson", "Deleuze");
		redSimetrica.agregarRelacion("Spinoza", "Leibniz");
		redSimetrica.agregarRelacion("Spinoza", "Nietzsche");
		redSimetrica.agregarRelacion("Spinoza", "Deleuze");
		redSimetrica.agregarRelacion("Nietzsche","Deleuze");
//		Consultas a la Red
		
		System.out.println(redSimetrica);
		System.out.println("Total de personas en la red Simetrica: "+redSimetrica.totalPersonas());
		System.out.println("Total de relaciones en la red Simetrica: "+redSimetrica.totalRelaciones());
		System.out.println("La cantidad de relaciones de Deleuze es "+redSimetrica.numRelaciones("Deleuze"));
		
//		Comprobar la red de influencia
		System.out.println("La red de influencia de Deleuze es "+redSimetrica.relacionesDeA("Deleuze"));
	
	}

}
