package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        TreeNode original;
        if(true)
        {
            original = TreeNode.deserialize("Is_this_person_a_male Is_this_person_a_salesman? Does_this_person_have_glasses? Is_it_Dwight? * * Is_this_person_caucasian? Are_you_thinking_of_Jim? Is_it_Jim? * * Is_it_Andy? * * Is_it_Stanley? * * Is_this_person_a_manager? Is_it_Michael? * * Is_this_person_an_accountant? Are_you_thinking_of_Oscar? Is_it_Oscar? * * Is_it_Kevin? * * Is_it_Creed? * * Are_they_a_salesman? Are_they_old? Is_it_phyllis? * * Is_it_karen? * * Are_they_blond? Are_they_holly? Is_it_Holy? * * Is_it_Angela? * * Is_it_Pam? Is_it_Pam? * * Is_it_Meredith? * * ");
        }
        System.out.println("Welcome to Office Akinator!\nThis program will try to guess who your office character is with a series of questions\nTo play, type y for Yes, n for No.\nEnjoy!");
	    new Asker(original);
    }
}
