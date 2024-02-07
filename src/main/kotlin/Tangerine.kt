class Tangerine {
  fun solution(k: Int, tangerine: IntArray): Int {
    var answer: Int = 0

    val tangerineList = tangerine.groupBy { it }
      .mapValues { it.value.size }
      .toList()
      .sortedByDescending { it.second }

    var sum = 0

    for (i in tangerineList.indices) {
      sum += tangerineList[i].second
      if (sum >= k) {
        answer = i + 1
        break
      }
    }

    return answer
  }
}
