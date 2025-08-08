import java.util.*;

class NageException extends Exception {
    NageException(String s) {
        super(s);
    }
}

class UserDefinedException {
    void decideAge(int age) throws NageException {
        if (age <= 0) {
            throw new NageException("age should be greater than 0");
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        UserDefinedException ob = new UserDefinedException();
        try {
            int a = s.nextInt();
            ob.decideAge(a);
            System.out.println("age is " + a);
        } catch (InputMismatchException e) {
            System.out.println("input must be integer");
        } catch (NageException e) {
            System.out.println(e);
        }
    }
}
