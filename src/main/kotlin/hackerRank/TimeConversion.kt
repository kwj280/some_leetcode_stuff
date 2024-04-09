package org.example.HackerRank

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */
/**
 *
 *   val input = "12:01:00PM"
 *   val expected = "12:01:00"
 *
 *   val input = "12:01:00AM"
 *   val expected = "00:01:00"
 *
 *   val input = "07:05:45PM"
 *   val expected = "19:05:45"
 *
 *    val input = "07:05:45AM"
 *    val expected = "07:05:45"
 *
 */
fun timeConversion(s: String): String {
    val split = s.split(":")
    var hh = split[0]
    val mm = split[1]
    val ss = split[2].slice(0..1)
    val noon = split[2].slice(2..3) //  AM PM

    if (noon == "AM" && hh == "12") {
        hh = "00"
    }
    if (noon == "PM" && hh.toInt() < 12) {
        hh = (hh.toInt() + 12).toString()
    }
    return "$hh:$mm:$ss"
}