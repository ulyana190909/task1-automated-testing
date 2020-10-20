package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void CashbackTest1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals (actual, expected);
    }

    @Test
    public void CashbackTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals (actual, expected);
    }

    @Test
    public void CashbackTest3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals (actual, expected);
    }
    @Test
    public void CashbackTest4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals (actual, expected);
    }
}
