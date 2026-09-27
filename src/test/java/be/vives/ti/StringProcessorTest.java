package be.vives.ti;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setup(){
        stringProcessor = new StringProcessor();
    }

    @Test
    public void withSuffixDoNothing(){
        String result = stringProcessor.appendIfMissing("hello world","world");
        assertEquals("hello world",result);
    }

    @Test
    public void addSuffix(){
        String result = stringProcessor.appendIfMissing("hello world","!!!");
        assertEquals("hello world!!!",result);
    }

}