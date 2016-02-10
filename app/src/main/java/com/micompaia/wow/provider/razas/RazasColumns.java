package com.micompaia.wow.provider.razas;

import android.net.Uri;
import android.provider.BaseColumns;

import com.micompaia.wow.provider.WowProvider;
import com.micompaia.wow.provider.clases.ClasesColumns;
import com.micompaia.wow.provider.logros.LogrosColumns;
import com.micompaia.wow.provider.mascotas.MascotasColumns;
import com.micompaia.wow.provider.monturas.MonturasColumns;
import com.micompaia.wow.provider.razas.RazasColumns;

/**
 * Columns for the {@code razas} table.
 */
public class RazasColumns implements BaseColumns {
    public static final String TABLE_NAME = "razas";
    public static final Uri CONTENT_URI = Uri.parse(WowProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String MASK = "mask";

    public static final String SIDE = "side";

    public static final String NAME = "name";

    public static final String IMAGEN = "imagen";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            MASK,
            SIDE,
            NAME,
            IMAGEN
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(MASK) || c.contains("." + MASK)) return true;
            if (c.equals(SIDE) || c.contains("." + SIDE)) return true;
            if (c.equals(NAME) || c.contains("." + NAME)) return true;
            if (c.equals(IMAGEN) || c.contains("." + IMAGEN)) return true;
        }
        return false;
    }

}
