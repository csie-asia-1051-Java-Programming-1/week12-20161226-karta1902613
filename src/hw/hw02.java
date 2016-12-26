package hw;
/*
 * Topic: 輸入一段文字 ( 限制為 ASCII 表中，編號 32 至 125 之字元 ) ，將它們每個字元 依照鍵盤的位置，印出它們右邊的字元，若右邊按鍵有兩層字元 
 *( 如 : 和 ; 位於同 一按鍵上 ) ，則輸出下層字元，即 ”;” ，若該按鍵為上層字元 ( 如 !) 則輸出其右 邊按鍵之上層字元 ( 如 @) ，若輸入的字元右邊的鍵
 *為不可視按鍵，如 shift, enter,backspace 或右邊已無按鍵，如不做更動，照樣輸出。
 * Date: 2016/12/26
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        String text =scn.next();
        char data[]=text.toCharArray();
        for(int i=0;i<data.length;i++){
        	if(data[i]>=65&&data[i]<=90){
        		data[i]=(char) (data[i]+32);
        	}
        	if(data[i]=='='||data[i]==']'||data[i]==92||data[i]=='/'){
        		System.out.print(data[i]);
        	}else if(data[i]=='q'||data[i]=='i'){
        		data[i]=(char) (data[i]+6);
        		System.out.print(data[i]);
        	}else if(data[i]=='a'){
        		data[i]=(char) (data[i]+18);
        		System.out.print(data[i]);
        	}else if(data[i]=='z'){
        		data[i]=(char) (data[i]-2);
        		System.out.print(data[i]);
        	}else if(data[i]=='w'){
        		data[i]=(char) (data[i]-18);
        		System.out.print(data[i]);
        	}else if(data[i]=='s'){
        		data[i]=(char) (data[i]-15);
        		System.out.print(data[i]);
        	}else if(data[i]=='x'||data[i]=='p'){
        		data[i]=(char) (data[i]-21);
        		System.out.print(data[i]);
        	}else if(data[i]=='e'){
        		data[i]=(char) (data[i]+13);
        		System.out.print(data[i]);
        	}else if(data[i]=='d'||data[i]=='r'||data[i]==','||data[i]=='['||data[i]=='h'){
        		data[i]=(char) (data[i]+2);
        		System.out.print(data[i]);
        	}else if(data[i]=='f'||data[i]=='g'||data[i]=='k'||data[i]=='.'||data[i]=='o'||data[i]=='j'){
        		data[i]=(char) (data[i]+1);
        		System.out.print(data[i]);
        	}else if(data[i]=='c'){
        		data[i]=(char) (data[i]+19);
        		System.out.print(data[i]);
        	}else if(data[i]=='t'){
        		data[i]=(char) (data[i]+5);
        		System.out.print(data[i]);
        	}else if(data[i]=='b'){
        		data[i]=(char) (data[i]+12);
        		System.out.print(data[i]);
        	}else if(data[i]=='y'){
        		data[i]=(char) (data[i]-4);
        		System.out.print(data[i]);
        	}else if(data[i]=='n'){
        		data[i]=(char) (data[i]-1);
        		System.out.print(data[i]);
        	}else if(data[i]=='u'){
        		data[i]=(char) (data[i]-12);
        		System.out.print(data[i]);
        	}else if(data[i]=='m'){
        		data[i]=(char) (data[i]-65);
        		System.out.print(data[i]);
        	}else if(data[i]=='l'){
        		data[i]=(char) (data[i]-49);
        		System.out.print(data[i]);
        	}else if(data[i]=='-'){
        		data[i]=(char) (data[i]+16);
        		System.out.print(data[i]);
        	}else if(data[i]==39){
        		data[i]=(char) (data[i]+53);
        		System.out.print(data[i]);
        	}else if(data[i]=='v'||data[i]==';'){
        		data[i]=(char) (data[i]-20);
        		System.out.print(data[i]);
        	}else if(data[i]=='`'){
        		data[i]=(char) (data[i]-47);
        		System.out.print(data[i]);
        	}else if(data[i]>48&&data[i]<57){
        		data[i]=(char) (data[i]+1);
        		System.out.print(data[i]);
        	}else if(data[i]=='0'){
        		data[i]=(char) (data[i]-3);
        		System.out.print(data[i]);
        	}else if(data[i]=='9'){
        		data[i]=(char) (data[i]-9);
        		System.out.print(data[i]);
        	}
        }
	}
}
