/*
 El siguiente código se crea para solucionar el tercer punto del taller
 Es un Lenguaje {a, b, c} con 4 estados (q0, q1, q2, q3)
 */
package tallerautomatas;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 *
 * @author Jonathan Cruz - 88404
 */
public class TercerPunto {
    public boolean validate(String input){
        System.out.println(input);
        boolean accepted = false;//Como la cadena vacía no es aceptada, se inicia en false
        int length = input.length();
        int index = 0;
        
        while(index<length){//Las validaciones se hacen a lo largo de la cadena
            //Estado inicial: q0
            if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                System.out.println(input.charAt(index)+" q1");//Se imprime el símbolo leído y el estado a donde pasa
                index+=1;//Cambio de posición de la cadena pasa al estado q1
                if((index+1)==length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                    System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                    accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                    index+=1;//Cambio de posición de la cadena pasa al estado q3
                }
                while(index<length&&input.charAt(index)=='c'){
                    System.out.println(input.charAt(index)+" q0");//Se imprime el símbolo leído y el estado a donde pasa
                    index+=1;//Cambio de posición de la cadena pasa al estado q0
                    if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                        System.out.println(input.charAt(index)+" q1");//Se imprime el símbolo leído y el estado a donde pasa
                        index+=1;//Cambio de posición de la cadena pasa al estado q1
                        if((index+1)==length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                            System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                            accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                            index+=1;//Cambio de posición de la cadena pasa al estado q3
                        }
                    }
                    else{
                        break;
                    }
                }
                if(index<length && input.charAt(index-1)!='c'){//Validación para continuar en el ciclo o salir del mismo
                    break;   
                }
            }
            
            if(index<length && (input.charAt(index)=='b'||input.charAt(index)=='c')){//Validación para lectura de símbolo y/o cambio de estado
                System.out.println(input.charAt(index)+" q2");//Se imprime el símbolo leído y el estado a donde pasa
                index+=1;//Cambio de posición de la cadena pasa al estado q2
                if((index+1)==length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                    System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                    accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                    index+=1;//Cambio de posición de la cadena pasa al estado q3
                }
                while(index<length&&input.charAt(index)=='a'){
                    System.out.println(input.charAt(index)+" q0");//Se imprime el símbolo leído y el estado a donde pasa
                    index+=1;//Cambio de posición de la cadena pasa al estado q0
                    if(index<length && (input.charAt(index)=='b'||input.charAt(index)=='c')){//Validación para lectura de símbolo y/o cambio de estado
                        System.out.println(input.charAt(index)+" q2");//Se imprime el símbolo leído y el estado a donde pasa
                        index+=1;//Cambio de posición de la cadena pasa al estado q2
                        if((index+1)==length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                            System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                            accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                            index+=1;//Cambio de posición de la cadena pasa al estado q3
                        }
                    }
                    else{
                        break;
                    }
                }
                if(index<length && input.charAt(index-1)!='a'){//Validación para continuar en el ciclo o salir del mismo
                    break;   
                }
            }
        }
        return accepted;
    }
    
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TercerPunto afd = new TercerPunto();
        try{
            if(afd.validate("babaacaccab"))//Validación de la cadena
                System.out.println("Cadena aceptada");//Se imprime resultado afirmativo
            else
                System.out.println("Cadena rechazada");//Se imprime resultado negativo
            bw.flush();
        }
        catch(Exception ex){
            System.out.println(ex.toString());//Se imprime excepciòn que se presente
        }
    }
}