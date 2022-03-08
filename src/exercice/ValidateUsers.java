package exercice;

public class ValidateUsers {
	public boolean verifNom(String nom)
	{
		
		return nom.length()>=3;
		
	}
	public boolean verifPassword(String mdp)
	{
		return mdp.length()>8;
		
		
	}
	public boolean VerifExistancePassword(String password, String nom)
	{
		if(password.contains(nom))
			return false;
		else 
			return true;
		
	}
	public boolean testAtEmail(String email)
	{
		int indice=email.indexOf("@");
		if(indice<0)
			return false;
		else if(indice> email.length()-2)
			return false;
		else
			return true;
		
	}
	public boolean testpointEmail(String email)
	{
		int indice=email.indexOf(".");
		if(indice<0) // indice ==-1 n'existe plus
			return false;
		else if(indice> email.length()-1) // tester la position (existe)
			
			return false;
		else
			return true;
		
	}

}
