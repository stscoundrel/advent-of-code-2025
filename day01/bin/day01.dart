import 'dart:io';

import 'package:day01/day01.dart';

Future<List<String>> readLines() async {
  final file = File('input.txt');
  return await file.readAsLines();
}

void main(List<String> arguments) async {
  int result1 = solvePart1(await readLines());

  print("Part 1:");
  print(result1);
}
