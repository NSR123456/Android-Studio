//rock, paper, scissor consol app
package com.example.rpc

fun main(){
    var useChoice = ""
    var computerChoice = ""
    print("Enter Rock, Paper or Scissors: ")
    useChoice = readLine().toString()
    var random =(1..3).random()

    if(random==1){
        computerChoice = "Rock"

    } else if(random ==2){
        computerChoice = "Paper"
    } else{
        computerChoice = "Scissors"
    }

    println("Computer Choice: $computerChoice")
    if(useChoice == computerChoice){
        println("It's a DRAW!")
    } else if(useChoice=="Rock"&&computerChoice=="Scissors" ||
        useChoice=="Paper"&&computerChoice=="Rock" ||
        useChoice == "Scissors"&&computerChoice=="Paper") {
        println("User Wins!!")
    }else{
        println("Computer Wins!!")
    }
}
