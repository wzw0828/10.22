class Caaa {
    public int num1; 
    public int num2; 
    public Caaa() { 
        num1 = 1;
        num2 = 1;
    }
    public Caaa(int a, int b) { //新增有引數的建構元，設定num1為a，num2為b
        num1 = a;
        num2 = b;
    }
}
class Cbbb extends Caaa { // 子類別 Cbbb 繼承自 Caaa
    public Cbbb(int a, int b) { //新增有引數的建構元，呼叫父類別Caaa的有引數建構元
        super(a, b); //呼叫父類別Caaa
    }
    public Cbbb() { //新增無引數的建構元，呼叫父類別Caaa
        super(); // 呼叫父類別 Caaa
    }
}
public class class13 {
    public static void main(String args[]) {
        Caaa aaa1 = new Caaa(); //無引數建構元
        System.out.println("aaa1.num1: " + aaa1.num1);
        System.out.println("aaa1.num2: " + aaa1.num2);

        Caaa aaa2 = new Caaa(5, 10); //有引數建構元
        System.out.println("aaa2.num1: " + aaa2.num1);
        System.out.println("aaa2.num2: " + aaa2.num2);

        Cbbb bbb = new Cbbb(3, 7); //子類別的建構元，呼叫父類別有引數建構元
        System.out.println("bbb.num1: " + bbb.num1);
        System.out.println("bbb.num2: " + bbb.num2);

        Cbbb bbb2 = new Cbbb(); //子類別的建構元，呼叫父類別無引數建構元
        System.out.println("bbb2.num1: " + bbb2.num1);
        System.out.println("bbb2.num2: " + bbb2.num2);
    }
}
