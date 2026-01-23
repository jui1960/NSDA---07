fun main() {
    val sc = java.util.Scanner(System.`in`)
    if (sc.hasNextInt()) {
        val t = sc.nextInt()
        repeat(t) {
            val n = sc.nextInt()
            val m = sc.nextInt()
            val a = IntArray(n) { sc.nextInt() }
            val b = IntArray(m) { sc.nextInt() }

            var count = 0
            for (i in 0 until n) {
                for (j in 0 until m) {
                    if (b[j] < a[i]) count++
                }
            }
            println(count)
        }
    }
}