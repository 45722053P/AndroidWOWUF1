package com.micompaia.wow.provider.logros;

import com.micompaia.wow.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Data model for the {@code logros} table.
 */
public interface LogrosModel extends BaseModel {

    /**
     * Get the {@code title} value.
     * Can be {@code null}.
     */
    @Nullable
    String getTitle();

    /**
     * Get the {@code points} value.
     * Can be {@code null}.
     */
    @Nullable
    String getPoints();

    /**
     * Get the {@code description} value.
     * Can be {@code null}.
     */
    @Nullable
    String getDescription();

    /**
     * Get the {@code icon} value.
     * Can be {@code null}.
     */
    @Nullable
    String getIcon();
}
