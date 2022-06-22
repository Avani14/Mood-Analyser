package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(String message)
    {
        this.message = message;
    }
    public MoodAnalyser()
    {
        this.message = null;
    }
    public String moodAnalyser()
    {
            if (this.message.contains("Sad"))
                return "SAD";

            return "HAPPY";
    }

}
