def call(MyLog myLog) {
    node {
        stage("Build:") {
            echo "Building..."
        }
        stage("Info") {
            myLog.info("This is log for information")
        }
        stage("Warning") {
            myLog.warning("This is log for warning")
        }
    }
}