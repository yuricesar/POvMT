package com.ufcg.tests.UnitTests;

import android.test.InstrumentationTestCase;

import com.ufcg.entities.Ti;
import com.ufcg.entities.Week;

/**
 * Created by ygorg_000 on 28/04/2015.
 */
public class TestWeek extends InstrumentationTestCase {

    public void Test() throws Exception{
        final Ti activity1 = new Ti("Jogando WoW", 2, 1l, "foto", 1, "cor");
        final Ti activity2 = new Ti("Estudando Calculo1", 2, 1l, "foto", 2, "cor");
        final Ti activity3 = new Ti("Jogando WoW", 3, 1l, "foto", 1, "cor");
        final Ti activity4 = new Ti("Trabalhando no Projeto de LES", 4, 1l, "foto", 3, "cor");


        Week week = new Week();
        week.addActivity(activity1);
        week.addActivity(activity2);
        week.addActivity(activity3);
        week.addActivity(activity4);

        assertEquals(week.getTotalTime(),11);
        assertEquals(week.getActivityTime("Estudando Calculo1"), 2);
        assertEquals(week.getActivityTime("Jogando WoW"), 5);
    }
}
