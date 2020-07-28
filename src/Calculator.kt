fun main(){
    println("\n***********************\nLambton Grade Calculator:")

    val RJ1 = getGrade(70.0, 5.0) // done
    val RJ2 = getGrade(77.0, 10.0) // done
    val PSR = getGrade(76.0, 30.0) //done
    val PIP = getGrade(65.0, 20.0) //done
    val MSP = getGrade(75.0, 15.0) //done
    //val PS = getGrade(90.0, 30.0) // done
    val QUIZ = getGrade(48.0.getScoreFromTrueAnswerNumber(), 20.0) // done

    val score = RJ1 + RJ2 + PIP + PSR + MSP + QUIZ //+ PS
    val letter = getLetter(score)

    println("2) My score is: $score\n3) My letter is: $letter")

    //Calculate estimated GPA.
    getCalculatedGPA(score)
    println("***********************\n@canerkaseler")
}

private fun Double.getScoreFromTrueAnswerNumber(): Double {
    //0.6 = 60 questions
    val score = this / 0.6

    println("1) 60/${this} true answers score is $score")

    return score
}

private fun getGrade(score: Double, weight: Double): Double {
    return score * weight / 100.0
}

private fun getCalculatedGPA(score: Double){
    val lesson1 = getLetter(78.0).split(" ")[1].toDouble() //   B+
    val lesson2 = getLetter(81.0).split(" ")[1].toDouble() //   A-
    val lesson3 = getLetter(63.0).split(" ")[1].toDouble() //   C
    val lesson4 = getLetter(score).split(" ")[1].toDouble() // B
    val lesson5 = getLetter(61.0).split(" ")[1].toDouble() //   C-
    val lesson6 = getLetter(61.0).split(" ")[1].toDouble() //   C-
    val lessonCoop = getLetter(61.0).split(" ")[1].toDouble() //   C- • Co-Op

    val totalCreditValue = (lesson1 * 4) +
                        (lesson2 * 4) +
                        (lesson3 * 2) +
                        (lesson4 * 2) +
                        (lesson5 * 2) +
                        (lesson6 * 4) +
                        (lessonCoop * 1)

    val gpaFirstTerm = 3.13
    val gpaSecondTerm = totalCreditValue / 19

    println("4) Min: 2.47 but your estimated this term GPA is: $gpaSecondTerm")
    println("5) Your estimated two term average GPA is: ${(gpaFirstTerm + gpaSecondTerm) / 2}")

    if ((gpaFirstTerm + gpaSecondTerm) / 2 > 2.8){
        println("6) Co-Op ELIGIBLE: ${(gpaFirstTerm + gpaSecondTerm) / 2} > 2.80")
    }
    else
        println("6) Co-Op is NOT eligible: ${(gpaFirstTerm + gpaSecondTerm) / 2} < 2.80")
}

private fun getLetter(score: Double): String{

    val result: String
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
