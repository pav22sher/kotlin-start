package additional

fun main() {
    //Nullable ���
    var name : String? = null
    val random = (0..10).random()
    println(random)
    if(random > 5) name = "Pavel"
    //elves - ��������
    val length1 = name?.length ?: 0
    println(length1)
    //!! (not-null assertion operator) - ����� ������� �� null
    val length2 = name!!.length
    println(length2)
}