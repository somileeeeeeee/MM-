package CodingTest;
import java.util.HashMap;

public class Programmers_phonelist {
    
    public boolean solution(String[] phone_book) {
        
        // 1. hashMap 을 선언
        HashMap<String, Integer> map = new HashMap<>();

        // 2. 모든 전화번호는 HashMap에 넣음
        for (int i=0; i < phone_book.length ; i++)
            map.put(phone_book[i],i);
            System.out.print(map);

        // 3. 모든 전화번호의 substring이 HashMap에 존재하는 지 확인함
        for (int i =0; i<phone_book.length;i++)
            for(int j=0; j<phone_book[i].length();j++)
                if(map.containsKey(phone_book[i].substring(0,j)))
                    
                    return false;
        return true;
    }
    public static void main(String[] args) {
        String[] phone_book = {"119", "333","1194"};
        Programmers_phonelist sol = new Programmers_phonelist();
        sol.solution(phone_book);


}



}
