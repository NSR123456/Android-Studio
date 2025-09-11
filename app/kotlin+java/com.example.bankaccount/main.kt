package com.example.bankaccount

fun main(){
    var acc = BankAccount( name ="John Doe", 1000.0)
    while(true){
        println("=========Bank Acoount Menu==============")
        println("1. Deposit")
        println("2. Withdraw")
        println("3. Balance Check")
        println("4. Transaction History")
        println("5. Exit")

        print("Enter your choice: ")
        var ch = readln()?.toInt()

        when(ch){
            1 ->{
                print("Enter amount to deposit: ")
                var dep = readln().toDouble()
                acc.deposit(dep)
            }
            2 ->{
                print("Enter amount to withdraw: ")
                var wit = readln().toDouble()
                acc.withdraw(wit)
            }
            3 -> {
                acc.checkBalance()
            }
            4 -> {
                acc.checkHistory()
            }
            5 -> {
                println("Exiting the program")
                break
            }
            else -> {
                println("Invalid choice, please try again!")
            }
        }
    }

}
