package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class S_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr = br.readLine();
        String[] inputStrArr = inputStr.toUpperCase().split(""); // 각각의 글자로 대문자로 맹글어서 나누기

        Map<String,Integer> hashMap = new HashMap<>();

        for(int i =0 ; i < inputStrArr.length; i++) {
            String inputChar = inputStrArr[i] ;
            if(!hashMap.containsKey(inputChar)) {
                hashMap.put(inputChar, 1);
            } else {
                int cnt = hashMap.get( inputChar );
                hashMap.replace( inputChar, ++cnt );
            }
        }
        Collection<Integer> cntArr = hashMap.values();
        int maxCnt = Collections.max(cntArr);
        String maxChar = "";
        int chkEqual = 0;

        for(Map.Entry<String, Integer> element : hashMap.entrySet()) {
            if(element.getValue() == maxCnt) {
                maxChar = element.getKey();
                chkEqual++;
            }
            if(chkEqual == 2) {
                maxChar = "?";
                break;
            }

        }
        bw.write(maxChar);
        bw.flush();

        br.close();
        bw.close();

	}
}
