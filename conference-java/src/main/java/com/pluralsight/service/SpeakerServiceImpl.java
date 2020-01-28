package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository = repository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("Called after the constructor");
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository setter");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
