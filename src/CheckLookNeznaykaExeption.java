class CheckLookNeznaykaExeption extends Exception {
    CheckLookNeznaykaExeption(String message) {
        super("\033[31m\r" + message + "\033[0m\r\n");
        Move.sleep(1000);
    }
}

