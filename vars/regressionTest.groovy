def call(arg) {
//    node {
        stage("Build:") {
            echo "Building...${arg}"
        }
        stage("Info") {
            arg.info("This is log for information")
        }
        stage("Warning") {
            arg.warning("This is log for warning")
        }
//    }
}