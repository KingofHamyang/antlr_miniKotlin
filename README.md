Antlr kotlin Parser
Kotlin2java convert software

Grammar files
    1. parser 파일과 Lexer 파일을 나누어서 작성하였습니다. string을 처리하기 위해서는
    프로그램 코드 부분과는 달리 WhitelsSpace를 스킵하지 않고 그대로 토큰으로써 인식해주어야 하는데 이는
    같은 Lexer rule안에서 처리하지 못합니다 따라서 mode라는 기능을 사용하였고, mode를 사용하기
    위해서는 Lexer rule과 parser rule을 따로 다른 파일에 작성하여야 하기 때문에 위와 같은 방법을 사용했습니다.
     
    1.2. 실행방법은 다음과 같습니다
        antlr5 KotlinParser.g4 KotlinLexer.g4 -visitor
        javac Kotlin*.java
        java Kotlin2java input.kt output.java

