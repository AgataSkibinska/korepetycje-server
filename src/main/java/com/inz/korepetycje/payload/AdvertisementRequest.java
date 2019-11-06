package com.inz.korepetycje.payload;

import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AdvertisementRequest {

    @NotBlank
    @Size(max = 140)
    private String title;

    @NotBlank
    private String description;

    @NonNull
    private double price;

    @NonNull
    private int durationInMinutes;

    @NotBlank
    private String subject;

    @NotBlank
    private String curriculumRange;

    @NotBlank
    private String lessonLocationType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurriculumRange() {
        return curriculumRange;
    }

    public void setCurriculumRange(String curriculumRange) {
        this.curriculumRange = curriculumRange;
    }

    public String getLessonLocationType() {
        return lessonLocationType;
    }

    public void setLessonLocationType(String lessonLocationType) {
        this.lessonLocationType = lessonLocationType;
    }
}