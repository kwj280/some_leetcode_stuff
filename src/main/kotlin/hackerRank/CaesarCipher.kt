package hackerRank

fun caesarCipher(s: String, k: Int): String {
    var encrypted = ""

    s.forEach {
        var maxCode = 'Z'.code
        if (it.isLowerCase()) {
            maxCode = 'z'.code
        }
        if (it.isLetter()) {
            var charCode = it.code + (k % 26)
            if (charCode > maxCode) {
                charCode -= 26
            }
            encrypted += Char(charCode)
        } else {
            encrypted += it
        }
    }
    return encrypted
}
