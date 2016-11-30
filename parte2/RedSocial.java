package tp2.parte2;
import java.util.*;
import java.util.Map.Entry;

@SuppressWarnings("unused")
public abstract class RedSocial<K,V> implements Iterable<K>{
	private HashMap<K,HashSet<V>> relaciones;
	private HashSet<K> personas;
	private int cantidadRelaciones;
	protected RedSocial(){
		this.relaciones = new HashMap<K,HashSet<V>>();
		this.personas = new HashSet<K>();
	}

	
	public abstract boolean agregarRelacion(K a, V b);
//	Complejidad Asintótica O(1):
	protected int totalPersonas() {
		return personas.size();
	}
	protected int totalRelaciones() {
		return cantidadRelaciones;
	}
	protected int numRelaciones(K a) {
		int size = 0;
		if(relaciones.containsKey(a)){
			size = relaciones.get(a).size();
		}
		return size;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(K persona : personas ){
			if(relacionesDeA(persona)!= null){ // Sólo guarda las personas que tienen relaciones
				sb.append(persona);
				sb.append("=");
				sb.append("[");
				int contador = 0;
				for(V relacion : relacionesDeA(persona)){
					if(contador < numRelaciones(persona)-1){
						sb.append(relacion);
						sb.append(",");
					}
					else{
						sb.append(relacion);
					}
					contador++;
				}
				sb.append("]");
				sb.append("\n");
			}
		}
		return sb.toString();
	}
	
	
	
	protected boolean agregarRelacionDerIzq(K a, V b){ //Metodo auxiliar, agrega las relaciones de Derecha a izquierda
		boolean agregado = false;
		HashSet<V> relacionados = new HashSet<V>();
		if(!relaciones.containsKey((K)b)){
			if(relaciones.get((K)b)== null){
				relacionados.add((V)a);
			}
			else{
				relacionados = relaciones.get((K)b);
				relacionados.add((V)a);
			}
			relaciones.put((K)b,relacionados);
			agregado = true;
			personas.add(a);
			personas.add((K)b);
		}
		else{
			relacionados = relaciones.get((K)b);
			if(relacionados.add((V)a)){
				relaciones.put((K) b, relacionados);
				personas.add(a);
				agregado = true;
			}
		}
		return agregado;
	}
	protected boolean agregarRelacionIzqDer(K a, V b){ //Metodo auxiliar, agrega las relaciones de izquierda a Derecha
		boolean agregado = false;
		HashSet<V> relacionados = new HashSet<V>();
		if(!relaciones.containsKey(a)){
			if(relacionados.add(b))cantidadRelaciones++;
			relaciones.put(a,relacionados);
			personas.add(a);
			personas.add((K)b);
			agregado = true;
		}
		else{
			relacionados = relaciones.get(a);
			if(relacionados.add(b)){
				cantidadRelaciones++;
				relaciones.put(a, relacionados);
				personas.add((K)b);
				agregado = true;
			}
		}
		return agregado;
	}
	
	
	protected Iterable<V> relacionesDeA(K a){ //Devuelve un iterable, que luego usaré en toString()
		if(relaciones.containsKey(a)){
			return relaciones.get(a);
		}
		return null;
	}
	
	@Override
	public Iterator<K> iterator() { //Es para iterar sobre las personas
		return personas.iterator();
	}
	
}
