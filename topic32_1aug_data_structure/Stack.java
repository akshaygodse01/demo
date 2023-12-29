package topic32_1aug_data_structure;

public class Stack {

	private int size;
private int top;
private int[]data;
public Stack(int size, int top, int[] data) {

	this.size = size;
	this.top = 0;//
	data=new int[this.size];
}
public Stack(int i) {
	// TODO Auto-generated constructor stub
this.size=size;
}
void push (int ele) {
	data[this.top]=ele;
	this.top++;
	
}
int pop() {
	this.top--;
	return data[this.top];
}
void display() {
	for (int i=(this.size-1);i>=0;i++)
	{if(i>=this.top) {
		System.out.printf("[]\n");
	}
	else
	{
		System.out.printf("%4d",this.data[i]);//stack display
	}}
}
	

}
