package calculadora;
/**
 
 * @author S1PC28
 */
public class Calculadora {
     double x,y;
    public Calculadora(){
        this.x=x;
        this.y=y;
        
        double sum=x+y;
        double res=x-y;
        double multi=x*y;
        double div=x/y;
    }
    
    public void sumar(double x, double y){
        double z;
        z=x+y;
        System.out.println(""+x+y+"="+z);
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
