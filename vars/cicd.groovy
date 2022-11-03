def newGit(repo)
{
  git "${repo}"
}

def NewMaven()
{
  sh 'mvn clean install package'
}
