class Song
{
    public static void main(String[] args)
    {


printVerse1();
printVerse2();
printVerse3();
printVerse4();
printVerse5();
printVerse6();
printVerse7();
printVerse8();
}


public static void printVerse1()
{
System.out.println("There was an old lady who swallowed a fly,\nI don\'t know why she swallowed that fly,\nPerhaps she'll die.");
System.out.println();
}

public static void printRefrain()
{
System.out.println("That wriggled and jiggled and wiggled inside her. \nShe swallowed the spider to catch the fly, \nI don\'t know why she swallowed that fly,\nPerhaps she\'ll die.");
} 



public static void printSwallowedBird()
{
System.out.println("She swallowed the bird to catch the spider.");
}



public static void printSwallowedCatDog()
{
System.out.println("She swallowed the dog to catch the cat.\nShe swallowed the cat to catch the bird.");
}





public static void printVerse2()
{
System.out.println("There was an old lady who swallowed a spider,");
printRefrain();
System.out.println();
}



public static void printVerse3()
{
System.out.println("There was an old lady who swallowed a bird; \nHow absurd, to swallow a bird!");
printSwallowedBird();
printRefrain();
System.out.println();
}


public static void printVerse4()
{
System.out.println("There was an old lady who swallowed a cat.\nImagine that, she swallowed a cat.\nShe swallowed the cat to catch the bird.");
printSwallowedBird();
printRefrain();
System.out.println();

}

public static void printVerse5()
{
System.out.println("There was an old lady who swallowed a dog.\nWhat a hog! To swollow a dog!");
printSwallowedCatDog();
printSwallowedBird();
printRefrain();
System.out.println();
}


public static void printVerse6()
{
System.out.println("There was an old lady who swallowed a goat.\nJust opened her throat and swallowed a goat!\nShe swallowed the goat to catch the dog,");
printSwallowedCatDog();
printSwallowedBird();
printRefrain();
System.out.println();
}

public static void printVerse7()
{
System.out.println("There was an old lady who swallowed a cow.\nI don\'t know how she swallowed the cow!\nShe swallowed the cow to catch the goat.");
printSwallowedCatDog();
printSwallowedBird();
printRefrain();
System.out.println();
}


public static void printVerse8()
{
System.out.println("There was an old lady who swallowed a horse.\nShe died, of course.");
System.out.println();
}
}
