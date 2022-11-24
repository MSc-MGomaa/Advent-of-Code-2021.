# Advent-of-Code-2021.
Every year, the Advent of Code challenge is published (https://adventofcode.com/), where you have to solve a coding puzzle every day.

## Problem Definition

<p align = "justified">
You're minding your own business on a ship at sea when the overboard alarm goes off! You rush to see if you can help. Apparently, one of the Elves tripped and accidentally sent the sleigh keys flying into the ocean! Before you know it, you're inside a submarine the Elves keep ready for situations like this. It's covered in Christmas lights (because of course it is).

<p align = "justified">
As the submarine drops below the surface of the ocean, it automatically performs a sonar sweep of the nearby sea floor. On a small screen, the sonar sweep report (your puzzle input) appears: each line is a measurement of the sea floor depth as the sweep looks further and further away from the submarine.

Use the following report (note: store this data in a text file as input):<br>
199 200 208 210 200 207 240 269 260 263

This report indicates that, scanning outward from the submarine, the sonar sweep found depths of 199, 200, 208, 210, and so on.

Consider sums of a three-measurement sliding window:

199 A <br>
200 A B <br>
208 A B C <br>
210 - B C D <br>
200 E - C D <br>
207 E F - D <br>
240 E F G <br>
269 - F G H <br>
260 - - G H <br>
263 - - - H <br>

<p align = "justified">
Start by comparing the first and second three-measurement windows. The measurements in the first window are marked A (199, 200, 208); their sum is 199 + 200 + 208 = 607. The second window is marked B (200, 208, 210); its sum is 618. The sum of measurements in the second window is larger than the sum of the first, so this first comparison increased.

<p align = "justified">
Your goal now is to count the number of times the sum of measurements in this sliding window increases from the previous sum. So, compare A with B, then compare B with C, then C with D, and so on. Stop when there aren't enough measurements left to create a new three-measurement sum.

In the above example, the sum of each three-measurement window is as follows: <br>

A: 607 (N/A - no previous sum) <br>
B: 618 (increased) <br>
C: 618 (no change) <br>
D: 617 (decreased) <br>
E: 647 (increased) <br>
F: 716 (increased) <br>
G: 769 (increased) <br>
H: 792 (increased) <br>

## Part 2
Now, you need to figure out how to pilot this thing. It seems like the submarine can take a series of commands like forward 1, down 2, or up 3:
* forward X increases the horizontal position by X units.
* down X increases the depth by X units.
* up X decreases the depth by X units.

Note that since you're on a submarine, down and up affect your depth, and so they have the opposite result of what you might expect. <br>

The submarine seems to already have a planned course (your puzzle input). You should probably figure out where it's going (note: store this as a file and use it as input):

Forward 5 <br>
Down 5 <br>
Forward 8 <br>
Up 3 <br>
Down 8 <br>
Forward 2<br>

Your horizontal position and depth both start at 0. The steps above will then modify them as follows:

* forward 5 adds 5 to your horizontal position, a total of 5.
* down 5 adds 5 to your depth, resulting in a value of 5.
* forward 8 adds 8 to your horizontal position, a total of 13.
* up 3 decreases your depth by 3, resulting in a value of 2.
* down 8 adds 8 to your depth, resulting in a value of 10.
* forward 2 adds 2 to your horizontal position, a total of 15.

After following these instructions, you will have a horizontal position of 15 and a depth of 10. 













