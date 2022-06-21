package swt_test;

public class Bilder {

    // count
    protected static int c;
    // size
    protected double s;
    
    // name
    protected String desc;
    
    // default constructor
    Bilder(double s){
             this.s = s;
             c++;
    }
    
    // empty constructor
    Bilder(){
        
    }
    
    public int getC() {
        return this.c;
    }
    
    
    public double getS() {
        return this.s;
    }
    
    public void setC(int s) {
        this.c = c;
    }
    
    public void setS(double s) {
        this.s = s;
    }

    
    public String getDesc() {
        return this.desc;
    }
        
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
