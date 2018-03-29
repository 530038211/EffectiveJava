package rule8;

import java.awt.*;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：equals传递性
 * 创建日期：2018/2/28
 */
public class Point
{
    private int x;

    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    /**
     * obj是Point实例,且里面属性都对应
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Point))
        {
            return false;
        }
        Point t = (Point)obj;
        return t.x == x && t.y == y;
    }
    
    public String toString(){
		return "x=" +x + ",y="+y;
    	
    }
}
//扩展这个类，为这个类加颜色

class ColorPoint extends Point
{

    private Color color;

    public ColorPoint(int x, int y, Color color)
    {
        super(x, y);
        this.color = color;
    }

//        违反对称性
//        @Override    
//        public boolean equals(Object obj)
//        {
//            if(!(obj instanceof  ColorPoint)){
//                return  false;
//            }
//            return super.equals(obj) && ((ColorPoint)obj).color == color;
//        }

/**
 * obj是 Point实例,不能转化为ColorPoint去调用color,因为Point没有color属性,违反传递性
 */  
    @Override
    public boolean equals(Object obj)
    {
        if(!(obj instanceof ColorPoint)){
            return  false;
        }
        ColorPoint colorPoint = (ColorPoint) obj;
        return colorPoint.color.equals(color);
    }
}