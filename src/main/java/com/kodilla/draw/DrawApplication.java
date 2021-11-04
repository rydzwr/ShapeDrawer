package com.kodilla.draw;


import java.lang.*;
import java.util.Scanner;

public class DrawApplication
{
    private static final String RECTANGLE_NAME = "rectangle";
    private static final String SQUARE_NAME = "square";
    private static final String TREE_NAME = "tree";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Drawable drawable = readAndCreateShape();
        if (drawable != null)
        {
            drawable.draw();
        }
    }

    private static Drawable readAndCreateShape()
    {
        Drawable drawable = null;
        System.out.println("What Do You Want To Draw? (rectangle / square / tree)");
        String element = scanner.nextLine();
        switch (element)
        {
            case RECTANGLE_NAME:
                drawable = readAndCreateRectangle();
                break;
            case SQUARE_NAME:
                drawable = readAndCreateSquare();
                break;
            case TREE_NAME:
                drawable = readAndCreateTree();
                break;
            default:
                System.out.println("I Can't Draw That!");
        }

        return drawable;
    }

    private static Drawable readAndCreateTree()
    {
        System.out.println("Enter Tree Height: ");
        int height = scanner.nextInt();
        return new Tree(height);
    }

    private static Drawable readAndCreateSquare()
    {
        System.out.println("Enter The Length Of Side Of The Square: ");
        int a = scanner.nextInt();
        return new Square(a);
    }

    private static Drawable readAndCreateRectangle()
    {
        System.out.println("Enter The Length Of First Side Of The Rectangle: ");
        int a = scanner.nextInt();
        System.out.println("Enter The Length Of Second Side Of The Rectangle: ");
        int b = scanner.nextInt();
        return new Rectangle(a, b);
    }
}
