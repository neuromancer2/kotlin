// EXPECTED_REACHABLE_NODES: 1375
package foo

fun box(): String {
    try {
        if (true) throw Exception() else "fail1"
    }
    catch (e: Exception) {
        return "OK"
    }
    return "fail2"
}