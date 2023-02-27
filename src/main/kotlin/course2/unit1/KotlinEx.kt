package course2.unit1

import java.io.File
import java.nio.charset.Charset

class KotlinEx {
}

public fun File.jtReadText(charset: Charset = Charsets.UTF_8): String {
    return readBytes().toString(charset)
}

val File.jtVal: String
    get() = "Hello,Jt"