# Jrvs-Lang (also known as Jrvs-Script)

For informations about variables, conditions, effects and variables go to <a target="_blank" href="https://github.com/loonypl/Jrvs-Lang/wiki">wiki</a> page.
<img src="http://i.imgur.com/NkhFCOh.png"/>
<b>Jrvs</b> is easy, light and intuitive language written in Java.<br/>
There is no compiler for Jrvs, <b>yet</b>.<br/>
<br/>
<b>Available effects:</b>
* console [string]
* create file [string (path)]
* delete file [string (path)]
* write file [string (path)] [string (to write)]
* create folder [string (path)]
* delete folder [string (path)]
* wait and execute [int (delay in seconds)] [effects (splitted by ', ')]
* repeat [int (how many times to repeat)] [effects (splitted by ', ')]
<br/><br/>
<b>Available expressions:</b>
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
