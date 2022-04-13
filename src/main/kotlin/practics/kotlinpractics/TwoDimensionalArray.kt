package practics.kotlinpractics

fun main() {
twoArrays(1)
}

fun twoArrays(target: Int): IntArray {
    val nums = arrayOf(1,2,3,4,5,6)
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[j] == target - nums[i]) {
                return intArrayOf(i,j)
            }
        }
    }
    throw IllegalArgumentException("No two sum solution")
}