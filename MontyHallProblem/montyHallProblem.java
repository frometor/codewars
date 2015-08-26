public class MontyHall {

  public int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
  float winPercentage = 0;
  for (int i =0; i<=participantGuesses.length-1; i++)
    {
      if (correctDoorNumber != participantGuesses[i])
      {
      winPercentage += 100;
      }
    }
    return Math.round((winPercentage / participantGuesses.length));
  }

}
