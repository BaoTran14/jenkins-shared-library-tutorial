def call() {
    node {
        def lib = library('my-shared-lib')
        stage("Log Info") {
            lib.tutorial.jenkins.MyLog.new().info("This is log for information")
        }
        stage("Log Warning") {
            log.warning("This is log for warning")
        }
    }
}