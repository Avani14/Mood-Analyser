package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {
    MoodAnalyser object ;
    @BeforeEach
    public void setUp()
    {
        object = new MoodAnalyser();
    }
    @Test
    public void moodAnalyser()
    {

        String ans = object.moodAnalyser("This is a happy message");
        Assertions.assertEquals("HAPPY",ans);
    }
}