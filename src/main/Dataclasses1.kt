import kotlin.random.Random

class Dataclasses1 {



    data class Article (
        val title:String,
        val content:String,
        val numberOfReaders:Int
    )
    fun getArticle():Article{
        val randomTitle:String = "Title" + Random.nextInt(100)
        val numberOfReaders:Int = Random.nextInt(1000)
        return Article(randomTitle,"Some content",numberOfReaders)
    }

    fun main(args:Array<String>){
        val articles:ArrayList<Article> = arrayListOf<Article>()
        articles.add(getArticle())
        articles.add(getArticle())

        val newArticles:ArrayList<Article> = arrayListOf<Article>()

        for (article:Article in articles){
            newArticles.add(article)
            val newArticle:Article = article.copy(title = article.title + "for my blog")
            newArticles.add(newArticle)
        }
        articles.forEach{ println(it) }
    }
}