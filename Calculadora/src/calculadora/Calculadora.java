package calculadora;

public class Calculadora {
     double x,y;
    public calculadora(double x, double y){
        this.x=x;
        this.y=y;
        
        double sum=x+y;
        double res=x-y;
        double multi=x*y;
        double div=x/y;
    }
    
    public void sumar(double a, double b){
        double c;
         c=a+b
            System.out.println(""+c);
    }
    public double restar(){
        return res;
    }
    public double multiplicar(){
        /*int x, y, result;
        x = 5;
        y = 6;
        result = x* y;
        System.out.println("Resultado = " + result");
       */
        return multi;
    }
    public double dividir(){
        return div;
    }
}
