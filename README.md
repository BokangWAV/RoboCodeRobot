# BOKANGSROBOT (README) 🎮🤖

## INSTALLATION INSTRUCTIONS 📖
The source code of the robot is contained in the submitted JAR file. This file has both my .java code and the .class code with the built robot. 
### _To run the built robot in the Robocode game, follow the steps listed below:_
####     1. Open the _.jar_ file with an archive utility, or unzipping application.
####     2. Once open you will see two folders in the _robots_ folder, (out & src).
####     3. Proceed to open the Robocode game, navigate to _Options_, and then open _Prefrences_.
####     4. Once here navigate to _Development Options_ and select _Add_.
####     5. Now navigate to where you opened the _.jar_ file, and open the _out_ folder:
####            Once in the folder follow the below folder selection:
#####            _-> production -> robots_
####            If _robots_ is highlighted click on choose .
####     6. Now you will be taken back to Preferences page, now you may click finish.
####     7. From here click on _Battle_, select _New Battle_. In the _Packages_ panel,  select _(No Package)._
####     8. The robots name will appear as _BokangsRobot*_, add it along with other robots and battle it out. 🤖

## ROBOT DESIGN 🤖

### _The Walls Robot_
The Robocode game has many robots along with each robot having its own sample code. The robot which caught my attention was that of the _Walls_ robot, which clings to the game walls upon a round start and moves along these walls, scanning for robots to fire at and when colliding with a robot it will move away from the robot.

I decided to take this movement and firing style, but adjust by ensuring that if a robot is in front of mine when I collide with it instead of just moving away, I fire while also moving away, allowing for my robot to still have an offensive approach when robots collide with it.
Against the actual _Walls_ robot, it seems to be 50-50 as, sometimes it wins and sometimes it does not. 
Although against other robots it has a greater chance of winning against all the base _sample_ robots, my robot is either in 1st, 2nd or 3rd place, sometimes 4th. But this is all dependent on the intitial conditions of the game, as it may sometimes come out in 6th place.
Against the _sampleex_ robots, my robot comes out 1st against all the robots while only being able to come out 2nd against the _sampleteam_ robots.

My robot, similar to _Walls_ has no winning chance against the _BorderGuard_ robot, while against it, it comes out first, nothing really happens since this robot stops my robot from being able to go to a wall and fire at the _BorderGuard_ robot.


## IMPLEMENTATION COMMENTS 💻

While using the _Walls_ movement, to reduce risk of potential loss while at a robot we have hit, we only use the lowest firing power _fire(1);_ as this gives us a chance to rather move away than try fire a powerful shot a potential be killed.
I also ensured to manually scan for a robot rather than automatically, this way I am able to move the robot once fired all possible shots and ensure safety.

When battling against all the _sample_ robots, I found that my robot can get trapped between two robots against the wall and not be able to do anything, this I was not really able to fix and is a potential exploit enemies could use against mine.

