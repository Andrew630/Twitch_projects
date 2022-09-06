package com.andrewchi.jupiter.service;

public class RecommendationException extends RuntimeException {
    public RecommendationException(String errorMessage) {
        super(errorMessage);
    }
}