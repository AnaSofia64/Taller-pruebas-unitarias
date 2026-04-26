package edu.unisabana.tyvs.domain.model;

public enum RegisterResult {
    VALID,       // Registro exitoso
    DUPLICATED,  // ID ya registrado
    INVALID,     // Datos inválidos: null o id <= 0
    DEAD,        // Persona fallecida
    UNDERAGE,    // Menor de edad (age < 18)
    INVALID_AGE  // Edad fuera de rango (age < 0 o age > 120)
}
