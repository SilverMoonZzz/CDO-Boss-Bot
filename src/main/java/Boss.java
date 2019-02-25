public class Boss {
    public String name;
    public int spawnHour;
    public int spawnMinute;
    public String region;

    public Boss(String name,int spawnHour, int spawnMinute, String region) {
        this.name = name;
        this.spawnHour = spawnHour;
        this.spawnMinute = spawnMinute;
        this.region = region;
    }
}
