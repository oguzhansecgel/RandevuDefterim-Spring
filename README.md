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
2. Microservice'leri sırasıyla çalıştırın:

Config Server
Discovery Server
Gateway Server
Notification Service
Owner Service
Appointment Service
3. API uçlarını Postman veya benzeri bir araçla test edebilirsiniz.


## İletişim
Eğer bu proje hakkında sorularınız varsa, bana ulaşabilirsiniz: oguzhan.secgel.19@gmail.com