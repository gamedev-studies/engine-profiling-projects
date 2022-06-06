# Godot projects for profiling
By Gabriel C. Ullmann, 2022.
- BaseGame: an "empty" project with one scene and nothing else. When run with Callgrind, it allows us to see the call graph of Godot "core" without the interference of other feature-specific calls.
- Pong: a sample project we intend to compare to the empty project in the future.