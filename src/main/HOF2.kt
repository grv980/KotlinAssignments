class HOF2 {

    val numbers:List<Int> = listOf(45,60,65,42,44,90)
    val subset:List<Int> = numbers.map{
        if (it%2 == 0)
            it/2
        else
            it*2
    }
        .filter { it>25 }
}