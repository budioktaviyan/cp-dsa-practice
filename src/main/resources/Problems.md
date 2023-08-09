### Mars Rover kata

#### What we value
We value test-driving (using TDD) the solution and growing it in very small, incremental steps while explaining your intentions and design decisions to the interviewer.
For us, it doesn't matter that you build the whole solution during the session, but the way that you go about it and your workflow.

#### Problem Statement

You are building a rover that is going to explore Mars (represented as a grid).

1) The initial starting point of a rover is 0:0:N
- 0,0 are X and Y coordinates on a grid
- ‘N’ is the direction rover is facing - alias for North (directions it can face are N, S, E, W)

2) Rover accepts different commands and returns its position after executing them
- ‘L’ and ‘R’ commands rotate the rover left and right, respectively
- ‘M‘ command moves the rover one step in the direction it’s currently facing. E.g. If its position is “2:3:E” (facing East), sending ‘M’ to the rover moves it one step in the direction of East, i.e. “3:3:E”.

3) The rover receives a string of multiple commands and returns its position after executing commands. For example, assuming rover’s starting position is “0:0:N”, sending "RMMLML" to the rover will move it to "2:1:W".

To make things simple, assume following:
- Rover’s starting point is always 0:0:N
- The grid has infinite size, so don’t worry about falling off the grid
- Commands the rover will get will always be valid, so no need to guard against invalid input

#### Extension:

4) The rover wraps around if it reaches the end of the grid (imagine the grid as a globe). E.g. if the grid is a square from (0,0) to (10,10), and if the rover is at a position “10:2:E”, moving it once more will make it wrap around the grid and go to “0:2:E”.

5) The grid may have obstacles. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point and reports the obstacle e.g. "O:2:2:N" (O stands for Obstacle).

