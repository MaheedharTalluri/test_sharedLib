def call(body){
def log = sh(script: 'docker scan capstone:100' , returnStdout: true)
  echo "${log}"
}
