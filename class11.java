class CShape {
    public double area() {
        return 0.0; 
    }
}
class CCircle extends CShape {
    private double radius;
    public CCircle(double radius) {
        this.radius = radius; // 建構函數傳入半徑
    }
    public double area() {
        return Math.PI * radius * radius; // 使用圓形面積公式計算面積
    }
}
class CSquare extends CShape {
    private double side;
    public CSquare(double side) {
        this.side = side; 
    }
    public double area() {
        return side * side; // 使用正方形面積公式計算面積
    }
}
class CTriangle extends CShape {
    private double base;
    private double height;
    public CTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return 0.5 * base * height; // 使用三角形面積公式計算面積
    }
}
public class class11 {
    public static void main(String[] args) {
        CCircle c1 = new CCircle(5.0);// 創建圓形兩個實例
        CCircle c2 = new CCircle(3.0);
        CSquare s1 = new CSquare(4.0);// 創建正方形兩個實例
        CSquare s2 = new CSquare(6.0);
        CTriangle t1 = new CTriangle(3.0, 4.0);// 創建三角形兩個實例
        CTriangle t2 = new CTriangle(5.0, 7.0);
        CShape[] shapes = {c1, c2, s1, s2, t1, t2};
        CShape lS = largest(shapes);
        System.out.println("最大面積：" + lS.area());// 輸出最大面積
    }
    public static CShape largest(CShape[] shapes) {
        CShape largest = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].area() > largest.area()) {
                largest = shapes[i];
            }
        }
        return largest;
    }
}
