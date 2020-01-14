
public class ResultatModule {

	private static int cmpt=0;
	private int id=0;
	private double cc, tp,exam;
	
	public static int getCmpt() {return cmpt;}
	public int getId() {return id;}
	public double getCc() {return cc;}
	public double getTp() {return tp;}
	public double getExam() {return exam;}
	
	//public void setId(int id) {this.id=id;}
	public void setCc(double cc) {this.cc=cc;}
	public void setTp(double tp) {this.tp=tp;}
	public void setExam(double exam) {this.exam=exam;}
	
	public ResultatModule()
	{
		id=++cmpt;
		
	}
	
	public ResultatModule(double cc, double tp, double exam)
	{
		this.cc=cc;this.tp=tp;this.exam=exam;
		id=++cmpt;
	}
	
	public double calculeMoyenne()
	{
		return (double)(cc*0.3+tp*0.2+exam*0.5);
	}
	public boolean valideModule()
	{
		return this.calculeMoyenne()>=10;
	}
}
