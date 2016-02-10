package com.micompaia.wow.provider.clases;

import com.micompaia.wow.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Data model for the {@code clases} table.
 */
public interface ClasesModel extends BaseModel {

    /**
     * Get the {@code mask} value.
     * Can be {@code null}.
     */
    @Nullable
    String getMask();

    /**
     * Get the {@code powertype} value.
     * Can be {@code null}.
     */
    @Nullable
    String getPowertype();

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    String getName();
}
