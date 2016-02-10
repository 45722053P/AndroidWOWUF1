package com.micompaia.wow.provider.monturas;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.micompaia.wow.provider.base.AbstractSelection;

/**
 * Selection for the {@code monturas} table.
 */
public class MonturasSelection extends AbstractSelection<MonturasSelection> {
    @Override
    protected Uri baseUri() {
        return MonturasColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code MonturasCursor} object, which is positioned before the first entry, or null.
     */
    public MonturasCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new MonturasCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public MonturasCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code MonturasCursor} object, which is positioned before the first entry, or null.
     */
    public MonturasCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new MonturasCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public MonturasCursor query(Context context) {
        return query(context, null);
    }


    public MonturasSelection id(long... value) {
        addEquals("monturas." + MonturasColumns._ID, toObjectArray(value));
        return this;
    }

    public MonturasSelection idNot(long... value) {
        addNotEquals("monturas." + MonturasColumns._ID, toObjectArray(value));
        return this;
    }

    public MonturasSelection orderById(boolean desc) {
        orderBy("monturas." + MonturasColumns._ID, desc);
        return this;
    }

    public MonturasSelection orderById() {
        return orderById(false);
    }

    public MonturasSelection name(String... value) {
        addEquals(MonturasColumns.NAME, value);
        return this;
    }

    public MonturasSelection nameNot(String... value) {
        addNotEquals(MonturasColumns.NAME, value);
        return this;
    }

    public MonturasSelection nameLike(String... value) {
        addLike(MonturasColumns.NAME, value);
        return this;
    }

    public MonturasSelection nameContains(String... value) {
        addContains(MonturasColumns.NAME, value);
        return this;
    }

    public MonturasSelection nameStartsWith(String... value) {
        addStartsWith(MonturasColumns.NAME, value);
        return this;
    }

    public MonturasSelection nameEndsWith(String... value) {
        addEndsWith(MonturasColumns.NAME, value);
        return this;
    }

    public MonturasSelection orderByName(boolean desc) {
        orderBy(MonturasColumns.NAME, desc);
        return this;
    }

    public MonturasSelection orderByName() {
        orderBy(MonturasColumns.NAME, false);
        return this;
    }

    public MonturasSelection spellid(Integer... value) {
        addEquals(MonturasColumns.SPELLID, value);
        return this;
    }

    public MonturasSelection spellidNot(Integer... value) {
        addNotEquals(MonturasColumns.SPELLID, value);
        return this;
    }

    public MonturasSelection spellidGt(int value) {
        addGreaterThan(MonturasColumns.SPELLID, value);
        return this;
    }

    public MonturasSelection spellidGtEq(int value) {
        addGreaterThanOrEquals(MonturasColumns.SPELLID, value);
        return this;
    }

    public MonturasSelection spellidLt(int value) {
        addLessThan(MonturasColumns.SPELLID, value);
        return this;
    }

    public MonturasSelection spellidLtEq(int value) {
        addLessThanOrEquals(MonturasColumns.SPELLID, value);
        return this;
    }

    public MonturasSelection orderBySpellid(boolean desc) {
        orderBy(MonturasColumns.SPELLID, desc);
        return this;
    }

    public MonturasSelection orderBySpellid() {
        orderBy(MonturasColumns.SPELLID, false);
        return this;
    }

    public MonturasSelection creatureid(Integer... value) {
        addEquals(MonturasColumns.CREATUREID, value);
        return this;
    }

    public MonturasSelection creatureidNot(Integer... value) {
        addNotEquals(MonturasColumns.CREATUREID, value);
        return this;
    }

    public MonturasSelection creatureidGt(int value) {
        addGreaterThan(MonturasColumns.CREATUREID, value);
        return this;
    }

    public MonturasSelection creatureidGtEq(int value) {
        addGreaterThanOrEquals(MonturasColumns.CREATUREID, value);
        return this;
    }

    public MonturasSelection creatureidLt(int value) {
        addLessThan(MonturasColumns.CREATUREID, value);
        return this;
    }

    public MonturasSelection creatureidLtEq(int value) {
        addLessThanOrEquals(MonturasColumns.CREATUREID, value);
        return this;
    }

    public MonturasSelection orderByCreatureid(boolean desc) {
        orderBy(MonturasColumns.CREATUREID, desc);
        return this;
    }

    public MonturasSelection orderByCreatureid() {
        orderBy(MonturasColumns.CREATUREID, false);
        return this;
    }

    public MonturasSelection itemid(Integer... value) {
        addEquals(MonturasColumns.ITEMID, value);
        return this;
    }

    public MonturasSelection itemidNot(Integer... value) {
        addNotEquals(MonturasColumns.ITEMID, value);
        return this;
    }

    public MonturasSelection itemidGt(int value) {
        addGreaterThan(MonturasColumns.ITEMID, value);
        return this;
    }

    public MonturasSelection itemidGtEq(int value) {
        addGreaterThanOrEquals(MonturasColumns.ITEMID, value);
        return this;
    }

    public MonturasSelection itemidLt(int value) {
        addLessThan(MonturasColumns.ITEMID, value);
        return this;
    }

    public MonturasSelection itemidLtEq(int value) {
        addLessThanOrEquals(MonturasColumns.ITEMID, value);
        return this;
    }

    public MonturasSelection orderByItemid(boolean desc) {
        orderBy(MonturasColumns.ITEMID, desc);
        return this;
    }

    public MonturasSelection orderByItemid() {
        orderBy(MonturasColumns.ITEMID, false);
        return this;
    }

    public MonturasSelection qualityid(Integer... value) {
        addEquals(MonturasColumns.QUALITYID, value);
        return this;
    }

    public MonturasSelection qualityidNot(Integer... value) {
        addNotEquals(MonturasColumns.QUALITYID, value);
        return this;
    }

    public MonturasSelection qualityidGt(int value) {
        addGreaterThan(MonturasColumns.QUALITYID, value);
        return this;
    }

    public MonturasSelection qualityidGtEq(int value) {
        addGreaterThanOrEquals(MonturasColumns.QUALITYID, value);
        return this;
    }

    public MonturasSelection qualityidLt(int value) {
        addLessThan(MonturasColumns.QUALITYID, value);
        return this;
    }

    public MonturasSelection qualityidLtEq(int value) {
        addLessThanOrEquals(MonturasColumns.QUALITYID, value);
        return this;
    }

    public MonturasSelection orderByQualityid(boolean desc) {
        orderBy(MonturasColumns.QUALITYID, desc);
        return this;
    }

    public MonturasSelection orderByQualityid() {
        orderBy(MonturasColumns.QUALITYID, false);
        return this;
    }

    public MonturasSelection icon(String... value) {
        addEquals(MonturasColumns.ICON, value);
        return this;
    }

    public MonturasSelection iconNot(String... value) {
        addNotEquals(MonturasColumns.ICON, value);
        return this;
    }

    public MonturasSelection iconLike(String... value) {
        addLike(MonturasColumns.ICON, value);
        return this;
    }

    public MonturasSelection iconContains(String... value) {
        addContains(MonturasColumns.ICON, value);
        return this;
    }

    public MonturasSelection iconStartsWith(String... value) {
        addStartsWith(MonturasColumns.ICON, value);
        return this;
    }

    public MonturasSelection iconEndsWith(String... value) {
        addEndsWith(MonturasColumns.ICON, value);
        return this;
    }

    public MonturasSelection orderByIcon(boolean desc) {
        orderBy(MonturasColumns.ICON, desc);
        return this;
    }

    public MonturasSelection orderByIcon() {
        orderBy(MonturasColumns.ICON, false);
        return this;
    }

    public MonturasSelection isground(String... value) {
        addEquals(MonturasColumns.ISGROUND, value);
        return this;
    }

    public MonturasSelection isgroundNot(String... value) {
        addNotEquals(MonturasColumns.ISGROUND, value);
        return this;
    }

    public MonturasSelection isgroundLike(String... value) {
        addLike(MonturasColumns.ISGROUND, value);
        return this;
    }

    public MonturasSelection isgroundContains(String... value) {
        addContains(MonturasColumns.ISGROUND, value);
        return this;
    }

    public MonturasSelection isgroundStartsWith(String... value) {
        addStartsWith(MonturasColumns.ISGROUND, value);
        return this;
    }

    public MonturasSelection isgroundEndsWith(String... value) {
        addEndsWith(MonturasColumns.ISGROUND, value);
        return this;
    }

    public MonturasSelection orderByIsground(boolean desc) {
        orderBy(MonturasColumns.ISGROUND, desc);
        return this;
    }

    public MonturasSelection orderByIsground() {
        orderBy(MonturasColumns.ISGROUND, false);
        return this;
    }

    public MonturasSelection isflying(String... value) {
        addEquals(MonturasColumns.ISFLYING, value);
        return this;
    }

    public MonturasSelection isflyingNot(String... value) {
        addNotEquals(MonturasColumns.ISFLYING, value);
        return this;
    }

    public MonturasSelection isflyingLike(String... value) {
        addLike(MonturasColumns.ISFLYING, value);
        return this;
    }

    public MonturasSelection isflyingContains(String... value) {
        addContains(MonturasColumns.ISFLYING, value);
        return this;
    }

    public MonturasSelection isflyingStartsWith(String... value) {
        addStartsWith(MonturasColumns.ISFLYING, value);
        return this;
    }

    public MonturasSelection isflyingEndsWith(String... value) {
        addEndsWith(MonturasColumns.ISFLYING, value);
        return this;
    }

    public MonturasSelection orderByIsflying(boolean desc) {
        orderBy(MonturasColumns.ISFLYING, desc);
        return this;
    }

    public MonturasSelection orderByIsflying() {
        orderBy(MonturasColumns.ISFLYING, false);
        return this;
    }

    public MonturasSelection isaquatic(String... value) {
        addEquals(MonturasColumns.ISAQUATIC, value);
        return this;
    }

    public MonturasSelection isaquaticNot(String... value) {
        addNotEquals(MonturasColumns.ISAQUATIC, value);
        return this;
    }

    public MonturasSelection isaquaticLike(String... value) {
        addLike(MonturasColumns.ISAQUATIC, value);
        return this;
    }

    public MonturasSelection isaquaticContains(String... value) {
        addContains(MonturasColumns.ISAQUATIC, value);
        return this;
    }

    public MonturasSelection isaquaticStartsWith(String... value) {
        addStartsWith(MonturasColumns.ISAQUATIC, value);
        return this;
    }

    public MonturasSelection isaquaticEndsWith(String... value) {
        addEndsWith(MonturasColumns.ISAQUATIC, value);
        return this;
    }

    public MonturasSelection orderByIsaquatic(boolean desc) {
        orderBy(MonturasColumns.ISAQUATIC, desc);
        return this;
    }

    public MonturasSelection orderByIsaquatic() {
        orderBy(MonturasColumns.ISAQUATIC, false);
        return this;
    }

    public MonturasSelection isjumping(String... value) {
        addEquals(MonturasColumns.ISJUMPING, value);
        return this;
    }

    public MonturasSelection isjumpingNot(String... value) {
        addNotEquals(MonturasColumns.ISJUMPING, value);
        return this;
    }

    public MonturasSelection isjumpingLike(String... value) {
        addLike(MonturasColumns.ISJUMPING, value);
        return this;
    }

    public MonturasSelection isjumpingContains(String... value) {
        addContains(MonturasColumns.ISJUMPING, value);
        return this;
    }

    public MonturasSelection isjumpingStartsWith(String... value) {
        addStartsWith(MonturasColumns.ISJUMPING, value);
        return this;
    }

    public MonturasSelection isjumpingEndsWith(String... value) {
        addEndsWith(MonturasColumns.ISJUMPING, value);
        return this;
    }

    public MonturasSelection orderByIsjumping(boolean desc) {
        orderBy(MonturasColumns.ISJUMPING, desc);
        return this;
    }

    public MonturasSelection orderByIsjumping() {
        orderBy(MonturasColumns.ISJUMPING, false);
        return this;
    }
}
