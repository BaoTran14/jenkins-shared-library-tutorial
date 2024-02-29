class MyLog {
    def info(message) {
        bat "echo INFO: ${message}"
    }

    def warning(message) {
        bat "echo WARNING: ${message}"
    }
}