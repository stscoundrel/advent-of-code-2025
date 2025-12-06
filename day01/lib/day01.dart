const int maxPosition = 99;

int solvePart1(List<String> turns) {
  int zeroPositions = 0;
  int currentPosition = 50;

  for (final turn in turns) {
    final direction = turn[0];
    final rawNumber = int.parse(turn.substring(1));
    final number = rawNumber % 100;

    if (direction == 'L') {
      int newPosition = currentPosition - number;
      if (newPosition < 0) {
        currentPosition = maxPosition + newPosition + 1;
      } else {
        currentPosition = newPosition;
      }
    }

    if (direction == 'R') {
      int newPosition = currentPosition + number;
      if (newPosition > maxPosition) {
        currentPosition = newPosition - maxPosition - 1;
      } else {
        currentPosition = newPosition;
      }
    }

    if (currentPosition == 0) {
      zeroPositions++;
    }
  }

  return zeroPositions;
}

int solvePart2(List<String> turns) {
  int zeroPositions = 0;
  int currentPosition = 50;

  for (final turn in turns) {
    final direction = turn[0];
    final rawNumber = int.parse(turn.substring(1));
    final number = rawNumber % 100;
    int fullRounds = rawNumber ~/ 100;

    zeroPositions += fullRounds;

    if (direction == 'L') {
      int newPosition = currentPosition - number;
      if (newPosition < 0) {
        if (currentPosition != 0) {
          zeroPositions++;
        }
        currentPosition = maxPosition + newPosition + 1;
      } else {
        currentPosition = newPosition;
        if (currentPosition == 0) {
          zeroPositions++;
        }
      }
    }

    if (direction == 'R') {
      int newPosition = currentPosition + number;
      if (newPosition > maxPosition) {
        if (currentPosition != 0) {
          zeroPositions++;
        }
        currentPosition = newPosition - maxPosition - 1;
      } else {
        currentPosition = newPosition;
        if (currentPosition == 0) {
          zeroPositions++;
        }
      }
    }
  }

  return zeroPositions;
}
