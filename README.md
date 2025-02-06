# Kotlin NullPointerException in List.filter with null list

This repository demonstrates a subtle NullPointerException that can occur when using the `filter` function on a potentially null list in Kotlin.  The safe call operator and the Elvis operator do not prevent this exception when the `filter` operation itself might throw the exception.

The issue is described in the `Bug.kt` file, and the solution is provided in `BugSolution.kt`.