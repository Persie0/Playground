package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afd {
    /* JADX INFO: renamed from: a */
    public static Rect m453a(View view) {
        return view.getClipBounds();
    }

    /* JADX INFO: renamed from: b */
    public static void m454b(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* JADX INFO: renamed from: c */
    static boolean m455c(View view) {
        return view.isInLayout();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX INFO: renamed from: d */
    public static final boolean m456d(String str, String str2) {
        if (ooc.m18737c(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0) {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i3 == str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                } else if (cCharAt == '(') {
                    i3 = 0;
                    cCharAt = '(';
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt != ')') {
                        continue;
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                String strSubstring = str.substring(1, str.length() - 1);
                strSubstring.getClass();
                return ooc.m18737c(ook.m18802p(strSubstring).toString(), str2);
            }
        }
        return false;
    }
}
