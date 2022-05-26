package ex06calcTeste

class Calc {
    companion object{
        fun soma (n1: Double, n2: Double): Double{
            return n1 + n2
        }
        fun sub (n1: Double, n2: Double): Double{
            return n1 - n2
        }
        fun mult (n1: Double, n2: Double): Double{
            return n1 * n2
        }
        fun div (n1: Double, n2: Double): Double{
            return n1 / n2
        }
        fun pot (n1: Double, n2: Double): Double{
            return Math.pow(n1, n2)
        }
        fun raiz (n1: Double): Double{
            return Math.sqrt(n1)
        }
    }
}