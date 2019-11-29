package programmers.stackAndQue;

import java.util.Stack;

public class TopTower {
	public static int[] solution(int[] heights) {
		Stack<Integer> st = new Stack<Integer>();
		int sender_len = heights.length;
		int receiver = 0, sender = 0;
		int[] answer = new int[heights.length];

		for (int i = 0; i < sender_len; i++) {
			st.push(heights[i]);
		}

		for (int sdr_idx = sender_len - 1; sdr_idx >= 0; sdr_idx--) {
			sender = st.pop();

			int rNum = 0;
			while (!st.empty()) {
				receiver = st.pop();
				rNum++;
				if (receiver > sender) {
					answer[sdr_idx] = (sdr_idx - rNum) + 1;
					break;
				}
			}
			for (int i = sdr_idx - rNum; i < sdr_idx; i++) {
				st.push(heights[i]);
			}
		}
		return answer;
	}
}
