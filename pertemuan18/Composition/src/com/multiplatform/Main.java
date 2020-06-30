package com.multiplatform;

public class Main {

    Case Dzumba = new Case("DZ123432","Dzumba", "240");
    Motherboard Asus = new Motherboard("AS12345","Asus",4,4,"v.2.0" );
    Monitor LG= new Monitor("LG200,x","LG",27, new Resolution(2440,1234));

    PC myDreamPC = new PC(Dzumba,Asus,LG);
    myDreamPC.startPC("Linux ubuntu");

    }
}
