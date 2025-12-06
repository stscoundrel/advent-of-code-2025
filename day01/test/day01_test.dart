import 'package:day01/day01.dart';
import 'package:test/test.dart';

final List<String> partTestInput = [
  "L68",
  "L30",
  "R48",
  "L5",
  "R60",
  "L55",
  "L1",
  "L99",
  "R14",
  "L82",
];

void main() {
  test('part1', () {
    expect(solvePart1(partTestInput), 3);
  });

  test('part2', () {
    expect(solvePart2(partTestInput), 6);
  });
}
