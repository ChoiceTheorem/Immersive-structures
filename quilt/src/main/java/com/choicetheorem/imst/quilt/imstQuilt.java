package com.choicetheorem.imst.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.entrypoint.ModInitializer;

import com.choicetheorem.imst.imst;

public final class imstQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run our common setup.
        imst.init();
    }
}
