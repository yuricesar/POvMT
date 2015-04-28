package com.ufcg.tests.UnitTests;

import android.test.InstrumentationTestCase;

import com.ufcg.entities.Ti;

/**
 * Created by ygorg_000 on 28/04/2015.
 */
public class TestTi extends InstrumentationTestCase{


    public void TestGetsAndSets() throws Exception{
       final Ti activity = new Ti("Jogando WoW", 2, 1l, "foto", 2, "cor");

        assertEquals("Jogando WoW", activity.getNome());
        assertEquals(2, activity.getTempo());
}
}
