/*
 El siguiente código se crea para solucionar el segundo punto del taller
Es un Lenguaje {a, b, c} con 5 estados (q0, q1, q2, q3, q4)
 */
package tallerautomatas;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 *
 * @author Jonathan Cruz - 88404
 */
public class SegundoPunto {
    public boolean validate(String input){
        System.out.println(input);
        boolean accepted = false;//Como la cadena vacía no es aceptada, se inicia en false
        int length = input.length();
        int index = 0;
        
        while(index<length){//Las validaciones se repiten a lo largo de la cadena
            //Estado inicial: q0
            if(index==0 && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                System.out.println(input.charAt(index)+" q1");//Se imprime el símbolo leído y el estado a donde pasa
                index+=1;//Cambio de posición de la cadena pasa al estado q1
                if(index<length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                    System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                    accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                    index+=1;//Cambio de posición de la cadena pasa al estado q3
                    if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                        System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                        index+=1;//Cambio de posición de la cadena pasa al estado q4
                        while(index<length&&input.charAt(index)!='a'){
                            System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                            index+=1;//Cambio de posición de la cadena continía en el estado q4
                        }
                        if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                            accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                            break;
                        }
                    }
                    else{
                        if(index!=length){
                            accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                            break;
                        }
                    }
                }
                if(index<length && input.charAt(index)!='c'){//Validación para lectura de símbolo y/o cambio de estado
                    accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                    break;
                }
                while(index<length && input.charAt(index)=='c'){
                    System.out.println(input.charAt(index)+" q2");//Se imprime el símbolo leído y el estado a donde pasa
                    index+=1;//Cambio de posición de la cadena pasa al estado q2
                    if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                        System.out.println(input.charAt(index)+" q1");//Se imprime el símbolo leído y el estado a donde pasa
                        index+=1;//Cambio de posición de la cadena pasa al estado q1
                        if(index<length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                            System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                            accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                            index+=1;//Cambio de posición de la cadena pasa al estado q3
                            if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                                System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                                accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                                index+=1;//Cambio de posición de la cadena pasa al estado q4
                                while(index<length&&input.charAt(index)!='a'){
                                    System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                                    index+=1;//Cambio de posición de la cadena continúa en el estado q4
                                }
                                if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                                    accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                                    break;
                                }
                            }
                        }
                    }
                    if(index<length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                        System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                        accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                        index+=1;//Cambio de posición de la cadena pasa al estado q3
                        if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                            System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                            accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                            index+=1;//Cambio de posición de la cadena pasa al estado q4
                            while(index<length&&input.charAt(index)!='a'){
                                System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                                index+=1;//Cambio de posición de la cadena continúa en el estado q4
                            }
                            if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                                accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                                break;
                            }
                        }
                        else{
                            if(index!=length){
                                accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                                break;
                            }
                        }
                    }
                    else{
                        if(index<length && (input.charAt(index)!='c'||input.charAt(index-1)=='c')){//Validación para continuar en el ciclo o salir del mismo
                            break;
                        }
                    }
                }
            }
            if(index==0&&(input.charAt(index)=='b'|| input.charAt(index)=='c')){//Validación para lectura de símbolo y/o cambio de estado
                System.out.println(input.charAt(index)+" q2");//Se imprime el símbolo leído y el estado a donde pasa
                index+=1;//Cambio de posición de la cadena pasa al estado q2
                if(index<length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                    System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                    accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                    index+=1;//Cambio de posición de la cadena pasa al estado q3
                    if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                        System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                        index+=1;//Cambio de posición de la cadena pasa al estado q4
                        while(index<length&&input.charAt(index)!='a'){
                            System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                            index+=1;//Cambio de posición de la cadena continúa en el estado q4
                        }
                        if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                            accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                            break;
                        }
                    }
                    else{
                        if(index!=length){
                            accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                            break;
                        }
                    }
                }
                if(index<length && input.charAt(index)!='a'){//Validación para lectura de símbolo y/o cambio de estado
                    accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                    break;
                }
                while(index<length && input.charAt(index)=='a'){
                    System.out.println(input.charAt(index)+" q1");//Se imprime el símbolo leído y el estado a donde pasa
                    index+=1;//Cambio de posición de la cadena pasa al estado q1
                    if(index<length && input.charAt(index)=='c'){//Validación para lectura de símbolo y/o cambio de estado
                        System.out.println(input.charAt(index)+" q2");//Se imprime el símbolo leído y el estado a donde pasa
                        index+=1;//Cambio de posición de la cadena pasa al estado q2
                        if(index<length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                            System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                            accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                            index+=1;//Cambio de posición de la cadena pasa al estado q3
                            if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                                System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                                accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                                index+=1;//Cambio de posición de la cadena pasa al estado q4
                                while(index<length&&input.charAt(index)!='a'){
                                    System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                                    index+=1;//Cambio de posición de la cadena continúa en el estado q4
                                }
                                if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                                    accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                                    break;
                                }
                            }
                        }
                    }
                    if(index<length && input.charAt(index)=='b'){//Validación para lectura de símbolo y/o cambio de estado
                        System.out.println(input.charAt(index)+" q3");//Se imprime el símbolo leído y el estado a donde pasa
                        accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                        index+=1;//Cambio de posición de la cadena pasa al estado q3
                        if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                            System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                            accepted=true;//cambio de estado de aceptación ya que en este punto la cadena es válida
                            index+=1;//Cambio de posición de la cadena pasa al estado q4
                            while(index<length&&input.charAt(index)!='a'){
                                System.out.println(input.charAt(index)+" q4");//Se imprime el símbolo leído y el estado a donde pasa
                                index+=1;//Cambio de posición de la cadena continúa en el estado q4
                            }
                            if(index<length && input.charAt(index)=='a'){//Validación para lectura de símbolo y/o cambio de estado
                                accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                                break;
                            }
                        }
                        else{
                            if(index!=length){
                                accepted=false;//cambio de estado de aceptación ya que en este punto la cadena no es válida
                                break;
                            }
                        }
                    }
                    else{
                        if(index<length && (input.charAt(index)!='a'||input.charAt(index-1)=='a')){//Validación para continuar en el ciclo o salir del mismo
                            break;
                        }
                    }
                }
            }
            else{
                break;
            }
        }
        return accepted;
    }
    
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        SegundoPunto afd = new SegundoPunto();
        try{
            if(afd.validate("acacbaccb"))//Validación de la cadena
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