package rule15;
/**
 * 
 * @author Use
 * 使可变性最小：类不可以被继承或者重写
 * 所有域都是私有的
 */
public final class complex{
	private final double re;
	private final double im;
		
    public complex(double re,double im){
    	this.re = re;
    	this.im = im;
    }
    
    public complex add(complex c){
		return new complex(re + c.re,im + c.im);    	
    }
    
    public String toString(){
    	return re + " " + im;
    }
}