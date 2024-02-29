import tutorial.jenkins.MyLog

def call() {
    node {
        def log = new MyLog()
        stage("Build:") {
            log.info("This is log for information")
            echo "Building..."
        }
        stage("I") {
//            log.warning("This is log for warning")
            echo "I "
        }
        stage("Love") {
//            log.warning("This is log for warning")
            echo "Love  "
        }
        stage("You") {
//            log.warning("This is log for warning")
            echo "you"
        }
    }
}