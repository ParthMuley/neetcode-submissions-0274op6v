class DynamicArray:
    
    def __init__(self, capacity: int):
        self.capacity=capacity
        self.listed=deque()
        self.currentCapacity=0


    def get(self, i: int) -> int:
        if i<=self.currentCapacity:
            return self.listed[i]
        return -1

    def set(self, i: int, n: int) -> None:
        if i<=self.currentCapacity:
            self.listed[i]=n

    def resize(self) -> None:
        self.capacity*=2

    def pushback(self, n: int) -> None:
        if self.capacity<=self.currentCapacity:
            self.capacity*=2
        self.listed.append(n)
        self.currentCapacity+=1
        

    def popback(self) -> int:
        if self.currentCapacity>0:
            self.currentCapacity-=1
            return self.listed.pop()

        return -1

    

    def getSize(self) -> int:
        return self.currentCapacity
        
    
    def getCapacity(self) -> int:
        return self.capacity