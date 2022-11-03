def newGit(repo)
{
  git "${repo}"
}

def NewMaven()
{
  sh 'mvn clean install package'
}

def newDeploy(ip,appname)
{
  "deploy adapters: [tomcat9(credentialsId: '5c857de3-a7ad-4013-b04a-ae873aab9ac9', path: '', url: 'http://${ip}:8080')], contextPath: '${appname}', war: '**/*.war'"
}
