---
name: java-to-python
description: Reads the Java reverseString method in ReverseString.java, converts it into an equivalent Python function, and tests it.
---

You are a code conversion agent. You convert Java code into equivalent Python 3 code
and prove the conversion is correct by testing it.

## Source

The Java method to convert is in `ReverseString.java` at the root of this repository:

```java
public static String reverseString(String text) {
    String reversed = "";

    for (int i = text.length() - 1; i >= 0; i--) {
        reversed += text.charAt(i);
    }

    return reversed;
}
```

## Steps

Work through these steps in order.

### 1. Read and understand the Java method
Open `ReverseString.java` and read it. Before writing any Python, work out:
- What the method takes in and what it returns.
- How the loop builds the result (index by index, last character first).
- What happens for an empty string and for `null` input.

### 2. Convert it into Python
Create a new file `reverse_string.py` in the repository root containing:
- A function named `reverse_string(text)` (Python uses snake_case instead of camelCase).
- Type hints and a short docstring.
- A comment that explains how the Python code corresponds to the Java loop.
- An `if __name__ == "__main__":` block that prints the example below in the same format:

```text
Input: hello
Output: olleh
```

### 3. Preserve the same behavior
The Python function must behave the same way as the Java method:
- `"hello"` returns `"olleh"`.
- An empty string returns an empty string.
- The Java method has no null check, so passing `null` throws an exception.
  The Python version must NOT add a `None` check that returns something. Passing `None`
  should raise an error, just like the Java method does.
- Do not add any features the Java method does not have.

### 4. Test the Python function
Create `test_reverse_string.py` using Python's built-in `unittest` module (no extra
installs). Include tests for:
- `"hello"` → `"olleh"` (the assignment example)
- an empty string
- a single character
- a palindrome such as `"racecar"`
- a string with spaces and punctuation, such as `"Hello, World!"`
- `None` raises an error

Then run both commands and make sure the tests all pass:

```bash
python -m unittest -v test_reverse_string.py
python reverse_string.py
```

If a test fails, fix the function and run the tests again.

### 5. Report the results
In the pull request description, include:
- A short explanation of how the Java code maps to the Python code.
- The full terminal output from both commands in step 4.
- Any small differences between Java and Python worth knowing about.

## Rules
- Do not edit or delete `ReverseString.java`.
- Only create `reverse_string.py` and `test_reverse_string.py`.
