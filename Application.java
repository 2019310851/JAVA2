package jiekou;

public class Application {
	public static void main(String args[]){
		Doctor people1;
		Doctor people2;
		people1 =new Doctor("Áõ¼ÑÑô","ÄÐ","19");
		people2 =new Doctor("ÁõÔó","ÄÐ","19");
		System.out.println(people1.toString());
		people1.getPay(1000);
		people1.setPay(500);
		people1.getSalaly(10000);
		people1.setSalaly(10000);
		System.out.println(people2.toString());
		people2.getPay(1000);
		people2.setPay(500);
		people2.getSalaly(10000);
		people2.setSalaly(10000);
		Text T1;
		T1=new Text();
		T1.Sub(people1.Salaly,people1.Pay);
	}
}
