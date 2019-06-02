package com.company;

public class BlockyBaublePattern extends Pattern {
    public void pattern()
    {
        BlockStitch block = new BlockStitch();
        ShortLineStitch dash = new ShortLineStitch();
        CircleStitch circle = new CircleStitch();

        for(int x = 0; x<3; x++)
        {
            block.sew();
            dash.sew();
            dash.sew();
            circle.sew();
            dash.sew();
            dash.sew();
        }
    }
}
