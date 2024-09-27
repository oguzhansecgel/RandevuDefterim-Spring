# RandevuDefterim-Spring

RandevuDefterim-Spring projesi, microservice mimarisi kullanarak oluşturulmuş bir randevu yönetim sistemidir. Bu projede randevu oluşturma, listeleme, güncelleme, silme ve kullanıcıya randevu ile ilgili bilgilendirme e-postası gönderme özellikleri bulunmaktadır.
## Proje Görselleri

- Giriş Ekranı
  ![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362895556-ca1e8de9-584a-4d62-bc86-1f3247ee1ca0.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3Mjc0NjYxMzEsIm5iZiI6MTcyNzQ2NTgzMSwicGF0aCI6Ii8zNjA5MDk1MC8zNjI4OTU1NTYtY2ExZThkZTktNTg0YS00ZDYyLWJjODYtMWYzMjQ3ZWUxY2EwLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA5MjclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwOTI3VDE5MzcxMVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWQ4N2UxZTNjYzgwM2ZiMWY2N2JmYzRiYThhMWNmODZmNjhhM2NkYmZlMmI5YmM4ZTJjZWM2YzYyYzc4M2NhODMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.z1zPp56RKclHgCjNsuHWgXCQYhluW5N3XWfh2VctLDc)
- Kayıt Ekranı
  ![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362895804-36edc129-a51b-4e05-ac3d-a5062c340321.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3Mjc0NjYxMzAsIm5iZiI6MTcyNzQ2NTgzMCwicGF0aCI6Ii8zNjA5MDk1MC8zNjI4OTU4MDQtMzZlZGMxMjktYTUxYi00ZTA1LWFjM2QtYTUwNjJjMzQwMzIxLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA5MjclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwOTI3VDE5MzcxMFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTI5YzJlNGY4NThiNDQ1YmNhOTMwNmQ0Njg4OTY0MjkzZjQwMDYxNGZkYzI5NWU4MjI1MDVmNTE4NGMwMWRjMTQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.KKXK8GGzphxAoot7wCQ-PZDsezxw4ICgG4gzfVAoMCc-)
- Randevu Sayfası
  ![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362922184-7f167116-ed26-4382-9ec4-5dda91a5aab7.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3Mjc0NjYxMzAsIm5iZiI6MTcyNzQ2NTgzMCwicGF0aCI6Ii8zNjA5MDk1MC8zNjI5MjIxODQtN2YxNjcxMTYtZWQyNi00MzgyLTllYzQtNWRkYTkxYTVhYWI3LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA5MjclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwOTI3VDE5MzcxMFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTlmNmE0OWExMDRjYjljZjMxNjJjMWM3YTZlZWVhYjY1MzIxOTU2Y2UwZGIxZDY4NDI0ZWJhODJiMGIyMGFjMGUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.-A9j60E2Ycg95bv0N56gshUL9EjFFtGPtLMTqpFBbMs)
  
- Randevu Oluşturma Sayfası
  ![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362923215-9175fe7d-254a-4958-97ed-989756f869e2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3Mjc0NjYxMjksIm5iZiI6MTcyNzQ2NTgyOSwicGF0aCI6Ii8zNjA5MDk1MC8zNjI5MjMyMTUtOTE3NWZlN2QtMjU0YS00OTU4LTk3ZWQtOTg5NzU2Zjg2OWUyLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA5MjclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwOTI3VDE5MzcwOVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTBlMjYwM2ZjNTVlMTM4YzMzZTRjMzk5M2I5NTI0ZjgwMmY0YTM5ZWZmYWY4YzExMGU4NzkwODhiMzI2MDM1MzQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.N7yRT3ebnACfAdljuvite_btqG29cHI14i2O3ndMK6w)
- Swagger
  ![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362924331-a5f8bb53-fc07-410a-99c7-86f3a3d19ffb.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3Mjc0NjYwNDksIm5iZiI6MTcyNzQ2NTc0OSwicGF0aCI6Ii8zNjA5MDk1MC8zNjI5MjQzMzEtYTVmOGJiNTMtZmMwNy00MTBhLTk5YzctODZmM2EzZDE5ZmZiLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA5MjclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwOTI3VDE5MzU0OVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWM1YmE1OTI2NTdlMDczM2Y5Yjc4Yjg5ZmE5MjA0YWRkNWYwYmZjOGY1ZTUwZDI5NTQzMDg1NTIzZTllYTU2YWUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.ykdBsiCn3MuUYmqYYirwFenJZmKrgOm6vrF8dRrqDaw)



## Kullanılan Teknolojiler

- **Java Spring Boot**
- **Microservice Mimarisi**
- **Spring Cloud Config Server**
- **Spring Cloud Gateway**
- **Spring Cloud Eureka Discovery Server**
- **Notification Service**
- **Rest API**

## Microservice Yapısı

Projede kullanılan microservice'ler şunlardır:

- **Owner Service**: Kullanıcı işlemlerini yönetir.
- **Appointment Service**: Randevu işlemlerini yönetir.
- **Config Server**: Konfigürasyon yönetimi sağlar.
- **Discovery Server**: Servis keşfi için kullanılır.
- **Gateway Server**: Tüm microservice'lere tek bir giriş noktası sağlar.
- **Notification Service**: Randevu oluşturulduktan sonra kullanıcıya bilgilendirme e-postası gönderir.

## API Endpoints

### AppointmentController

- **GET** `/appointment/findById/{id}`  
  Randevuyu ID'sine göre getirir.

- **GET** `/appointment/listAppointment`  
  Tüm randevuları listeler.

- **GET** `/appointment/listAppointmentWithOwner/{ownerId}`  
  Belirli bir kullanıcıya ait tüm randevuları listeler.

- **DELETE** `/appointment/deleteAppointment/{id}`  
  Belirtilen ID'ye sahip randevuyu siler.

- **POST** `/appointment/createAppointment`  
  Yeni bir randevu oluşturur.

- **PUT** `/appointment/updateAppointment/{id}`  
  Mevcut bir randevuyu günceller.

### AuthController

- **POST** `/api/v1/auth/register`  
  Yeni bir kullanıcı kaydı oluşturur.

- **POST** `/api/v1/auth/login`  
  Kullanıcı girişi yapar ve JWT token döner.

### OwnerController

- **GET** `/api/owners/getAllOwners`  
  Tüm kullanıcıları listeler.

## Özellikler

- **Randevu Yönetimi**: Randevuları oluşturabilir, güncelleyebilir, silebilir ve listeleyebilirsiniz.
- **Kullanıcı Yönetimi**: Kullanıcılar sisteme kayıt olabilir ve giriş yapabilir.
- **E-posta Bildirimi**: Randevu oluşturulduktan sonra kullanıcıya otomatik olarak e-posta gönderilir.

## Nasıl Çalıştırılır?
1. **Maven bağımlılıklarını yükleyin:**
   ```bash
   mvn clean install
2. **Microservice'leri sırasıyla çalıştırın:**

Config Server
Discovery Server
Gateway Server
Notification Service
Owner Service
Appointment Service

3. **API uçlarını Postman veya benzeri bir araçla test edebilirsiniz.**


## İletişim
Eğer bu proje hakkında sorularınız varsa, bana ulaşabilirsiniz: oguzhan.secgel.19@gmail.com


