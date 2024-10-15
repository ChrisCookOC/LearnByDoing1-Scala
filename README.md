# Learn By Doing #1
## Duplicate client ID
You've been given a csv file containing lots of serial numbers and client IDs for futuristic IoT devices.
Unfortunately there's a duplicate client ID in the csv file, which will cause issues when the entries are inserted into a database.

Using your prefered programming language, find the two serial numbers associated with the duplicated client ID.
Your solution should focus on efficiency.

Good luck!

## Solutions
### Attempt 1
Duration: ~17 seconds
5 seconds is the parsing the csv file into a list...

Import csv file as text. 
Turn into List
Filter list -> check every item to see if it shares a duplicate client id


### Attempt 2
Duration: ~ 10 seconds
5 seconds is the parsing the csv file into a list...

Import csv file as text
Turn into List
Find first -> check every item to see if it shares a duplicate client id

Need to ditch the double list operation

### Attempt 3
Duration: ~ 5 seconds
5 seconds is the parsing the csv file into a list?

Import csv file as text
Turn into List
Group items by ClientId, find one with count of 2.

Can we speed up the parsing?

### Attempt 4
Duration: ~300ms

Import csv file, immediately turn into list of arrays
Group items by ClientId, find one with count of 2.

