class Solution {
    public boolean vowel(char ch) {
		boolean flag =false;
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' ) {
			flag = true;
		}
		return flag;
	}
    public String reverseVowels(String arr) {
        char [] ch = arr.toCharArray();
		int start =0;
		int end = arr.length()-1;
		while(start<end) {
			if(!vowel(ch[start])) {
				start++;
			}else if(!vowel(ch[end])) {
				end--;
			}else {
				char p = ch[start];
				ch[start] = ch[end];
				ch[end] = p;
				start++;
				end--;
			}
		}

		return String.valueOf(ch);
        
    }
}