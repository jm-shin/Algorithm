a = list(map(int, input().split(" ")))

ascending = True
descending = True

for i in range(1,7):
  if a[i+1] > a[i]:
    descending = False
  elif a[i] > a[i+1]:
    ascending = False
    
if ascending:
  print("ascending")
elif descending:
  print("descending")
else:
  print("mixed")