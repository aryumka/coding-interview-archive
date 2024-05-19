class KeyLock {
  fun solution(key: Array<IntArray>, lock: Array<IntArray>): Boolean {
    val n = lock.size
    val m = key.size
    val newLock = Array(n * 3) { IntArray(n * 3) }
    for (i in 0 until n) {
      for (j in 0 until n) {
        newLock[i + n][j + n] = lock[i][j]
      }
    }
    for (rotation in 0 until 4) {
      val rotatedKey = rotate(key, rotation, m)
      for (x in 0 until n * 2) {
        for (y in 0 until n * 2) {
          insertKey(newLock, rotatedKey, x, y, m)
          if (isMatch(newLock, n)) {
            return true
          }
          removeKey(newLock, rotatedKey, x, y, m)
        }
      }
    }
    return false
  }

  private fun rotate(key: Array<IntArray>, rotation: Int, m: Int): Array<IntArray> {
    val rotatedKey = Array(m) { IntArray(m) }
    for (i in 0 until m) {
      for (j in 0 until m) {
        when (rotation) {
          0 -> rotatedKey[i][j] = key[i][j]
          1 -> rotatedKey[i][j] = key[m - 1 - j][i]
          2 -> rotatedKey[i][j] = key[m - 1 - i][m - 1 - j]
          3 -> rotatedKey[i][j] = key[j][m - 1 - i]
        }
      }
    }
    return rotatedKey
  }

  private fun insertKey(newLock: Array<IntArray>, rotatedKey: Array<IntArray>, x: Int, y: Int, m: Int) {
    for (i in 0 until m) {
      for (j in 0 until m) {
        newLock[x + i][y + j] += rotatedKey[i][j]
      }
    }
  }

  private fun removeKey(newLock: Array<IntArray>, rotatedKey: Array<IntArray>, x: Int, y: Int, m: Int) {
    for (i in 0 until m) {
      for (j in 0 until m) {
        newLock[x + i][y + j] -= rotatedKey[i][j]
      }
    }
  }

  private fun isMatch(newLock: Array<IntArray>, n: Int): Boolean {
    for (i in n until n * 2) {
      for (j in n until n * 2) {
        if (newLock[i][j] != 1) {
          return false
        }
      }
    }
    return true
  }
}
