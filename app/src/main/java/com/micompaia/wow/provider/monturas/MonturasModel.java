package com.micompaia.wow.provider.monturas;

import com.micompaia.wow.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Data model for the {@code monturas} table.
 */
public interface MonturasModel extends BaseModel {

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    String getName();

    /**
     * Get the {@code spellid} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getSpellid();

    /**
     * Get the {@code creatureid} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getCreatureid();

    /**
     * Get the {@code itemid} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getItemid();

    /**
     * Get the {@code qualityid} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getQualityid();

    /**
     * Get the {@code icon} value.
     * Can be {@code null}.
     */
    @Nullable
    String getIcon();

    /**
     * Get the {@code isground} value.
     * Can be {@code null}.
     */
    @Nullable
    String getIsground();

    /**
     * Get the {@code isflying} value.
     * Can be {@code null}.
     */
    @Nullable
    String getIsflying();

    /**
     * Get the {@code isaquatic} value.
     * Can be {@code null}.
     */
    @Nullable
    String getIsaquatic();

    /**
     * Get the {@code isjumping} value.
     * Can be {@code null}.
     */
    @Nullable
    String getIsjumping();
}
