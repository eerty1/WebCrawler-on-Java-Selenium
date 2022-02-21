# WebCrawler-Java Selenium

Spontaneously came across one interesting this which is called WebCrawler. :astonished:

I've seen a lot of different variants of this entity, but some of them are quite hard for me now or done using other plugins and programs. :confused:

My variant of crawler is simple, just an amateur version in order to get acquainted with this type of automation. :dizzy_face:

Also it is important to mention, that my representation of crawler is done in 2 variants. 	:moyai:

So, let's start! :monocle_face:

To begin with, my crawler deals with a website called [Related words](https://relatedwords.org/).  :bomb:

This tool helps you find words that are related to a specific word or phrase.

## Variant 1

In my program I use the word "toy" (you can change ofc) and checks, how many related words contain a given letter (you can change it too).

## Variant 2

The structure is similar, but now, the program finds a given letter in every word from the list and then calculates the amount of the letters in a particular word. When the calculations're done, the program adds all the results to excel document.

## Installation

You are proposed to use Java 8. :trophy:

![This is an image](https://i.ibb.co/LNW93hG/javaversion.png)

Also It is important to use proper version of WebDriver.

Developing this project, I was using **97.0.4692.71**. It is the latest stable release for **31.01.2022**.

The dependency is: 

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->

        <dependency>
             <groupId>org.seleniumhq.selenium</groupId>
             <artifactId>selenium-java</artifactId>
             <version>4.1.1</version>
        </dependency>

[This is a link to see the screenshots of my POM.xml](https://i.ibb.co/DMLcvP9/pomagain.png).

It is essential to say about correct Maven version.

![This is an image](https://i.ibb.co/kSLL33z/image.png)

In order to add everything to excel, I used a libriary called [Apache POI](https://poi.apache.org/) **5.2.0**. This is the lastest stable release for **07.02.2022**.

I think, that I have no need in telling you how to install it, but if there're any problems, contact me via mail from my profile. :mailbox:

There're the steps to unpack my project: 

* git clone WebCrawler-Java-Selenium
* Open it via your IDE

## Usage

Make sure, that dependencies're correct.

Run like a usual project.

## Other
 
The "inspiration" for this project was got from the videos of these guys: :innocent:

* [Web Scraping Dynamic Websites with Java and Selenium](https://www.youtube.com/watch?v=PF0iyeDmu9E&t=718s&ab_channel=ShaneLee)

* [Web Scraper or Crawler Part 1 - Selenium WebDriver Tutorial 11](https://www.youtube.com/watch?v=zXFbR__vG5A&t=123s&ab_channel=AutomationZone)
