package com.micompaia.wow.provider.mascotas;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code mascotas} table.
 */
public class MascotasCursor extends AbstractCursor implements MascotasModel {
    public MascotasCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(MascotasColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code key} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getKey() {
        String res = getStringOrNull(MascotasColumns.KEY);
        return res;
    }

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(MascotasColumns.NAME);
        return res;
    }

    /**
     * Get the {@code typeabilityid} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getTypeabilityid() {
        String res = getStringOrNull(MascotasColumns.TYPEABILITYID);
        return res;
    }

    /**
     * Get the {@code strongagainstid} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getStrongagainstid() {
        String res = getStringOrNull(MascotasColumns.STRONGAGAINSTID);
        return res;
    }

    /**
     * Get the {@code weakagainstid} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getWeakagainstid() {
        String res = getStringOrNull(MascotasColumns.WEAKAGAINSTID);
        return res;
    }
}
