
import java.util.Scanner;

public class main
{

	public static void main(String[] args)
	{
	/*	
	 //Somme de 2 nombres:
Scanner sc=new Scanner(System.in);
System.out.print("Entrer le 1er nombre: ");
int nb1=sc.nextInt();
System.out.print("Entrer le 2eme nombre: ");
int nb2=sc.nextInt();
System.out.println("Resultat de la somme: "+(nb1+nb2));
*/	
		/*
		 //Division de 2 nombres:
		Scanner sc=new Scanner(System.in);
		System.out.print("Entrer le 1er nombre: ");	
		int nb1=sc.nextInt();
		System.out.print("Entrer le 2eme nombre: ");	
		int nb2=sc.nextInt();
		if(nb2!=0)
		System.out.print("Resultat de devision: " +((float)(nb1)/nb2));
		else
			System.out.print("Division par Zero!!");*/
	
/*
		//Perimetre d'un cercle
Scanner sc=new Scanner(System.in);		
System.out.print("Entrer le rayon de cercle: ");
float r=sc.nextFloat();
double perimetreDeCercle=2*Math.PI*r;
System.out.print("Perimetre d'un cerle: "+ perimetreDeCercle);	*/
		/*
		Scanner sc=new Scanner(System.in);
		System.out.print("Entrer un nombre: ");	
		int nb1=sc.nextInt();
		
		for(int i=1;i<=nb1;i++)
		{
			if(nb1%i==0)
				System.out.print(i+" ");
			
		}*/
		/*
//Somme des nombres pairs
Scanner sc=new Scanner(System.in);
System.out.print("Entrer un nombre: ");	
int nb1=sc.nextInt();
int somme=0;
for(int i=1;i<=nb1;i++)
{
	if(i%2==0)
		somme+=i;	
}
System.out.print("La somme= "+somme);
*/
		/* Exemple de la somme et min et max
		Scanner sc=new Scanner(System.in);
		int n=5;
		int tab[]= new int [n];
		int somme=0;
		int minInd=0;
		int maxInd=0;
		
		for(int i=0;i<tab.length;i++)
		{
			System.out.print("Entrer l'element:"+i+": ");
			tab[i]=sc.nextInt();
			somme+=tab[i];
			if(tab[i]<=tab[minInd])
				minInd=i;
			else if(tab[i]>tab[maxInd])
				maxInd=i;	
		}
		System.out.println("La somme= "+somme);
		System.out.println("La moyenne= "+(somme/n));
		System.out.println("Le Min= "+tab[minInd]);
		System.out.println("Le Max= "+tab[maxInd]);
		*/
		/*
		System.out.println("Entrer une date");
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		
		String day=date.substring(0,2);
		String month=date.substring(3,5);
		String year=date.substring(6,10);
		
		switch(month)
		{
		case "01":
			month="Janvier";
			break;
		case "02":
			month="Fevrier";
			break;
		case "03":
			month="Mars";
			break;
		case "04":
			month="Avril";
			break;
		case "05":
		month="Mai";
		break;
		case "06":
			month="Juin";
			break;
		case "07":
			month="Juillet";
			break;
		case "08":
			month="Aout";
			break;
		case "09":
			month="Semptembre";
			break;
		case "10":
			month="Octobre";
			break;
		case "11":
			month="Novembre";
			break;
		case "12":
			month="Decembre";
			break;
			default:
			System.out.print("FORMAT ERROR!");
			
		}	
		
		System.out.println(day+"/"+month+"/"+year);
		*/
		
		int randNbr=(int)(Math.random()*100);//since it generates o,123...
		System.out.println("------>"+randNbr);
		System.out.print("Entrer une nombre: ");
		Scanner sc=new Scanner(System.in);
		int tenta=0;
		do
		{
			System.out.println("tentative restant: "+(tenta+1));
			System.out.println("Entrer un nombre: ");
			int nb=sc.nextInt();
			if(nb> randNbr)
				System.out.println("votre nombre est plus grand\n");
			else if(nb< randNbr)
				System.out.println("votre nombre est plus petit\n");
			else
			{
				System.out.print("EXCELLENT!!");
				break;	
			}
			
			tenta++;
		}while(tenta<3);
		System.out.println("le nombre est "+randNbr);
	}
}