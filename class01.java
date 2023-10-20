class Caaa{
    public int num1;
    public int num2;
}
class Cbbb extends Caaa{//繼承子函數
    public void set_num(int x,int y){
        num1=x;
        num2=y;
    }
    public void show(){
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
}
public class class01
{
	public static void main(String[] args) {
	    Cbbb bb=new Cbbb();
	    bb.set_num(5,10);
	    bb.show();
		
	}
}
