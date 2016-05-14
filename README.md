# Common Memory Leaks

This is a sample app that leaks intentionally references to learn how to avoid them.

There's is a main activity that will launch a second (the one that will leak the reference or avoid it)
Inside each test there will be one package `leaked` _with the leak one_ and `clean` _with the not retained and not leaked reference_.
 
Will be using this awesome [Leak Canary][0] library to show
when there is a memory leak and when not.

The idea is that you open one activity and then close it and see with [Leak Canary][0] if its leaked or not.
 
 [0]: https://github.com/square/leakcanary