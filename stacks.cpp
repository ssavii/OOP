#include<iostream>
using namespace std;

class Stacks{
	int *arr;
	
	public:
		int top;
		Stacks(int size);
		~Stacks();
		void push(int num);
		void pop();
		void display();
};

Stacks::Stacks(int n){
	arr=new int[n];
	top=-1;
}

Stacks::~Stacks(){
	delete[] arr;
}

void Stacks::display(){
	cout<<"The stack is :"<<endl;
	for(int i=top;i>=0;i--){
		cout<<arr[i]<<endl;
	}
}

void Stacks::push(int num){
	top++;
	arr[top]=num;
	display();
}

void Stacks::pop(){
	int temp;
	temp=arr[top];
	top--;
	cout<<"Popped element is :"<<temp<<endl;
}

int main(){
	int n,ch,data;
	cout<<"Enter size of Stack : ";
	cin>>n;
	Stacks s1(n);
	do{
		cout<<"\nMenu\n1.Push\n2.Pop\n3.Display\n4.Exit"<<endl;
		cin>>ch;
		switch(ch){
			case 1:
				cout<<"Enter element to be pushed : ";
				cin>>data;
				if(s1.top==n-1){
					cout<<"Stack is full"<<endl;
				}
				else{
					s1.push(data);
				}
				break;
		
			case 2 :
				if(s1.top==-1){
					cout<<"Stack is empty"<<endl;
				}
				else{
					s1.pop();
				}
				break;
				
			case 3:
				if(s1.top==-1){
					cout<<"Stack is empty"<<endl;
				}
				else{
					s1.display();
				}
				break;
		}
				
	}while(ch!=4);
	return 0;
