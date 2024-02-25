Это первая часть сервиса. Сервис или веб-приложение состоит из трех автономных частей, каждая из которых запускается на локальном хосте и разных портах.
Конкретно эта ветка отвечает за веб представление примитивного ИнтернетМагазина.



shop-web
│   pom.xml
│   application.properties
│
└───src
    └───main
        ├───java
        │   └───com
        │       └───example
        │           └───shopweb
        │               │   ShopWebApplication.java
        │               │
        │               ├───controller
        │               │       ProductController.java
        │               │
        │               ├───model
        │               │       Product.java
        │               │
        │               └───service
        │                       ProductService.java
        │
        └───resources
            │   templates
            │       index.html
            │       product.html
            │
            └───static

