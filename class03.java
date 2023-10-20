class Caaa{
    public int num1;
    public int num2;
    public Caaa(){
        num1=1;
        num2=1;
    }
    public Caaa(int a,int b){
        num1=a;
        num2=b;
    }
}
class Cbbb extends Caaa{//繼承子函數
    /*
    public void set_num(int x,int y){
        num1=x;
        num2=y;
    }
    */
    public Cbbb(int a,int b){
        super(a,b);
    }
    /*
    public void show(){
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
    */
}
public class class03
{
	public static void main(String[] args) {
	    Caaa caaa1=new Caaa();
	    System.out.println("Caaa1.num1:"+caaa1.num1);
	    System.out.println("Caaa1.num2:"+caaa1.num2);
	    Caaa caaa2 = new Caaa(1,8);
	    System.out.println("Caaa2.num1:"+caaa2.num1);
	    System.out.println("Caaa2.num2:"+caaa2.num2);
		Caaa cbbb=new Cbbb(3,9);
	    System.out.println("Cbbb.num1:"+cbbb.num1);
	    System.out.println("Cbbb.num2:"+cbbb.num2);
	}
}
