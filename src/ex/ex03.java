package ex;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int ooxx[][]=new int[3][3];
        int mis=0;
        int o=0;
        int z=0;
        int i=0;
        int j=0;
        while(mis==0){
        for(i=0;i<3;i++){
        	for (j=0;j<3;j++){	     		
        		ooxx[i][j]=scn.nextInt();
        		if(ooxx[i][j]!=1&&ooxx[i][j]!=0){
        			j--;
        		}else if(ooxx[i][j]==0){
        			z++;
        		}else if(ooxx[i][j]==1){
        			o++;
        		}
        	  }
        	}
        if(o>5||z>5){
    		mis=0;
    		o=0;
    		z=0;
    		System.out.println("重新輸入");
        	}else{
        		mis=1;
        	}
        }
        for(int a=0;a<3;a++){
        	for(int b=0;b<3;b++){
        	System.out.print(ooxx[a][b]+"\t");	
        	}System.out.println("");
        	 System.out.println("");
        }
        if(ooxx[0][0]==ooxx[0][1]&&ooxx[0][1]==ooxx[0][2]){
        	System.out.print("True");
        }else if(ooxx[1][0]==ooxx[1][1]&&ooxx[1][1]==ooxx[1][2]){
        	System.out.print("True");
        }else if(ooxx[2][0]==ooxx[2][1]&&ooxx[2][1]==ooxx[2][2]){
        	System.out.print("True");
        }else if(ooxx[0][0]==ooxx[1][0]&&ooxx[1][0]==ooxx[2][0]){
        	System.out.print("True");
        }else if(ooxx[0][1]==ooxx[1][1]&&ooxx[1][1]==ooxx[2][1]){
        	System.out.print("True");
        }else if(ooxx[0][2]==ooxx[1][2]&&ooxx[1][2]==ooxx[2][2]){
        	System.out.print("True");
        }else if(ooxx[0][0]==ooxx[1][1]&&ooxx[1][1]==ooxx[2][2]){
        	System.out.print("True");
        }else if(ooxx[0][2]==ooxx[1][1]&&ooxx[1][1]==ooxx[2][0]){
        	System.out.print("True");
        }else{
        	System.out.print("False");
        }
	}
}
