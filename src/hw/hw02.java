package hw;
/*
 * Topic: ��J�@�q��r ( ��� ASCII ���A�s�� 32 �� 125 ���r�� ) �A�N���̨C�Ӧr�� �̷���L����m�A�L�X���̥k�䪺�r���A�Y�k����䦳��h�r�� 
 *( �p : �M ; ���P �@����W ) �A�h��X�U�h�r���A�Y ��;�� �A�Y�ӫ��䬰�W�h�r�� ( �p !) �h��X��k ����䤧�W�h�r�� ( �p @) �A�Y��J���r���k�䪺��
 *�����i������A�p shift, enter,backspace �Υk��w�L����A�p������ʡA�Ӽ˿�X�C
 * Date: 2016/12/26
 * Author: 105021043 �B�ͤ�
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
