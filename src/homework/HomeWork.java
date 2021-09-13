/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner in = new Scanner(System.in);
        System.out.print("Введите значение в цельсиях: ");             
        float  celsius = in.nextFloat(); 
         double Fahrenh = celsius * (9.0 / 5.0) + 32;
            System.out.println("Ваше значение в цельсиях:"+celsius);
            System.out.println("Этоже значение в форенгейтах:"+(float) Fahrenh);
            //Тут переводим из форингейт в цельсию
                         System.out.println("Обратная функция");             
             System.out.print("Введите значение в форингейтах: ");             
        float FahrenhnextFloat = in.nextFloat(); 
         double celsiusFl = (FahrenhnextFloat -32) * (5.0 / 9.0);
            System.out.println("Ваше значение в форенгейнах:"+FahrenhnextFloat);
            System.out.println("Это же значение Цельсия:"+(float) celsiusFl);
    }
}
