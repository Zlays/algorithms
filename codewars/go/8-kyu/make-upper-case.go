package main

import "fmt"

func main() {
	var result = MakeUpperCase("hello word!")
	if result == "HELLO WORD!" {
		fmt.Println(result, "Done.")
	} else {
		fmt.Println(result, "Rip.")
	}
}

func MakeUpperCase(str string) string {
	result := ""
	for i := 0; i < len(str); i++ {
		tmp := str[i]
		if tmp >= 97 && tmp <= 122 {
			result += string(uint8(int(tmp) - 32))
		} else {
			result += string(str[i])
		}
	}
	return result
}
