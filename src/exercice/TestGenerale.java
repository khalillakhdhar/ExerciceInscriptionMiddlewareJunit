package exercice;

public class TestGenerale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User u=new User("nom", "nompassword");
ValidateUsers vu=new ValidateUsers();
if(vu.VerifExistancePassword(u.getMdp(), u.getNom()))
{
//ajouter à la BD	
}
else
{
//message d'erreur	
}
		
		
	}

}
