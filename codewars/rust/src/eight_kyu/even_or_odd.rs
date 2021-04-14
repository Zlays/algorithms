pub fn run(i: i32) -> &'static str {
    return if i % 2 == 0 {
        "Even"
    } else {
        "Odd"
    };
}

#[test]
fn it_works() {
    assert_eq!(run(2), "Even");
    assert_eq!(run(3), "Odd");
    assert_eq!(run(13), "Odd");
    assert_eq!(run(14), "Even");
}
