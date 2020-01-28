package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl() {

    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public void setRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
