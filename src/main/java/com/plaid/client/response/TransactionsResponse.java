package com.plaid.client.response;

import java.util.List;


public class TransactionsResponse extends AccountsResponse {

    protected List<Transaction> transactions;
    
    public List<Transaction> getTransactions() {
        return transactions;
    }
    
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
}
