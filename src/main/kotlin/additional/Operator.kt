package additional


fun main() {
    val counter1 = Counter(5)
    val counter2 = Counter(7)
    val counter1IsGreater = counter1 <= counter2
    val counter3: Counter = counter1 + counter2
    println(counter1IsGreater)
    println(counter3.value)
    val counter4: Counter = 33 + counter1
    println(counter4.value)
}

/**
 * ���������
 *
 * ������� ���������:
 * +a - a.unaryPlus()
 * -a - a.unaryMinus()
 * !a - a.not()
 * ���������/���������:
 * ++a / a++ - a.inc()
 * --a / a-- - a.dec()
 * �������� �������������� ���������:
 * a + b - a.plus(b)
 * a - b - a.minus(b)
 * a * b - a.times(b)
 * a / b - a.div(b)
 * a % b - a.rem(b)
 * a..b - a.rangeTo(b)
 * ��������� ���������:
 * a > b, a < b, a >= b, a <= b - a.compareTo(b)
 * a == b, a != b - a.equals(b)
 * ��������� ����������:
 * a += b - a.plusAssign(b)
 * a -= b - a.minusAssign(b)
 * a *= b - a.timesAssign(b)
 * a /= b - a.divAssign(b)
 * a %= b - a.remAssign(b)
 * �������� in:
 * a in b, a !in b - b.contains(a)
 * ��������� ������� �� �������:
 * a[i] - a.get(i)
 * a[i] = b - a.set(i, b)
 * ��������� ������:
 * a() - a.invoke()
 * a(i) - a.invoke(i)
 */
class Counter(var value: Int) {
    operator fun unaryMinus(): Counter {
        return Counter(-value)
    }

    operator fun plus(counter: Counter): Counter {
        return Counter(this.value + counter.value)
    }

    operator fun compareTo(counter: Counter): Int {
        return this.value - counter.value
    }

    override operator fun equals(other: Any?): Boolean{
        if(other is Counter) return this.value == other.value
        return false
    }

    operator fun plusAssign(counter: Counter){
        this.value += counter.value
    }
    operator fun plusAssign(number: Int){
        this.value += number
    }
}

/**
 * ��������� ����� ���� ���������� ��� � ���� ������� ������,
 * ��� � � ���� ������� ����������.
 */
operator fun Int.plus(counter: Counter): Counter {
    return Counter(this + counter.value)
}