# Moshi Codegen Benchmark

[Moshi](https://github.com/square/moshi) has been a lot of people's go-to json library of choice, and it definitely gain
more interest when they introduce [Codegen](https://medium.com/@sweers/exploring-moshis-kotlin-code-gen-dec09d72de5e),
which understand most of the new toys of kotlin. And in my personal experience, one of the bigger reasons why people
don't switch to Moshi is because it is usually not the fastest nor the most memory efficient of the bunch, so now I'd
like to do an experiment to see if code gen changes the equation

## Goal

- Moshi Codegen vs Moshi not Codegen (vs Gson)
  - Speed
  - Memory consumption

## Methodology

### JVM test

- Unit test in Android Studio

### Android test

- Bundle all the json and logic into an apk
- Build a release version of apk
- Run the benchmark