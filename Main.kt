//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Para calcular el área y la circunferencia del círculo introduzca la longuitud del radio")
    var radio = readln().toInt()
    var area = 3.14 * radio //pi lo representamos como 3,14 a no ser que nos digan lo contrario
    var circunferencia =  2 * radio * 3.14
    println("El área del círculo es igual a $area y la circunferencia es $circunferencia")
}
   fun areaRectangulo(){
       println("Introduzca la altura del rectangulo")
       var altura=readln().toInt()
       println("Introduzca la base del cuadrado")
       var base=readln().toInt()
       var area=altura*base
       println("El área del rectangulo es $area")
   }