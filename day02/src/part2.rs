fn is_invalid(value: u64) -> bool {
    let s = value.to_string();
    let len = s.len();

   (1..=len / 2).any(|sub_len| {
        len % sub_len == 0 && {
            let pattern = &s[..sub_len];
            pattern.repeat(len / sub_len) == s
        }
    })
}

fn parse_range(s: &str) -> (u64, u64) {
    let parts: Vec<&str> = s.split('-').collect();
    let start = parts[0].parse::<u64>().unwrap();
    let end = parts[1].parse::<u64>().unwrap();
    (start, end)
}

fn get_invalids_in_value(value: &str) -> Vec<u64> {
    let mut invalids: Vec<u64> = Vec::new();
    let (start, end) = parse_range(value);

    for i in start..=end {
        if is_invalid(i) {
            invalids.push(i)
        }
    }

    invalids
}

pub fn solve_part_2(input: &Vec<String>) -> u64 {
    let mut invalids: Vec<u64> = Vec::new();
    
    for value in input {
        invalids.extend(get_invalids_in_value(value))       
    }

    invalids.iter().sum()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn solves_part_2() {
        let test_input: Vec<String> = vec![
            "11-22".to_string(),
            "95-115".to_string(),
            "998-1012".to_string(),
            "1188511880-1188511890".to_string(),
            "222220-222224".to_string(),
            "1698522-1698528".to_string(),
            "446443-446449".to_string(),
            "38593856-38593862".to_string(),
            "565653-565659".to_string(),
            "824824821-824824827".to_string(),
            "2121212118-2121212124".to_string(),
        ];

        let result = solve_part_2(&test_input);
        assert_eq!(result, 4174379265);
    }
}