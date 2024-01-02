package base

fun main() {
    //����������� if ����� ���������� ��������
    ex0(10, 20)
    //����������� when
    ex1(true)
    ex2(20)
    ex3(10)
    ex4(1, 2)
    ex5(100)
}

fun ex5(sum: Int = 100) {
    val rate = when (sum) {
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println(rate)
}

fun ex4(a: Int, b: Int) {
    val a = 15
    val b = 6
    when {
        (a > 10) -> println("a ������ 10")
        (b > 10) -> println("b ������ 10")
        else -> println("� a, � b ������ ��� ����� 10")
    }
}

private fun ex3(range: Int = 10) {
    when (range) {
        in 10..19 -> println("a � ��������� �� 10 �� 19")
        in 20..29 -> println("a � ��������� �� 20 �� 29")
        !in 10..20 -> println("a ��� ��������� �� 10 �� 20")
        else -> println("�������������� ��������")
    }
}

private fun ex2(varible: Int = 10) {
    var result = varible
    when (varible) {
        1, 2 -> {
            println("a = 1 or 2")
            result *= 1
        }

        10 -> {
            println("a = 10")
            result *= 2
        }

        20 -> {
            println("a = 20")
            result *= 5
        }

        else -> {
            println("�������������� ��������")
        }
    }
    println(result)
}

private fun ex1(isEnabled: Boolean = false) {
    when (isEnabled) {
        false -> println("isEnabled off")
        true -> println("isEnabled on")
    }
}

private fun ex0(a: Int = 1, b: Int = 2) {
    val c = if (a > b || a == b) {
        println("a = $a")
        a
    } else {
        println("b = $b")
        b
    }
    println("c = $c")
}