function reverseWords(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
  }
  
  const readline = require('readline');
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  
  rl.question('Enter the sentence: ', (inputSentence) => {
    const reversed = reverseWords(inputSentence);
    console.log(reversed);
    rl.close();
  });

