package com.micompaia.wow.provider.logros;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.micompaia.wow.provider.base.AbstractSelection;

/**
 * Selection for the {@code logros} table.
 */
public class LogrosSelection extends AbstractSelection<LogrosSelection> {
    @Override
    protected Uri baseUri() {
        return LogrosColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code LogrosCursor} object, which is positioned before the first entry, or null.
     */
    public LogrosCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new LogrosCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public LogrosCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code LogrosCursor} object, which is positioned before the first entry, or null.
     */
    public LogrosCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new LogrosCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public LogrosCursor query(Context context) {
        return query(context, null);
    }


    public LogrosSelection id(long... value) {
        addEquals("logros." + LogrosColumns._ID, toObjectArray(value));
        return this;
    }

    public LogrosSelection idNot(long... value) {
        addNotEquals("logros." + LogrosColumns._ID, toObjectArray(value));
        return this;
    }

    public LogrosSelection orderById(boolean desc) {
        orderBy("logros." + LogrosColumns._ID, desc);
        return this;
    }

    public LogrosSelection orderById() {
        return orderById(false);
    }

    public LogrosSelection title(String... value) {
        addEquals(LogrosColumns.TITLE, value);
        return this;
    }

    public LogrosSelection titleNot(String... value) {
        addNotEquals(LogrosColumns.TITLE, value);
        return this;
    }

    public LogrosSelection titleLike(String... value) {
        addLike(LogrosColumns.TITLE, value);
        return this;
    }

    public LogrosSelection titleContains(String... value) {
        addContains(LogrosColumns.TITLE, value);
        return this;
    }

    public LogrosSelection titleStartsWith(String... value) {
        addStartsWith(LogrosColumns.TITLE, value);
        return this;
    }

    public LogrosSelection titleEndsWith(String... value) {
        addEndsWith(LogrosColumns.TITLE, value);
        return this;
    }

    public LogrosSelection orderByTitle(boolean desc) {
        orderBy(LogrosColumns.TITLE, desc);
        return this;
    }

    public LogrosSelection orderByTitle() {
        orderBy(LogrosColumns.TITLE, false);
        return this;
    }

    public LogrosSelection points(String... value) {
        addEquals(LogrosColumns.POINTS, value);
        return this;
    }

    public LogrosSelection pointsNot(String... value) {
        addNotEquals(LogrosColumns.POINTS, value);
        return this;
    }

    public LogrosSelection pointsLike(String... value) {
        addLike(LogrosColumns.POINTS, value);
        return this;
    }

    public LogrosSelection pointsContains(String... value) {
        addContains(LogrosColumns.POINTS, value);
        return this;
    }

    public LogrosSelection pointsStartsWith(String... value) {
        addStartsWith(LogrosColumns.POINTS, value);
        return this;
    }

    public LogrosSelection pointsEndsWith(String... value) {
        addEndsWith(LogrosColumns.POINTS, value);
        return this;
    }

    public LogrosSelection orderByPoints(boolean desc) {
        orderBy(LogrosColumns.POINTS, desc);
        return this;
    }

    public LogrosSelection orderByPoints() {
        orderBy(LogrosColumns.POINTS, false);
        return this;
    }

    public LogrosSelection description(String... value) {
        addEquals(LogrosColumns.DESCRIPTION, value);
        return this;
    }

    public LogrosSelection descriptionNot(String... value) {
        addNotEquals(LogrosColumns.DESCRIPTION, value);
        return this;
    }

    public LogrosSelection descriptionLike(String... value) {
        addLike(LogrosColumns.DESCRIPTION, value);
        return this;
    }

    public LogrosSelection descriptionContains(String... value) {
        addContains(LogrosColumns.DESCRIPTION, value);
        return this;
    }

    public LogrosSelection descriptionStartsWith(String... value) {
        addStartsWith(LogrosColumns.DESCRIPTION, value);
        return this;
    }

    public LogrosSelection descriptionEndsWith(String... value) {
        addEndsWith(LogrosColumns.DESCRIPTION, value);
        return this;
    }

    public LogrosSelection orderByDescription(boolean desc) {
        orderBy(LogrosColumns.DESCRIPTION, desc);
        return this;
    }

    public LogrosSelection orderByDescription() {
        orderBy(LogrosColumns.DESCRIPTION, false);
        return this;
    }

    public LogrosSelection icon(String... value) {
        addEquals(LogrosColumns.ICON, value);
        return this;
    }

    public LogrosSelection iconNot(String... value) {
        addNotEquals(LogrosColumns.ICON, value);
        return this;
    }

    public LogrosSelection iconLike(String... value) {
        addLike(LogrosColumns.ICON, value);
        return this;
    }

    public LogrosSelection iconContains(String... value) {
        addContains(LogrosColumns.ICON, value);
        return this;
    }

    public LogrosSelection iconStartsWith(String... value) {
        addStartsWith(LogrosColumns.ICON, value);
        return this;
    }

    public LogrosSelection iconEndsWith(String... value) {
        addEndsWith(LogrosColumns.ICON, value);
        return this;
    }

    public LogrosSelection orderByIcon(boolean desc) {
        orderBy(LogrosColumns.ICON, desc);
        return this;
    }

    public LogrosSelection orderByIcon() {
        orderBy(LogrosColumns.ICON, false);
        return this;
    }
}
