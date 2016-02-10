package com.micompaia.wow.provider.logros;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code logros} table.
 */
public class LogrosContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return LogrosColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable LogrosSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable LogrosSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public LogrosContentValues putTitle(@Nullable String value) {
        mContentValues.put(LogrosColumns.TITLE, value);
        return this;
    }

    public LogrosContentValues putTitleNull() {
        mContentValues.putNull(LogrosColumns.TITLE);
        return this;
    }

    public LogrosContentValues putPoints(@Nullable String value) {
        mContentValues.put(LogrosColumns.POINTS, value);
        return this;
    }

    public LogrosContentValues putPointsNull() {
        mContentValues.putNull(LogrosColumns.POINTS);
        return this;
    }

    public LogrosContentValues putDescription(@Nullable String value) {
        mContentValues.put(LogrosColumns.DESCRIPTION, value);
        return this;
    }

    public LogrosContentValues putDescriptionNull() {
        mContentValues.putNull(LogrosColumns.DESCRIPTION);
        return this;
    }

    public LogrosContentValues putIcon(@Nullable String value) {
        mContentValues.put(LogrosColumns.ICON, value);
        return this;
    }

    public LogrosContentValues putIconNull() {
        mContentValues.putNull(LogrosColumns.ICON);
        return this;
    }
}
