import 'dart:io';

import 'package:day01/day01.dart';

Future<List<String>> readLines() async {
  final file = File('input.txt');
  return await file.readAsLines();
}

void main(List<String> arguments) async {
  List<String> lines = await readLines();
  int result1 = solvePart1(lines);
  int result2 = solvePart2(lines);

  print("Part 1:");
  print(result1); // 1074

  print("Part 2:");
  print(result2); // 6254
}
