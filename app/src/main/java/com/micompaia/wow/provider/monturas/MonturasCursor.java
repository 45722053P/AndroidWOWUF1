package com.micompaia.wow.provider.monturas;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code monturas} table.
 */
public class MonturasCursor extends AbstractCursor implements MonturasModel {
    public MonturasCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(MonturasColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(MonturasColumns.NAME);
        return res;
    }

    /**
     * Get the {@code spellid} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getSpellid() {
        Integer res = getIntegerOrNull(MonturasColumns.SPELLID);
        return res;
    }

    /**
     * Get the {@code creatureid} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getCreatureid() {
        Integer res = getIntegerOrNull(MonturasColumns.CREATUREID);
        return res;
    }

    /**
     * Get the {@code itemid} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getItemid() {
        Integer res = getIntegerOrNull(MonturasColumns.ITEMID);
        return res;
    }

    /**
     * Get the {@code qualityid} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getQualityid() {
        Integer res = getIntegerOrNull(MonturasColumns.QUALITYID);
        return res;
    }

    /**
     * Get the {@code icon} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getIcon() {
        String res = getStringOrNull(MonturasColumns.ICON);
        return res;
    }

    /**
     * Get the {@code isground} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getIsground() {
        String res = getStringOrNull(MonturasColumns.ISGROUND);
        return res;
    }

    /**
     * Get the {@code isflying} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getIsflying() {
        String res = getStringOrNull(MonturasColumns.ISFLYING);
        return res;
    }

    /**
     * Get the {@code isaquatic} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getIsaquatic() {
        String res = getStringOrNull(MonturasColumns.ISAQUATIC);
        return res;
    }

    /**
     * Get the {@code isjumping} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getIsjumping() {
        String res = getStringOrNull(MonturasColumns.ISJUMPING);
        return res;
    }
}
