fun main() {
    school("akirachix","highway","Hope","Moleni")
    println(word(30,30,10))
    numbers()


}
//no1
fun school(name1:String,name2:String,name3:String,name4:String){
    var names= arrayOf(name1,name2,name3,name4)
    println(names.contentToString())
}
//no2
fun word(num1:Int,num2:Int,num3:Int):Int{
    var num=num1*num2*num3
    return (num)
}

//no3
fun numbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))
}
//no4
fun words(words:Array<String>){
    var nam= arrayOf<String>("edna","dew","kile")
    println(nam.contentToString())
}

