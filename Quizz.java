
import java.util.Scanner;
 interface methods{
 void addition();
 void subtraction();
 void multiplication();
 void division();
 }
 public class Quizz{
Scanner scan = new Scanner(System.in);
int count = 0;
 	int count1 = 0;
 public void addition(){
 	
 	for(int i =0;i<=5;i++){
 float a =(float)Math.ceil(Math.random()*100);
 float b = (float)Math.ceil(Math.random()*100);
 System.out.println(a +" "+" + "+b);
float answer = a + b;
System.out.println("please input your answer");
double c = scan.nextDouble();
if(c == answer){
	System.out.println("correct");
	count++;
}
else{
	System.out.println("not correct");
	System.out.println("The correct answer is "+ answer);
	count1++;
}

 }System.out.println("Correct answers "+count);
System.out.println("Not Correct answers "+count1);

}
 public void subtraction(){

 	for(int i =0;i<=5;i++){
 float a =(float)Math.ceil(Math.random()*100);
 float b = (float)Math.ceil(Math.random()*100);
 
 float answer = 0;
 if( a > b){
 	System.out.println(a +" "+" - "+b);
 answer = a - b;
}
else{
System.out.println(b +" "+" - "+a);
 answer = b - a;
}
System.out.println("please input your answer");
float c = scan.nextFloat();
if(c == answer){
	System.out.println("correct");
	count++;
}
else{
	System.out.println("not correct");
	System.out.println("The correct answer is "+ answer);
	count1++;
}
 }
 System.out.println("Correct answers "+count);
System.out.println("Not Correct answers "+count1);
}
 public void multiplication(){
 	
 	for(int i =0;i<=5;i++){
 double a = Math.ceil(Math.random()*100);
 double b = Math.ceil(Math.random()*100);
  System.out.println(a +" "+" * "+b);
double answer = a * b;
System.out.println("please input your answer");
double c = scan.nextDouble();
if(c == answer){
	System.out.println("correct");
	System.out.println();
	count++;
}
else{
	System.out.println("not correct");
	System.out.println("The correct answer is "+ answer);
	count1++;
}
 }
 System.out.println("Correct answers "+count);
System.out.println("Not Correct answers "+count1);
}
 public void division(){
 	
 	for(int i =0;i<=5;i++){
 int a = (int)Math.ceil(Math.random()*100);
 int b = (int)Math.ceil(Math.random()*100);
  
  int answer;
  if( a > b){
  	System.out.println(a +" "+" / "+b);
answer = a / b;
}
else{
	System.out.println(b +" "+" / "+a);
	answer = b / a;
}
System.out.println("please input your answer");
int c = scan.nextInt();
if(c == answer){
	System.out.println("correct");
	count++;
}
else{
	System.out.println("not correct");
	System.out.println("The correct answer is "+ answer);
	count1++;
}
 }
 System.out.println("Correct answers "+count);
System.out.println("Not Correct answers "+count1);
}


 


 public static void main(String [] args){
 	Scanner scan1 = new Scanner(System.in);
Quizz maths = new Quizz();
System.out.println("Please select an area you would like to perfect");
System.out.println("option 1: ADDITION");
System.out.println("option 2: SUBTRACTION");
System.out.println("option 3: MULTIPLICATION");
System.out.println("option 4: DIVISION");
System.out.println();
int option = scan1.nextInt();
switch(option){
case 1:
	maths.addition();
	break;
case 2:
	maths.subtraction();
	break;
case 3:
	maths.multiplication();
	break;
case 4:
	maths.division();
	break;
}
 }
 }