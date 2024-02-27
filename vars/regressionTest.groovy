@Library('my-shared-lib') import tutorial.jenkins.*
def log = new Log();
def call() {
    node {
        stage("Log Info") {
            log.info("This is log for information")
        }
        stage("Log Warning") {
            log.info("This is log for warning")
        }
    }
}