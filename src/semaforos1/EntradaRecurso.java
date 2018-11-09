package semaforos1;

import java.util.concurrent.Semaphore;

public class EntradaRecurso {
	
	Semaphore semaforo = new Semaphore(3);
	
	public void bloquear () {
		
		try {
			semaforo.acquire();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Estoy dentro");
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		semaforo.release();
		System.out.println("Libero");
	}
	
	

}
