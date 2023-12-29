package topic32_1aug_data_structure;
import java.util.Stack;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Student> mystack=new Stack();
//Stack<String> mystring=new Stack<>();//new Stack declaration
mystack.push(new Student("akki",12));//stack and object in one line

//Student ele=new Student("ak",255);
//mystack.push(ele);  //spliitting object and stack;
mystack.push(new Student("akkig",122));

mystack.push(new Student("mahi",02));

Student temp=(Student) mystack.pop();
System.out.println(temp);
}

}
