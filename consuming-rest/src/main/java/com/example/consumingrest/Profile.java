package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Profile(Long id, String name, String email, String gender, String status) {
}
