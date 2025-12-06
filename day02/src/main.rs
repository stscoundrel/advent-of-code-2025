use std::fs;
mod part1;

fn read_file(filename: &str) -> Vec<String> {
    let contents = fs::read_to_string(filename).unwrap();
    
    let values: Vec<String> = contents
        .split(',')
        .map(|s| s.to_string())
        .collect();
    
    values
}

fn main() {
    let input = read_file("input.txt");
    let result1 = part1::solve_part_1(&input);

    print!("Part 1: {}", result1);
}
