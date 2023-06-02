/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_juanflores;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Juan David
 */
public class Lab7P1_JuanFlores {

    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();
    
    public static void main(String[] args) {
        
        boolean menu=true;
        
        while(menu){
            
            System.out.println("M E N U");
            System.out.println("1. She sohoot, she scores!");
            System.out.println("2. Piedra, papel o ...");
            System.out.println("3. Salir");
            
            System.out.println("Ingrese una opción: ");
            int opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("ingrese la cantidad de filas: ");
                    int filas = leer.nextInt();  
                    System.out.println("ingrese la cantidad de columnas: ");
                    int columnas = leer.nextInt();
                    int maximo=filas*columnas;
                        
                    while(maximo>=88){
                        System.out.println("ingrese bien la cantidad de filas: ");
                        filas = leer.nextInt();  
                        System.out.println("ingrese bien la cantidad de columnas: ");
                        columnas = leer.nextInt();
                        maximo=filas*columnas;
                    }
                        
                    llenar(filas,columnas);
                    System.out.println("--------Tablero  para jugar--------");
                    //imprimir(llenar(filas,columnas));
                    int [][] llenaar;
                    int [][]llena;
                    llena=llenar(filas,columnas);
                    llenaar=llenar(filas,columnas);
                    //imprimir(validar(llenaar,filas,columnas));     
                    imprimir(llenaar);
                    
                    System.out.println("ingrese la cantidad de disparos: ");
                    int disparos=leer.nextInt();
                    
                    while(disparos>=((filas*columnas)/2)-1){
                         System.out.println("ingrese bien la cantidad de disparos: ");
                          disparos=leer.nextInt();
                    }
                    
                    int disparos1=disparos;
                    int disparos2=disparos;
                    
                    int cant1=1;
                    int cant2=1; 
                    while(disparos1>0 && disparos2>0){
                         int op1=99;
                         int op2=88;
                         
                         System.out.println("Elegi que numero disparar jugador 1: ");
                         int dis=leer.nextInt();
                         
                         imprimir(disparo1(llenaar,dis,op1));
                         
                         disparos1--;   
                         
                         System.out.println("le quedan: "+disparos+" balas");
                         if(RevisarBalazos(llena,dis)){
                             System.out.println("tiro acertado");
                             cant1+=dis;
                         }else{
                             System.out.println("fallaste");
                         }
                         
                         System.out.println("Elegi que numero disparar jugador 2: ");
                         int dis2=leer.nextInt();
                         imprimir(disparo1(llenaar,dis2,op2));
                         
                         disparos2--;
                         System.out.println("le quedan: "+disparos2+" balas");
                         
                         if(RevisarBalazos(llena,dis2)){
                             System.out.println("tiro acertado");
                             cant2+=dis2;
                         }else{
                             System.out.println("fallaste");
                         }
                         
                        
                         
                         
                     }
                     if(cant1>cant2){
                         System.out.println("jugador 1 gana con: "+cant1);
                         System.out.println("jugador 2 pierde con: "+ cant2);
                     }else if (cant2>cant1){
                         System.out.println("jugador 2 gana con: "+cant2);
                         System.out.println("jugador 1 gana con: "+cant1);
                     }
 
                     
                    
                    
                    break;
                    
                case 2:
                    int f=5;
                    int c=5;
                    int [][] matriz = new int [5][5];
                    
                    llenar2(f,c);
                   // imprimir(llenar2(f,c));
                    
                    System.out.println("""
                                       1. Spack = 1
                                       2. lizard = 2
                                       3. rock = 3
                                       4. Paper = 4
                                       5. Scissor = 5
                                       """);
                    
                    System.out.println("elija que quiera usar: ");
                    int opp=leer.nextInt();
                    
                    int maquina=1+ran.nextInt(5);
                    
                    
                    if(opp==1){
                        System.out.println("Spack");
                    }else if(opp==2){
                        System.out.println("lizard");
                    }else if(opp==3){
                        System.out.println("rock");
                    }else if(opp==4){
                        System.out.println("paper");
                    }else if(opp==5){
                        System.out.println("Scissor");
                    }
                    
                    switch(maquina){
                        case 1:
                            System.out.println("maquina eligio spack ");
                            if(1>5||1>3){
                                System.out.println("Gana la maquina");
                            }else{
                                System.out.println("perdiste");
                            }
                            break;
                            
                        case 2:
                            System.out.println("maquina eligio lizard ");
                             if(2>1||2>4){
                                System.out.println("Gana la maquina");
                            }else{
                                System.out.println("perdiste");
                            }
                            break;
                            
                        case 3:
                            System.out.println("maquina eligio rock");
                             if(3>2||3>5){
                                System.out.println("Gana la maquina");
                            }else{
                                System.out.println("perdiste");
                            }
                            break;
                            
                        case 4:
                            System.out.println("maquina eligio paper ");
                             if(4>3||4>1){
                                System.out.println("Gana la maquina");
                            }else{
                                System.out.println("perdiste");
                            }
                            
                            break;
                            
                        case 5:
                            System.out.println("maquina eligio scissor");
                             if(5>1||5>2){
                                System.out.println("Gana la maquina");
                            }else{
                                System.out.println("perdiste");
                            }
                            
                            break;
                            
                        default:
                            
                            break;
                    
                }
                            
                    
                    break;
                    
                case 3:
                    
                    menu=false;
                    System.out.println("Has salido del menu...");
                    
                    break;
                    
                default:
                    
                    System.out.println("opcion invalida ");
                    break;
                    
                
            }
        }
    }
    
    public static int [][] llenar(int f, int c){
        int max=f*c;
        int [][] matriz = new int [f][c];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                int random=1+ran.nextInt(max);
                
                while(revisarRepetidos(matriz,random)){
                    random=1+ran.nextInt(max);
               }
                matriz[i][j]=random;
                
            }
        }
        return matriz;
    }
    
    public static boolean revisarRepetidos(int [][] matriz, int num){
        
        boolean numero= false;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
               if(matriz[i][j]==num){
                   numero=true;
               }
            }
        }
        return numero;
    }
    
    public static int [][] disparo1(int [][]matriz, int num, int camb){
        int [][] temporal = matriz;
        boolean vali=RevisarBalazos(matriz,num);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
  
                if(matriz[i][j]==num){
                    temporal[i][j]=camb;
                }
            }
        }
        
        return temporal;
    }
    

    public static boolean RevisarBalazos(int [][] matriz, int num){
        
        boolean numero = false;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
               if(matriz[i][j]==num){
                   numero=true;
               }
            }
        }
        return numero;
    }
    
    public static void imprimir(int [][]matriz){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]"+"\t");
                
            }
            System.out.println("");
        }
        
    }
    
    //funciones ejercicio 2
    public static int [][] llenar2(int f, int c){
        
        int [][] matriz = new int [f][c];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j]=1+ran.nextInt(5);
               
            }
        }
        return matriz;
    }
}
