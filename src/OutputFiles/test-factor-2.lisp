(thm (implies (and 
(boolp '11)
(boolp '1)
(boolp '2)
(boolp '3)
(boolp '4)
(boolp '5)
(boolp '6)
(boolp '7)
(boolp '8)
(boolp '9)
(boolp '10))
(and(or '5 (not '4) '11 '10 (not '8))
(or '6 '5 '11)
(or (not '6) '4 '10 (not '9) '8)
(or (not '6) '5 '10 '8)
(or (not '6) '11 '10 '9)
(or '5 (not '4) (not '11) '8)
(or '6 '3 (not '10) '9)
(or (not '6) '5 '4 '3 (not '9))
(or '5 '2 (not '11) (not '10))
(or '7)
(or '6 '5 '4 '11 '10)
(or (not '6) (not '4) (not '2) (not '10) '9)
(or '4 '3 '10 (not '8))
(or '5 '11)
(or '6 (not '5) (not '4) '2 (not '10) '9)
(or (not '6) '11 '10)
(or (not '5) '4 (not '3) (not '11) (not '9))
(or '6 '4 (not '3) (not '2) '10 (not '9) (not '8))
(or (not '5) (not '4) '11 '8)
(or '5 '4 '10 '9)
(or '4 (not '3) (not '2) '10)
(or (not '6) (not '5) '4 '3 (not '10) '8)
(or (not '4) (not '10) (not '9) (not '8))
(or (not '6) (not '4) '2 (not '9))
(or '3 (not '9))
(or (not '5) '3 (not '11) (not '10) '9)
(or (not '6) (not '5) '4 '11 '9 (not '8))
(or (not '6) (not '5) (not '4) '3 '11 '10 (not '8))
(or (not '5) '4 (not '2) (not '11) (not '10))
(or (not '6) (not '5) (not '4) '3 '2 (not '11) (not '10))
(or '4 '2 (not '10) (not '9) '8)
(or (not '6) '5 (not '4) (not '3) (not '11) (not '9))
(or '5 '11 '10 '9)
(or '5 '2 '11 '10 (not '9))
(or '6 (not '5) (not '4) '2 (not '11) (not '9))
(or (not '6) (not '5) '4 '3 (not '11) (not '9) (not '8))
(or (not '5) '4 '11 '10)
(or '5 '4 '11 (not '10) '8)
(or '1)
(or '6 '5 (not '4) (not '3) (not '2) '10 '9)
(or (not '6) (not '5) (not '3) (not '2))
(or (not '5) '4 '3 '2 (not '10) '9 '8)
(or '4 '3 (not '2) '11 (not '10))
(or '6 (not '5) (not '4) (not '3) '11 (not '8))
(or '6 '4)
(or (not '5) '2 (not '11) '10 (not '9))
(or '6 '5 (not '3) '2 '11 '9)
(or '6 '11)
(or '6 '3 '2 (not '11) (not '10) (not '9))
(or (not '6) '5 (not '4) (not '9) '8)
(or '6 '4 '3 '2 (not '10))
(or (not '4) (not '2) '10 (not '9) (not '8))
(or (not '6) (not '4) '3 (not '11) (not '8))
(or '6 '5)
(or (not '5) '4 (not '10) '9)
(or '5 (not '4) '2 '11 '10 (not '9))
(or (not '5) (not '4) '11 (not '10))
(or '6 '5 '2 (not '11) '10)
(or (not '6) (not '5) (not '4) (not '3) (not '2))
(or '6 '5 '3 (not '11) '10)
(or (not '6) (not '4) (not '3) (not '11) (not '10))
(or '2 '8)
(or '6 '5 '2 (not '11) (not '10) (not '9))
(or '6 '5 '3 '10)
(or (not '6) '4 (not '3) (not '11) '10 '9 (not '8))
(or '4 '10 '9 '8)
(or '2 '3 '4 '5 '6)
(or (not '4) (not '10) '9 '8)
(or (not '4) '3 '2)
(or '6 '4 '3 '9)
(or '10 '9 '8)
(or (not '6) '4 (not '3) (not '10) '8)
(or (not '5) (not '4) (not '3) '11 '8)
(or (not '5) (not '3) (not '2) (not '11))
(or '6 '10 '8)
(or (not '4) '3 '2 (not '10))
(or (not '5) '4 '11 (not '8))
(or '6 '4 '3 '11 '10)
(or '6 '4 (not '2) (not '10) (not '9) '8)
(or (not '6) '4 '3 '10 (not '9) '8)
(or '5 (not '2) (not '11) '10)
(or (not '3) '9)
(or (not '6) (not '5) '4 '3 (not '10) (not '9))
(or (not '6) '5 '3 (not '2) '9 (not '8))
(or (not '2) (not '8))
(or (not '6) (not '5) (not '2) (not '11) (not '9))
(or '5 '4 (not '11) '10)
(or (not '6) (not '5) (not '4) '10)
(or (not '5) (not '4) (not '11) '9 (not '8))
(or '3 '10 (not '9) (not '8))
(or (not '6) (not '5) '4 (not '3) (not '11))
(or (not '6) (not '11) (not '10) (not '9))
(or '6 (not '5) (not '4) (not '11) '10)
(or '6 (not '5) (not '4) (not '3) (not '2))
(or '4 (not '3) (not '2) '9)
(or '6 '3 '2 (not '10))
(or (not '6) '5 (not '11) (not '8))
(or (not '6) (not '5) '4 (not '10) (not '9) '8)
(or '5 '3 '2 '10 '8)
(or '11 '10 '9 '8)
(or (not '6) (not '5) (not '4) (not '3) '8)
(or '5 (not '4) '3 '11 (not '8))
(or (not '5) (not '11) (not '10) (not '9))
(or '6 '5 '4 '2 '10 '9)
(or (not '6) '5 (not '4) '3 (not '2))
(or '6 '11 '10 '9)
(or (not '5) '4 (not '3) '2 '11 (not '10) (not '9))
(or (not '4) (not '3) (not '2) (not '10))
(or '8 '9 '10 '11)
(or '5 '4 '11 '10)
(or (not '6) (not '5) (not '10) '9)
)))