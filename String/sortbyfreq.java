import java.util.*;


public class sortbyfreq {

    // Method to sort characters by frequency
    public List<Character> freqs(String s){
        //// Array to hold frequency and character for 'a' to 'z'
        Pair [] freq = new Pair[26];

        for (int i = 0; i<26; i++){
            freq[i] = new Pair(0, (char)(i+'a'));

        }

        for(char ch : s.toCharArray()){
            freq[ch -'a'].freq++;
        }

        List <Character> result = new ArrayList<>();

        for(Pair p :freq){
            if(p.freq>0) result.add(p.ch);
        }

        return result;
    } 

    class Pair{
        int freq;
        char ch;

        Pair(int f, char c){
            this.freq = f;
            this.ch = c;
        }
    }
    
}
