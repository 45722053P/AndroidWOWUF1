package com.micompaia.wow.provider.monturas;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.micompaia.wow.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code monturas} table.
 */
public class MonturasContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return MonturasColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable MonturasSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable MonturasSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public MonturasContentValues putName(@Nullable String value) {
        mContentValues.put(MonturasColumns.NAME, value);
        return this;
    }

    public MonturasContentValues putNameNull() {
        mContentValues.putNull(MonturasColumns.NAME);
        return this;
    }

    public MonturasContentValues putSpellid(@Nullable Integer value) {
        mContentValues.put(MonturasColumns.SPELLID, value);
        return this;
    }

    public MonturasContentValues putSpellidNull() {
        mContentValues.putNull(MonturasColumns.SPELLID);
        return this;
    }

    public MonturasContentValues putCreatureid(@Nullable Integer value) {
        mContentValues.put(MonturasColumns.CREATUREID, value);
        return this;
    }

    public MonturasContentValues putCreatureidNull() {
        mContentValues.putNull(MonturasColumns.CREATUREID);
        return this;
    }

    public MonturasContentValues putItemid(@Nullable Integer value) {
        mContentValues.put(MonturasColumns.ITEMID, value);
        return this;
    }

    public MonturasContentValues putItemidNull() {
        mContentValues.putNull(MonturasColumns.ITEMID);
        return this;
    }

    public MonturasContentValues putQualityid(@Nullable Integer value) {
        mContentValues.put(MonturasColumns.QUALITYID, value);
        return this;
    }

    public MonturasContentValues putQualityidNull() {
        mContentValues.putNull(MonturasColumns.QUALITYID);
        return this;
    }

    public MonturasContentValues putIcon(@Nullable String value) {
        mContentValues.put(MonturasColumns.ICON, value);
        return this;
    }

    public MonturasContentValues putIconNull() {
        mContentValues.putNull(MonturasColumns.ICON);
        return this;
    }

    public MonturasContentValues putIsground(@Nullable String value) {
        mContentValues.put(MonturasColumns.ISGROUND, value);
        return this;
    }

    public MonturasContentValues putIsgroundNull() {
        mContentValues.putNull(MonturasColumns.ISGROUND);
        return this;
    }

    public MonturasContentValues putIsflying(@Nullable String value) {
        mContentValues.put(MonturasColumns.ISFLYING, value);
        return this;
    }

    public MonturasContentValues putIsflyingNull() {
        mContentValues.putNull(MonturasColumns.ISFLYING);
        return this;
    }

    public MonturasContentValues putIsaquatic(@Nullable String value) {
        mContentValues.put(MonturasColumns.ISAQUATIC, value);
        return this;
    }

    public MonturasContentValues putIsaquaticNull() {
        mContentValues.putNull(MonturasColumns.ISAQUATIC);
        return this;
    }

    public MonturasContentValues putIsjumping(@Nullable String value) {
        mContentValues.put(MonturasColumns.ISJUMPING, value);
        return this;
    }

    public MonturasContentValues putIsjumpingNull() {
        mContentValues.putNull(MonturasColumns.ISJUMPING);
        return this;
    }
}
