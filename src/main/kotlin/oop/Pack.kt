package oop
import email.send as sendEmail
import email.Message as EmailMessage
import sms.send as sendSms
import sms.Message as SmsMessage

/**
 * Пакеты в Kotlin представляют логический блок, который объединяет функционал,
 * например, классы и функции, используемые для решения близких
 * по характеру задач.
 * Так, классы и функции, которые предназначены для решения одной задачи,
 * можно поместить в один пакет,
 * классы и функции для других задач можно поместить в другие пакеты.
 * Пакет похож на область видимости - нельзя объявлять одинаковых глобальные функции
 *
 * Псевдонимы - С помощью оператора as можно определять псевдоним
 * для подключаемого типа и затем обращаться к этому типу через его псевдоним.
 *
 * Kotlin имеет ряд встроенных пакетов, которые подключаются по умолчанию
 * в любой файл на языке Kotlin:
 * kotlin.*
 * kotlin.annotation.*
 * kotlin.collections.*
 * kotlin.comparisons.*
 * kotlin.io.*
 * kotlin.ranges.*
 * kotlin.sequences.*
 * kotlin.text.*
 */
fun main() {
    val myMessage = EmailMessage("Hello Kotlin")
    sendEmail(myMessage, "tom@gmail.com")

    val mySmsMessage = SmsMessage("Hello Kotlin")
    sendSms(mySmsMessage, "+1234567890")
}