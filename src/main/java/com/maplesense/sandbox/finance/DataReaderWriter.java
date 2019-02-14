package com.maplesense.sandbox.finance;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maplesense.sandbox.finance.model.DummyModel;
import com.maplesense.sandbox.finance.model.FamilyMember;

import java.io.File;
import java.io.IOException;

public class DataReaderWriter {

    public void writeData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        
        FamilyMember fenne = FamilyMember.FENNE;
        System.out.println(fenne);

        DummyModel dummy = new DummyModel("SuperType", "ModelXYZ", 2002);
        
        objectMapper.writeValue(new File("src/main/resources/target/fenne.json"), fenne);
        objectMapper.writeValue(new File("dummy.json"), dummy);
    }

    public void readData() {
        
    }
}
