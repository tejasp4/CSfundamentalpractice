# Tracker that looks at location of the
# user while also filtering tweets by those and key locations
from TwitterAPI import TwitterAPI
consumerKey = "YOBQnrulcSHFtEiJnnWiDaVhG"
consumerSecret = "zQRNJ2J8hw1kccQO1Sb3X5bhbiVAFph6KSJr46d6cbZqP4rTZR"
tokenKey = "814761966723960832-EOKXXImj9OA8sNz51dasntrhbeReSsG"
tokenSecret = "CoKgSROWgP1Jxbql5oEtHnzt3Tt9jDJ7SAMfmJdsAOiJL"
twitAPI = TwitterAPI(consumerKey,consumerSecret, tokenKey, tokenSecret)

#function that collects all tweets from a city within a 24 hour time period.
def tweetStreamCity(cityBoxCoordinates):
    locationalTweets = twitAPI.request('statuses/filter', {'locations':cityBoxCoordinates})
    return locationalTweets

#function that collects all tweets filtering by keywords

def tweetStreamKeywords(listOfKeyWords):
    keywordTweets = twitAPI.request('statuses/filter', {'track':listOfKeyWords})
    return keywordTweets

#function that prints out each tweet inside of the list of tweets
def printOutTweets(twitterTweetsList):
    for tweet in twitterTweetsList.get_iterator():
        print(tweet['text'])

#applies a function to each tweet inside of a list of tweets
def funcApplyTweet(twitterTweetsList, func):
    for tweet in twitterTweetsList.get_iterator():
        func(tweet)


keywordList = ['concert']

rv = tweetStreamKeywords(keywordList)
printOutTweets(rv)
