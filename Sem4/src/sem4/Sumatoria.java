/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4;


public class Sumatoria {
        public int sum(int n){
            if (n==1){
                return 1;
            }else{
                return n+sum (n-1);
                
            }
        }
}
