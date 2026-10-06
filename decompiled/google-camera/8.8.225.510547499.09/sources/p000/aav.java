package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aav {
    /* JADX INFO: renamed from: a */
    public static int m60a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* JADX INFO: renamed from: b */
    public static AppOpsManager m61b(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    /* JADX INFO: renamed from: c */
    public static String m62c(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: d */
    public static Font m63d(FontFamily fontFamily, int i) {
        int i2 = 1;
        FontStyle fontStyle = new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM64e = m64e(fontStyle, font.getStyle());
        while (i2 < fontFamily.getSize()) {
            Font font2 = fontFamily.getFont(i2);
            int iM64e2 = m64e(fontStyle, font2.getStyle());
            int i3 = iM64e2 < iM64e ? iM64e2 : iM64e;
            if (iM64e2 < iM64e) {
                font = font2;
            }
            i2++;
            iM64e = i3;
        }
        return font;
    }

    /* JADX INFO: renamed from: e */
    private static int m64e(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }
}
