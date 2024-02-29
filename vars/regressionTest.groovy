def call() {
    node {
        def lib = library('my-shared-lib').tutorial.jenkins
        def log = lib.Log.new()
        stage("Log Info") {
            log.info("This is log for information")
        }
        stage("Log Warning") {
            log.warning("This is log for warning")
        }
    }
}