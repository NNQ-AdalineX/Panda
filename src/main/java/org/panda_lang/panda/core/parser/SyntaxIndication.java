package org.panda_lang.panda.core.parser;

public enum SyntaxIndication {

    CLOSE("}"),
    COMMENT("//"),
    SECTION("(){"),
    METHOD("();"),
    RUNTIME("()"),
    STATEMENT(";"),
    VARIABLE("=;");

    private final String indication;

    private SyntaxIndication(String indication){
        this.indication = indication;
    }

    public String getIndication(){
        return this.indication;
    }

    public static SyntaxIndication recognize(String s){
        for(SyntaxIndication i : values()){
            if(s.equals(i.getIndication())){
                return i;
            }
        } return null;
    }

}
