package p000;

import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import com.google.android.gms.dynamite.p017ho.DNTdN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aeq {
    /* JADX INFO: renamed from: a */
    static int m365a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: b */
    static int m366b(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX INFO: renamed from: c */
    static ColorStateList m367c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX INFO: renamed from: d */
    static PorterDuff.Mode m368d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static MenuItem m369e(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    /* JADX INFO: renamed from: f */
    public static MenuItem m370f(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: g */
    public static MenuItem m371g(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: h */
    public static MenuItem m372h(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: i */
    public static MenuItem m373i(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    /* JADX INFO: renamed from: j */
    static MenuItem m374j(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    /* JADX INFO: renamed from: k */
    public static MenuItem m375k(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: l */
    static CharSequence m376l(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX INFO: renamed from: m */
    static CharSequence m377m(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX INFO: renamed from: n */
    public static final int m378n(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public static final int m379o(Cursor cursor, String str) {
        String string;
        String str2 = DNTdN.HhoncczQvswamq;
        int iM378n = m378n(cursor, str);
        if (iM378n >= 0) {
            return iM378n;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) str2);
            int i = 0;
            for (String str3 : columnNames) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                ook.m18797k(sb, str3, null);
            }
            sb.append((CharSequence) str2);
            string = sb.toString();
        } catch (Exception e) {
            string = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }
}
