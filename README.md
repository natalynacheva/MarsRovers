
[![LinkedIn][linkedin-shield]][linkedin-url]


  <h3 align="center">Project: Mars rovers</h3>

  <p align="center">
<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project


Here's a blank template to get started:
**    The problem below requires some kind of input. You are free to implement any mechanism for feeding
input into your solution (for example, using hard coded data within a unit test). You should provide
sufficient evidence that your solution is complete by, as a minimum, indicating that it works correctly
against the supplied test data.
The code you write should be of production quality, and most importantly, it should be code you are
proud of.
MARS ROVERS
A squad of robotic rovers are to be landed by NASA on a plateau on Mars.
This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board
cameras can get a complete view of the surrounding terrain to send back to Earth.
A rover's position is represented by a combination of an x and y coordinates and a letter representing
one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An
example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.
In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and
'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its
current spot.
'M' means move forward one grid point, and maintain the same heading. Assume that the square
directly North from (x, y) is (x, y+1).
Input
The first line of input is the upper-right coordinates of the plateau, so defining the area. The lower-left
coordinates are assumed to be 0,0.
The rest of the input is information pertaining to the rovers that have been deployed. Each rover has
two lines of input. The first line gives the rover's position, and the second line is a series of
instructions telling the rover how to explore the plateau.
The position is made up of two integers and a letter separated by spaces, corresponding to the x and
y coordinates and the rover's orientation.
Each rover will be finished sequentially, which means that the second rover won't start to move until
the first one has finished moving.
Output
The output for each rover should be its final coordinates and heading.
Test Input:
55
12N LMLMLMLMM 33E MMRMMRMRRM
Expected Output: 13N
51E
HINTS:
1. Please try to prepare a solution which is production like.
2. Add build tool.
3. Create tests to prove that the solution works (separate of the solution).
4. Readme about the solution would be nice (even if it’s basic).
5. Document the main parts of the solution.




### Built With

* java
* maven




<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* Install maven
* Check maven installation   
  ```sh
   mvn -version (windows) 
  ``` 
### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/github_username/repo_name.git
   ```
2. * Run the tests
  ```sh
   mvn test 
  ```



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/natalinacheva/
