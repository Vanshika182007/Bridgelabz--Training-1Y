import java.util.*;

class Transaction {
    int id;
    Transaction(int id){ this.id=id; }
}

class Account {
    int id;
    Account(int id){ this.id=id; }

    public boolean equals(Object o){
        return o instanceof Account && ((Account)o).id==this.id;
    }
    public int hashCode(){ return Objects.hash(id); }
}

public class BankSystem {
    public static void main(String[] args) {
        List<Transaction> all = new ArrayList<>();
        Queue<Transaction> queue = new LinkedList<>();
        Stack<Transaction> rollback = new Stack<>();
        Set<Account> accounts = new HashSet<>();

        accounts.add(new Account(1));

        queue.add(new Transaction(1));

        while (!queue.isEmpty()) {
            Transaction t = queue.poll();
            rollback.push(t);
            System.out.println("Processed: " + t.id);
        }

        // rollback
        System.out.println("Undo: " + rollback.pop().id);
    }
}