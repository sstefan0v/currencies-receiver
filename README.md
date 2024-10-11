# currencies-receiver service

The purpose of this service is to get money currencies and save them in a Postgres db. It receives data via Web socket 
from another service, `Currency-updater` (`https://github.com/sstefan0v/currencies-updater`). For that purpose, 
`Currency-updater` has to be online and send data.

#### Requirements:
- Docker environment
- Java 23

#### Used versions:
- Java 23 2024-09-17
- Spring Boot 3.3.4
- PostgreSQL 17
- Apache Maven 3.9.4

#### Build:
It is necessary to build `Currency-updater` service first, due to some preparatory 
operations, which are started when building `Currency-updater` only. To build, simply run `mvn install`. This will build
all classes and run tests. 

#### Demo requirements:
Направете Java Spring микросървис, който да има един REST ендпойнт – “/download-currencies”. Този ендпойнт може да бъде викан много на брой пъти, всеки ден. При хитване на ендпойнта, микросървиса трябва да свали най-актуалната информация за всички валутни курсове от БНБ ( за справка: Българска народна банка (bnb.bg)), в xml формат, но само само ако има промяна на валутните курсове от страна на БНБ. Tози сървис трябва да записва хронологично информацията за всички свалени валутни курсове в PostgreSQL база данни. След това, трябва да изпрати информация само за най-актуално свалените валутни курсове по websocket в JSON формат, като за целта този сървис, трябва да бъде и websocket server. Валутните курсове, да бъдат записани с Българските и с Английските им имена и така да бъдат предавани по websocket.
Направете втори сървис, който да чете данните изпратени от гореописаният сървис и отново да записва данните в PostgreSQL таблица.
(untitled)