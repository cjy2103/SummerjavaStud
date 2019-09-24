import java.util.Stack;

public class Ex5 {
    public static void main(String[] args) {
        String e="34 12 25/*";
        System.out.println(postfixEval(e));

    }
    private static double postfixEval(String e) {
        Stack<Double> stack=new Stack<>();
        String s="";
        for (Character c : e.toCharArray()) {
            if("+-*/".indexOf(c)>=0) s+=" "+c+" ";
            else s+=c;
        }
        for (String token : s.split("\\s+")) {
            if(" + - * / ".contains(token)){
                double n2=stack.pop();
                double n1=stack.pop();
                if(token.equals("+")) stack.push(n2+n1);
                else if(token.equals("-")) stack.push(n2-n1);
                else if(token.equals("*")) stack.push(n2*n1);
                else if(token.equals("/")) stack.push(n2/n1);
            }
            else stack.push(Double.parseDouble(token));
        }
        return stack.pop();
    }
}
