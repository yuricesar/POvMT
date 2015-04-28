package com.ufcg.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ygorg_000 on 28/04/2015.
 */
public class Week {

    private List<Ti> activitiesInTheWeek;
    private Map< String, Integer> activities;
    private Data initialDate;
    private Data endDate;

    public Week(){
        activitiesInTheWeek = new ArrayList<Ti>();
        activities = new HashMap<String, Integer>();
        initialDate = new Data();
    }

    public void addActivity(Ti newActivity){
        activitiesInTheWeek.add(newActivity);
        if(activities.containsKey(newActivity.getNome())){
            int tempo =  activities.get(newActivity.getNome()) + newActivity.getTempo();
            activities.put(newActivity.getNome(),tempo);
        }else{
            activities.put(newActivity.getNome(), newActivity.getTempo());
        }
    }

    public int getTotalTime(){
        int totalTime = 0;
        for (Integer time : activities.values()){
            totalTime += time;
        }
        return totalTime;
    }

    public int getActivityTime(String activity){
        return activities.get(activity);
    }

    public Data getInitialDate(){
        return initialDate;
    }

    public Map<String, Integer> getAcivities(){
        return activities;
    }

    public List<Ti> getActivitiesInTheWeek(){
        return activitiesInTheWeek;
    }


}
