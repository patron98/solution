#!/usr/local/bin/python3

numbers = [5, 23, 15, 30, 32, 3, 50, 100, 41, 
           51, 17, 19, 405, 230, 560, 140, 71, 490]

anagram_dict = {}

for num in numbers:
    sorted_str = "".join(sorted(str(num)))

    if sorted_str in anagram_dict:
        anagram_dict[sorted_str].append(num)
    else:
        anagram_dict[sorted_str] = [num]

anagrams = [v for v in anagram_dict.values() if len(v) > 1]
print(anagrams, "\n")
