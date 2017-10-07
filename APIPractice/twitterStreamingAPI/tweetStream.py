from TwitterAPI import TwitterAPI
consumerKey = "YOBQnrulcSHFtEiJnnWiDaVhG"
consumerSecret = "zQRNJ2J8hw1kccQO1Sb3X5bhbiVAFph6KSJr46d6cbZqP4rTZR"
tokenKey = "814761966723960832-EOKXXImj9OA8sNz51dasntrhbeReSsG"
tokenSecret = "CoKgSROWgP1Jxbql5oEtHnzt3Tt9jDJ7SAMfmJdsAOiJL"
twitAPI = TwitterAPI(consumerKey,consumerSecret, tokenKey, tokenSecret)


def tweetStreamCity(cityBoxCoordinates):
    locationalTweets = twitAPI.request('statuses/filter', {'locations':cityBoxCoordinates})
    for item in locationalTweets.get_iterator():
        if 'text' in item:
            print(item['text'])

tweetStreamCity("-74,40,-73,41")
