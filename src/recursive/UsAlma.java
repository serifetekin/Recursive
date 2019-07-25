/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive; // recursive fonk ile üslü sayı hesaplama.

/**
 *
 * @author AYBU
 */
public class UsAlma {
    
    public int pow(int taban, int us){
        if(us == 0 || taban == 1){
            return 1;
        }else if(us == 1){
            return taban;
        }else if(taban == 0){
            return 0;
        }else{
            return pow(taban,us-1)*taban;
        }
    }
}
