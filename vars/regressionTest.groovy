def lib = library('my-shared-lib').tutorial.jenkins
def call() {
    node {
        stage("Log Info") {
            lib.Log.info("This is log for information")
        }
        stage("Log Warning") {
            lib.Log.warning("This is log for warning")
        }
    }
}