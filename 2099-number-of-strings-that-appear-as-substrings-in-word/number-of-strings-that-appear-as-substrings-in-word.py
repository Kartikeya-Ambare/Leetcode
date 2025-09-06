class Solution(object):
    def numOfStrings(self, patterns, word):
        """
        :type patterns: List[str]
        :type word: str
        :rtype: int
        """
        self.count = 0
        for i in patterns:
            if i in word:
                self.count=self.count+1
        return self.count