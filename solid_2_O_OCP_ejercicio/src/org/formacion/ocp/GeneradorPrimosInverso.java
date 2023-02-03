package org.formacion.ocp;

import java.util.Comparator;

public class GeneradorPrimosInverso extends GeneradorPrimos {

	@Override
	protected Comparator<Integer> getOrdenacion() {
		return (a,b) -> a > b?-1:1;
	}
}
