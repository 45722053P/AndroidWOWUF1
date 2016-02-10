package com.micompaia.wow.provider.razas;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code razas} table.
 */
public class RazasContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return RazasColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable RazasSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable RazasSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public RazasContentValues putMask(@Nullable String value) {
        mContentValues.put(RazasColumns.MASK, value);
        return this;
    }

    public RazasContentValues putMaskNull() {
        mContentValues.putNull(RazasColumns.MASK);
        return this;
    }

    public RazasContentValues putSide(@Nullable String value) {
        mContentValues.put(RazasColumns.SIDE, value);
        return this;
    }

    public RazasContentValues putSideNull() {
        mContentValues.putNull(RazasColumns.SIDE);
        return this;
    }

    public RazasContentValues putName(@Nullable String value) {
        mContentValues.put(RazasColumns.NAME, value);
        return this;
    }

    public RazasContentValues putNameNull() {
        mContentValues.putNull(RazasColumns.NAME);
        return this;
    }

    public RazasContentValues putImagen(@Nullable String value) {
        mContentValues.put(RazasColumns.IMAGEN, value);
        return this;
    }

    public RazasContentValues putImagenNull() {
        mContentValues.putNull(RazasColumns.IMAGEN);
        return this;
    }
}
