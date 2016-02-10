package com.micompaia.wow.provider;

import java.util.Arrays;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.Log;

import com.micompaia.wow.BuildConfig;
import com.micompaia.wow.provider.base.BaseContentProvider;
import com.micompaia.wow.provider.clases.ClasesColumns;
import com.micompaia.wow.provider.logros.LogrosColumns;
import com.micompaia.wow.provider.mascotas.MascotasColumns;
import com.micompaia.wow.provider.monturas.MonturasColumns;
import com.micompaia.wow.provider.razas.RazasColumns;

public class WowProvider extends BaseContentProvider {
    private static final String TAG = WowProvider.class.getSimpleName();

    private static final boolean DEBUG = BuildConfig.DEBUG;

    private static final String TYPE_CURSOR_ITEM = "vnd.android.cursor.item/";
    private static final String TYPE_CURSOR_DIR = "vnd.android.cursor.dir/";

    public static final String AUTHORITY = "com.micompaia.wow.provider";
    public static final String CONTENT_URI_BASE = "content://" + AUTHORITY;

    private static final int URI_TYPE_CLASES = 0;
    private static final int URI_TYPE_CLASES_ID = 1;

    private static final int URI_TYPE_LOGROS = 2;
    private static final int URI_TYPE_LOGROS_ID = 3;

    private static final int URI_TYPE_MASCOTAS = 4;
    private static final int URI_TYPE_MASCOTAS_ID = 5;

    private static final int URI_TYPE_MONTURAS = 6;
    private static final int URI_TYPE_MONTURAS_ID = 7;

    private static final int URI_TYPE_RAZAS = 8;
    private static final int URI_TYPE_RAZAS_ID = 9;



    private static final UriMatcher URI_MATCHER = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        URI_MATCHER.addURI(AUTHORITY, ClasesColumns.TABLE_NAME, URI_TYPE_CLASES);
        URI_MATCHER.addURI(AUTHORITY, ClasesColumns.TABLE_NAME + "/#", URI_TYPE_CLASES_ID);
        URI_MATCHER.addURI(AUTHORITY, LogrosColumns.TABLE_NAME, URI_TYPE_LOGROS);
        URI_MATCHER.addURI(AUTHORITY, LogrosColumns.TABLE_NAME + "/#", URI_TYPE_LOGROS_ID);
        URI_MATCHER.addURI(AUTHORITY, MascotasColumns.TABLE_NAME, URI_TYPE_MASCOTAS);
        URI_MATCHER.addURI(AUTHORITY, MascotasColumns.TABLE_NAME + "/#", URI_TYPE_MASCOTAS_ID);
        URI_MATCHER.addURI(AUTHORITY, MonturasColumns.TABLE_NAME, URI_TYPE_MONTURAS);
        URI_MATCHER.addURI(AUTHORITY, MonturasColumns.TABLE_NAME + "/#", URI_TYPE_MONTURAS_ID);
        URI_MATCHER.addURI(AUTHORITY, RazasColumns.TABLE_NAME, URI_TYPE_RAZAS);
        URI_MATCHER.addURI(AUTHORITY, RazasColumns.TABLE_NAME + "/#", URI_TYPE_RAZAS_ID);
    }

    @Override
    protected SQLiteOpenHelper createSqLiteOpenHelper() {
        return WowSQLiteOpenHelper.getInstance(getContext());
    }

    @Override
    protected boolean hasDebug() {
        return DEBUG;
    }

    @Override
    public String getType(Uri uri) {
        int match = URI_MATCHER.match(uri);
        switch (match) {
            case URI_TYPE_CLASES:
                return TYPE_CURSOR_DIR + ClasesColumns.TABLE_NAME;
            case URI_TYPE_CLASES_ID:
                return TYPE_CURSOR_ITEM + ClasesColumns.TABLE_NAME;

            case URI_TYPE_LOGROS:
                return TYPE_CURSOR_DIR + LogrosColumns.TABLE_NAME;
            case URI_TYPE_LOGROS_ID:
                return TYPE_CURSOR_ITEM + LogrosColumns.TABLE_NAME;

            case URI_TYPE_MASCOTAS:
                return TYPE_CURSOR_DIR + MascotasColumns.TABLE_NAME;
            case URI_TYPE_MASCOTAS_ID:
                return TYPE_CURSOR_ITEM + MascotasColumns.TABLE_NAME;

            case URI_TYPE_MONTURAS:
                return TYPE_CURSOR_DIR + MonturasColumns.TABLE_NAME;
            case URI_TYPE_MONTURAS_ID:
                return TYPE_CURSOR_ITEM + MonturasColumns.TABLE_NAME;

            case URI_TYPE_RAZAS:
                return TYPE_CURSOR_DIR + RazasColumns.TABLE_NAME;
            case URI_TYPE_RAZAS_ID:
                return TYPE_CURSOR_ITEM + RazasColumns.TABLE_NAME;

        }
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        if (DEBUG) Log.d(TAG, "insert uri=" + uri + " values=" + values);
        return super.insert(uri, values);
    }

    @Override
    public int bulkInsert(Uri uri, ContentValues[] values) {
        if (DEBUG) Log.d(TAG, "bulkInsert uri=" + uri + " values.length=" + values.length);
        return super.bulkInsert(uri, values);
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        if (DEBUG) Log.d(TAG, "update uri=" + uri + " values=" + values + " selection=" + selection + " selectionArgs=" + Arrays.toString(selectionArgs));
        return super.update(uri, values, selection, selectionArgs);
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        if (DEBUG) Log.d(TAG, "delete uri=" + uri + " selection=" + selection + " selectionArgs=" + Arrays.toString(selectionArgs));
        return super.delete(uri, selection, selectionArgs);
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        if (DEBUG)
            Log.d(TAG, "query uri=" + uri + " selection=" + selection + " selectionArgs=" + Arrays.toString(selectionArgs) + " sortOrder=" + sortOrder
                    + " groupBy=" + uri.getQueryParameter(QUERY_GROUP_BY) + " having=" + uri.getQueryParameter(QUERY_HAVING) + " limit=" + uri.getQueryParameter(QUERY_LIMIT));
        return super.query(uri, projection, selection, selectionArgs, sortOrder);
    }

    @Override
    protected QueryParams getQueryParams(Uri uri, String selection, String[] projection) {
        QueryParams res = new QueryParams();
        String id = null;
        int matchedId = URI_MATCHER.match(uri);
        switch (matchedId) {
            case URI_TYPE_CLASES:
            case URI_TYPE_CLASES_ID:
                res.table = ClasesColumns.TABLE_NAME;
                res.idColumn = ClasesColumns._ID;
                res.tablesWithJoins = ClasesColumns.TABLE_NAME;
                res.orderBy = ClasesColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_LOGROS:
            case URI_TYPE_LOGROS_ID:
                res.table = LogrosColumns.TABLE_NAME;
                res.idColumn = LogrosColumns._ID;
                res.tablesWithJoins = LogrosColumns.TABLE_NAME;
                res.orderBy = LogrosColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_MASCOTAS:
            case URI_TYPE_MASCOTAS_ID:
                res.table = MascotasColumns.TABLE_NAME;
                res.idColumn = MascotasColumns._ID;
                res.tablesWithJoins = MascotasColumns.TABLE_NAME;
                res.orderBy = MascotasColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_MONTURAS:
            case URI_TYPE_MONTURAS_ID:
                res.table = MonturasColumns.TABLE_NAME;
                res.idColumn = MonturasColumns._ID;
                res.tablesWithJoins = MonturasColumns.TABLE_NAME;
                res.orderBy = MonturasColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_RAZAS:
            case URI_TYPE_RAZAS_ID:
                res.table = RazasColumns.TABLE_NAME;
                res.idColumn = RazasColumns._ID;
                res.tablesWithJoins = RazasColumns.TABLE_NAME;
                res.orderBy = RazasColumns.DEFAULT_ORDER;
                break;

            default:
                throw new IllegalArgumentException("The uri '" + uri + "' is not supported by this ContentProvider");
        }

        switch (matchedId) {
            case URI_TYPE_CLASES_ID:
            case URI_TYPE_LOGROS_ID:
            case URI_TYPE_MASCOTAS_ID:
            case URI_TYPE_MONTURAS_ID:
            case URI_TYPE_RAZAS_ID:
                id = uri.getLastPathSegment();
        }
        if (id != null) {
            if (selection != null) {
                res.selection = res.table + "." + res.idColumn + "=" + id + " and (" + selection + ")";
            } else {
                res.selection = res.table + "." + res.idColumn + "=" + id;
            }
        } else {
            res.selection = selection;
        }
        return res;
    }
}
