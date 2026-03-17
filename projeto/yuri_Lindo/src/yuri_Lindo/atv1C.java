package yuri_Lindo;

import java.util.Scanner;


public class atv1C {
	
	 public static void main(String[] args) {
		 	atv1 unidadeDeBlumenau = new atv1();
	        
	        unidadeDeBlumenau.nomeMercado = "Mercado Blumenau";
	        unidadeDeBlumenau.macaVendidaAno = 3000;
	        unidadeDeBlumenau.precoMaca = 1.20;
	        unidadeDeBlumenau.laranjaVendidaAno = 4000;
	        unidadeDeBlumenau.precoLaranja = 1.00;
	        double PaoDoYuri = unidadeDeBlumenau.macaVendidaAno*unidadeDeBlumenau.precoMaca;
	        double PaoDoYuri1 = unidadeDeBlumenau.laranjaVendidaAno*unidadeDeBlumenau.precoLaranja;
	         
	        
	        atv1 unidadeDeJoinville = new atv1();
	        
	        unidadeDeJoinville.nomeMercado = "Mercado Joinville";
	        unidadeDeJoinville.macaVendidaAno = 5000;
	        unidadeDeJoinville.precoMaca = 1.10;
	        unidadeDeJoinville.laranjaVendidaAno = 3000;
	        unidadeDeJoinville.precoLaranja = 1.50;
	        
	        atv1 unidadeDeFlorianopolis = new atv1();
	        
	        unidadeDeFlorianopolis.nomeMercado = "Mercado Floripa";
	        unidadeDeFlorianopolis.macaVendidaAno = 7000;
	        unidadeDeFlorianopolis.precoMaca = 0.50;
	        unidadeDeFlorianopolis.laranjaVendidaAno = 6500;
	        unidadeDeFlorianopolis.precoLaranja = 1.25;    
	        //pra cima é a 3//
	        //abaixo é a 6,junto com a 3//
	        
	        double r1 = unidadeDeBlumenau.receitaMacas();
	        double r2 = unidadeDeJoinville.receitaMacas();
	        double r3 = unidadeDeFlorianopolis.receitaMacas();

	        atv1 maior = unidadeDeBlumenau;
	        
	        if (r1 > maior.receitaMacas()) {
	            maior = unidadeDeJoinville;
	        }


	        if (r2 > maior.receitaMacas()) {
	            maior = unidadeDeJoinville;
	        }

	        if (r3 > maior.receitaMacas()) {
	            maior = unidadeDeFlorianopolis;
	        }

	        System.out.println("Maior receita com maçãs: " + maior.nomeMercado);
	        
	        
	        double L1 = unidadeDeBlumenau.receitaLaranjas();
	        double L2 = unidadeDeJoinville.receitaLaranjas();
	        double L3 = unidadeDeFlorianopolis.receitaLaranjas();

	        atv1 menor = unidadeDeBlumenau;

	        if (L1 < menor.receitaLaranjas()) {
	            menor = unidadeDeJoinville;
	        }
	        
	        if (L2 < menor.receitaLaranjas()) {
	            menor = unidadeDeJoinville;
	        }

	        if (L3 < menor.receitaLaranjas()) {
	            menor = unidadeDeFlorianopolis; 
	        }
	        System.out.println("menor receita com laranjas: " + menor.nomeMercado);
	        
	        
	}
	    

	}


