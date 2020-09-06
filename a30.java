// Add Two Complex Numbers

public class a30{
    double real;
    double imag;
    public a30(double real,double imag){
this.real = real;
this.imag = imag;
    }

    public static void main(String args[]){
        a30 n1 = new a30(2.3,4.5),
        n2=new a30(6.5,8.4),temp;

        temp = add(n1,n2);
        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static a30 add(a30 n1, a30 n2){
        a30 temp = new a30(0.0,0.0);
        
        temp.real = n1.real+n2.real;
        temp.imag= n1.imag+n2.imag;

        return temp;
    }
}