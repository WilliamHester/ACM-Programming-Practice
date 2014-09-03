eat [m,c,e] = wrappers numWrappers e numWrappers
    where numWrappers = m `div` c
          wrappers n e c
                    | n >= e    = wrappers (n - e + 1) e (c + 1)
                    | otherwise = c

main = do
    _ <- getLine
    c <- getContents
    mapM_ (print . eat . map read .  words) (lines c)