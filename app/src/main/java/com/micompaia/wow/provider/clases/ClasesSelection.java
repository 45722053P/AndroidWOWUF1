package com.micompaia.wow.provider.clases;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.micompaia.wow.provider.base.AbstractSelection;

/**
 * Selection for the {@code clases} table.
 */
public class ClasesSelection extends AbstractSelection<ClasesSelection> {
    @Override
    protected Uri baseUri() {
        return ClasesColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code ClasesCursor} object, which is positioned before the first entry, or null.
     */
    public ClasesCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new ClasesCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public ClasesCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code ClasesCursor} object, which is positioned before the first entry, or null.
     */
    public ClasesCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new ClasesCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public ClasesCursor query(Context context) {
        return query(context, null);
    }


    public ClasesSelection id(long... value) {
        addEquals("clases." + ClasesColumns._ID, toObjectArray(value));
        return this;
    }

    public ClasesSelection idNot(long... value) {
        addNotEquals("clases." + ClasesColumns._ID, toObjectArray(value));
        return this;
    }

    public ClasesSelection orderById(boolean desc) {
        orderBy("clases." + ClasesColumns._ID, desc);
        return this;
    }

    public ClasesSelection orderById() {
        return orderById(false);
    }

    public ClasesSelection mask(String... value) {
        addEquals(ClasesColumns.MASK, value);
        return this;
    }

    public ClasesSelection maskNot(String... value) {
        addNotEquals(ClasesColumns.MASK, value);
        return this;
    }

    public ClasesSelection maskLike(String... value) {
        addLike(ClasesColumns.MASK, value);
        return this;
    }

    public ClasesSelection maskContains(String... value) {
        addContains(ClasesColumns.MASK, value);
        return this;
    }

    public ClasesSelection maskStartsWith(String... value) {
        addStartsWith(ClasesColumns.MASK, value);
        return this;
    }

    public ClasesSelection maskEndsWith(String... value) {
        addEndsWith(ClasesColumns.MASK, value);
        return this;
    }

    public ClasesSelection orderByMask(boolean desc) {
        orderBy(ClasesColumns.MASK, desc);
        return this;
    }

    public ClasesSelection orderByMask() {
        orderBy(ClasesColumns.MASK, false);
        return this;
    }

    public ClasesSelection powertype(String... value) {
        addEquals(ClasesColumns.POWERTYPE, value);
        return this;
    }

    public ClasesSelection powertypeNot(String... value) {
        addNotEquals(ClasesColumns.POWERTYPE, value);
        return this;
    }

    public ClasesSelection powertypeLike(String... value) {
        addLike(ClasesColumns.POWERTYPE, value);
        return this;
    }

    public ClasesSelection powertypeContains(String... value) {
        addContains(ClasesColumns.POWERTYPE, value);
        return this;
    }

    public ClasesSelection powertypeStartsWith(String... value) {
        addStartsWith(ClasesColumns.POWERTYPE, value);
        return this;
    }

    public ClasesSelection powertypeEndsWith(String... value) {
        addEndsWith(ClasesColumns.POWERTYPE, value);
        return this;
    }

    public ClasesSelection orderByPowertype(boolean desc) {
        orderBy(ClasesColumns.POWERTYPE, desc);
        return this;
    }

    public ClasesSelection orderByPowertype() {
        orderBy(ClasesColumns.POWERTYPE, false);
        return this;
    }

    public ClasesSelection name(String... value) {
        addEquals(ClasesColumns.NAME, value);
        return this;
    }

    public ClasesSelection nameNot(String... value) {
        addNotEquals(ClasesColumns.NAME, value);
        return this;
    }

    public ClasesSelection nameLike(String... value) {
        addLike(ClasesColumns.NAME, value);
        return this;
    }

    public ClasesSelection nameContains(String... value) {
        addContains(ClasesColumns.NAME, value);
        return this;
    }

    public ClasesSelection nameStartsWith(String... value) {
        addStartsWith(ClasesColumns.NAME, value);
        return this;
    }

    public ClasesSelection nameEndsWith(String... value) {
        addEndsWith(ClasesColumns.NAME, value);
        return this;
    }

    public ClasesSelection orderByName(boolean desc) {
        orderBy(ClasesColumns.NAME, desc);
        return this;
    }

    public ClasesSelection orderByName() {
        orderBy(ClasesColumns.NAME, false);
        return this;
    }
}
