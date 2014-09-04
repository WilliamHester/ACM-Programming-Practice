absDif (a,b,c,d) n
    | a == b && b == c && c == d = n
    | otherwise                  = absDif (abs $ a - b, abs $ b - c, abs $ c - d, abs $ d - a) (n + 1)

tuple [a,b,c,d] = (a,b,c,d)

main = do
    l <- getLine
    let n = tuple (map read $ words l)
    if n == (0,0,0,0) then return ()
    else do
        print $ absDif n 0
        main