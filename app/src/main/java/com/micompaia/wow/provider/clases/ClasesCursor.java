package com.micompaia.wow.provider.clases;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code clases} table.
 */
public class ClasesCursor extends AbstractCursor implements ClasesModel {
    public ClasesCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(ClasesColumns._ID);
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
        String res = getStringOrNull(ClasesColumns.MASK);
        return res;
    }

    /**
     * Get the {@code powertype} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getPowertype() {
        String res = getStringOrNull(ClasesColumns.POWERTYPE);
        return res;
    }

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(ClasesColumns.NAME);
        return res;
    }
}
