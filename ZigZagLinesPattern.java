package com.company;

public class ZigZagLinesPattern extends Pattern {

    public void pattern()
    {
        ZigZagStitch zigZag = new ZigZagStitch();
        FillStitch fill = new FillStitch();
        for(int x = 0; x < 4; x++)
        {
            for(int y = 0; y < 3; y++)
            {
                if(x%2 == 0)
                {
                    zigZag.sew();
                }
                else {
                    fill.sew();
                }
            }
        }
    }
}
