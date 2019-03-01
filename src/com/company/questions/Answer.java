package com.company.questions;

import com.company.TreeNode;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class Answer extends Question
{
    private String s;
    public Answer(String s, boolean fin)
    {
        super("Is it " + s + "?");
        this.s = s;
        if(fin)
        {
            System.out.println(s);
        }
    }

    @Override
    public TreeNode<String> left()
    {
        //if (true) return null; else return new Answer("It is " + s , true);
        return new TreeNode<>(s);
    }
    @Override
    public TreeNode<String> right()
    {
        if (true) return null;
        try
        {
            System.out.println("Who is it?");
            Scanner s = new Scanner(System.in);
            String person = s.nextLine();
            File f = new File("nodestoadd.txt");
            if(!f.exists()) f.createNewFile();
            Files.write(f.toPath(), Arrays.asList(person), StandardOpenOption.APPEND);
            System.exit(0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
