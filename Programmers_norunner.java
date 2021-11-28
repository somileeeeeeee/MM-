package CodingTest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Programmers_norunner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)

        // 완주한 사람들은 Value에서 1을 빼는 동작을 해서 만약 비교 시 a,b,c->a,b의 상황에서 
        //  c가 완주못함을 알 수 있기 위해서
        //  결과적으로 남아있는 한 사람이 완주하지 못한 선수가 됨.
            map.put(player, map.getOrDefault(player, 0)+1); // getOrDefault는 Key에 해당하는 Value있으면 가져오고, 아닐경우 0을 Default로 지정해 사용
        
        for (String player : completion) 
            map.put(player, map.get(player)-1);


            // 자바의 컬렉션에 저장되어 있는 요소들을 읽어오는 방법의 인터페이스.
            // 즉 컬렉션으로부터 정보를 얻어내는 인터페이스
            Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        
        // 반복자를 사용해 순회함
        while(iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
        }

        public static void main(String[] args) {
            String[] part = {"a", "b", "c"};
            String[] com = {"c", "b"};
            Programmers_norunner sol = new Programmers_norunner();
            System.out.println(sol.solution(part, com));
        }


    
}
