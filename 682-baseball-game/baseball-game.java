class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i].equals("C")) st.pop();
			else if(arr[i].equals("D")) {
				int s = st.peek();
				st.push(s*2);
			}
			else if(arr[i].equals("+")) {
				int top = st.pop();
				int dow= st.peek();
				int sum = top+dow;
				st.push(top);
				st.push(sum);
			}else {
				st.push(Integer.parseInt(arr[i]));
			}
		}
		int sum =0;
		while(!st.isEmpty()) {
			sum+=st.pop();
		}
		return sum;
        
    }
}