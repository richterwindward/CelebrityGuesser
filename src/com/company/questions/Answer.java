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
            System.exit(0);
        }
    }

    @Override
    public TreeNode<String> left()
    {
        return new Answer("It is " + s , true);
    }
    @Override
    public TreeNode<String> right()
    {
        try
        {
            System.out.println("Damn, who is it?");
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
