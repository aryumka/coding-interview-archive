class ToBinary {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        //반복횟수
        var times = 0
        //제거된 0의 개수
        var zeros = 0
        var str = s

        //결국 모든 이진수에서 0을 제거하여 반복하면 1이 됨
        while(str != "1"){
            times++
            zeros += str.replace("1", "").length
            str = str.replace("0", "").length.toString(2)
        }
        return intArrayOf(times, zeros)
    }
}