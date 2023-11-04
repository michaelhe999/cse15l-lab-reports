x# Lab 3

## Part 1 - Bugs

### Bug with reverseInPlace

#### Failure inducing input: 
input: {0,1,2,3,4} expected: {4,3,2,1,0} output: {4,3,2,3,4}
```
@Test 
  public void testReversedWorking(){
      int[] input = {0,1,2,3,4};
      int[] output = {4,3,2,1,0};
      ArrayExamples.reverseInPlace(input);
      assertArrayEquals(output, input);
  }
```
#### Passing input: 
input: {0} expected: {0} output: {0}
```
@Test 
  public void testReversedWorking(){
      int[] input = {0};
      int[] output = {0};
      ArrayExamples.reverseInPlace(input);
      assertArrayEquals(output, input);
  }
```
#### Symptoms:
##### Failing Input:
![Image](FailingInputTestRun.png)
##### Passing Input:
![Image](PassingInputTestRun.png)

#### Buggy Code:
```
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = arr[i];
    }
  }
```
#### Fixed Code: 
```
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
    }
  }
```
For the reverseInPlace function, the bug is that the method rewrites its elements as it is trying to reverse, and thus later elements are never actually reversed. The fix is setting temporary values, such that the actual element that should be switched between two indexes is saved elsewhere and not overwritten. 

## Part 2 - Researching commands

### grep command options:

#### -i 

Finds the lines in a file with the given pattern, ignoring cases. Outputs all the lines. [1](https://www.geeksforgeeks.org/grep-command-in-unixlinux/#)
```
michaelhe@MacBook-Pro-3 docsearch % grep -i "dna strand" technical/biomed/1471-2091-3-13.txt
        circle, instead of the complementary DNA strand through the
        the cleaved DNA gate strand while the passing DNA strand
```
This command outputs all the lines in a file with the given pattern. In this case, it could be used to quickly search for lines in the file to find answers to questions about DNA strands. 

```
michaelhe@MacBook-Pro-3 docsearch % grep -i "dna strand" technical/biomed/*.txt             
technical/biomed/1471-2091-3-13.txt:        circle, instead of the complementary DNA strand through the
technical/biomed/1471-2091-3-13.txt:        the cleaved DNA gate strand while the passing DNA strand
technical/biomed/1471-2105-3-37.txt:          3' end of the opposite DNA strand. Molegos 7, 11 and 12
technical/biomed/1471-2105-3-37.txt:          enzymes cleave only one DNA strand in a duplex and
technical/biomed/1471-2121-2-12.txt:        in DNA strand-break repair, and can phosphorylate serines
technical/biomed/1471-2121-3-11.txt:        PS on the cell surface preceded DNA strand breaks in
technical/biomed/1471-2164-2-4.txt:        linked to the target DNA strand. These DNA circles are
technical/biomed/1471-2164-4-19.txt:          polyT tails to the 3' ends of each DNA strand. We are
technical/biomed/1471-2164-4-21.txt:        quencher are all covalently linked on the same DNA strand.
technical/biomed/1471-2172-3-10.txt:          both DNA strands as input.
technical/biomed/1471-2172-3-10.txt:          reverse complement DNA strand was considered with the
technical/biomed/1471-2180-2-13.txt:          non-coding DNA strand, the size of the DNase I footprint
technical/biomed/1471-2180-3-15.txt:        Misalignment of DNA strands during chromosome replication
technical/biomed/1471-2334-3-12.txt:          biotin-labeled DNA strand from 50 μl of product. The
technical/biomed/1471-2334-3-12.txt:          biotin-free DNA strand was then used in the assay.
technical/biomed/1471-2407-1-6.txt:        unwinding of the parental DNA strands at these forks [ 28].
technical/biomed/1472-6750-2-13.txt:          dietary mutagens [ 46 ] also cause distributed DNA strand
technical/biomed/1476-4598-2-3.txt:          of 3'-hydroxy-DNA strand breaks, a measure of apoptosis,
```
This command outputs all the lines in all the files in the biomed directory with the give pattern, as well as giving the file the line is in, regardless of case. In this case, it can search for any case in any file with the pattern, to not only find answers to questions but also be able to list the sources. 

#### -w

Finds the lines in a file with the pattern as a word, not just as a segment of a string. [1](https://www.geeksforgeeks.org/grep-command-in-unixlinux/#)
```
michaelhe@MacBook-Pro-3 docsearch % grep -w "and" technical/biomed/1468-6708-3-3.txt 
        Three published [ 1 2 3 ] and one recently presented [ 4
        the morbidity and mortality associated with coronary
        and surgical coronary revascularization, and stroke in
        myocardial infarction and randomized them to 16 weeks of
        or during the previous month; and, coronary
        revascularization and change in lipid levels throughout the
        approximately 65% were men, 86% Caucasian and the mean
        myocardial infarction and resuscitated sudden cardiac death
        significantly reduced total and LDL cholesterol and
        The efficacy and safety findings from MIRACL were unique
        strategy should allay theoretical fears and by doing so
        Despite these unique and important findings, there were
        and foremost, the possibility of a null treatment effect
        cannot be ignored given the wide confidence intervals (and
        ischemia is an important determinant of quality of life and
        whether statins can prevent these and other adverse events
        from restenosis or bypass graft closure and that statins
        an early invasive strategy is applied [ 12 13 14 ] and it
        greater than in patients with stable coronary disease, and
        and/or other objective evidence of ischemia), the rate of
        [ 15 16 ] , especially among high risk patients and is
        atorvastatin and placebo groups make it difficult to
        dissect the relationship between baseline lipid levels and
        Although MIRACL and the two aforementioned cohort
        early and universally in patients who present with an acute
        coronary syndrome: First, the long-term safety and
        (excepting total :HDL and LDL:HDL cholesterol ratios [ 22 ]
        disease will ultimately require both pharmacologic and
        and to date our efforts at cholesterol lowering in the
        The ascertainment and quantification of any incremental
        receive 80 mg of simvastatin daily and those treated with
        The Pravastatin or Atorvastatin Evaluation and Infection
        within 10 days of an acute coronary syndrome and
        and the A-2-Z trials, this study will not assess the
        or unstable disease and will need to
        combination therapy [ 30 ] and determine whether there is a
        Dr Aronow has received honoraria as a speaker and
        advisory board member for Pfizer and as a speaker for
        Evaluation and Infection Therapy.
```
This output all the lines in the file with the word "and". This is useful when looking for word counts (could not work if word appears twice in a line), or if looking for cases where two things are presented in the same line through a conjunction. 

```
michaelhe@MacBook-Pro-3 docsearch % grep -w "moreover" technical/biomed/*.txt
technical/biomed/1471-2091-3-17.txt:          moreover, would indicate massive supersaturation (up to 8
technical/biomed/1471-2180-2-1.txt:        1suggest moreover that the scale of the final spatial
technical/biomed/1471-2180-2-1.txt:        and in the same orientation. Smaller structures moreover
technical/biomed/1471-2202-2-12.txt:        cultured sympathetic neurons exposed to BMP-7; moreover,
technical/biomed/1471-2202-3-3.txt:          ribosomal proteins; moreover, RP transcripts represented
technical/biomed/1471-2458-3-9.txt:        are distinctly separate from the urban centers, moreover
technical/biomed/1472-6785-1-5.txt:        moreover, tightly linked with changes in moose density [ 6
technical/biomed/gb-2001-2-12-research0051.txt:          correspond to those in C2 domains; moreover, many of the
technical/biomed/gb-2002-3-2-research0008.txt:        only very rarely achieve fixation [ 28, 29]; moreover, in
technical/biomed/gb-2003-4-9-r57.txt:        underestimated. We moreover show that the hypothesis of an
technical/biomed/gb-2003-4-9-r58.txt:        ] ; moreover, in the electric fish 
technical/biomed/rr73.txt:        protease inhibitor, moreover, have an increased
```
This output all the lines and files where the lines occur with the word "moreover", only lowercased. It could be useful when only looking for cases where a certain word appears, as well as looking for the lines where it appears. 

#### -C(n)
Outputs a number of lines before and after the searched pattern. [1](https://www.geeksforgeeks.org/grep-command-in-unixlinux/#)
```
michaelhe@MacBook-Pro-3 docsearch % grep -C1 "DNA strand" technical/biomed/1471-2091-3-13.txt 
        reaction involves passage of another double-stranded DNA
        circle, instead of the complementary DNA strand through the
        break generated by DNA cleavage so the ZD domain would not
--
        bound 5' phosphate and non-covalently bound 3' hydroxyl of
        the cleaved DNA gate strand while the passing DNA strand
        (T-strand) is guided through the "gate" via interaction
```
Like the -i command, this command is useful to finding answers to questions about DNA strands. It is more useful because it also gives context to the line. 

```
michaelhe@MacBook-Pro-3 docsearch % grep -C1 "DNA strand" technical/biomed/*.txt             
technical/biomed/1471-2091-3-13.txt-        reaction involves passage of another double-stranded DNA
technical/biomed/1471-2091-3-13.txt:        circle, instead of the complementary DNA strand through the
technical/biomed/1471-2091-3-13.txt-        break generated by DNA cleavage so the ZD domain would not
--
technical/biomed/1471-2091-3-13.txt-        bound 5' phosphate and non-covalently bound 3' hydroxyl of
technical/biomed/1471-2091-3-13.txt:        the cleaved DNA gate strand while the passing DNA strand
technical/biomed/1471-2091-3-13.txt-        (T-strand) is guided through the "gate" via interaction
--
technical/biomed/1471-2105-3-37.txt-          molegos 1 and 2, bind 5' of the cleavage site and to the
technical/biomed/1471-2105-3-37.txt:          3' end of the opposite DNA strand. Molegos 7, 11 and 12
technical/biomed/1471-2105-3-37.txt-          bind to one base 5' and the next base 3' of the cleavage
--
technical/biomed/1471-2105-3-37.txt-          opposed to the processive, highly specific huAPE1. Both
technical/biomed/1471-2105-3-37.txt:          enzymes cleave only one DNA strand in a duplex and
technical/biomed/1471-2105-3-37.txt-          bacterial Xth cleaves ssDNA containing an abasic site [
--
technical/biomed/1471-2121-2-12.txt-        cellular response to DNA damage [ 41]. DNA-PK is involved
technical/biomed/1471-2121-2-12.txt:        in DNA strand-break repair, and can phosphorylate serines
technical/biomed/1471-2121-2-12.txt-        15 and serine 37 of p53 
--
technical/biomed/1471-2121-3-11.txt-        et al [ 27 ] showed that exposure of
technical/biomed/1471-2121-3-11.txt:        PS on the cell surface preceded DNA strand breaks in
technical/biomed/1471-2121-3-11.txt-        apoptosis of different cell lines. Cell membrane
--
technical/biomed/1471-2164-2-4.txt-        results in small circular DNA molecules topologically
technical/biomed/1471-2164-2-4.txt:        linked to the target DNA strand. These DNA circles are
technical/biomed/1471-2164-2-4.txt-        amplified in the powerful homogeneous ERCA reaction capable
--
technical/biomed/1471-2164-4-19.txt-          priming, we optimized a terminal transferase step to add
technical/biomed/1471-2164-4-19.txt:          polyT tails to the 3' ends of each DNA strand. We are
technical/biomed/1471-2164-4-19.txt-          able to generate tails with a tight distribution around
--
technical/biomed/1471-2164-4-21.txt-        complementary DNA sequences, fluorescent reporter, and
technical/biomed/1471-2164-4-21.txt:        quencher are all covalently linked on the same DNA strand.
technical/biomed/1471-2164-4-21.txt-        The comparative stability of the unimolecular Amplifluor
--
technical/biomed/1471-2172-3-10.txt-          to 25 nucleotides as the range of motif size; and (iv)
technical/biomed/1471-2172-3-10.txt:          both DNA strands as input.
technical/biomed/1471-2172-3-10.txt-          The first pass of MEME for ≥ 6 W ≤ 25 nucleotides
--
technical/biomed/1471-2172-3-10.txt-          MEME PSSMs with an E-value < 1 were presented, and the
technical/biomed/1471-2172-3-10.txt:          reverse complement DNA strand was considered with the
technical/biomed/1471-2172-3-10.txt-          forward orientation in the search.
--
technical/biomed/1471-2180-2-13.txt-          +27, +4, +3, -10, -20, -21, -22 and -32. For the
technical/biomed/1471-2180-2-13.txt:          non-coding DNA strand, the size of the DNase I footprint
technical/biomed/1471-2180-2-13.txt-          pattern appears to increase when higher levels of
--
technical/biomed/1471-2180-3-15.txt-        factor in generating tandem repeat polymorphisms [ 16 ] .
technical/biomed/1471-2180-3-15.txt:        Misalignment of DNA strands during chromosome replication
technical/biomed/1471-2180-3-15.txt-        is thought to lead to the addition or deletion of repeat
--
technical/biomed/1471-2334-3-12.txt-          Avidin-coated beads were used to harvest the
technical/biomed/1471-2334-3-12.txt:          biotin-labeled DNA strand from 50 μl of product. The
technical/biomed/1471-2334-3-12.txt:          biotin-free DNA strand was then used in the assay.
technical/biomed/1471-2334-3-12.txt-          Briefly, the target mimic or target DNA was mixed with a
--
technical/biomed/1471-2407-1-6.txt-        with replication forks and are likely to stimulate the
technical/biomed/1471-2407-1-6.txt:        unwinding of the parental DNA strands at these forks [ 28].
technical/biomed/1471-2407-1-6.txt-        We previously demonstrated [ 25] that, in normal tissues,
--
technical/biomed/1472-6750-2-13.txt-          Chemotherapy [ 44 ] , ionizing radiation [ 45 ] and
technical/biomed/1472-6750-2-13.txt:          dietary mutagens [ 46 ] also cause distributed DNA strand
technical/biomed/1472-6750-2-13.txt-          interruptions [ 47 ] . Chemical modifications [ 48 49 50
--
technical/biomed/1476-4598-2-3.txt-          measure of cell proliferation, and enzymatic end labeling
technical/biomed/1476-4598-2-3.txt:          of 3'-hydroxy-DNA strand breaks, a measure of apoptosis,
technical/biomed/1476-4598-2-3.txt-          were quantified
```
Using the command with multiple files, the command also outputs the file where the lines are found. Again, this is useful for searching multiple files to find information about DNA strands.

#### -o
The -o command prints out all the occurences of the given pattern. [1](https://www.geeksforgeeks.org/grep-command-in-unixlinux/#)
```
michaelhe@MacBook-Pro-3 docsearch % grep -o "DNA strand" technical/biomed/1471-2091-3-13.txt                 
DNA strand
DNA strand
```
This command may be useful to count the number of times a certain pattern occurs in a file. This could be useful if you want to find/replace information. 
```
michaelhe@MacBook-Pro-3 docsearch % grep -o "DNA strand" technical/biomed/*.txt             
technical/biomed/1471-2091-3-13.txt:DNA strand
technical/biomed/1471-2091-3-13.txt:DNA strand
technical/biomed/1471-2105-3-37.txt:DNA strand
technical/biomed/1471-2105-3-37.txt:DNA strand
technical/biomed/1471-2121-2-12.txt:DNA strand
technical/biomed/1471-2121-3-11.txt:DNA strand
technical/biomed/1471-2164-2-4.txt:DNA strand
technical/biomed/1471-2164-4-19.txt:DNA strand
technical/biomed/1471-2164-4-21.txt:DNA strand
technical/biomed/1471-2172-3-10.txt:DNA strand
technical/biomed/1471-2172-3-10.txt:DNA strand
technical/biomed/1471-2180-2-13.txt:DNA strand
technical/biomed/1471-2180-3-15.txt:DNA strand
technical/biomed/1471-2334-3-12.txt:DNA strand
technical/biomed/1471-2334-3-12.txt:DNA strand
technical/biomed/1471-2407-1-6.txt:DNA strand
technical/biomed/1472-6750-2-13.txt:DNA strand
technical/biomed/1476-4598-2-3.txt:DNA strand
```
This command done over multiple files also outputs the files where the pattern occurs. Aside from the usage in the previous example, it can also be used to see if a file has multiple occurences of a pattern. 

## Citations:
{1} GeeksforGeeks. (2022, November 15). GREP command in unix/linux. grep command in Unix/Linux. https://www.geeksforgeeks.org/grep-command-in-unixlinux/# 
