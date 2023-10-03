# Lab Report 1

## `cd` Command

### without arguments

```
[user@sahara ~]$ cd
[user@sahara ~]$
```
or 
```
[user@sahara ~/lecture1]$ cd
[user@sahara ~]$
```
The starting working directory for the first code block: `user@sahara`; it did not change. The starting working directory for the second code block: `lecture1`; it changed to `user@sahara`. 

The `cd` command without arguments returns to the root directory, which in the case of the first code block does not change the prompt, but in the second code block the prompt changes. 

This code produces no errors.

### with path to directory as argument

```
[user@sahara ~]$ cd lecture1
[user@sahara ~/lecture1]$
```
The starting working directory for this code block is `user@sahara`; it changes to `lecture1`. Because of the argument `lecture1`, the working directory of the terminal was changed to the `lecture1` directory. 
This is reflected in the prompt changing. 

This code produces no errors.

### with path to file as argument

```
[user@sahara ~]$ cd lecture1/messages/en-us.txt
bash: cd: lecture1/messages/en-us.txt: Not a directory
```
The starting working directory for this code block is `user@sahara`. It does not change. Because the argument after the command `cd` is not a directory, the command does not work and throws an error. 

## `ls` Command

### without arguments

```
[user@sahara ~]$ ls
lecture1
```
The starting working directory for this code block is `user@sahara`. It does not change. The output of the command `ls` is `lecture1` because `ls` lists the files in the working directory. 

This code produces no errors.

### with path to directory as argument

```
[user@sahara ~]$ ls lecture1
Hello.class  Hello.java  messages  README
```
The starting working directory for this code block is `user@sahara`; it changes to `lecture1`. The output of the command is the list of the files and directories inside the `lecture1` directory. 

This code produces no errors.

### with path to file as argument

```
[user@sahara ~]$ ls lecture1/messages/en-us.txt
lecture1/messages/en-us.txt
```
The starting working directory for this code block is `user@sahara`; it does not change. The output of the command is the path of the file that was input as the argument. 

This code produces no errors.

## `cat` Command

### without arguments

```
[user@sahara ~]$ cat

```
The starting working directory for this code block is `user@sahara`; it does not change. Without arguments, the `cat` command waits for the next user input, after which it outputs it. For example: 
```
[user@sahara ~]$ cat
hello
hello
```
While `cat` without parameters is impossible to run, it is not an error. 

### with path to directory as argument

```
[user@sahara ~]$ cat lecture1
cat: lecture1: Is a directory
```
The starting working directory for this code block is `user@sahara`; it does not change. With a directory as an argument, the `cat` command can't print out the contents. This leads to an error. 

### with path to file as argument

```
[user@sahara ~]$ cat lecture1/messages/en-us.txt
Hello World!
```
The starting working directory is `user@sahara`; it does not change. With a file as an argument, the `cat` command outputs the contents of the file. 

This code produces no errors. 
