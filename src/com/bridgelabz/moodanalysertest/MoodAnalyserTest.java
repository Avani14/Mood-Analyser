package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyserException;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class MoodAnalyserTest {
    MoodAnalyser object ;
    @BeforeEach
    public void setUp()
    {
        object = new MoodAnalyser();
    }
    @Test
    public void moodAnalyser() {
        try {
            ExpectedException e =  ExpectedException.none();
            object.moodAnalyser();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.NULL,e.type);
        }
    }
}