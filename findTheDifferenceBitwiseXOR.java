class findTheDifferenceBitwiseXOR {
    public char findTheDifference(String s, String t) {
        char result = 0;
        int len = s.length();
        for(int i=0; i<len; i++){
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }
         // XOR the last character of t (since t is longer by one character)
        result ^= t.charAt(len);
        
        return result;
    }
}

/* 
The `result` variable isn't actually holding two values at once. Instead, it's holding a single value that represents the cumulative XOR of all the characters processed so far. The XOR operation combines these values in such a way that it effectively "remembers" the differences between them.

Here's a more detailed explanation:

### XOR Operation
The XOR operation works on the binary representation of characters. When you XOR two characters, the result is a new character whose binary representation is the bitwise XOR of the binary representations of the original characters.

### Step-by-Step Example
Let's take an example to illustrate this. Suppose `s = "abc"` and `t = "abdc"`.

1. **Initialization**: `result = 0`
2. **Iterate through both strings**:
   - `result ^= 'a'` (result now holds the XOR of 0 and 'a')
   - `result ^= 'b'` (result now holds the XOR of previous result and 'b')
   - `result ^= 'c'` (result now holds the XOR of previous result and 'c')
   - `result ^= 'a'` (result now holds the XOR of previous result and 'a')
   - `result ^= 'b'` (result now holds the XOR of previous result and 'b')
   - `result ^= 'd'` (result now holds the XOR of previous result and 'd')
   - `result ^= 'c'` (result now holds the XOR of previous result and 'c')

3. **Final XOR**: XOR the last character of `t` (since `t` is longer by one character):
   - `result ^= 'd'` (result now holds the XOR of previous result and 'd')

### How XOR Cancels Out
When you XOR a character with itself, the result is 0. For example, `a ^ a = 0`. This property allows the XOR operation to cancel out characters that appear in both strings.

In the example above:
- `result ^= 'a' ^ 'a'` results in 0 (since `a ^ a = 0`)
- `result ^= 'b' ^ 'b'` results in 0 (since `b ^ b = 0`)
- `result ^= 'c' ^ 'c'` results in 0 (since `c ^ c = 0`)
- The remaining character is `d`, which is the extra character in `t`.

### Final Result
After XORing all characters, the characters that appear in both `s` and `t` will cancel out, leaving only the extra character in `t`. The `result` variable holds this extra character.
*/
