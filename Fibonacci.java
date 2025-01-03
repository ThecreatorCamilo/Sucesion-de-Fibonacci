/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author camilovelandia
 */
/* ESTE ALGORITMO SE EJECUTA DE LA MISMA MANERA QUE EL DE ABAJO
public class Fibonacci {
     

     public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        
        Map<Integer,Integer> cache = new HashMap<>();
        System.out.println(fibo(5, cache));
        System.out.println(fibo(4, cache));
        System.out.println(fibo(3, cache));
        System.out.println(fibo(2, cache));
        System.out.println(fibo(1, cache));
     }
    
    public static int fibo(int n, Map<Integer,Integer>cache){
        if ( n <= 2 ) {
            return 1;
        } if(cache==null){
            cache = new HashMap<Integer,Integer>();
        }else if (cache.containsKey(n)) {
            return cache.get(n);
        }else{
            cache.put(n, fibo(n-1,cache) + fibo(n-2,cache));
            System.out.println("fibonacci de " + n);
            
        }
        return cache.get(n);
    }    
    
}
*/
public class Fibonacci {
   
    public static HashMap<Integer,Long> cache = new HashMap<>();

    public Long get(Integer n) {
        if ( n <= 2 ) {
            return 1L;
        } else if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            Long result = get(n-1) + get(n-2);
            cache.put(n, result);
            System.out.println("Calculate once for " + n);
            return result;
        }
    }
    
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.get(5));
        System.out.println(f.get(4));
        System.out.println(f.get(3));
        System.out.println(f.get(2 ));
        System.out.println(f.get(1));
    }

}

