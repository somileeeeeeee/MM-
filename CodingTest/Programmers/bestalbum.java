package CodingTest;
import java.util.*;

class Programmers_bestalbum {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();

        // hashmap에 genres와 plays 입력
        for (int i=0; i<genres.length;i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);

        }

        // key값만 가져와서 genre에 넣어줌.
        // key값만 가져오려면-> keyset
        // hashmap은 순서가 x, arraylist를 통해 idx 순서대로 정렬
        ArrayList<String> genre = new ArrayList<>();
        for (String key : map.keySet()) {
            genre.add(key);
        }

        // key값에 해당하는  value를 내림차순 정렬
        Collections.sort(genre, (o1, o2) -> map.get(o2) - map.get(o1));

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<genre.size(); i++) {
            String g = genre.get(i);

            // 해당 장르 중 play횟수가 가장 큰 인덱스를 찾음
            int max = 0;
            int firstIdx = -1;
            for(int j = 0; j < genres.length;j++) {
                if(g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }

            // 해당 장르 중 play횟수가 두번째로 큰 인덱스를 찾는다.
            max = 0;
            int secondIdx = -1;
            for(int j=0; j<genres.length;j++) {
                if(g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
                    max = plays[j];
                    secondIdx = j;
                } 
            }

            list.add(firstIdx);
            if(secondIdx >= 0) list.add(secondIdx); //secondIdx는 존재할 수도, 아닐수도 있음.
        }

        int[] result = new int[list.size()];
        for(int i=0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;


    }

}
