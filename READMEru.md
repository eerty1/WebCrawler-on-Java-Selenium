# WebCrawler-Java Selenium

Спонтанно наткнулся на одну интересную штуку, которая называется WebCrawler. :astonished:

Я успел увидеть много разных способов сотворить это, но они пока для меня слишком сложные или используют неподходящие мне плагины и программы. :confused:

Мой вариант краулера достаточно простой, просто любительская версия, чтобы познакомиться с данным применением автоматизации. :dizzy_face:

Также важно упомянуть, что моя программа выполнена в двух вариантах. :moyai:

Поехали! :monocle_face:

Начнем с того, что мой краулер работает с сайтом под названием  [Related words](https://relatedwords.org/).  :bomb:

Сайт помогает находить связанные тем или иным образом слова или фразы.

## Вариант 1
В своей программе я использую слово "toy" (вы можете его изменить) и проверяю, сколько предложенных содержат заданную мной букву (букву вы тоже можете изменить).

## Вариант 2

Суть проекта та же, только сейчас, программа ищет заданную букву в словах из списка и потом, считает количество повторений этой буквы в словах. По завершении вычислений, программа заносит полученные данные в excel документ.

## Установка

Для начала вам лучше использовать Java 8. :trophy:

![This is an image](https://i.ibb.co/LNW93hG/javaversion.png)

Также важно использовать правильную версию WebDriver.

Во время разработки проекта я использовал версию **97.0.4692.71**. Это последний стабильный релиз на **31.01.2022**.

Dependency:

   <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->

        <dependency>
             <groupId>org.seleniumhq.selenium</groupId>
             <artifactId>selenium-java</artifactId>
             <version>4.1.1</version>
        </dependency>

[Посмотреть на мой POM.xml полностью](https://i.ibb.co/DMLcvP9/pomagain.png).

Используйте правильную версию maven.

![This is an image](https://i.ibb.co/kSLL33z/image.png)

Для того, чтобы записать данные в excel, я использую библиотеку под названием [Apache POI](https://poi.apache.org/) **5.2.0**. Это последний стабильный релиз на **07.02.2022**.

Я думаю, что мне нет необходимости рассказывать вам, как это все установить, но если возникнут какие-либо проблемы, свяжитесь со мной по почте из моего профиля. :mailbox:

Далее алгоритм действий прост:

* git clone WebCrawler-Java-Selenium

* Открыть этот проект в вашей IDE

## Работа с проектом

Убедитесь, что все dependency подключены.

Запустите проект как обычно.

## Other
 
"Вдохновение" для написания этой программы черпалось из видео этих ребят: :innocent:

* [Web Scraping Dynamic Websites with Java and Selenium](https://www.youtube.com/watch?v=PF0iyeDmu9E&t=718s&ab_channel=ShaneLee)

* [Web Scraper or Crawler Part 1 - Selenium WebDriver Tutorial 11](https://www.youtube.com/watch?v=zXFbR__vG5A&t=123s&ab_channel=AutomationZone)
