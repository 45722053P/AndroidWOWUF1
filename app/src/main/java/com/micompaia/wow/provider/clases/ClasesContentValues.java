package com.micompaia.wow.provider.clases;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code clases} table.
 */
public class ClasesContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return ClasesColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable ClasesSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable ClasesSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public ClasesContentValues putMask(@Nullable String value) {
        mContentValues.put(ClasesColumns.MASK, value);
        return this;
    }

    public ClasesContentValues putMaskNull() {
        mContentValues.putNull(ClasesColumns.MASK);
        return this;
    }

    public ClasesContentValues putPowertype(@Nullable String value) {
        mContentValues.put(ClasesColumns.POWERTYPE, value);
        return this;
    }

    public ClasesContentValues putPowertypeNull() {
        mContentValues.putNull(ClasesColumns.POWERTYPE);
        return this;
    }

    public ClasesContentValues putName(@Nullable String value) {
        mContentValues.put(ClasesColumns.NAME, value);
        return this;
    }

    public ClasesContentValues putNameNull() {
        mContentValues.putNull(ClasesColumns.NAME);
        return this;
    }
}
