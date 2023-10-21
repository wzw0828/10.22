class CTriangle {
    protected int base; 
    protected int height; 
    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}
class CData extends CTriangle {
    public CData(int base, int height) {
        this.base = base; 
        this.height = height; 
    }
    public void area() {
        super.show(); 
        double t = 0.5 * base * height; // 計算三角形面積。
        System.out.println("area=" + t); // 顯示面積。
    }
}

public class class06 {
    public static void main(String[] args) {
        CData obj = new CData(3, 8); // 創建一個具有底 3 高 8 的 CData 實例。
        obj.area(); // 呼叫 'area' 方法以顯示三角形的資訊和其面積。
    }
}
