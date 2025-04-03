package Questions;
public final class Configuration {
    private final String configName;
    private final int maxUsers;
    private final boolean isEnabled;
    
    public Configuration(String configName, int maxUsers, boolean isEnabled) {
        this.configName = configName;
        this.maxUsers = maxUsers;
        this.isEnabled = isEnabled;
    }
    
    public String getConfigName() {
        return configName;
    }
    
    public int getMaxUsers() {
        return maxUsers;
    }
    
    public boolean isEnabled() {
        return isEnabled;
    }
    
    @Override
    public String toString() {
        return "Configuration{" +
               "configName='" + configName + '\'' +
               ", maxUsers=" + maxUsers +
               ", isEnabled=" + isEnabled +
               '}';
    }
}
