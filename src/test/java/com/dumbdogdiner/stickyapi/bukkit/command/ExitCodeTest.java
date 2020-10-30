package com.dumbdogdiner.stickyapi.bukkit.command;

import com.dumbdogdiner.stickyapi.bukkit.command.ExitCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExitCodeTest {
    @Test
    public void testSuccess() {
        assertEquals(new ExitCode().EXIT_SUCCESS.getMessage(), null);
    }

    @Test
    public void testSuccessOverride() {
        assertEquals(new ExitCode().EXIT_SUCCESS.setMessage("test").getMessage(), "test");
    }
}