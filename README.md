# IT4045c_Group9_Vidya-Viewer_Final-Project
# Ent. Application Development 

## Group 9  - Vidya Viewer  

### Group Members: Couri Wilson, Blake Schriewer, Zion Ivery, William Taylor 

## Introduction 

Since the dawn of mankind, humans have found innumerable ways to distract themselves from the pressures of facing the world. Throwing a ball back and forth, like in football; kicking a can down the road, like in “kick the can” (the can could also be replaced with a rock); and most recently among this ever growing list, video games. Video games offer an escape that is unique to our modern world, as nearly anything can be emulated with 1’s and 0’s in a virtual space. Many (potentially most) of these environments can only exist in this world of make-believe. And they bridge the gap of what’s possible and what’s not; affording a freedom of experience that is completely its own.  

Having released the shackles of what’s possible in the real world, the ever-growing landscape of gaming has only gotten larger as time has gone on. The list of “games you have to play” grows at an almost breakneck speed. However, cataloging and ranking these games on a personal level has typically gone by the wayside. Focusing on commercializing opinions, businesses and consumers sell their opinions in the form of magazines, subscriptions, and likes.  

But what if there was a way to catalog and rank all games, just for yourself? Introducing Vidya Viewer. Our goal is to create a platform that has all the hallmarks of an enterprise application, with the feel of a bookshelf at your own home. Affording the user the ability to take notes, choose photos, and rank their personal lists of video games without ever leaving the couch.  

## Storyboard  

<img width="968" alt="My storyboard" src="https://user-images.githubusercontent.com/26129706/218202488-576f2ba3-9055-4b77-9c7d-d960fc0a2e78.png">


## Functional Requirements  

 

Given [I have accessed the application] 

When [I search for a game] 

Then [That game will show in a list] 

<br/>

Given [I have accessed the application and am looking at all games] 

When [I choose a category] 

Then [I will receive results for that category] 

<br/>

Given [I am viewing a game not in my library]  

When [I click the menu icon]  

Then [I can add the game to my library] 

<br/>

Given [A game is in my library] 

When [I click that game] 

Then [I can add my personal notes about the game] 

Then [I can rank that game] 

Then [I can share that game] 

Then [I can upload screenshots] 

<br/>

Given [A game was shared to me] 

When [I click that game] 

Then [I can add to my library] 

Then [I can respond to the share] 

Then [I can watch gameplay footage online] 

<br/>

## Class Diagram 

<img width="2170" alt="group9 UML diagram" src="https://user-images.githubusercontent.com/26129706/221246819-c6db7043-2cf7-4647-974a-c0e16b0f1f87.png">


## Class Diagram Description 

1. Interface Package 

Sharable interface will be implemented by the GameDTO and CategoriesDTO, as those objects should be able to be shared between Users. It has two instance variables – a “from user” and a “to user” with one method: “share to user”  

AddAndRemovable interface acts as a template for objects that can be added and removed from a class. It is implemented by all members of the Logic class.  

2. Service package 

GameDTO will be a transfer object populated with instance variables describing the Game Object 

UserDTO will be a transfer object populated with instance variables describing the User Object 

CategoriesDTO will be a transfer object populated with instance variables describing the Categories Object 

3. Logic 

GameDAO implements AddAndRemovable and holds methods related to the specific nature of the game object. It will initialize the DTO and be presented by the controller in a view (html file not on this document) 

UserDAO implements AddAndRemovable and holds methods related to the specific nature of the user object. It will initialize the DTO and be presented by the controller in a view (html file not on this document) 

CategoriesDAO implements AddAndRemovable and holds methods related to the specific nature of the categories object. It will initialize the DTO and be presented by the controller in a view (html file not on this document) 

4. Controller 

Consumes requests sent by the user. Calls methods from the DAO’s when necessary and serves appropriate HTML responses where appropriate.  

Github projects link for Scrum tasks 

Strongly integrated with github. Will make for a much easier time when committing, collaborating on tasks, and automation.  

https://github.com/users/WillTaylor2352/projects/1  

## Scrum Roles: 

Product owner: William Taylor 

UI Expert:  

Database Expert: Blake Schriewer 

Additional Support:  

## Github Link:  

https://github.com/WillTaylor2352/IT4045c_Group9_Vidya-Viewer_Final-Project  
