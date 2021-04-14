pub fn run(a: &[i32]) -> String {
    let mut result: String = "".to_string();
    let mut pivot: usize = 0;
    let mut i: usize = 1;
    while i < a.len() {
if(i>1) {
    println!("{}{}{}", i > i, (pivot + 1) == i, a[i - 2] == (a[i - 1] - 1));
    println!("I:{}  pivot:{}/{}   aaa:{}/{}", i, (pivot + 1), i, a[i - 2], (a[i - 1] - 1));
}
        if a[i - 1] != (a[i] - 1) && (pivot + 1) != i {
            let diff: i32 = (i - pivot) as i32;
            if diff <= 2 {
                result += &*format!("{}{}", a[pivot], ",");
                pivot = i;
            } else {
                result += &*format!("{}{}{}{}", a[pivot], "-", a[i - 1], ",");
                pivot = i;
            }
        } else if i > 1 && (pivot+1) == i && a[i - 2] == (a[i - 1] - 1) {
            result += &*format!("{}{}", a[i + 1], ",");
            pivot = i;
        }
        i += 1;
    }
    if pivot == i {
        result += &*format!("{}{}", a[pivot], ",");
    } else if pivot <= i - 1 {
        result += &*format!("{}{}{}{}", a[pivot], "-", a[i - 1], ",");
    }
    result.pop();
    return result;
}

#[test]
fn it_works() {
    assert_eq!("-6,-3-1,3-5,7-11,14,15,17-20", run(&[-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20]));
    assert_eq!("-3--1,2,10,15,16,18-20", run(&[-3, -2, -1, 2, 10, 15, 16, 18, 19, 20]));
}
