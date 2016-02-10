package com.micompaia.wow.provider.razas;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code razas} table.
 */
public class RazasCursor extends AbstractCursor implements RazasModel {
    public RazasCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(RazasColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code mask} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getMask() {
        String res = getStringOrNull(RazasColumns.MASK);
        return res;
    }

    /**
     * Get the {@code side} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getSide() {
        String res = getStringOrNull(RazasColumns.SIDE);
        return res;
    }

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(RazasColumns.NAME);
        return res;
    }

    /**
     * Get the {@code imagen} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getImagen() {
        String res = getStringOrNull(RazasColumns.IMAGEN);
        return res;
    }
}
