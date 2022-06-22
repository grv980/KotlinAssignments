class Companionobjects1 {


    class Editor(val editorName:String){

    }

    class Book(val editor: Editor){
        companion object{
            fun getEditor() = Editor("O'reilly")
        }

    }
    fun main(args:Array<String>){
        val myBook = Book(Book.getEditor())

        println(myBook.editor.editorName)
    }
}