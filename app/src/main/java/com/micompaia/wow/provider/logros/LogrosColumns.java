package com.micompaia.wow.provider.logros;

import android.net.Uri;
import android.provider.BaseColumns;

import com.micompaia.wow.provider.WowProvider;
import com.micompaia.wow.provider.clases.ClasesColumns;
import com.micompaia.wow.provider.logros.LogrosColumns;
import com.micompaia.wow.provider.mascotas.MascotasColumns;
import com.micompaia.wow.provider.monturas.MonturasColumns;
import com.micompaia.wow.provider.razas.RazasColumns;

/**
 * Columns for the {@code logros} table.
 */
public class LogrosColumns implements BaseColumns {
    public static final String TABLE_NAME = "logros";
    public static final Uri CONTENT_URI = Uri.parse(WowProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String TITLE = "title";

    public static final String POINTS = "points";

    public static final String DESCRIPTION = "description";

    public static final String ICON = "icon";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            TITLE,
            POINTS,
            DESCRIPTION,
            ICON
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(TITLE) || c.contains("." + TITLE)) return true;
            if (c.equals(POINTS) || c.contains("." + POINTS)) return true;
            if (c.equals(DESCRIPTION) || c.contains("." + DESCRIPTION)) return true;
            if (c.equals(ICON) || c.contains("." + ICON)) return true;
        }
        return false;
    }

}
