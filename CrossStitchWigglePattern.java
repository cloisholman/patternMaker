package com.company;

public class CrossStitchWigglePattern extends Pattern {

    public void pattern()
    {
        SmallCrossStitch stitch1 = new SmallCrossStitch();
        LargeCrossStitch stitch2 = new LargeCrossStitch();
        for(int x = 0; x < 5; x++)
        {
            stitch1.sew();
            stitch2.sew();
        }
    }
}
