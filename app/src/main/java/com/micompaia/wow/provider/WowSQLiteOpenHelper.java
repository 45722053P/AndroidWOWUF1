package com.micompaia.wow.provider;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import com.micompaia.wow.BuildConfig;
import com.micompaia.wow.provider.clases.ClasesColumns;
import com.micompaia.wow.provider.logros.LogrosColumns;
import com.micompaia.wow.provider.mascotas.MascotasColumns;
import com.micompaia.wow.provider.monturas.MonturasColumns;
import com.micompaia.wow.provider.razas.RazasColumns;

public class WowSQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String TAG = WowSQLiteOpenHelper.class.getSimpleName();

    public static final String DATABASE_FILE_NAME = "Wow.db";
    private static final int DATABASE_VERSION = 1;
    private static WowSQLiteOpenHelper sInstance;
    private final Context mContext;
    private final WowSQLiteOpenHelperCallbacks mOpenHelperCallbacks;

    // @formatter:off
    public static final String SQL_CREATE_TABLE_CLASES = "CREATE TABLE IF NOT EXISTS "
            + ClasesColumns.TABLE_NAME + " ( "
            + ClasesColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ClasesColumns.MASK + " TEXT, "
            + ClasesColumns.POWERTYPE + " TEXT, "
            + ClasesColumns.NAME + " TEXT "
            + " );";

    public static final String SQL_CREATE_TABLE_LOGROS = "CREATE TABLE IF NOT EXISTS "
            + LogrosColumns.TABLE_NAME + " ( "
            + LogrosColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + LogrosColumns.TITLE + " TEXT, "
            + LogrosColumns.POINTS + " TEXT, "
            + LogrosColumns.DESCRIPTION + " TEXT, "
            + LogrosColumns.ICON + " TEXT "
            + " );";

    public static final String SQL_CREATE_TABLE_MASCOTAS = "CREATE TABLE IF NOT EXISTS "
            + MascotasColumns.TABLE_NAME + " ( "
            + MascotasColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MascotasColumns.KEY + " TEXT, "
            + MascotasColumns.NAME + " TEXT, "
            + MascotasColumns.TYPEABILITYID + " TEXT, "
            + MascotasColumns.STRONGAGAINSTID + " TEXT, "
            + MascotasColumns.WEAKAGAINSTID + " TEXT "
            + " );";

    public static final String SQL_CREATE_TABLE_MONTURAS = "CREATE TABLE IF NOT EXISTS "
            + MonturasColumns.TABLE_NAME + " ( "
            + MonturasColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MonturasColumns.NAME + " TEXT, "
            + MonturasColumns.SPELLID + " INTEGER, "
            + MonturasColumns.CREATUREID + " INTEGER, "
            + MonturasColumns.ITEMID + " INTEGER, "
            + MonturasColumns.QUALITYID + " INTEGER, "
            + MonturasColumns.ICON + " TEXT, "
            + MonturasColumns.ISGROUND + " TEXT, "
            + MonturasColumns.ISFLYING + " TEXT, "
            + MonturasColumns.ISAQUATIC + " TEXT, "
            + MonturasColumns.ISJUMPING + " TEXT "
            + " );";

    public static final String SQL_CREATE_TABLE_RAZAS = "CREATE TABLE IF NOT EXISTS "
            + RazasColumns.TABLE_NAME + " ( "
            + RazasColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + RazasColumns.MASK + " TEXT, "
            + RazasColumns.SIDE + " TEXT, "
            + RazasColumns.NAME + " TEXT, "
            + RazasColumns.IMAGEN + " TEXT "
            + " );";

    // @formatter:on

    public static WowSQLiteOpenHelper getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = newInstance(context.getApplicationContext());
        }
        return sInstance;
    }

    private static WowSQLiteOpenHelper newInstance(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            return newInstancePreHoneycomb(context);
        }
        return newInstancePostHoneycomb(context);
    }


    /*
     * Pre Honeycomb.
     */
    private static WowSQLiteOpenHelper newInstancePreHoneycomb(Context context) {
        return new WowSQLiteOpenHelper(context);
    }

    private WowSQLiteOpenHelper(Context context) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION);
        mContext = context;
        mOpenHelperCallbacks = new WowSQLiteOpenHelperCallbacks();
    }


    /*
     * Post Honeycomb.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private static WowSQLiteOpenHelper newInstancePostHoneycomb(Context context) {
        return new WowSQLiteOpenHelper(context, new DefaultDatabaseErrorHandler());
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private WowSQLiteOpenHelper(Context context, DatabaseErrorHandler errorHandler) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION, errorHandler);
        mContext = context;
        mOpenHelperCallbacks = new WowSQLiteOpenHelperCallbacks();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        if (BuildConfig.DEBUG) Log.d(TAG, "onCreate");
        mOpenHelperCallbacks.onPreCreate(mContext, db);
        db.execSQL(SQL_CREATE_TABLE_CLASES);
        db.execSQL(SQL_CREATE_TABLE_LOGROS);
        db.execSQL(SQL_CREATE_TABLE_MASCOTAS);
        db.execSQL(SQL_CREATE_TABLE_MONTURAS);
        db.execSQL(SQL_CREATE_TABLE_RAZAS);
        mOpenHelperCallbacks.onPostCreate(mContext, db);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            setForeignKeyConstraintsEnabled(db);
        }
        mOpenHelperCallbacks.onOpen(mContext, db);
    }

    private void setForeignKeyConstraintsEnabled(SQLiteDatabase db) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            setForeignKeyConstraintsEnabledPreJellyBean(db);
        } else {
            setForeignKeyConstraintsEnabledPostJellyBean(db);
        }
    }

    private void setForeignKeyConstraintsEnabledPreJellyBean(SQLiteDatabase db) {
        db.execSQL("PRAGMA foreign_keys=ON;");
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setForeignKeyConstraintsEnabledPostJellyBean(SQLiteDatabase db) {
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        mOpenHelperCallbacks.onUpgrade(mContext, db, oldVersion, newVersion);
    }
}
