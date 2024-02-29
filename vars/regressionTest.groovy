//@Library('my-shared-lib') import tutorial.jenkins.Log
//def log = new Log();
def call() {
    node {
        stage("Log Info") {
//            log.info("This is log for information")
            echo "This is log for information"
        }
        stage("Log Warning") {
//            log.warning("This is log for warning")
            echo "This is log for warning"
        }
    }
}