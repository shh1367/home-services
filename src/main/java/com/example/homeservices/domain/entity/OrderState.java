package com.example.homeservices.domain.entity;

public enum OrderState {
    WAIT_FOR_SPECIALISTS_SUGGESTS,
    WAIT_FOR_SPECIALISTS_SELECTION,
    WAIT_FOR_SPECIALIST_COMING,
    TASK_STARTED,
    TASK_DONE,
    TASK_PAID
}
