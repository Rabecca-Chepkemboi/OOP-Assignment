fun main() {
var chep= Human("Rabecca", 24, 56)
    chep.eat(6)
    println(chep.weight)

    chep.speak("I am a brave girl")

    chep.birthday()
    println(chep.age)

    val myDetail= Detail("Rabecca", "Chepkemboi","chepkemboirabecca@gmail.com","0716607726","becca 57")
    println(myDetail.email)
    println(myDetail.password)
}
class Human(var name: String, var age: Int, var weight: Int){
    fun eat(foodWight: Int){
        println("I am eating $foodWight Kg of food")
        weight +=foodWight

    }
    fun speak(speech: String){
        println(speech)
    }
    fun birthday(){
       age +=1
    }

}
data class Detail(var fistName: String, var lastName: String, var email: String, var phoneNumber: String, var password: String ){

}