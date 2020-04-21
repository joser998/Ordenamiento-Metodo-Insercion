import java.util.Scanner;
public class Holas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("¿Cuantos numeros deseas ordenar?");
        int cantidad=sc.nextInt();
        
        int [] numeros = new int [cantidad];
        
        System.out.println("Guardar Numeros:");
        for(int i=0; i<numeros.length; i++){
            System.out.print("Numero: ");
            numeros[i]=sc.nextInt();
        }
        
        //Ordenamiento Metodo Insercion
        for(int i=0; i<numeros.length; i++){
            int pos=i;
            int aux=numeros[pos];
            while(pos > 0 && numeros[pos-1] > aux){
                numeros[pos]=numeros[pos-1];
                pos--;
            }
            numeros[pos]=aux;
        }
        
        //Mostrando Numeros Menor a Mayor
        System.out.println("\nNumeros Menor a Mayor:");
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
        
        //Mostrando Numeros Mayor a Menor
        System.out.println("\nNumeros Mayor a Menor:");
        for(int i=numeros.length-1; i>=0; i--)
            System.out.println(numeros[i]);
        
        
    }
}
