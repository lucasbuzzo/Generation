package ex06calcTeste
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalcTest{
    @Test
    fun somaTeste(){
        assertEquals(10.0, Calc.soma(5.0, 5.0))
    }
    @Test
    fun subTeste(){
        assertEquals(1.0, Calc.sub(3.0, 2.0))
    }
    @Test
    fun multTeste(){
        assertEquals(50.0, Calc.mult(5.0, 10.0))
    }
    @Test
    fun divTeste(){
        assertEquals(2.0, Calc.div(10.0, 5.0))
    }
    @Test
    fun potTeste(){
        assertEquals(4.0, Calc.pot(2.0, 2.0))
    }
    @Test
    fun raizTeste(){
        assertEquals(3.0, Calc.raiz(9.0))
    }
}