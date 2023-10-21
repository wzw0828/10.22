class CRectangle {
    protected int length;  
    protected int width;   
    public CRectangle(int l, int w) {
        length = l;  
        width = w;   
    }
    public int getArea() {//計算面積
        return length * width;  
    }
    public String toString() {
        return "length=" + length + ", width=" + width + ", area=" + getArea();
    }
    public String toString(int a, int b) {
        if (a >= b) {
            return super.toString();  //使用父類的toString()
        } else {
            return "Argument Error";  //如果a < b，返回"Argument Error"字串
        }
    }
}
public class class20 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle(2, 6);  //建立CRectangle物件並設定初始值
        System.out.println(rect.toString());// (a)當toString()沒有引數時，調用CRectangle類別的toString()
        int a = 3; 
        int b = 2;
        System.out.println(rect.toString(a, b)); //呼叫CRectangle的toString(int a, int b)
        a = 1;
        b = 4;
        System.out.println(rect.toString(a, b)); //呼叫Object的toString()
    }
}
