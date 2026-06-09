# TODO - Covert logging with static buffer[1024]

- [ ] Understand existing (empty) C/Static Keyword/covertLogging.c and adjacent examples.
- [ ] Design API: internal-only logging that uses `static char buffer[1024]` and never exposes it directly.
- [x] Implement functions (accumulate, flush, get length) in covertLogging.c.
- [x] Add a small `main()` demo that logs messages and flushes them to stdout (without exposing buffer pointer).
- [x] Compile and run to verify behavior and bounds.

