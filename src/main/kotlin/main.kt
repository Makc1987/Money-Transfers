
fun main() {
    val comission = 0.75
    val minComission = 35
    println("Введите сумму перевода в рублях:")
    val amount = readln().toInt()
    val totalComission = if (amount * comission / 100 > minComission) amount * comission / 100 else minComission
    println("Размер комиссии за перевод: $totalComission руб.")
}