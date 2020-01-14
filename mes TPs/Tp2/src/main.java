
public class main {

	public static void main(String[] args) {
	

		
		ResultatModule r1=new ResultatModule();
		ResultatModule r2=new ResultatModule(15,18,16);
		ResultatModule r3=new ResultatModule(17.5,12,14);
		ResultatModule modules1[]= {r1,r2,r3};
		ResultatModule modules2[]= {r1,r2};
		
		
		AnneeEtudiant etd1=new AnneeEtudiant(1,3, modules1);
		AnneeEtudiant etd2=new AnneeEtudiant(2,2, modules2);
		
		
		//System.out.println("Le nombre de modules créés: "+ResultatModule.getCmpt());
		
		System.out.println(etd1.resultatEtudiant());
		System.out.println(etd2.resultatEtudiant());
		
		
		
		
	}

	

}
