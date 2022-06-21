class TwelveDays {

    String getDayName(int day)
    {
        switch(day)
            {
                case 1: {
                    return "first";
                    
                }
                case 2: {
                    return "second";
                    
                }
                case 3: {
                    return "third";
                    
                }
                case 4: {
                    return "fourth";
                    
                }
                case 5: {
                    return "fifth";
                    
                }
                case 6: {
                    return "sixth";
                    
                }
                case 7: {
                    return "seventh";
                    
                }
                case 8: {
                    return "eighth";
                    
                }
                case 9: {
                    return "ninth";
                    
                }
                case 10: {
                    return "tenth";
                    
                }
                case 11: {
                    return "eleventh";
                    
                }
                default : {
                    return "twelfth";
                }
            }
    }


    String getGifts(int day)
    {
        String giftsForDay = new String("");
        String[] gifts = new String[12];
        gifts[0]="a Partridge in a Pear Tree";
        gifts[1]="two Turtle Doves";
        gifts[2]="three French Hens";
        gifts[3]="four Calling Birds";
        gifts[4]="five Gold Rings";
        gifts[5]="six Geese-a-Laying";
        gifts[6]="seven Swans-a-Swimming";
        gifts[7]="eight Maids-a-Milking";
        gifts[8]="nine Ladies Dancing";
        gifts[9]="ten Lords-a-Leaping";
        gifts[10]="eleven Pipers Piping";
        gifts[11]="twelve Drummers Drumming";

        for(int i=day-1;i>0;i--)
            {
                giftsForDay+=" "+gifts[i]+",";
                if(i==1)
                {
                    giftsForDay+=" and";
                }
            }
        giftsForDay+=" "+gifts[0]+".";
        return giftsForDay;
    }

    
    String verse(int verseNumber) {

        String verseCreated = String.format("On the %s day of Christmas my true love gave to me:%s\n",getDayName(verseNumber),getGifts(verseNumber));
        
        return verseCreated;
    }

    String verses(int startVerse, int endVerse) {
        // throw new UnsupportedOperationException("Delete this statement and https://exercism.org/about/hiringwrite your own implementation.");
        String versesCreated = new String("");
        for (int i=startVerse;i<=endVerse;i++)
            {
                if(i!=startVerse)
                {
                    versesCreated+="\n";
                }
                versesCreated+=verse(i);
                
            }
        //adding comment for changing the file
        return versesCreated;
    }
    
    String sing() {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return verses(1,12);
    }
}
