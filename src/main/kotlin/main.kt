
fun main() {
    val comission = 0.75
    val minComission = 35
    println("Введите сумму перевода в рублях:")
    val amount = readln().toInt()
    val result = amount * comission / 100
    val totalComission = if (result > minComission) result else minComission
    println("Размер комиссии за перевод: $totalComission руб.")
}