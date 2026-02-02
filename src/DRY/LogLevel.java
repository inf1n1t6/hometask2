package DRY;

public enum LogLevel {
    INFO, WARNING, ERROR
}

public void log(LogLevel level, String message) {
    System.out.println(level + ": " + message);
}

