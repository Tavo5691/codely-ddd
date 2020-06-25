# codely-ddd
This repository contains the practical implementations of DDD and Hexagonal Architecture theory and patterns in a Spring Boot project.

The Example Domain here is a courses platform, so the main Domain Models are:

* Courses
* Students

The Domain contains the following Bounded Contexts:

* Backoffice (used by the platform employees to upload new courses, etc)
* MOOC (Massive Online Open Courses, the platform itself)
* Shared (contains the common classes used in several Bounded Contexts)
