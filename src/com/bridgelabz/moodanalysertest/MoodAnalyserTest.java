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
        object = new MoodAnalyser("I am in Happy mood");
    }
    @Test
    public void moodAnalyser()
    {
        String ans = object.moodAnalyser();
        Assertions.assertEquals("HAPPY",ans);
    }
}