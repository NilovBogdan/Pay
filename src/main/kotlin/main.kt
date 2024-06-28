fun main(){
    val amount = 1000000
    val calcCommission = amount / 100 * 0.75 //Расчет комисии
    val minCommission = 35 // Минимальная комиссия
    val commission = if (calcCommission < minCommission) minCommission else calcCommission // Определение нужной комиссии
    println(commission)

}