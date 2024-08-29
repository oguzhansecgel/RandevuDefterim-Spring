package com.randevudefterim.notificationservice.service.concretes;

import com.randevudefterim.notificationservice.entity.Appointment;
import com.randevudefterim.notificationservice.service.abstracts.CustomerInfoService;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {


    private final JavaMailSender mailSender;

    public CustomerInfoServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendToCustomerAppointment(Appointment appointment) {

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(appointment.getEmail());
        mailMessage.setSubject("Randevu Bilgilendirme");
        mailMessage.setText(String.format("Merhaba %s %s,\n\n" +
                        "Randevunuz başarıyla oluşturulmuştur. Randevu tarihiniz: %s.\n\n" +
                        "Sorularınız ve destek için bizlerle iletişime geçmekten çekinmeyin.\n\n" +
                        "İyi günler dileriz.",
                appointment.getCustomerFirstName(),
                appointment.getCustomerLastName(),
                appointment.getAppointmentDate().format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm"))
        ));


        try {
            mailSender.send(mailMessage);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateToCustomerAppointment(Appointment updateAppointment) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(updateAppointment.getEmail());
        mailMessage.setSubject("Randevu Güncelleme");
        mailMessage.setText(String.format("Merhaba %s %s,\n\n" +
                        "Randevunuz başarıyla güncellenmiştir. Yeni randevu tarihiniz: %s.\n\n" +
                        "Sorularınız ve destek için bizlerle iletişime geçmekten çekinmeyin.\n\n" +
                        "İyi günler dileriz.",
                updateAppointment.getCustomerFirstName(),
                updateAppointment.getCustomerLastName(),
                updateAppointment.getAppointmentDate().format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm"))
        ));


        try {
            mailSender.send(mailMessage);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }


}
