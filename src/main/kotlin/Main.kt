fun main(args: Array<String>) {
    val transfer1: Int = 1000
    val transfer2: Int = 455466
    taks(transfer1)
    taks(transfer2)

}

fun taks(amount: Int) {
    val kopeyka: Int = amount * 100
    var commission: Double = (kopeyka * 0.75)/100
    if (commission < 3500){
        commission = 3500.0
    }
    var cop: Int = (commission % 100).toInt()
    var rur: Int = (commission/100).toInt()

    println("Вы перевели $amount руб. Ваша коммиссия составила $rur рублей $cop копеек.")

}