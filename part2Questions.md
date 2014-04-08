=================
     Set 2
================= 
1. It makes sure that the bug does not go outside of the selected square area. It checks the collision of the bug and the selected square.

2. It keeps track of how many places on the grid or steps that the bug has taken. I'm pretty sure this will come in later so the flower trail can be left behind the bug.

3. The bug only takes a 45 degree turn each time turn is called, so it is nessecary to call it multiple times to get it to turn 90 degrees making the box shape.

4. The class extends Bug(where the move method was made) allowing the BoxBug class to call it without recreating the method.

5. It will stay the same until you change the size of the square you want the bug to travel on.

6. Not after it enters into the neverending loop of the square. That is why it is called the BoxBug.

7. When the bug has not yet moved from it's original starting position.