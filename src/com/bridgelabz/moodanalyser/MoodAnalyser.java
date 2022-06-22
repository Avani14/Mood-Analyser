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
    public String moodAnalyser() throws MoodAnalyserException {
        try {
            if(this.message.length() == 0)
            {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,"Please enter valid message.The message is empty.");
            }
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch(NullPointerException e)
        {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL,"Please enter valid message.The message is null");
        }
    }

}
