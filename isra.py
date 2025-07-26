questions = [
    {
        "question": "1. The Python Programming Language was created by Guido van Rossum in ________ and further developed by the Python Software Foundation.",
        "options": ["1989", "1991", "1995", "2000"],
        "answer": "1991"
    },
    {
        "question": "2. ________ is a built-in function in Python that tells the program to display something on the screen.",
        "options": ["input()", "output()", "print()", "display()"],
        "answer": "print()"
    },
    {
        "question": "3. ________ are always enclosed in quotation marks.",
        "options": ["Variables", "Strings", "Comments", "Functions"],
        "answer": "Strings"
    },
    {
        "question": "4. In Python, single-line comments start with ________.",
        "options": ["//", "/*", "#", "--"],
        "answer": "#"
    },
    {
        "question": "5. In Python, ________ is used to define blocks of code.",
        "options": ["Curly braces {}", "Parentheses ()", "Indentation", "Semicolon ;"],
        "answer": "Indentation"
    },
    {
        "question": "6. ________ act as placeholders for data in Python.",
        "options": ["Functions", "Variables", "Strings", "Modules"],
        "answer": "Variables"
    },
    {
        "question": "7. A ________ is a block of reusable code.",
        "options": ["Variable", "Loop", "Function", "Class"],
        "answer": "Function"
    },
    {
        "question": "8. ________ are ordered and mutable collections.",
        "options": ["Tuples", "Lists", "Sets", "Dictionaries"],
        "answer": "Lists"
    },
    {
        "question": "9. ________ are ordered and immutable collections.",
        "options": ["Lists", "Sets", "Tuples", "Dictionaries"],
        "answer": "Tuples"
    },
    {
        "question": "10. ________ are unordered and unique collections.",
        "options": ["Lists", "Sets", "Tuples", "Dictionaries"],
        "answer": "Sets"
    },
    {
        "question": "11. Python supports the creation of anonymous functions at runtime, using a construct called ________.",
        "options": ["def", "lambda", "func", "anon"],
        "answer": "lambda"
    },
    {
        "question": "12. ________ is a way to extract a portion of a string by specifying the start and end indexes.",
        "options": ["Indexing", "Slicing", "Splitting", "Joining"],
        "answer": "Slicing"
    },
    {
        "question": "13. ________ removes leading and trailing whitespace from the string.",
        "options": ["strip()", "trim()", "clean()", "remove()"],
        "answer": "strip()"
    },
    {
        "question": "14. ________ must have all elements of the same type.",
        "options": ["Lists", "Tuples", "Arrays", "Sets"],
        "answer": "Arrays"
    },
    {
        "question": "15. The command ________ displays all keywords in the Python column by column.",
        "options": ['print(keywords)', 'show(keywords)', 'help("keywords")', 'list_keywords()'],
        "answer": 'help("keywords")'
    }
]

score = 0

for q in questions:
    print(q["question"])
    for i, option in enumerate(q["options"], 1):
        print(f"  {i}. {option}")
    while True:
        try:
            choice = int(input("Your answer (enter the option number): "))
            if 1 <= choice <= len(q["options"]):
                break
            else:
                print("Please enter a valid option number.")
        except ValueError:
            print("Please enter a number.")
    
    if q["options"][choice - 1].lower() == q["answer"].lower():
        print("Correct!\n")
        score += 1
    else:
        print(f"Wrong! The correct answer is: {q['answer']}\n")

print(f"Quiz complete! Your score: {score} out of {len(questions)}")
