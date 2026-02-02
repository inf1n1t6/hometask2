package DRY;

public class DatabaseConfig {
    private static final String CONNECTION_STRING =
            "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";

    public String getConnectionString() {
        return CONNECTION_STRING;
    }
}

public class DatabaseService {
    private final DatabaseConfig config;

    public DatabaseService(DatabaseConfig config) {
        this.config = config;
    }

    public void connect() {
        String connectionString = config.getConnectionString();

    }
}

public class LoggingService {
    private final DatabaseConfig config;

    public LoggingService(DatabaseConfig config) {
        this.config = config;
    }

    public void log(String message) {
        String connectionString = config.getConnectionString();

    }
}