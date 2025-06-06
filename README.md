# solution-homework-7
# part 1
## Overview
This project demonstrates the Iterator design pattern by implementing a Netflix-like episode browsing system. It provides different ways to traverse through TV series episodes while hiding the underlying storage implementation details.

## Design Structure

### Core Classes
- **Episode**: Represents a single episode with title and runtime
- **Season**: Contains a collection of episodes
- **Series**: Contains multiple seasons
- **EpisodeIterator**: Interface defining iteration capabilities

### Iterator Implementations
1. **SeasonIterator**: Standard sequential iteration
2. **ReverseSeasonIterator**: Iterates episodes in reverse order
3. **ShuffleSeasonIterator**: Iterates in randomized order (with fixed seed)
4. **BingeIterator**: Chains all seasons together for continuous playback

