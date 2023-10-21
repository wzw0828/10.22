class Car
{
    protected String owner; //車主
    protected String id;    //車牌
    public Car(String own, String s) {
        owner = own;  
        id = s;       
    }
    public void show() {
        System.out.println("車主姓名：" + owner);  //顯示車主
        System.out.println("車牌號碼：" + id);    //顯示車牌
    }
}
class CColor extends Car
{
    private String color;  //車身顏色
    public CColor(String own, String s, String c) {
        super(own, s);  //使用父類的建構元設定車主和車牌
        color = c;      //設定車身顏色
    }
    public void show() {
        super.show(); //呼叫父類的show()函數以顯示車主和車牌
        System.out.println("車身顏色：" + color);  //顯示車身顏色
    }
}
public class class17 {
    public static void main(String[] args) {
        CColor mycar = new CColor("Riaan", "A1-2345", "Black");
        mycar.show();  //顯示車主、車牌和車身顏色
    }
}
