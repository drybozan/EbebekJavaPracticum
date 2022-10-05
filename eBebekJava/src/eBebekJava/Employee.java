package eBebekJava;


public class Employee {
	
	public String name ;
	public double salary ;
	public double workHours ;
	public int hireYear ;
	
	public Employee() {
		
	}
	
	 Employee(String _name,double _salary,double _workHours,int _hireYear){
		 this.name = _name;
		 this.salary = _salary;
		 this.workHours = _workHours;
		 this.hireYear = _hireYear;
	 }
	
	//maa�a uygulanan vergiyi hesaplar
	 public double tax(){
		 double vergi = 0.0;
		 if( salary > 1000){
			vergi = salary * 0.03; //vergi oran�n� hesapla
			return vergi;
		 }
		return vergi;
	}

	 //E�er �al��an haftada 40 saatten fazla 
	 //�al��m�� ise fazladan �al��t��� her saat ba��na 30 TL 
	 //olacak �ekilde bonus �cretleri hesaplayacakt�r.
	 public double bonus(){
		 double bonus = 0.0;
		 if(workHours>40){
			 bonus = (workHours-40)*30;
			 return bonus;
		 }
			return bonus;
	}
	 //�al��an�n i�e ba�lang�� y�l�na g�re maa� art���n� hesaplayacakt�r. 
	 public double raiseSalary(){
		 
		double raiseSalary=0.0;
		
		if((2021-hireYear)<10){
			raiseSalary= (salary-tax()+bonus())*0.05;
			return raiseSalary;
		}else if(9 <(2021-hireYear)&& (2021-hireYear)< 20){
			raiseSalary= (salary-tax()+bonus())*0.10;
			return raiseSalary;
		}else if(19 <(2021-hireYear)){
			raiseSalary= (salary-tax()+bonus())*0.15;
			return raiseSalary;
		}
		return raiseSalary;
	}
	 
	public String toString(){
		System.out.println("�al��an�n ad�: " + this.name);
		System.out.println("�al��an�n maa��: "+ this.salary);
		System.out.println("Haftal�k �al��ma saati: "+ this.workHours);
		System.out.println("��e ba�lang�� y�l�: "+ this.hireYear);
		System.out.println("Vergi: " + tax() );
		System.out.println("Bonus: " + bonus() );
		System.out.println("Maa� art���: " + raiseSalary() );
		System.out.println("Vergi ve Bonuslarla birlikte toplam maa�: " + (salary-tax()+bonus()) );
		System.out.println("Toplam Maa�: " + (salary-tax()+bonus()+raiseSalary()) );
		return null;
	}
}