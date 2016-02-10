package com.micompaia.wow.provider.razas;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.micompaia.wow.provider.base.AbstractSelection;

/**
 * Selection for the {@code razas} table.
 */
public class RazasSelection extends AbstractSelection<RazasSelection> {
    @Override
    protected Uri baseUri() {
        return RazasColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code RazasCursor} object, which is positioned before the first entry, or null.
     */
    public RazasCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new RazasCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public RazasCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code RazasCursor} object, which is positioned before the first entry, or null.
     */
    public RazasCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new RazasCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public RazasCursor query(Context context) {
        return query(context, null);
    }


    public RazasSelection id(long... value) {
        addEquals("razas." + RazasColumns._ID, toObjectArray(value));
        return this;
    }

    public RazasSelection idNot(long... value) {
        addNotEquals("razas." + RazasColumns._ID, toObjectArray(value));
        return this;
    }

    public RazasSelection orderById(boolean desc) {
        orderBy("razas." + RazasColumns._ID, desc);
        return this;
    }

    public RazasSelection orderById() {
        return orderById(false);
    }

    public RazasSelection mask(String... value) {
        addEquals(RazasColumns.MASK, value);
        return this;
    }

    public RazasSelection maskNot(String... value) {
        addNotEquals(RazasColumns.MASK, value);
        return this;
    }

    public RazasSelection maskLike(String... value) {
        addLike(RazasColumns.MASK, value);
        return this;
    }

    public RazasSelection maskContains(String... value) {
        addContains(RazasColumns.MASK, value);
        return this;
    }

    public RazasSelection maskStartsWith(String... value) {
        addStartsWith(RazasColumns.MASK, value);
        return this;
    }

    public RazasSelection maskEndsWith(String... value) {
        addEndsWith(RazasColumns.MASK, value);
        return this;
    }

    public RazasSelection orderByMask(boolean desc) {
        orderBy(RazasColumns.MASK, desc);
        return this;
    }

    public RazasSelection orderByMask() {
        orderBy(RazasColumns.MASK, false);
        return this;
    }

    public RazasSelection side(String... value) {
        addEquals(RazasColumns.SIDE, value);
        return this;
    }

    public RazasSelection sideNot(String... value) {
        addNotEquals(RazasColumns.SIDE, value);
        return this;
    }

    public RazasSelection sideLike(String... value) {
        addLike(RazasColumns.SIDE, value);
        return this;
    }

    public RazasSelection sideContains(String... value) {
        addContains(RazasColumns.SIDE, value);
        return this;
    }

    public RazasSelection sideStartsWith(String... value) {
        addStartsWith(RazasColumns.SIDE, value);
        return this;
    }

    public RazasSelection sideEndsWith(String... value) {
        addEndsWith(RazasColumns.SIDE, value);
        return this;
    }

    public RazasSelection orderBySide(boolean desc) {
        orderBy(RazasColumns.SIDE, desc);
        return this;
    }

    public RazasSelection orderBySide() {
        orderBy(RazasColumns.SIDE, false);
        return this;
    }

    public RazasSelection name(String... value) {
        addEquals(RazasColumns.NAME, value);
        return this;
    }

    public RazasSelection nameNot(String... value) {
        addNotEquals(RazasColumns.NAME, value);
        return this;
    }

    public RazasSelection nameLike(String... value) {
        addLike(RazasColumns.NAME, value);
        return this;
    }

    public RazasSelection nameContains(String... value) {
        addContains(RazasColumns.NAME, value);
        return this;
    }

    public RazasSelection nameStartsWith(String... value) {
        addStartsWith(RazasColumns.NAME, value);
        return this;
    }

    public RazasSelection nameEndsWith(String... value) {
        addEndsWith(RazasColumns.NAME, value);
        return this;
    }

    public RazasSelection orderByName(boolean desc) {
        orderBy(RazasColumns.NAME, desc);
        return this;
    }

    public RazasSelection orderByName() {
        orderBy(RazasColumns.NAME, false);
        return this;
    }

    public RazasSelection imagen(String... value) {
        addEquals(RazasColumns.IMAGEN, value);
        return this;
    }

    public RazasSelection imagenNot(String... value) {
        addNotEquals(RazasColumns.IMAGEN, value);
        return this;
    }

    public RazasSelection imagenLike(String... value) {
        addLike(RazasColumns.IMAGEN, value);
        return this;
    }

    public RazasSelection imagenContains(String... value) {
        addContains(RazasColumns.IMAGEN, value);
        return this;
    }

    public RazasSelection imagenStartsWith(String... value) {
        addStartsWith(RazasColumns.IMAGEN, value);
        return this;
    }

    public RazasSelection imagenEndsWith(String... value) {
        addEndsWith(RazasColumns.IMAGEN, value);
        return this;
    }

    public RazasSelection orderByImagen(boolean desc) {
        orderBy(RazasColumns.IMAGEN, desc);
        return this;
    }

    public RazasSelection orderByImagen() {
        orderBy(RazasColumns.IMAGEN, false);
        return this;
    }
}
