# RandevuDefterim-Spring

RandevuDefterim-Spring projesi, microservice mimarisi kullanarak oluşturulmuş bir randevu yönetim sistemidir. Bu projede randevu oluşturma, listeleme, güncelleme, silme ve kullanıcıya randevu ile ilgili bilgilendirme e-postası gönderme özellikleri bulunmaktadır.

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

## Proje Görselleri
- Giriş Ekranı
![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362895556-ca1e8de9-584a-4d62-bc86-1f3247ee1ca0.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQ5NjcxMTEsIm5iZiI6MTcyNDk2NjgxMSwicGF0aCI6Ii8zNjA5MDk1MC8zNjI4OTU1NTYtY2ExZThkZTktNTg0YS00ZDYyLWJjODYtMWYzMjQ3ZWUxY2EwLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MjklMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODI5VDIxMjY1MVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTc1NDM2NjlmNjY3NjRmZjU1ZTRlN2EyOGJkZDI3NWViMzkwZmI3YmUwZGYzYThiYTA0MGU1NTI2Nzc0Mjg1YjUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.jitXJIBLgIHIygBJL4lDGNxKm62COKY2iKZmjuY5CtA)
- Kayıt Ekranı
![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362895804-36edc129-a51b-4e05-ac3d-a5062c340321.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQ5NjcxNzUsIm5iZiI6MTcyNDk2Njg3NSwicGF0aCI6Ii8zNjA5MDk1MC8zNjI4OTU4MDQtMzZlZGMxMjktYTUxYi00ZTA1LWFjM2QtYTUwNjJjMzQwMzIxLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MjklMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODI5VDIxMjc1NVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTM1YzkzMDViMDg1ZDkwNzhiZGZjODUxYTAxNTkyYjU5MGM1NWRhZThhYzAxNWJlMGNlNjExMmQzYjUzNWRmZTImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.wsxoEoHYeCQqDRUE3eeycnjzM2LX_-NQgfIZfDaqkIA)
- Randevu Sayfası
![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362922184-7f167116-ed26-4382-9ec4-5dda91a5aab7.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQ5NjkxMTUsIm5iZiI6MTcyNDk2ODgxNSwicGF0aCI6Ii8zNjA5MDk1MC8zNjI5MjIxODQtN2YxNjcxMTYtZWQyNi00MzgyLTllYzQtNWRkYTkxYTVhYWI3LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MjklMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODI5VDIyMDAxNVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTA2ZjZkZGRhNWNlZmZjYjhjZjVjY2ZmMDk0ZjliYzE3M2ZmZTMzZmY1ZTNjMWFlZjAwYmQyZDcxNWQ5YmJiYzMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.ynL56vBLytvZnXFIxezXB-_X-hg57lLGVpkTbrRHJw4)
- Randevu Oluşturma Sayfası
![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362923215-9175fe7d-254a-4958-97ed-989756f869e2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQ5NjkxNzEsIm5iZiI6MTcyNDk2ODg3MSwicGF0aCI6Ii8zNjA5MDk1MC8zNjI5MjMyMTUtOTE3NWZlN2QtMjU0YS00OTU4LTk3ZWQtOTg5NzU2Zjg2OWUyLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MjklMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODI5VDIyMDExMVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTAzYjc3ZTYxY2JiMzY4N2JjZGVmMThmYjI3Njk4MzNkOGJmN2ZmOWUyZDExMmJiMTZjMjAyYjczZjIyOTU3NzAmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.-N48In8ud-c45dopqaGBOCZqNr_S9P7Vr17nJMEN0iY)
- Swagger
![Proje Görseli](https://private-user-images.githubusercontent.com/36090950/362924331-a5f8bb53-fc07-410a-99c7-86f3a3d19ffb.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQ5NjkyMzQsIm5iZiI6MTcyNDk2ODkzNCwicGF0aCI6Ii8zNjA5MDk1MC8zNjI5MjQzMzEtYTVmOGJiNTMtZmMwNy00MTBhLTk5YzctODZmM2EzZDE5ZmZiLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MjklMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODI5VDIyMDIxNFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTlkOTUzZWE0NDliYjgyNzc5MjU2ZjJlMTM4MTVmMDhiNzRlZWVkMWQ0Njk4MTQ0NjczNGU2NzllMTI2OTg4NzEmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.jLAd_-Y_k-6iSCgvTbbTagEINwUKkoBEtaH8QjoXCVc)