package tarea;

public class NodoA{

	int numero1;
	int numero2;
	
	public NodoA(){
	}
	
	public NodoA(int numero1){
		this.numero1=2;
	}
	
	public NodoA(int numero1, int numero2){
		this.numero1=1;
		this.numero2=1;
	}
	
		public int menor(int numero1, int numero2){
			if(numero1>numero2){
				return numero2;
			}
			else{
				if (numero2>numero1){
					return(numero1);
				}
				else{
					return(numero1);
				}
			}
				
		}
	
		public void mostrarNumero(int numero1, int numero2){
			System.out.println(""+menor(numero1,numero2));
		}
}
