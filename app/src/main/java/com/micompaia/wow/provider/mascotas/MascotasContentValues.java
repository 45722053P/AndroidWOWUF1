package com.micompaia.wow.provider.mascotas;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code mascotas} table.
 */
public class MascotasContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return MascotasColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable MascotasSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable MascotasSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public MascotasContentValues putKey(@Nullable String value) {
        mContentValues.put(MascotasColumns.KEY, value);
        return this;
    }

    public MascotasContentValues putKeyNull() {
        mContentValues.putNull(MascotasColumns.KEY);
        return this;
    }

    public MascotasContentValues putName(@Nullable String value) {
        mContentValues.put(MascotasColumns.NAME, value);
        return this;
    }

    public MascotasContentValues putNameNull() {
        mContentValues.putNull(MascotasColumns.NAME);
        return this;
    }

    public MascotasContentValues putTypeabilityid(@Nullable String value) {
        mContentValues.put(MascotasColumns.TYPEABILITYID, value);
        return this;
    }

    public MascotasContentValues putTypeabilityidNull() {
        mContentValues.putNull(MascotasColumns.TYPEABILITYID);
        return this;
    }

    public MascotasContentValues putStrongagainstid(@Nullable String value) {
        mContentValues.put(MascotasColumns.STRONGAGAINSTID, value);
        return this;
    }

    public MascotasContentValues putStrongagainstidNull() {
        mContentValues.putNull(MascotasColumns.STRONGAGAINSTID);
        return this;
    }

    public MascotasContentValues putWeakagainstid(@Nullable String value) {
        mContentValues.put(MascotasColumns.WEAKAGAINSTID, value);
        return this;
    }

    public MascotasContentValues putWeakagainstidNull() {
        mContentValues.putNull(MascotasColumns.WEAKAGAINSTID);
        return this;
    }
}
