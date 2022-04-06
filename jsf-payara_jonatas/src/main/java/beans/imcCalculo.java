package beans;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
public class imcCalculo implements Serializable 
{	
	private float idade;
    private float altura;
    private float peso;
    
    // construtor sem parâmetros
    public imcCalculo() {}
    
    public String imc(float altura, float peso) 
	{ 
		float imc;
		String diagnostico;
		
		imc = peso / (altura*altura);
		
		String indice;
		indice = String.valueOf(imc);
				
		if (imc <= 18.5)
			diagnostico = "IMC: " + indice + ". Abaixo do peso.";
		else if (imc <= 25)
			diagnostico = "IMC: " + indice + ". Peso normal.";
		else if (imc <= 30 )
			diagnostico = "IMC: " + indice + ". Acima do peso.";
		else
			diagnostico = "IMC: " + indice + ". Obeso.";
			
			
		return diagnostico;		
		}
	
    // métodos Get´s e Set´s	

	public float getIdade() 
	{
		return idade;
	}

	public void setIdade(float idade) 
	{
		this.idade = idade;
	}

	public float getAltura() 
	{
		return altura;
	}

	public void setAltura(float altura) 
	{
		this.altura = altura;
	}

	public float getPeso() 
	{
		return peso;
	}

	public void setPeso(float peso) 
	{
		this.peso = peso;
	}
    
}

