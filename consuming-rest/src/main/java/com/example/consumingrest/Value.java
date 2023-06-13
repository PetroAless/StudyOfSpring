package com.example.consumingrest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record Value(Long id, String quote) {

}
