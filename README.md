# IT4045c_Group9_Vidya-Viewer_Final-Project
# Ent. Application Development 

## Group 9  - Vidya Viewer  

### Group Members: Blake Schriewer, William Taylor 

## Introduction 

Since the dawn of mankind, humans have found innumerable ways to distract themselves from the pressures of facing the world. Throwing a ball back and forth, like in football; kicking a can down the road, like in “kick the can” (the can could also be replaced with a rock); and most recently among this ever growing list, video games. Video games offer an escape that is unique to our modern world, as nearly anything can be emulated with 1’s and 0’s in a virtual space. Many (potentially most) of these environments can only exist in this world of make-believe. And they bridge the gap of what’s possible and what’s not; affording a freedom of experience that is completely its own.  

Having released the shackles of what’s possible in the real world, the ever-growing landscape of gaming has only gotten larger as time has gone on. The list of “games you have to play” grows at an almost breakneck speed. However, cataloging and ranking these games on a personal level has typically gone by the wayside. Focusing on commercializing opinions, businesses and consumers sell their opinions in the form of magazines, subscriptions, and likes.  

But what if there was a way to catalog and rank all games, just for yourself? Introducing Vidya Viewer. Our goal is to create a platform that has all the hallmarks of an enterprise application, with the feel of a bookshelf at your own home. Affording the user the ability to take notes, choose photos, and rank their personal lists of video games without ever leaving the couch.  

## Storyboard  

![group9 storyboard](https://user-images.githubusercontent.com/26129706/221280913-78fdf815-5d94-4a87-97a9-01441be05ad5.png)

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

<img width="2170" alt="group9 UML diagram" src="https://user-images.githubusercontent.com/26129706/221247531-39eca524-64c1-418f-af64-9f44e1c1939c.png">

## Class Diagram Description 

1. DTO Package

This package contains the classes used to transfer data across the application. Each class has variables with getters and setters for all attributes. 

2. UI package

This package contains the intended views that should display through normal use of the applications. There is a controller listed that has get and post methods that help to define the flow direction, as well as the general idea of what will be occurring during the operation.  

3. Service

This package will take some explaining. I initially intended on have the leftmost-groups located within the UI package, as members of the controller operations. However it seemed better suited for them to be a breakout of the methods found within the Interfaces of the Service package. By structuring it in this way,  I am able to show how each method should map to individual views, as mandated by the controller. The benefit here being one implementation by the controller for all interface methods. Extensibility can be handled within the UI layer, and objects seem like they will be easier to handle and interact with.  

4. DAO

These interfaces hold the methods used to communicate with persistent storage. The interfaces will be realized by the DAO objects and will perform CRUD operations. 

## TRELLO link for Scrum tasks 

Previously integrated through Github Projects. Change was made due to lack of legacy coverage (Forced deprecation of Github Projects (Classic) - R.I.P).  

~~https://github.com/users/WillTaylor2352/projects/1~~  

This project is now managed (MUCH more easily) through Trello, updates on development tasks can be found there. 

https://trello.com/b/KYVkLC2x/it4045c-group-9-vidya-viewer

## Scrum Roles: 

Product owner: William Taylor 

UI Expert:  William Taylor

Database Expert: Blake Schriewer 

## Github Link:  

https://github.com/WillTaylor2352/IT4045c_Group9_Vidya-Viewer_Final-Project  
