package Builder;

public class Carro {
	
	private Porta[] portas;
	private Motor motor;
	private ComputadorBordo comutadorBordo;
	private FreioABS freioABS;
	
	public Porta[] getPortas() {
		return portas;
	}
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public ComputadorBordo getComutadorBordo() {
		return comutadorBordo;
	}
	public void setComutadorBordo(ComputadorBordo comutadorBordo) {
		this.comutadorBordo = comutadorBordo;
	}
	public FreioABS getFreioABS() {
		return freioABS;
	}
	public void setFreioABS(FreioABS freioABS) {
		this.freioABS = freioABS;
	}
	
	

}
