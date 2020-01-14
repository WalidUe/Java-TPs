
public class AnneeEtudiant {
private int idEtd=0;
private int nbrModuleInscr=0;
private ResultatModule modules[]=new ResultatModule[nbrModuleInscr];

public int getIdEtd() {return idEtd;}
public int getNbrModuleInscr() {return nbrModuleInscr; }
public ResultatModule[] getModules() {return modules;}

public void setIdEtd(int idEtd) {this.idEtd=idEtd;}

public void setNbrModuleInscr(int nbrModuleInscr) {this.nbrModuleInscr=nbrModuleInscr;}
public void setResultatModule(ResultatModule modules[]) {this.modules=modules;}

public AnneeEtudiant() {}
public AnneeEtudiant(int idEtd, int nbrModuleInscr,ResultatModule modules[] )
{
	this.idEtd=idEtd;this.nbrModuleInscr=nbrModuleInscr;this.modules=modules;
}


public double moyenneAnnee()
{
	double moyenne=0;
	for(int i=0;i<modules.length;i++)
	{
		moyenne+=modules[i].calculeMoyenne();
	}
	
	return (moyenne/nbrModuleInscr);
}

public int nombreValides()
{
	int valides=0;
	
	for(int i=0;i<modules.length;i++)
	{
		if(modules[i].valideModule())
			valides++;
	}
	
	return valides;
}

public String resultatAnnee()
{
return "Resultat Annee: "+moyenneAnnee()+" Nombre de modules valides: "+nombreValides();
}

public String resultatEtudiant()
{
	if(nombreValides()!=0)
	 return "La moyenne de l'etudiant"+ idEtd+" est: "+  moyenneAnnee();
	return "Etudiant n'a pas valide!";
}

}
