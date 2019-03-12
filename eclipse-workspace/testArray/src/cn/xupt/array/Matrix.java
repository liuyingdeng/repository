package cn.xupt.array;
/**
 * @author Administrator
 *
 */
public class Matrix {
	
	//打印指定的矩阵
	public static void printArray(int[][] c) {
				for(int i=0;i<c.length;i++) {
					for(int j=0;j<c.length;j++) {
						System.out.print(c[i][j]+"\t");
					}
					System.out.println();
				}
	}
	
	//矩阵的加法			
	public static int[][] add(int[][] a,int[][] b){
		int[][] c=new int[a.length][a.length];
		for(int i=0;i<c.length;i++)
			for(int j=0;j<c.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		return c;
	}
	
	public static void main(String[] args){
		int[][] a= {
				{2,3},
				{4,5},				
		};
		int[][] b= {
				{5,3},
				{3,5},				
		};
		int[][] c=add(a,b);
		printArray(c);

		}
	}

