public class Account {
    private  double a, b, c, z, x1,x2;

    public Account(){

    }

    public Account(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;


    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return z = b*b - 4*a*c;
    }

    public  double getRoot1(){
        return x1 = ((-b + Math.sqrt(z)) / (2*a));
    }

    public  double getRoot2(){
        return x2 = ((-b - Math.sqrt(z)) / (2*a));
    }

    public  double getDoubleRoot(){
        return x1 = (-b / (2 * a));
    }

    public  double getOnlyRoot(){
        return x1 = (-b / (2 * a));
    }


}
