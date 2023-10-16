package com.lambda;
interface Message{
	abstract  void message(String msg);
}
public class LambdaExpression {

	public static void main(String[] args) {
Message m= (msg) ->System.out.println(msg);
m.message("Java 8 features");
	}

}
