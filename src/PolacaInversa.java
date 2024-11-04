import javax.swing.*;
import java.util.Stack;

public class PolacaInversa{
    public PolacaInversa() {
    }

    public void calcular(String operacion, JTextArea textArea) {

        Stack <Double> pila = new Stack<>();
        String[] entradaSeparada = operacion.split(" ");

        double op1;
        double op2;
        double resultado = 0;

        for(String elemento : entradaSeparada){
            if(elemento.equals("+")||elemento.equals("-")||elemento.equals("*")||elemento.equals("/")){
                op2 = pila.pop();
                op1 = pila.pop();

                switch(elemento){
                    case "+":
                        resultado = op1 + op2;
                        break;
                    case "-":
                        resultado = op1 - op2;
                        break;
                    case "*":
                        resultado = op1 * op2;
                        break;
                    case "/":
                        resultado = op1 / op2;
                        break;
                }
                pila.push(resultado);
            }else{
                pila.push(Double.parseDouble(elemento));
            }
        }
        resultado = pila.pop();
        textArea.setText(Double.toString(resultado));
    }
}
