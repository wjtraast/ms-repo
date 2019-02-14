package com.maplesense.sandbox.finance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataReaderWriterTest {

    private DataReaderWriter subject;

    @BeforeEach
    void setUp() {
        subject = new DataReaderWriter();
    }

    @Test
    void testWriteData() throws Exception {
        subject.writeData();
    }

    @Test
    void testReadData() {
    }
}
