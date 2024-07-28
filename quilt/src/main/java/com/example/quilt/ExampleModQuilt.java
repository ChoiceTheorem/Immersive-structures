package com.example.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import com.example.ExampleMod;

public final class ExampleModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run our common setup.
        ExampleMod.init();
    }
}
