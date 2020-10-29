package loops;

public class Condition3 {
    public static void main(String[] args) {
        boolean IsElectionIsOver= false;

        if (IsElectionIsOver==false){
            System.out.println("2 more weeks for Election");
        }else{
            System.out.println("The Election is over");
        }

        if (!IsElectionIsOver==false){  //! is for NO
            System.out.println("2 more weeks for Election");
        }else{
            System.out.println("The Election is over");
        }
        if (!IsElectionIsOver){  //! is for NO
            System.out.println("2 more weeks for Election");
        }else{
            System.out.println("The Election is over");
        }
        if (IsElectionIsOver){   // Straight to get true value.
            System.out.println("2 more weeks for Election");
        }else{
            System.out.println("The Election is over");
        }
    }
}
