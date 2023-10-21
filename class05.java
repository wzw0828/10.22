class Caaa {
    private int num; 
    public Caaa(int n) { // 建構函數，用於初始化num
        num = n;
    }
    public int get() { 
        return num;
    }
}
class Cbbb extends Caaa {
    public Cbbb(int n) { // 建構函數
        super(n);//父類別建構函數
    }
    public void show() { 
        System.out.println("num=" + get());
    }
}
public class class05 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2); // 創建 Cbbb，並傳入參數2
        bb.show(); // 輸出num的值
    }
}
