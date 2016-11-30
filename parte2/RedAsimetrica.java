package tp2.parte2;

public class RedAsimetrica<K,V> extends RedSocial<K,V>{

	@Override
	public boolean agregarRelacion(K a, V b) {
		return agregarRelacionIzqDer(a,b);
	}

	public RedAsimetrica<K, V> inversa(){
		RedAsimetrica<K,V> redInversa = new RedAsimetrica<K,V>();
		for(K p : this){
			if(relacionesDeA(p) != null){
				for(V r: relacionesDeA(p)){
					redInversa.agregarRelacionIzqDer((K)r,(V)p);
				}
			}
		}
		return redInversa;
	}
	
	
}
