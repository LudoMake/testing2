package funciones;

public class Utilidades {
	
	/**
	 * Funcion para devolver un numero par
	 * @param num
	 * @return
	 */
	static boolean esPar(int num) {
		if (num%2 ==0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Funcion para devolver un numero primo
	 * @param num
	 * @return
	 */
	static boolean esPrimo(int num) {
		if (num<2) return false;
		for (int i=2; i<num;i++) {
			if (num%i==0) return false;
		}
		return true;
	}
	
	/**
	 * Funcion para devolver un numero factorial
	 * @param n
	 * @return
	 */
	static public long factorial(int n) {
        long producto=1;
        int i;
        if (n<0) 
        	throw new ArithmeticException(
        			"Debe ser positivo");
        for (i = 2; i <= n; i++) {
        	producto =producto* i;
        }
        return producto;
    }
	
	/**
	 * Funcion para rotar numeros mediante array
	 * @param v
	 */
	static public void rotarDerecha(int v[]) {
		int aux = v[v.length-1];
		for (int i = v.length-1; i >=1; i--) {
			v[i]=v[i-1];
		}
		v[0]=aux;
	}
}
