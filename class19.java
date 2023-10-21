class CRectangle {
    protected int length;  //長
    protected int width;   //寬
    public CRectangle(int l, int w) {
        length = l;  
        width = w; 
    }
    public int getArea() {
        return length * width;  //傳回面積
    }
    public String toString() {
        int area = getArea();  //計算面積
        return "length=" + length + ", width=" + width + ", area=" + area;  //傳回長、寬和面積
    }
}
public class class19 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle(2, 6);  // 建立CRectangle物件並設定初始值
        System.out.println(rect);  // 列印長、寬和面積
    }
}
