package Calculadora;

public class Calculadora {
	private int ans;
	
	public Calculadora() {
		ans =0 ;
	}
	
	public int suma(int a,int b){
		ans=a+b;
		return ans;		
	}
	
	public int resta(int a,int b){
		ans=a-b;
		return ans;		
	}
	
	public int multiplicar(int a, int b){
		ans=a*b;
		return ans;
	}
	
	public int dividir(int a, int b){
		ans=a/b;
		return ans;
	}
	
	public int Sumatorio(int a){
		int sumatorio = 0;	 
			
		while(a > 0){
		   sumatorio = sumatorio + a;
		   a--;
		} 		
		ans=sumatorio;		
		return ans;
	}
	
	public int Factorial(int a){
		int factorial = 1;	 
			
		while(a > 0){
		   factorial = factorial * a;
		   a--;
		} 
		ans=factorial; 
		return ans;
	}

}
