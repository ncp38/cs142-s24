---
title: Lab 1
parent: Labs
---

# CS 142 Lab 1

## Wheel of Fortune

<img src="GetFromVersionControl.png" width=300 align=right>

- Start IntelliJ. In the top-left corner of the screen, click the project dropdown and choose “Get from VCS.” This is new; we haven’t used this option before. We will make a new project to store all of our labs and code that I want to distribute to the whole class.  (This will copy my code from online into a new project-I recommend you put this in a directory with the other COMP 142 projects. Intellij *should* automatically set this to the directory you've used most recently.)

- On the next screen, copy and paste in the following URL in the box that says “URL”:

  https://github.com/ncp38/cs142-f23-inclass

<img src="SetUpURLAndDirectory.png" width=600 align=center>

-  In the “Directory” box, double-check that the folder listed is the right place for new projects to be stored (a subfolder 
of your main cs142 projects). If something is off, you can click the folder icon at the far right of the text area and make 
a new folder for this class work.

<img src="SetDirectory.png" width=400 align=center>

- In the left-hand panel, expand the `src` folder to see today’s lab (in the lab1 folder). Double-click on 
  WheelOfFortune (not the md file yet.) If you get a message at the top that says “Project JDK is not defined,” then click on “Setup SDK” and choose the JDK you downloaded earlier.

- In the left-hand panel, double-click on `WheelOfFortune.md`. Follow the instructions in this file. This is where you will answer the questions for the lab.

## Submitting the lab

At the end of the lab session, upload the two files to canvas.  *Important!  Make sure both you and your partner submit the .java file and the question file.*  You can find these files by hovering over the file name 
in the top bar in IntelliJ and right-clicking (or ctrl+click for Macs) and selecting Open in -> Explorer (for Macs, you'll instead want to select Open in -> Finder).

<img src="OpenIn.png" width=400 align=center>

-Each Java file you upload should include a header with an assignment title, your name, class number/period, and your teammates' names.  (Your names need to be listed in the questions.md file as well!)

-Beneath this header include a short description of what you've changed in the file.

For example:

```java
//Lab 1 - Wheel of Fortune
//John Doe, COMP 142 Section 1
//Jane Deere, COMP 142 Section 1
//Changed lines 250-265 to allow the user to bet their earned money on a letter.
```