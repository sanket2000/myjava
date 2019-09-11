import java.util.*;

class teach1{
	int id, sal;
	String name;
	public void setData(int id, int sal, String name){
		this.id = id;
		this.sal = sal;
		this.name = name;
	}
}

class teach2 extends teach1{
	String sub, qual;
	public void getData(String sub, String qual){
		this.sub = sub;
		this.qual = qual;
	}
	public void disp(){
		System.out.println(id+name+sal+sub+qual);
	}
}

class Inheritance{
	public static void main(String args[]){
		String name, sub, qual;
		int sal, id,fix=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("id sal name sub qual");
		for(int i = 0 ; i < fix ; i++){
			id = sc.nextInt();
			sal = sc.nextInt();
			name = sc.nextLine();
			sub = sc.nextLine();
			qual = sc.nextLine();
		}
		//teach1 t1 = new teach1();
		teach2 t2 = new teach2();
		t2.setData(id, sal, name);
		t2.getData(sub, qual);
		t2.disp();
	}
}