import threading

def tarefa1():
    x = 0
    while x < 100:
        print("Tarefa 1")
        x += 1

def tarefa2():
    y = 0
    while y < 100:
        print("Tarefa 2")
        y += 1

threading.Thread(target=tarefa1).start()
tarefa2()