
public class Modul1Fase2App {

	public static void main(String[] args) {
		final int ANY=1948;
		int anyNaixement=1979;
		int contador=0;
		
		for(int i=ANY;i<=anyNaixement;i++){
			if((i % 4 == 0)&&(i % 100 != 100)|| (i % 400 == 0))
			{
			System.out.println("Any: " +i);
				contador++;	
			}
		}
	System.out.println("El total d'anys de traspàs entre " + ANY + " i " + anyNaixement + ""
			+ " són " + contador + " anys.");
	}

}
