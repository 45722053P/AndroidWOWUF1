package com.micompaia.wow.provider.mascotas;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.micompaia.wow.provider.base.AbstractSelection;

/**
 * Selection for the {@code mascotas} table.
 */
public class MascotasSelection extends AbstractSelection<MascotasSelection> {
    @Override
    protected Uri baseUri() {
        return MascotasColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code MascotasCursor} object, which is positioned before the first entry, or null.
     */
    public MascotasCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new MascotasCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public MascotasCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code MascotasCursor} object, which is positioned before the first entry, or null.
     */
    public MascotasCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new MascotasCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public MascotasCursor query(Context context) {
        return query(context, null);
    }


    public MascotasSelection id(long... value) {
        addEquals("mascotas." + MascotasColumns._ID, toObjectArray(value));
        return this;
    }

    public MascotasSelection idNot(long... value) {
        addNotEquals("mascotas." + MascotasColumns._ID, toObjectArray(value));
        return this;
    }

    public MascotasSelection orderById(boolean desc) {
        orderBy("mascotas." + MascotasColumns._ID, desc);
        return this;
    }

    public MascotasSelection orderById() {
        return orderById(false);
    }

    public MascotasSelection key(String... value) {
        addEquals(MascotasColumns.KEY, value);
        return this;
    }

    public MascotasSelection keyNot(String... value) {
        addNotEquals(MascotasColumns.KEY, value);
        return this;
    }

    public MascotasSelection keyLike(String... value) {
        addLike(MascotasColumns.KEY, value);
        return this;
    }

    public MascotasSelection keyContains(String... value) {
        addContains(MascotasColumns.KEY, value);
        return this;
    }

    public MascotasSelection keyStartsWith(String... value) {
        addStartsWith(MascotasColumns.KEY, value);
        return this;
    }

    public MascotasSelection keyEndsWith(String... value) {
        addEndsWith(MascotasColumns.KEY, value);
        return this;
    }

    public MascotasSelection orderByKey(boolean desc) {
        orderBy(MascotasColumns.KEY, desc);
        return this;
    }

    public MascotasSelection orderByKey() {
        orderBy(MascotasColumns.KEY, false);
        return this;
    }

    public MascotasSelection name(String... value) {
        addEquals(MascotasColumns.NAME, value);
        return this;
    }

    public MascotasSelection nameNot(String... value) {
        addNotEquals(MascotasColumns.NAME, value);
        return this;
    }

    public MascotasSelection nameLike(String... value) {
        addLike(MascotasColumns.NAME, value);
        return this;
    }

    public MascotasSelection nameContains(String... value) {
        addContains(MascotasColumns.NAME, value);
        return this;
    }

    public MascotasSelection nameStartsWith(String... value) {
        addStartsWith(MascotasColumns.NAME, value);
        return this;
    }

    public MascotasSelection nameEndsWith(String... value) {
        addEndsWith(MascotasColumns.NAME, value);
        return this;
    }

    public MascotasSelection orderByName(boolean desc) {
        orderBy(MascotasColumns.NAME, desc);
        return this;
    }

    public MascotasSelection orderByName() {
        orderBy(MascotasColumns.NAME, false);
        return this;
    }

    public MascotasSelection typeabilityid(String... value) {
        addEquals(MascotasColumns.TYPEABILITYID, value);
        return this;
    }

    public MascotasSelection typeabilityidNot(String... value) {
        addNotEquals(MascotasColumns.TYPEABILITYID, value);
        return this;
    }

    public MascotasSelection typeabilityidLike(String... value) {
        addLike(MascotasColumns.TYPEABILITYID, value);
        return this;
    }

    public MascotasSelection typeabilityidContains(String... value) {
        addContains(MascotasColumns.TYPEABILITYID, value);
        return this;
    }

    public MascotasSelection typeabilityidStartsWith(String... value) {
        addStartsWith(MascotasColumns.TYPEABILITYID, value);
        return this;
    }

    public MascotasSelection typeabilityidEndsWith(String... value) {
        addEndsWith(MascotasColumns.TYPEABILITYID, value);
        return this;
    }

    public MascotasSelection orderByTypeabilityid(boolean desc) {
        orderBy(MascotasColumns.TYPEABILITYID, desc);
        return this;
    }

    public MascotasSelection orderByTypeabilityid() {
        orderBy(MascotasColumns.TYPEABILITYID, false);
        return this;
    }

    public MascotasSelection strongagainstid(String... value) {
        addEquals(MascotasColumns.STRONGAGAINSTID, value);
        return this;
    }

    public MascotasSelection strongagainstidNot(String... value) {
        addNotEquals(MascotasColumns.STRONGAGAINSTID, value);
        return this;
    }

    public MascotasSelection strongagainstidLike(String... value) {
        addLike(MascotasColumns.STRONGAGAINSTID, value);
        return this;
    }

    public MascotasSelection strongagainstidContains(String... value) {
        addContains(MascotasColumns.STRONGAGAINSTID, value);
        return this;
    }

    public MascotasSelection strongagainstidStartsWith(String... value) {
        addStartsWith(MascotasColumns.STRONGAGAINSTID, value);
        return this;
    }

    public MascotasSelection strongagainstidEndsWith(String... value) {
        addEndsWith(MascotasColumns.STRONGAGAINSTID, value);
        return this;
    }

    public MascotasSelection orderByStrongagainstid(boolean desc) {
        orderBy(MascotasColumns.STRONGAGAINSTID, desc);
        return this;
    }

    public MascotasSelection orderByStrongagainstid() {
        orderBy(MascotasColumns.STRONGAGAINSTID, false);
        return this;
    }

    public MascotasSelection weakagainstid(String... value) {
        addEquals(MascotasColumns.WEAKAGAINSTID, value);
        return this;
    }

    public MascotasSelection weakagainstidNot(String... value) {
        addNotEquals(MascotasColumns.WEAKAGAINSTID, value);
        return this;
    }

    public MascotasSelection weakagainstidLike(String... value) {
        addLike(MascotasColumns.WEAKAGAINSTID, value);
        return this;
    }

    public MascotasSelection weakagainstidContains(String... value) {
        addContains(MascotasColumns.WEAKAGAINSTID, value);
        return this;
    }

    public MascotasSelection weakagainstidStartsWith(String... value) {
        addStartsWith(MascotasColumns.WEAKAGAINSTID, value);
        return this;
    }

    public MascotasSelection weakagainstidEndsWith(String... value) {
        addEndsWith(MascotasColumns.WEAKAGAINSTID, value);
        return this;
    }

    public MascotasSelection orderByWeakagainstid(boolean desc) {
        orderBy(MascotasColumns.WEAKAGAINSTID, desc);
        return this;
    }

    public MascotasSelection orderByWeakagainstid() {
        orderBy(MascotasColumns.WEAKAGAINSTID, false);
        return this;
    }
}
