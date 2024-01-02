package oop
import email.send as sendEmail
import email.Message as EmailMessage
import sms.send as sendSms
import sms.Message as SmsMessage

/**
 * ������ � Kotlin ������������ ���������� ����, ������� ���������� ����������,
 * ��������, ������ � �������, ������������ ��� ������� �������
 * �� ��������� �����.
 * ���, ������ � �������, ������� ������������� ��� ������� ����� ������,
 * ����� ��������� � ���� �����,
 * ������ � ������� ��� ������ ����� ����� ��������� � ������ ������.
 * ����� ����� �� ������� ��������� - ������ ��������� ���������� ���������� �������
 *
 * ���������� - � ������� ��������� as ����� ���������� ���������
 * ��� ������������� ���� � ����� ���������� � ����� ���� ����� ��� ���������.
 *
 * Kotlin ����� ��� ���������� �������, ������� ������������ �� ���������
 * � ����� ���� �� ����� Kotlin:
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