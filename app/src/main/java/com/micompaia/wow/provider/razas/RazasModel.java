package com.micompaia.wow.provider.razas;

import com.micompaia.wow.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Data model for the {@code razas} table.
 */
public interface RazasModel extends BaseModel {

    /**
     * Get the {@code mask} value.
     * Can be {@code null}.
     */
    @Nullable
    String getMask();

    /**
     * Get the {@code side} value.
     * Can be {@code null}.
     */
    @Nullable
    String getSide();

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    String getName();

    /**
     * Get the {@code imagen} value.
     * Can be {@code null}.
     */
    @Nullable
    String getImagen();
}
