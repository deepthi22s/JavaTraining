class BufferReplaceWork{
	public static void main(String[] args){
		StringBuffer sb= new StringBuffer("this is replaced");
		sb.replace(5,7,"was");
		System.out.println(sb);
	}
}