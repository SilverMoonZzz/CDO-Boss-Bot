import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.entities.TextChannel;

import java.util.*;


public class Bot {

    public ArrayList<Boss> monday = new ArrayList<Boss>();
    public ArrayList<Boss> tuesday = new ArrayList<Boss>();
    public ArrayList<Boss> wednesday = new ArrayList<Boss>();
    public ArrayList<Boss> thursday = new ArrayList<Boss>();
    public ArrayList<Boss> friday = new ArrayList<Boss>();
    public ArrayList<Boss> saturday = new ArrayList<Boss>();
    public ArrayList<Boss> sunday = new ArrayList<Boss>();

    public TimeZone tz = TimeZone.getTimeZone("CET");

    public Calendar now = Calendar.getInstance(tz);
    public TextChannel bossCh;
    public Role bossRole;

    private static final Bot bot = new Bot();

    private Bot(){}

    public static Bot getInstance() {
        return bot;
    }

    public static void main(String args[]) throws Exception {

        Bot bot = Bot.getInstance();
        bot.now.setTimeZone(bot.tz);


        JDA jda = new JDABuilder("NTQ3NTIzMDkwMDc1MzUzMDg4.D04BGA.ifluGW56ovagG6tmqCjEfk85eTU").build();

        jda.awaitReady();

        jda.getPresence().setGame(Game.playing("with your mum."));

        List<TextChannel> channels = jda.getTextChannelsByName("boss-bot", true);
        bot.bossCh = channels.get(0);

        List<Role> boss = jda.getRolesByName("Bosses",true);
        bot.bossRole = boss.get(0);


        bot.generateArrays();
        bot.routineCheck();
        bot.sendMessage("Initialized!");
        jda.addEventListener(new MessageReceivedListener());
    }

    public void sendMessage(String msg) {

        bossCh.sendMessage(msg).queue();
    }

    public void checkBossDay(ArrayList<Boss> day) {


        for(int i=0;i<day.size();i++) {
            if(now.get(Calendar.HOUR_OF_DAY) == day.get(i).spawnHour) {
                if(now.get(Calendar.MINUTE) == day.get(i).spawnMinute) {
                    System.out.println("BOSS SPAWNING!!");
                    sendMessage(bossRole + " " + day.get(i).name + " on " + day.get(i).region + " is spawning!");
                } else if(now.get(Calendar.MINUTE)+15 == day.get(i).spawnMinute) {
                    sendMessage(bossRole +" " +day.get(i).name + " on " + day.get(i).region + " is spawning in 15 minutes!");
                }
            }
            if(now.get(Calendar.HOUR_OF_DAY)+1 == day.get(i).spawnHour) {
                if(now.get(Calendar.MINUTE)+15 == 60) {
                    if(day.get(i).spawnMinute == 0) {
                        sendMessage(bossRole + " " +day.get(i).name + " on " + day.get(i).region + " is spawning in 15 minutes!");
                    }
                }
            }
        }
    }

    public void checkBoss() {
        now = Calendar.getInstance(tz);
        now.setTimeZone(tz);
        int today = now.getTime().getDay();

        switch (today) {
            case 1:
                checkBossDay(monday);
                break;
            case 2:
                checkBossDay(tuesday);
                break;
            case 3:
                checkBossDay(wednesday);
                break;
            case 4:
                checkBossDay(thursday);
                break;
            case 5:
                checkBossDay(friday);
                break;
            case 6:
                checkBossDay(saturday);
                break;
            case 7:
                checkBossDay(sunday);
                break;
        }
    }

    public void routineCheck() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {

                        checkBoss();
                        Thread.sleep(60000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }

    public void nextBossDay(ArrayList<Boss> day) {

        int diff = 100;
        int spawnmin=61;
        int tempdiff;
        ArrayList<Integer> bossSpawning = new ArrayList<Integer>();

        for(int i=0;i<day.size();i++) {
            if(now.get(Calendar.HOUR_OF_DAY) == day.get(i).spawnHour) {
                if(now.get(Calendar.MINUTE) <= day.get(i).spawnMinute) {
                    tempdiff = day.get(i).spawnHour - now.get(Calendar.HOUR_OF_DAY);
                    if(tempdiff <= diff) {
                        diff = tempdiff;
                        bossSpawning.add(i);
                    }
                }
            }
            if(now.get(Calendar.HOUR_OF_DAY) < day.get(i).spawnHour) {
                tempdiff = day.get(i).spawnHour - now.get(Calendar.HOUR_OF_DAY);
                if(tempdiff <= diff) {
                    if(day.get(i).spawnMinute <= spawnmin) {
                        spawnmin = day.get(i).spawnMinute;
                        diff = tempdiff;
                        bossSpawning.add(i);
                    }

                }
            }
        }
        for(int i=0;i<bossSpawning.size();i++) {
            System.out.println("Next boss spawn is :" + day.get(bossSpawning.get(i)).name);
            if(day.get(bossSpawning.get(i)).spawnMinute == 0) {
                sendMessage("Next boss that will spawn is : " + day.get(bossSpawning.get(i)).name + " on " + day.get(bossSpawning.get(i)).region + " at " + day.get(bossSpawning.get(i)).spawnHour + ":00");
            } else {
                sendMessage("Next boss that will spawn is : " + day.get(bossSpawning.get(i)).name + " on " + day.get(bossSpawning.get(i)).region + " at " + day.get(bossSpawning.get(i)).spawnHour + ":15");
            }

        }
    }

    public void nextBoss() {

        int today = now.get(Calendar.DAY_OF_WEEK) - 1;

        switch (today) {
            case 1:
                nextBossDay(monday);
                break;
            case 2:
                nextBossDay(tuesday);
                break;
            case 3:
                nextBossDay(wednesday);
                break;
            case 4:
                nextBossDay(thursday);
                break;
            case 5:
                nextBossDay(friday);
                break;
            case 6:
                nextBossDay(saturday);
                break;
            case 7:
                nextBossDay(sunday);
                break;
        }
    }

    public void generateArrays() {
        Arrays arrays = new Arrays();

        monday = arrays.generateMonday();
        tuesday = arrays.generateTuesday();
        wednesday = arrays.generateWednesday();
        thursday = arrays.generateThursday();
        friday = arrays.generateFriday();
        saturday = arrays.generateSaturday();
        sunday = arrays.generateSunday();
    }


}
