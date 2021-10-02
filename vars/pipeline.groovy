def call(String var){
  var = script(sh "docker scan ${var}")
}
