package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String example,PoemDecorator poemDecorator){
    String result = poemDecorator.decorate(example);
    System.out.println("At the first" +""+example+"After"+""+result);
    }
    public static String toUpperCase (String example){
        return example.toUpperCase();
    }
    public static String addABC (String example){
        String aBC = "ABC";
        return aBC + example + aBC;
    }
    public static String substring (String example){
        return example.substring(5,14);
    }
    public static  String replace (String example){
        return  example.replace("t","k");
    }
}
