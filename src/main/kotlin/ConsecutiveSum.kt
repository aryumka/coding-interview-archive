
class ConsecutiveSum {
  fun solution(elements: IntArray): Int {
    val resultSet = mutableSetOf<Int>()

    for (size in elements.indices) {
      resultSet.addAll(elements.indices.map { start ->
        (start .. start + size).sumOf { elements[it % elements.size] }
      })
    }

    return resultSet.size
  }
}

