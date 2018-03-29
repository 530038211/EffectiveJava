package rule8;

import java.awt.Color;

public class PointTest {
    public static void main(String[] args)
    {
        //违法对称性
        Point point = new Point(1, 2);
        ColorPoint colorPoint = new ColorPoint(1, 2, Color.RED);
        ColorPoint colorPoint1 = new ColorPoint(1, 2, Color.RED);
        System.out.println(point.equals(colorPoint));
        System.out.println(colorPoint.equals(point));
        System.out.println(colorPoint.equals(colorPoint1));
        
        if(point instanceof ColorPoint){
        	System.out.println("Point父类可以实例成 ColorPoint子类");
        }else{
        	System.out.println("Point父类不可以实例成 ColorPoint子类");
        }
        //colorPoint可以实例成 Point类型,子类可以实例成父类
        if(colorPoint instanceof Point){
        	Point point1 = (Point)colorPoint;
        	//父类引用指向子类对象
        	Point point2 = new ColorPoint(2, 3, Color.RED);
        	/*
        	 * 如果属性x,y加了static则放在静态区共用一套属性修改了x,y值都会变,
        	 * 不加static对象各自拥有自己的属性 不受影响
        	 * 
        	 */
        	System.out.println(point1);
        	System.out.println(point2);
        	System.out.println("colorPoint可以实例成 Point");
        }
    }
}
