use std::fs;
mod part1;
mod part2;

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
    let result2 = part2::solve_part_2(&input);

    println!("Part 1: {}", result1); // 44487518055
    println!("Part 2: {}", result2); // 53481866137
}
