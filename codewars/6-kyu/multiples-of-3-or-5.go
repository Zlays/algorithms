package main

import (
	"fmt"
)

func main() {
	var result = Multiple3And5(10)
	if result == 23 {
		fmt.Println(result, "Done.")
	} else {
		fmt.Println(result, "Rip.")
	}
}

func Multiple3And5(number int) int {
	total := 0
	x := 0
	for x < number {
		if x % 3 == 0 || x % 5 == 0 {
			total += x
		}
		x++
	}
	return total
}
