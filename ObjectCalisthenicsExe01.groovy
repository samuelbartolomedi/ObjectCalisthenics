public class BankAccount {
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }
        public void processTransactions(List<Transaction> transactions) {
        for (Transaction transaction : transactions) {
            string type = GetTransactionType(transaction);
            if (type.equals("deposit")){
                SaveDeposit(transaction);
            }
            if (type.equals("withdraw")){
                SaveWithdraw(transaction);
            }
        }
    }

    public void SaveWithdraw(Transaction transaction){
        if (transaction.getAmount() > 0){
            balance += transaction.getAmount();
            transactionHistory.add("Withdrew: " + transaction.getAmount());
        }
        else{
            transactionHistory.add("Invalid withdrawal amount: " + transaction.getAmount());
        }
    }

    public void SaveDeposit(Transaction transaction){
        if (transaction.getAmount() > 0){
            balance += transaction.getAmount();
            transactionHistory.add("Deposited: " + transaction.getAmount());
        }
        else{
            transactionHistory.add("Invalid deposit amount: " + transaction.getAmount());
        }
    }


    public string GetTransactionType(Transaction transaction){
        string type = "";
        if (transaction.getType().equals("deposit")){
            type = "deposit";
            return type;
        }
        if (transaction.getType().equals("withdraw")){
            type = "withdraw";
            return type;
        }
    }
}