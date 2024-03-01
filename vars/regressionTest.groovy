import tutorial.jenkins.*

def call(arg) {
    MyLog myLog = new MyLog()
    node {
        stage("Build:") {
            echo "Building...${arg}"
        }
        stage("Info") {
            myLog.info("This is log for information")
        }
        stage("Warning") {
            myLog.warning("This is log for warning")
        }
    }
}