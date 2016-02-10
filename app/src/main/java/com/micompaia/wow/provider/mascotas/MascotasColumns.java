package com.micompaia.wow.provider.mascotas;

import android.net.Uri;
import android.provider.BaseColumns;

import com.micompaia.wow.provider.WowProvider;
import com.micompaia.wow.provider.clases.ClasesColumns;
import com.micompaia.wow.provider.logros.LogrosColumns;
import com.micompaia.wow.provider.mascotas.MascotasColumns;
import com.micompaia.wow.provider.monturas.MonturasColumns;
import com.micompaia.wow.provider.razas.RazasColumns;

/**
 * Columns for the {@code mascotas} table.
 */
public class MascotasColumns implements BaseColumns {
    public static final String TABLE_NAME = "mascotas";
    public static final Uri CONTENT_URI = Uri.parse(WowProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String KEY = "key";

    public static final String NAME = "name";

    public static final String TYPEABILITYID = "typeAbilityId";

    public static final String STRONGAGAINSTID = "strongAgainstId";

    public static final String WEAKAGAINSTID = "weakAgainstId";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            KEY,
            NAME,
            TYPEABILITYID,
            STRONGAGAINSTID,
            WEAKAGAINSTID
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(KEY) || c.contains("." + KEY)) return true;
            if (c.equals(NAME) || c.contains("." + NAME)) return true;
            if (c.equals(TYPEABILITYID) || c.contains("." + TYPEABILITYID)) return true;
            if (c.equals(STRONGAGAINSTID) || c.contains("." + STRONGAGAINSTID)) return true;
            if (c.equals(WEAKAGAINSTID) || c.contains("." + WEAKAGAINSTID)) return true;
        }
        return false;
    }

}
