package beans;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;
//import javax.enterprise.context.RequestScoped;

@Named
public class manageBeanIMC implements Serializable
{
  private float idade;
  private float altura;
  private float peso;
  private String diagnostico;
  
  @Inject
	private imcCalculo imc; 
  
    public manageBeanIMC() { }
    
    public manageBeanIMC(float idade, float altura, float peso, String diagnostico) 
    {
    	this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.diagnostico = diagnostico;
    }
    
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
	public String getDiagnostico() 
	{
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) 
	{
		this.diagnostico = diagnostico;
	}
	
	
}
