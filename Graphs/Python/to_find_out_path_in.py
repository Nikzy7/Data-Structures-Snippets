# Python3 program to find out path in  
# a rectangle containing circles. 
import math  
import queue 
  
# Function to find out if there is  
# any possible path or not.  
def isPossible(m, n, k, r, X, Y): 
      
    # Take an array of m*n size and  
    # initialize each element to 0.  
    rect = [[0] * n for i in range(m)] 
  
    # Now using Pythagorean theorem find if a  
    # cell touches or within any circle or not. 
    for i in range(m): 
        for j in range(n): 
            for p in range(k): 
                if (math.sqrt((pow((X[p] - 1 - i), 2) + 
                               pow((Y[p] - 1 - j), 2))) <= r): 
                    rect[i][j] = -1
      
    # If the starting cell comes within  
    # any circle return false.  
    if (rect[0][0] == -1):  
        return False
  
    # Now use BFS to find if there  
    # is any possible path or not.  
  
    # Initialize the queue which holds  
    # the discovered cells whose neighbors  
    # are not discovered yet.  
    qu = queue.Queue()  
  
    rect[0][0] = 1
    qu.put([0, 0])  
      
    # Discover cells until queue is not empty  
    while (not qu.empty()): 
        arr = qu.get() 
        elex = arr[0]  
        eley = arr[1]  
  
        # Discover the eight adjacent nodes.  
        # check top-left cell  
        if ((elex > 0) and (eley > 0) and 
            (rect[elex - 1][eley - 1] == 0)): 
            rect[elex - 1][eley - 1] = 1
            v = [elex - 1, eley - 1]  
            qu.put(v) 
      
        # check top cell  
        if ((elex > 0) and 
            (rect[elex - 1][eley] == 0)): 
            rect[elex - 1][eley] = 1
            v = [elex - 1, eley]  
            qu.put(v) 
      
        # check top-right cell  
        if ((elex > 0) and (eley < n - 1) and 
            (rect[elex - 1][eley + 1] == 0)): 
            rect[elex - 1][eley + 1] = 1
            v = [elex - 1, eley + 1]  
            qu.put(v) 
      
        # check left cell  
        if ((eley > 0) and 
            (rect[elex][eley - 1] == 0)): 
            rect[elex][eley - 1] = 1
            v = [elex, eley - 1]  
            qu.put(v) 
      
        # check right cell  
        if ((eley > n - 1) and 
            (rect[elex][eley + 1] == 0)): 
            rect[elex][eley + 1] = 1
            v = [elex, eley + 1]  
            qu.put(v) 
      
        # check bottom-left cell  
        if ((elex < m - 1) and (eley > 0) and 
            (rect[elex + 1][eley - 1] == 0)): 
            rect[elex + 1][eley - 1] = 1
            v = [elex + 1, eley - 1]  
            qu.put(v) 
      
        # check bottom cell  
        if ((elex < m - 1) and 
            (rect[elex + 1][eley] == 0)): 
            rect[elex + 1][eley] = 1
            v = [elex + 1, eley] 
            qu.put(v) 
      
        # check bottom-right cell  
        if ((elex < m - 1) and (eley < n - 1) and 
            (rect[elex + 1][eley + 1] == 0)): 
            rect[elex + 1][eley + 1] = 1
            v = [elex + 1, eley + 1]  
            qu.put(v)  
  
    # Now if the end cell (i.e. bottom right cell)  
    # is 1(reachable) then we will send true.  
    return (rect[m - 1][n - 1] == 1) 
  
# Driver Code 
if __name__ == '__main__': 
  
    # Test case 1  
    m1 = 5
    n1 = 5
    k1 = 2
    r1 = 1
    X1 = [1, 3] 
    Y1 = [3, 3] 
    if (isPossible(m1, n1, k1, r1, X1, Y1)):  
        print("Possible")  
    else: 
        print("Not Possible")  
  
    # Test case 2  
    m2 = 5
    n2 = 5
    k2 = 2
    r2 = 1
    X2 = [1, 1] 
    Y2 = [2, 3] 
    if (isPossible(m2, n2, k2, r2, X2, Y2)):  
        print("Possible")  
    else: 
        print("Not Possible") 