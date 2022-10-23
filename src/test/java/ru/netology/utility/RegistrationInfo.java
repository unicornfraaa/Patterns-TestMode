package ru.netology.utility;

import lombok.*;
@Value
public class RegistrationInfo {
    private String login;
    private String password;
    private String status;
}