package tp2.parte2;


public class RedSimetrica<K,V> extends RedSocial<K, V>{

	@Override
	public boolean agregarRelacion(K a, V b) {
		// TODO Auto-generated method stub
		return agregarRelacionIzqDer(a,b) && agregarRelacionDerIzq(a,b);
	}

}
