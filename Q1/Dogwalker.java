//PART A
public int walkDogs(int hour) {
  

    // find out from DogWalkCompany how many dogs at hour
    int numDogs = company.numAvailableDogs(hour);

    // if walker can walk more (or equal) dogs than available
    if (maxDogs >= numDogs) {
        company.updateDogs(hour, numDogs);
        return numDogs;
    } 
    // if there are more dogs than the walker can handle
    company.updateDogs(hour, maxDogs);
    return maxDogs;
}

//PART B
public int dogWalkShift(int startHour, int endHour) {
    int moneyEarned = 0;

    for (int hour = startHour; hour <= endHour; hour++) {
        int dogs = walkDogs(hour);
        
        // earn $5 per dog walked
        moneyEarned += dogs * 5;

        // earn a $3 bonus?
        if (dogs == maxDogs || (hour >= 9 && hour <= 17)) {
            moneyEarned += 3;
        }
    }

    return moneyEarned;
}

