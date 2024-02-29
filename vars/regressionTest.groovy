def call(arg) {
    node {
        stage("Build:") {
            echo "Building..."
        }
        stage("Info") {
            arg.info("This is log for information")
        }
        stage("Warning") {
            arg.warning("This is log for warning")
        }
    }
}