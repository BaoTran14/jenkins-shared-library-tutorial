def call() {
    node {
//        def log = new tutorial.jenkins.MyLog()
        stage("Build:") {
            new tutorial.jenkins.MyLog().info("This is log for information")
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