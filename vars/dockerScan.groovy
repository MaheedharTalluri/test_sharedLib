def call(body){
def log = sh(returnStdout: true, script: 'docker scan capstone:100')
  echo "${log}"
}
