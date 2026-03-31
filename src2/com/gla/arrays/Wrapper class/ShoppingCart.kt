package `Wrapper class`

class ShoppingCart {
    object ShoppingCart {
        @kotlin.jvm.JvmStatic
        fun main(args: Array<String>) {
            val prices = arrayOf<String?>("250", "499", "99", "abc")

            var total = 0

            for (p in prices) {
                try {
                    val price: Int = p.toInt()
                    total += price
                } catch (e: NumberFormatException) {
                    println("Invalid price: " + p)
                }
            }

            println("Total Price = " + total)
        }
    }
}