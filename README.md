# Jrvs-Lang (also known as Jrvs-Script)

For informations about variables, conditions, effects and variables go to <a target="_blank" href="https://github.com/loonypl/Jrvs-Lang/wiki">wiki</a> page.
<img src="http://i.imgur.com/NkhFCOh.png"/>
<b>Jrvs</b> is easy, light and intuitive language written in Java.<br/>
There is no compiler for Jrvs, <b>yet</b>.<br/>
<br/>
<b>Available effects:</b> (9)
* console [string]
* create file [string (path)]
* delete file [string (path)]
* write file [string (path)] [string (to write)]
* create folder [string (path)]
* delete folder [string (path)]
* exit program
* wait and execute [int (delay in seconds)] [effects (splitted by ', ')]
* repeat [int (how many times to repeat)] [effects (splitted by ', ')]
<br/><br/>
<b>Available expressions:</b> (42)
* get time
* get time minute
* get time hour
* get date
* get date month numeric
* get date month text
* get date day
* get date year
* get folders of [string (path to folder/dir)]
* get first letter of [string]
* get last letter of [string]
* substrings between [string] [from (string)] [to (string)] [index (int)]
* count in string [string] [letter to count (string)]
* amount of letters in string [string]
* get random letter
* get random integer between [integer] [integer]
* get random integer
* get random double
* plus integer [integer] [integer]
* minus integer [integer] [integer]
* multiply integer [integer] [integer]
* divide integer [integer] [integer]
* plus double [double] [double]
* minus double [double] [double]
* multiply double [double] [double]
* divide double [double] [double]
* get char at [integer (index)] [string]
* replace all [string (to replace)] [string (as replacement)] [string]
* get md5 hash of [string]
* get os name
* get os version
* get os architecture
* get user dir
* get user home
* get user name
* get java dir
* get java vendor
* get java vendor url
* get java version
* get jrvs version
* get jrvs vendor
* get jrvs vendor url
