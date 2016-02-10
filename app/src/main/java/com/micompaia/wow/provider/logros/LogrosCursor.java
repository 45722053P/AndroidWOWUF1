package com.micompaia.wow.provider.logros;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code logros} table.
 */
public class LogrosCursor extends AbstractCursor implements LogrosModel {
    public LogrosCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(LogrosColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code title} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getTitle() {
        String res = getStringOrNull(LogrosColumns.TITLE);
        return res;
    }

    /**
     * Get the {@code points} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getPoints() {
        String res = getStringOrNull(LogrosColumns.POINTS);
        return res;
    }

    /**
     * Get the {@code description} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getDescription() {
        String res = getStringOrNull(LogrosColumns.DESCRIPTION);
        return res;
    }

    /**
     * Get the {@code icon} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getIcon() {
        String res = getStringOrNull(LogrosColumns.ICON);
        return res;
    }
}
