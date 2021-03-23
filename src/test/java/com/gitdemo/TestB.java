package com.gitdemo;

public class TestB {

    public static void main(String[] args) {
        System.out.println("Hi");

    }
}
/*
* First when we write into th terminal we have to run the "git status" command
* we will see some file that are in red and need to be added
* run the "git add filename" command to add the file to the staging area
* run the "git commit -m "message"" command to commit the changes
* run the "git push" command and provide username and password of git hub account
* make some changes from the remote repo , commit and add some message
* run the "git fetch" command
* run the "git pull command" and you should be able to see the changes
* make changes on more than one file
* run the "git add ." command which adds all the changes that happening at once, so we dont need to specify the folder name
* run the (git commit -am "message") command to commit all the changes we did in all the files
* and lastly push with providing username and password of github account
*Thank you for your time
*this is cool
* thanks.
*
* git clone gitHubURL
git pull ==> to pull the latest code
git branch branchName ==> it will create a new branch
git checkout branchName  ==> it will checkout the branch and you will be working in you branch
git checkout -b branchName ==> this command will create and checkout to the new branch
git add .  ==> this will add file to staging area
git commit -m "commit message" ==> this will commit changes with the message
git push -u origin branchName ==> this will push your changes to github from your branch
git checkout master ==> this command it will move the head to the master
git merge  branchName ==> this command it will merge your changes from the branch to your master
git log ==> this command it will display all commits
git merge --abort ==> this command it will abort the conflict merge
git log --graph --online --all  ==> it will show the commit log
git branch ==> this command it will give you a list of all the branches
echo >> fileName +extension
git branch -d localBranchName ==> this command will  delete local branch
* */
