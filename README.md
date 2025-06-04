# UserControll

Ein Spring Boot-Projekt zur Verwaltung von Benutzern mit Fokus auf Registrierung und Authentifizierung mittels JSON Web Tokens (JWT).

## Zielsetzung

* Benutzer können sich registrieren.
* Implementierung einer sicheren Authentifizierung mit JWT.
* Schutz sensibler Daten durch Verschlüsselung.

## Technologien

* Java 17+
* Spring Boot 3.x
* Spring Security 6
* Spring Data JPA
* JWT (z. B. mit [JJWT](https://github.com/jwtk/jjwt))
* Datenbank: H2 (für Entwicklung) oder MySQL/PostgreSQL([medium.com][1], [gitlab.com][2], [github.com][3], [github.com][4])

## Setup

### Voraussetzungen

* Java 17 oder höher
* Maven 3.8+
* Datenbank (H2, MySQL oder PostgreSQL)([medium.com][1], [github.com][4])

### Installation

1. Repository klonen:

   ```bash
   git clone https://github.com/FlorianS716/UserControll.git
   cd UserControll
   ```

([toptal.com][5])

2. Abhängigkeiten installieren:

   ```bash
   mvn clean install
   ```

([github.com][3])

3. Anwendung starten:

   ```bash
   mvn spring-boot:run
   ```

([medium.com][6])

## Konfiguration

Die Anwendungskonfiguration erfolgt über die Datei `src/main/resources/application.properties`.

Beispielkonfiguration für H2-Datenbank:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

# JWT-Konfiguration
app.jwt.secret=DeinJWTGeheimnis
app.jwt.expirationMs=86400000
```



> **Hinweis:** Für Produktionsumgebungen sollten sensible Informationen wie `app.jwt.secret` nicht im Code hinterlegt, sondern über Umgebungsvariablen oder sichere Konfigurationsdienste verwaltet werden.

## API-Endpunkte

### Authentifizierung

* `POST /api/auth/register` – Benutzerregistrierung
* `POST /api/auth/login` – Benutzeranmeldung (gibt JWT zurück)([medium.com][1])

### Geschützte Ressourcen

* `GET /api/user/profile` – Zugriff auf Benutzerprofil (erfordert gültiges JWT)

## Sicherheit

* Passwörter werden mit BCrypt verschlüsselt gespeichert.
* JWTs werden zur Authentifizierung und Autorisierung verwendet.
* Sichere Konfiguration von Spring Security, um Endpunkte entsprechend zu schützen.([medium.com][7])

## 🛠️ Weiterentwicklung

* Implementierung von Rollen und Berechtigungen.
* Refresh Tokens für längere Sitzungen.
* Integration von E-Mail-Verifizierung nach Registrierung.



Für eine detaillierte Implementierung von JWT-Authentifizierung mit Spring Boot und Spring Security kannst du dir das folgende Beispielprojekt ansehen:([medium.com][1])

* [Spring Boot JWT Authentication example with Spring Security & Spring Data JPA](https://github.com/bezkoder/spring-boot-spring-security-jwt-authentication)([github.com][3])

Dieses Projekt demonstriert die Benutzerregistrierung, Anmeldung und Autorisierung mit JWT in einer Spring Boot-Anwendung.([github.com][4])

Wenn du weitere Unterstützung bei der Implementierung benötigst, stehe ich gerne zur Verfügung!

[1]: https://medium.com/%40tericcabrel/implement-jwt-authentication-in-a-spring-boot-3-application-5839e4fd8fac?utm_source=chatgpt.com "Implement JWT authentication in a Spring Boot 3 application - Medium"
[2]: https://gitlab.com/nicholas97/spring-boot-3-spring-security-6-jwt-authentication-and-authorisation?utm_source=chatgpt.com "Spring Boot 3 + Spring Security 6 - JWT Authentication and ... - GitLab"
[3]: https://github.com/bezkoder/spring-boot-spring-security-jwt-authentication?utm_source=chatgpt.com "bezkoder/spring-boot-spring-security-jwt-authentication - GitHub"
[4]: https://github.com/bezkoder/spring-boot-security-login?utm_source=chatgpt.com "Spring Boot Security Login example with JWT and H2 ... - GitHub"
[5]: https://www.toptal.com/spring/spring-security-tutorial?utm_source=chatgpt.com "Spring Security JWT Tutorial | Toptal®"
[6]: https://medium.com/%40villysiu/login-and-signup-with-spring-security-and-json-web-token-jwt-db0ec14e192b?utm_source=chatgpt.com "Authentication with Spring Security and JSON Web Token (JWT)"
[7]: https://medium.com/code-with-farhan/spring-security-jwt-authentication-authorization-a2c6860be3cf?utm_source=chatgpt.com "Spring Security JWT Authentication & Authorization - Medium"
