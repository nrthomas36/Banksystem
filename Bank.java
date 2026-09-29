import java.util.*;

public class Bank{
    public static void main(String[] args){
        HashMap<Customer, List<Account>> customerAccounts = new HashMap<>();
        
        Customer john = new Customer("John Doe", 101);
        Account savings = new Account("Savings");
        
        customerAccounts.put(john, new ArrayList<>());
        customerAccounts.get(john).add(savings);

        System.out.println("Customer: " + john.getName() + ", Account Type: " + savings.getAccountType());
    }
}