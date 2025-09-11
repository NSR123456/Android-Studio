package com.example.bankaccount

import androidx.collection.mutableIntSetOf

class BankAccount (var name: String, var balance: Double){
   var history = mutableListOf<String>()

    fun deposit(amount:Double){
        balance+=amount
        history.add("Deposited $amount --Balance: $balance")
    }

    fun withdraw(amount: Double){
        if(amount > balance){
            println("Insufficient balance!!")
        }
        else{

            balance -= amount
            history.add("Withdrawn $amount -- Balance: $balance")
        }
    }
    fun checkBalance(){
        println("Balance: $balance")
    }

    fun checkHistory(){
        if(history.isEmpty()){
            println("No transaction yet!")
        }
        else{
            history.forEach{ println(it)}
        }
    }

}
