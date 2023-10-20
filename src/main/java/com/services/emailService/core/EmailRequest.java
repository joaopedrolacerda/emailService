package com.services.emailService.core;

public record EmailRequest(String to, String subject, String body) {
}
