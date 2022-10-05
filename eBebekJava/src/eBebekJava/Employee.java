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
	
	//maaþa uygulanan vergiyi hesaplar
	 public double tax(){
		 double vergi = 0.0;
		 if( salary > 1000){
			vergi = salary * 0.03; //vergi oranýný hesapla
			return vergi;
		 }
		return vergi;
	}

	 //Eðer çalýþan haftada 40 saatten fazla 
	 //çalýþmýþ ise fazladan çalýþtýðý her saat baþýna 30 TL 
	 //olacak þekilde bonus ücretleri hesaplayacaktýr.
	 public double bonus(){
		 double bonus = 0.0;
		 if(workHours>40){
			 bonus = (workHours-40)*30;
			 return bonus;
		 }
			return bonus;
	}
	 //Çalýþanýn iþe baþlangýç yýlýna göre maaþ artýþýný hesaplayacaktýr. 
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
		System.out.println("Çalýþanýn adý: " + this.name);
		System.out.println("Çalýþanýn maaþý: "+ this.salary);
		System.out.println("Haftalýk çalýþma saati: "+ this.workHours);
		System.out.println("Ýþe baþlangýç yýlý: "+ this.hireYear);
		System.out.println("Vergi: " + tax() );
		System.out.println("Bonus: " + bonus() );
		System.out.println("Maaþ artýþý: " + raiseSalary() );
		System.out.println("Vergi ve Bonuslarla birlikte toplam maaþ: " + (salary-tax()+bonus()) );
		System.out.println("Toplam Maaþ: " + (salary-tax()+bonus()+raiseSalary()) );
		return null;
	}
}