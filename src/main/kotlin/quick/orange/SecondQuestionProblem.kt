package quick.orange

import java.lang.Exception
import java.util.ArrayList

class SecondQuestionProblem {

  fun twoSum(arr: IntArray, target: Int): IntArray {
    val list = ArrayList<Int>()
    for ((index, value) in arr.withIndex()) {
      if (value <= target) {
        list.add(index)
        try {
          val second = arr.first { t -> t == target - value }
          val indexOf=arr.indexOf(second)
          list.add(indexOf)
          break
        }catch (e: Exception){
          list.clear()
        }
      }
    }
    return list.toIntArray()
  }
}