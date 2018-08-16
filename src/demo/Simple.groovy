package demo;
// src/demo/Simple.groovy
/* Call example

*/

def sayHello(String name = 'human') {
    echo "Hello, ${name}."
}


def getConf() {
  def confMap = [
    gitCredential: '2af0aa56-5025-4fca-a83f-f44396fe228d',
    uKey: '573618ff055b59cc1ba2d4ea746aa4cc',
    apiKey: 'f967bf380d92a40128cd8423176f8513'
  ]

  return confMap
}
