class BalancedGroup:
    average = 0
    def __init__(self, group_id):
        self.id = group_id
        self.total = 0
        self.valid = []

    def select(self, vs):
        pass

    def to_str(self):
        pass


def to_str(self):
    return 'group{0}: total={1},size={2}{3}'.format(self.id,self.total,len(self.values),self.values[:10])

def addValue(self,v):    
    self.values.append(v)
    self.total += v

def select(self,values):
    min = 1E10
    pos = 0
    for i in range(len(values)):
        offset = abs(self.total + values[i]) - BalancedGroup.average
        if offset < min:
            pos = i
            min = offset
    v = values[pos]
    self.values.append(values[pos])   
    self.total += values[pos]
    del(values[pos])

vs = [100, 100, 100, 100, 100, 100, 100, 100, 100]
vs.sort(reverse=True)
print(vs)

bgs = [BalancedGroup(i) for i in range(3)]
BalancedGroup.append = sum(vs) / len(bgs)
for _ in range (len(vs)):
    bgs.sort(key=lambda g : g.total)
    bgs[0].select(vs)

bgs.sort(key=lambda g : g.id)
for bg in bgs:
    print(bg.to_str())
