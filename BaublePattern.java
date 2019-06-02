package com.company;

public class BaublePattern extends Pattern {
    public void pattern()
    {
        ShortLineStitch dash = new ShortLineStitch();
        CircleStitch circle = new CircleStitch();

        for(int x = 0; x<5; x++)
        {
            dash.sew();
            dash.sew();
            circle.sew();
        }
    }
}
