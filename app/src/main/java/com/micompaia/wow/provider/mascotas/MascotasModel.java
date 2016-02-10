package com.micompaia.wow.provider.mascotas;

import com.micompaia.wow.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Data model for the {@code mascotas} table.
 */
public interface MascotasModel extends BaseModel {

    /**
     * Get the {@code key} value.
     * Can be {@code null}.
     */
    @Nullable
    String getKey();

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    String getName();

    /**
     * Get the {@code typeabilityid} value.
     * Can be {@code null}.
     */
    @Nullable
    String getTypeabilityid();

    /**
     * Get the {@code strongagainstid} value.
     * Can be {@code null}.
     */
    @Nullable
    String getStrongagainstid();

    /**
     * Get the {@code weakagainstid} value.
     * Can be {@code null}.
     */
    @Nullable
    String getWeakagainstid();
}
