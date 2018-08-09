public class Celular{
	private double Saldo;
		
	Celular(double Saldo_){
		this.Saldo = 0; 
	};
	
	public double getsaldo(){
		return this.Saldo;
	};

	public void topUp(double Plus_){
		if(Plus_ < 0){ System.out.println("Valor inadequado!")};
		else{this.Saldo = this.Saldo + Plus_;};	
	};

	public void gastar(double Minus_){
		this.Saldo = this.Saldo - Minus_;
		if(this.Saldo < 0){
			this.Saldo = 0;
		};
	};
	
	public void Status(){
		system.out.printf("Seu saldo é: " getsaldo)
	};

}
