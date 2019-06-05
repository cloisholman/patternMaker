package com.company;

import java.util.ArrayList;

public class TapestryController {

    public static void main(String[] args) {
        ArrayList<Pattern> patterns = new ArrayList<>();
        CrossStitchWigglePattern wiggle = new CrossStitchWigglePattern();
        ZigZagLinesPattern zigzag = new ZigZagLinesPattern();
        BaublePattern bauble = new BaublePattern();
        BlockyBaublePattern blocky = new BlockyBaublePattern();

        patterns.add(wiggle);
        patterns.add(zigzag);
        patterns.add(bauble);
        patterns.add(blocky);

        for(Pattern pattern:patterns)
        {
            for(int row = 0; row<3; row++){
                for(int column = 0; column<8; column++){
                    pattern.pattern();
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();

        }
        System.out.println();
        System.out.println();
        for(Pattern pattern:patterns){
            for(int row = 0; row<8; row++){
                for(int column=0; column<6; column++){
                    pattern.pattern();
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }

    }
}
