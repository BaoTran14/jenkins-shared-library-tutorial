def lib = library('my-shared-lib').tutorial.jenkins
def log = lib.Log
def call() {
    node {
        stage("Log Info") {
            log.info("This is log for information")
        }
        stage("Log Warning") {
            log.warning("This is log for warning")
        }
    }
}