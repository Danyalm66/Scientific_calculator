import java.util.ArrayDeque;



import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostfixConversionAndEvaluations {
	 private  Deque<Double> stack2 = new ArrayDeque<Double>();
	 private  Deque<String> stack = new ArrayDeque<String>();
	 private  List<String> postfix = new ArrayList<String>(); // To hold the postfix expression
	 public  List<String> tokens = new ArrayList<String>(); 

	 public PostfixConversionAndEvaluations(String infix){
	        StringBuilder temp = new StringBuilder();
	        for(int i = 0; i != infix.length(); i++)
            {          
                if(Character.isDigit(infix.charAt(i)) || (i==0 && (infix.charAt(i)=='-' || infix.charAt(i)=='+')) || ((infix.charAt(i)=='-' || infix.charAt(i)=='+') && infix.charAt(i-1) == '^' ))
                		
                {
                    /* If we encounter a digit, read all digit next to it and append to temp
                     * until we encounter an operator.118*2+1
                     */
                    temp.append(infix.charAt(i));

                    while((i+1) != infix.length() && (Character.isDigit(infix.charAt(i+1)) 
                                                      || infix.charAt(i+1) == '.'))
                    {
                        temp.append(infix.charAt(++i));
                    }


                    /* If the loop ends it means the next token is an operator or end of expression
                     * so we put temp into the postfix list and clear temp for next use
                     */
                    tokens.add(temp.toString());
                    temp.delete(0, temp.length());
                }
                else
                	temp.append(infix.charAt(i));
                if(isOperator(temp.toString())){
                	tokens.add(temp.toString());
               		temp.delete(0, temp.length());
               		}else
               			if(isParen(temp.toString())){
               				tokens.add(temp.toString());
                			temp.delete(0, temp.length());
                			}    			
                }
    		for(int i = 0; i != tokens.size(); ++i)
            {           
                if(!isOperator(tokens.get(i)) && !isParen(tokens.get(i)))
                {
                    postfix.add(tokens.get(i));
                }
                else
                	inputToStack(tokens.get(i));
    			
    	}
            clearStack();
            
	 }
	 public boolean isOperator(String op){
	    	if(op.equals("\u221A") || op.equals("x\u221A") || op.equals("Mod") || op.equals("hSin") || op.equals("hCos") || op.equals("hTan") || op.equals("asin") || op.equals("acos") || op.equals("atan") || op.equals("sin") || op.equals("tan") || op.equals("cos") || op.equals("log") || op.equals("ln") || op.equals("!") || op.equals("sqrt") || op.equals("C")|| op.equals("P") || op.equals("e")|| op.equals("%") || op.equals("*") || op.equals("+") || op.equals("-") || op.equals("/") || op.equals("^")){
	    		return true;
	    	}else 
			   return false;
	   }   
	 private void inputToStack(String input)
	   {
	       if(stack.isEmpty() || input.equals("(") )
	           stack.addLast(input);
	       else 
	       {
	           if(input.equals(")"))
	           {
	               while(!stack.getLast().equals("("))
	               {
	                   postfix.add(stack.removeLast());
	               }
	               stack.removeLast();
	           }
	           else 
	           {
	               if(stack.getLast().equals("("))
	                   stack.addLast(input);
	               else
	               {
	                   while(!stack.isEmpty() && !stack.getLast().equals("(") && 
	                           getPrecedence(input) <= getPrecedence(stack.getLast()))
	                   {
	                       postfix.add(stack.removeLast());
	                   }
	                   stack.addLast(input);
	               }
	           }
	       }
	   }
	       private int getPrecedence(String op)
	       {
	    	   if( op.equals("\u221A") ||op.equals("x\u221A") || op.equals("Mod") || op.equals("hSin") || op.equals("hCos") || op.equals("hTan") || op.equals("asin") || op.equals("acos") || op.equals("atan") || (op.equals("sin") || op.equals("cos") || op.equals("tan") || op.equals("log") || op.equals("ln") || op.equals("!") || op.equals("C") || op.equals("P") || op.equals("e")|| op.equals("%") || op.equals("sqrt")))
	    		   return 4;
	    	   else if (op.equals("+") || op.equals("-"))
	    		   return 1;
	    	   else if (op.equals("*") || op.equals("/"))
	    		   return 2;
	    	   else if (op.equals("^"))
	    		   return 3;
	    	   else 
	    		   return 0;
	    	   }  
	       private void clearStack()
	       {
	           while(!stack.isEmpty())
	           {
	               postfix.add(stack.removeLast());
	           }
	       }
	       public double result()
	       {	
	           for(int i = 0; i != postfix.size(); i++)
	           {
	               // Determine if current element is digit or not
	               if(!isOperator(postfix.get(i)))
	               {
	                   stack2.addLast(Double.parseDouble(postfix.get(i)));
	               }
	               else 
	               {
	                   double tempResult = 0;
	                   double temp = 0;

	                   switch(postfix.get(i))
	                   {
	                       case "+": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = stack2.removeLast() + temp;
	                    	   break;

	                       case "-": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = stack2.removeLast() - temp;
	                    	   break;

	                       case "*": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = stack2.removeLast() * temp;
	                    	   break;

	                       case "/": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = stack2.removeLast() / temp;
	                    	   break;
	                       case "^":
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.pow(stack2.removeLast(), temp);
	                    	   break;
	                       case "sin": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.sin(temp);
	                    	   break;
	                       case "cos": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.cos(temp);
	                    	   break;
	                       case "tan": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.tan(temp);
	                    	   break;
	                       case "asin": 	
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.asin(temp);
	                    	   break;
	                       case "acos":
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.acos(temp);
	                    	   break;
	                       case "atan": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.atan(temp);
	                    	   break;
	                       case "hSin": 	
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.sinh(temp);
	                    	   break;
	                       case "hCos":
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.cosh(temp);
	                    	   break;
	                       case "hTan": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.tanh(temp);
	                    	   break;
	                       case "log": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.log10(temp);
	                    	   break;
	                       case "ln": 
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.log(temp);
	                    	   break;
	                       case "sqrt":
	                    	   temp = stack2.removeLast();
	                    	   tempResult = Math.sqrt(temp);
	                    	   break;
	                       case "!":
	                    	   temp = stack2.removeLast();
	                    	   tempResult = factorial(temp);
	                    	   break;
	                      case "C":
	                    	  temp = stack2.removeLast();
	                    	  double n = stack2.removeLast();
	                    	  if(n>=temp){
	                    		  tempResult = factorial(n)/(factorial(temp)*factorial(n - temp));
	                    		  }
	                    	  break;
	                      case "P":
	                    	  temp = stack2.removeLast();
	                    	  double N = stack2.removeLast();
	                    	  if(N>=temp){
	                    		  tempResult = factorial(N)/factorial(N - temp);
	                    		  }
	                    	  break;
	                      case "e": 	
	                    	  tempResult = Math.E;
	                    	  break;
	                      case "%":
	                    	  temp = stack2.removeLast();
	                    	  tempResult = temp/100;
	                    	  break;
	                      case "Mod":
	                    	  temp = stack2.removeLast();
	                    	  tempResult = stack2.removeLast() % temp;
	                    	  break;
	                      case "x\u221A":
	                    	  temp = stack2.removeLast();
	                    	  tempResult = Math.pow(temp, 1/stack2.removeLast());
	                    	  break;
  	         			  default:
  	         				  tempResult = stack2.removeLast();
  	         				  break;
	                       
	                   }
	                   stack2.addLast(tempResult);
	               }
	           }
	           return new Double(stack2.removeLast());
	       }
	       public boolean isParen(String inp){
	    	   if(inp.equals("(") || inp.equals(")"))
	    		   return true;
	    	   else 
	    		   return false;
	       }
	       public int factorial(double num){
	   		int i,fact=1;  
	   		  int number=(int) num;
	   		  for(i=1;i<=number;i++){    
	   		      fact=fact*i;    
	   		  }
	   		  return fact;
	   	}

	       

            

	 }
