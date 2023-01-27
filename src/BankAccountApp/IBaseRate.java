
package BankAccountApp;

    public interface IBaseRate {

        // Write a methods that returns the base rate
        default double getBaseRate(){
            return 2.5;
        }
    }



