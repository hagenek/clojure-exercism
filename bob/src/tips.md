This is a really nice solution! Well done using let and the various functions from clojure.string well.

In your main response-for function, I think you should look into using cond to reduce the amount of nested ifs.

For the all-caps? function, you could use and instead of nesting two if statements and returning true or false.

Also, instead of the replace and join functions, perhaps you could just filter through all the characters, checking it isn't empty, then checking that they are all uppercase.

Perhaps look into the ends-with? function to check if the last character is one you've specified.

Also, I do not think you need to check for exclamation marks to pass the tests!
