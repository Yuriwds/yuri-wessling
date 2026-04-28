package relobjetoexerc;


public class Exercicio1 {
 
 private double largura; 
 
 
 public Exercicio1 (double altura, double largura) {
	 setAltura(altura);
	 setLargura(altura);
	 
 } 
  public double Obterarea() {
	  return largura * altura;
  }
  
  public double obterperimetro() {
	  return (largura + altura ) * 2; 
	  
  }
  public double getarea() {
	  return altura;
  }
  public void setAltura(double altura) {
	   if (altura < 0) {
		   throw new IllegalArgumentException("altura invalida ");
	   }
	   this.altura = altura;
  } 
  public double getLargura() {
	  return largura;
	  
  }
  public void setLargura(double largura) {
	  if (altura < 0 ) {
		  throw new IllegalArgumentException("largura invalida");
	  }
	  this.largura = largura;
  }
  @Override
	 public String toString() {
		 return  "Retangulo [altura=" + altura + ", largura=" + largura + "]";
	 }
	 
	

}
