package programmers.hash;

import java.util.Arrays;

class MarathonCompletion {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        
        for(i=0;i<completion.length;i++) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];						
        	}
        	
        }
        return participant[i];
    }
    
    public static void main(String[] args) {
    	String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    	String[] completion = {"marina", "josipa", "nikola", "filipa"}; 
    	System.out.println(solution(participant, completion));
	}
}

