
class HashTable {
  fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
    val sortedData = data.sortedWith(
      compareBy<IntArray> {
        it[col-1]
      }.thenByDescending {
        it[0]
      }
    )

    return hash(row_begin, row_end, sortedData)
  }

  fun hash(row_begin: Int, row_end: Int, data: List<IntArray>): Int {
    var answer: Int = 0

    for (i in (row_begin - 1) until row_end) {
      var rowSum = 0;
      for (j in data[i]) {
        rowSum += j % (i+1)
      }
      answer = answer xor rowSum
    }
    return answer
  }
}
