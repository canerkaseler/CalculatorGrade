fun main(){
    println("\n***********************\nLambton Grade Calculator:")

    val RJ1 = getGrade(90.0, 5.0) // done
    val RJ2 = getGrade(90.0, 10.0) // done
    val PIP = getGrade(80.0, 10.0) //done
    val PSR = getGrade(90.0, 10.0) //done
    val PS = getGrade(90.0, 30.0) // done
    val QUIZ = getGrade(60.0, 35.0) // done

    val score = RJ1 + RJ2 + PIP + PSR + PS + QUIZ
    val letter = getLetter(score)

    println("1) My score is: $score\n2) My letter is: $letter\n***********************\n@canerkaseler")
}

private fun getGrade(score: Double, weight: Double): Double {
    return score * weight / 100.0
}

private fun getLetter(score: Double): String{

    var result: String
    val scoreNum = score.toInt()

    if (scoreNum in 94..100)
        result = "A+ 4.0"
    else if (scoreNum in 87..93)
        result = "A 3.7"
    else if (scoreNum in 80..86)
        result = "A- 3.5"
    else if (scoreNum in 77..79)
        result = "B+ 3.2"
    else if (scoreNum in 73..76)
        result = "B 3.0"
    else if (scoreNum in 70..72)
        result = "B- 2.7"
    else if (scoreNum in 67..69)
        result = "C+ 2.3"
    else if (scoreNum in 63..66)
        result = "C 2.0"
    else if (scoreNum in 60..62)
        result = "C- 1.7"
    else if (scoreNum in 50..59)
        result = "D 1.0"
    else
        result = "F 0.0"

    return result
}
