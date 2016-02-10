package com.micompaia.wow.provider.monturas;

import android.net.Uri;
import android.provider.BaseColumns;

import com.micompaia.wow.provider.WowProvider;
import com.micompaia.wow.provider.clases.ClasesColumns;
import com.micompaia.wow.provider.logros.LogrosColumns;
import com.micompaia.wow.provider.mascotas.MascotasColumns;
import com.micompaia.wow.provider.monturas.MonturasColumns;
import com.micompaia.wow.provider.razas.RazasColumns;

/**
 * Columns for the {@code monturas} table.
 */
public class MonturasColumns implements BaseColumns {
    public static final String TABLE_NAME = "monturas";
    public static final Uri CONTENT_URI = Uri.parse(WowProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String NAME = "name";

    public static final String SPELLID = "spellId";

    public static final String CREATUREID = "creatureId";

    public static final String ITEMID = "itemId";

    public static final String QUALITYID = "qualityId";

    public static final String ICON = "icon";

    public static final String ISGROUND = "isGround";

    public static final String ISFLYING = "isFlying";

    public static final String ISAQUATIC = "isAquatic";

    public static final String ISJUMPING = "isJumping";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            NAME,
            SPELLID,
            CREATUREID,
            ITEMID,
            QUALITYID,
            ICON,
            ISGROUND,
            ISFLYING,
            ISAQUATIC,
            ISJUMPING
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(NAME) || c.contains("." + NAME)) return true;
            if (c.equals(SPELLID) || c.contains("." + SPELLID)) return true;
            if (c.equals(CREATUREID) || c.contains("." + CREATUREID)) return true;
            if (c.equals(ITEMID) || c.contains("." + ITEMID)) return true;
            if (c.equals(QUALITYID) || c.contains("." + QUALITYID)) return true;
            if (c.equals(ICON) || c.contains("." + ICON)) return true;
            if (c.equals(ISGROUND) || c.contains("." + ISGROUND)) return true;
            if (c.equals(ISFLYING) || c.contains("." + ISFLYING)) return true;
            if (c.equals(ISAQUATIC) || c.contains("." + ISAQUATIC)) return true;
            if (c.equals(ISJUMPING) || c.contains("." + ISJUMPING)) return true;
        }
        return false;
    }

}
