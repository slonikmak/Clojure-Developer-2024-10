(ns otus-04.homework.scramblies)

;; Оригинальная задача:
;; https://www.codewars.com/kata/55c04b4cc56a697bb0000048

(defn scramble?
  "Функция возвращает true, если из букв в строке letters
  можно составить слово word."
  [letters word]
  (let [letters-count (frequencies letters)
        word-count (frequencies word)]
    (every? (fn [[char count]]
              (>= (get letters-count char 0) count)) word-count)))
