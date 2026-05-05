students = [
    "Alex", "Ben", "Alex", "Diana", "Ben",
    "Alex", "Ethan", "Diana", "Ben", "Alex"
]

# idea: key is the name, value is the count of that name
name_map = {} 

for name in students:
    if name not in name_map:
        name_map[name] = 0
    
    name_map[name] += 1

for name in name_map:
    print(f"{name}: {name_map[name]}")
    