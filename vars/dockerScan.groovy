def call(body){
def log = sh(script: 'docker scan capstone:100')
  echo "${log}"
}
