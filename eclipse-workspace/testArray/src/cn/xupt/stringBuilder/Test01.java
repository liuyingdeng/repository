package cn.xupt.stringBuilder;

/**
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("abcdefghigklmnopqrstuvwxyz");
		sb.delete(3,5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}