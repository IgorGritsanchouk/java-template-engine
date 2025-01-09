package com.jte.domain;

public record Todo(
    Long id,
    String title,
    String description,
    boolean completed
) {
}
