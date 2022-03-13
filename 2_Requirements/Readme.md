# State of art/ Research

This game is one of the classic platformer games, the game consists of a moving platform at the bottom of the screen that the player controls. The goal for the users is to try and destroy all the bricks on the top by bouncing a small ball of the plateform. Every brick the comes in contact with the ball gets destroyed.

I will be developing this application using Unreal 4 engine. The aim is create the game to run both on computers and mobile platforms. This will be a fun little game that can be played and enjoyed by all age groups.

# Primary and Secondary Features

## Primary Features
1. Single player
2. Player controlled moving platform
3. Bricks that can be destroyed
4. Moving Ball to destroy bricks
5. Be able to shot ball up on initial game start

## Secondary Features
1. Score counter
2. Number of balls remaining
3. Power ups add
4. Play sfx when ball hits/launches

# 4 W's and 1H
## Who
People to who need enjoy and have fun.

## When
when the people required to entertain there life .

## What
For makeing the people entertained.

## Where
Around any where the digital screan is present.

## How
Using keys present in the keyboard can play.

# High Level Requirements

| ID | Description | Exp I/p | Exp O/P | Status |
| -- | ----------- | ------- | ------- | ------ |
| HR01 | 	Check if brickBreaker game gui executes properly | Key Press in accordance to menu option | GUI should open | Pass |
| HR02 | Check if slide moves in accordance to arrow key |	keys pressed for the movement of slide | Slide should turn in desired direction | Pass |
| HR03 |	Check if game gets over if ball move out of slide |	key pressed | display Game Over restart | Pass |
| HR04 |	Check if player hit all the brickes  |	key Pressed | display you won press enter to restart | pass |
| HR05 |	Check if ball hit brick every time each brick should be removed | key pressed | bricks should decreases by 1 |	pass |

# Low Level Requirements

| ID | HLT Id | Description | Exp I/p | Exp O/P | Status |
| -- | ------ | ----------- | ------- | ------- | ------ |
| L01 | H 1 | application should start with out any error	| Application Execute |  Application Executed | Success |
| L02 | H 2 | Grid of 700px X 600px Y should be devlpoed |	keys pressed | Grid of 700x600 px should be created | Success |
| L03 | H 3 |	Check if game gets over if ball move out of slide |	key pressed | display Game Over restart | Success |
| L04 | H 4 |	Slide corrdinate should move left and right |	key Pressed left and right | slide moves left and right | Success |

