def call() {
    node {
        def log = new tutorial.jenkins.MyLog()
        stage("Log Info") {
            log.info("This is log for information")
        }
        stage("Log Warning") {
            log.warning("This is log for warning")
        }
    }
}