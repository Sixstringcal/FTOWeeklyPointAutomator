# FTOWeeklyPointAutomator
Automates the process of the leaderboards for Ben Streeter's weekly online FTO competition.

This is a console java application.  Please run it through your command line.

To input results, enter them in this fashion (note, if the average is over a minute, convert it to seconds):

roundNumber  
Name,average  
Name,average  
...  
Name,average  
end of round  

Note: results must be entered in the order they place.  For example: someone with an average of 30 must be below someone with an average of 29 for each round.
  
An example input for a single competition would be as follows (using data from August 30th 2020):  

1  
Tyler Hicks,24.27  
Michael Larsen,28.74  
Edward Dibley,28.75  
Calvin Nielson,35.20  
Nathan Lewis,52.21  
Lacey Dilworth,52.97  
Vishwa Sankar,54.09  
Amelia Cheng,61.87  
Samuel Rubinstein,105.16  
end of round

When you are done entering results and want a point tally, type:  
done with results

This program does not save results, so the results for the entire month must be entered each time.  For an example of how to enter results for more than one round, please see "exampleInput.txt"
