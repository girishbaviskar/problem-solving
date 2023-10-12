# O(nlogn) | O(1)
def nonConstructibleChange(coins):
    change = 0
    coins.sort()
    for coin in coins:
      if change + 1 < coin:
        return change + 1
      change += coin
    return change + 1
