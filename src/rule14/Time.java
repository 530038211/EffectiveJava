package rule14;

public class Time {
	//共有域可以被其他类直接被访问，建议不要用
//    public  int hour;
//    public  int minute;
    private  int hour;
    private  int minute;

    public Time(int hour,int minute){
    	this.hour = hour;
    	this.minute = minute;
    }
}
