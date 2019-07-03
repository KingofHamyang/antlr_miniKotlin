Programming language 2019 spring semester

Assignment3 Kotlin2java translater

Grammar files
    1. 마찬가지로 이번 과제는 parser 파일과 Lexer 파일을 나누어서 작성하였습니다. string을 처리하기 위해서는
    프로그램 코드 부분과는 달리 WhitelsSpace를 스킵하지 않고 그대로 토큰으로써 인식해주어야 하는데 이는
    같은 Lexer rule안에서 처리하지 못합니다 따라서 mode라는 기능을 사용하였고, mode를 사용하기
    위해서는 Lexer rule과 parser rule을 따로 다른 파일에 작성하여야 하기 때문에 두 가지 파일을
    제출합니다.

    Googling 결과, 파일을 두개로 나누려면, SomenameParser.g4와 SomenameLexer.g4로 해야 한다고 나와있어서
    원래 과제 이름인 Kotlin.g4를 KotlinLexer.g4와 KotlinParser.g4로 나누었습니다.
     
    1.2. 실행방법은 다음과 같습니다
        antlr5 KotlinParser.g4 KotlinLexer.g4 -visitor
        javac Kotlin*.java
        java Kotlin2java input.kt output.java

