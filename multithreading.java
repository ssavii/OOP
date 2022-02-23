public class MultiThreads
{
 public static void main(String args[])
 {
  Chat m = new Chat();
  new T1(m);
  new T2(m);
 }
}

class Chat
{
 boolean flag = false;
 public synchronized void FromFrank(String msg){
  if(flag) {
  try {
  wait();
  } catch(InterruptedException e) {
    e.printStackTrace();
  }
}
 System.out.println(msg);
 flag = true;
 notify();
}

public synchronized void FromJoe(String msg){
 if(!flag) {
  try {
  wait();
  } catch(InterruptedException e) {
    e.printStackTrace();
    e.getMessage();
  }
}
 System.out.println(msg);
 flag = false;
 notify();
  }
}

class T1 implements Runnable {
Chat m;
String[] s1 = {"Hello Joe", "How are you?", "I am also doing fine!"};

public T1(Chat m1){
 this.m = m1;
 new Thread(this,"Frank").start();
 }

public void run() {
 for (int i=0; i < s1.length; i++) {
     
	m.FromFrank(s1[i]);
    }
   }
}

class T2 implements Runnable {
Chat m;
String[] s2 = {"Hi Frank", "I am good, and you?", "Will catch up later"};

public T2(Chat m2){
 this.m = m2;
 new Thread(this,"Joe").start();
 }

public void run() {
 for (int i=0; i < s2.length; i++) {
     m.FromJoe(s2[i]);
    }
   }
}
