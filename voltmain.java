package voltajee;
import java.util.Scanner; 
public class voltmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		int x;
		
		float voltaje = 0;
		float minimo = Integer.MAX_VALUE, max = Integer.MIN_VALUE, suma = 0, prom = 0;
		System.out.println("Ingresar cantidad de voltajes a evaluar");
		x = tc.nextInt();
		
		for(int i=1 ; i<=x; i++) {
		System.out.println("Ingresar el voltaje");
		voltaje = tc.nextFloat();
		suma = suma + voltaje;
		prom = suma / x;
		
		if(voltaje<minimo) {
			minimo = voltaje;
		}
		else if (voltaje>max) {
			max = voltaje;
		}
		
		
	}
System.out.println("Este promedio es: "+prom);
System.out.println("Este maximo es: "+minimo);
System.out.println("Este promedio es: "+max);

	}
}