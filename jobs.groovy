def allJobs() {
  Jenkins.instance.getAllItems(Job.class).size()
}
return this
