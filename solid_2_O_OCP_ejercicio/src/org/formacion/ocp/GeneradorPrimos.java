package org.formacion.ocp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeneradorPrimos {

	
	protected  List<Integer> primos (int limit){
		List<Integer> primos = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}
		Collections.sort(primos, getOrdenacion());
		return primos;
	}
	
	protected boolean esPrimo (int candidato) {
		for (int i = 2; i < candidato; i++) {
			if (candidato % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	protected Comparator<Integer> getOrdenacion(){
		return (a,b)-> a > b? 1:-1;
	}
}
