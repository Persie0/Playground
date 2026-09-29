package p000;

import android.graphics.Color;
import com.google.common.primitives.AbstractC1110a;

/* JADX INFO: loaded from: classes2.dex */
public final class gg9 {

    /* JADX INFO: renamed from: a */
    public final String f40775a;

    /* JADX INFO: renamed from: b */
    public final int f40776b;

    /* JADX INFO: renamed from: c */
    public final Integer f40777c;

    /* JADX INFO: renamed from: d */
    public final Integer f40778d;

    /* JADX INFO: renamed from: e */
    public final float f40779e;

    /* JADX INFO: renamed from: f */
    public final boolean f40780f;

    /* JADX INFO: renamed from: g */
    public final boolean f40781g;

    /* JADX INFO: renamed from: h */
    public final boolean f40782h;

    /* JADX INFO: renamed from: i */
    public final boolean f40783i;

    /* JADX INFO: renamed from: j */
    public final int f40784j;

    public gg9(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f40775a = str;
        this.f40776b = i;
        this.f40777c = num;
        this.f40778d = num2;
        this.f40779e = f;
        this.f40780f = z;
        this.f40781g = z2;
        this.f40782h = z3;
        this.f40783i = z4;
        this.f40784j = i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m12587a(String str) {
        boolean z;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        hn1.m13365o("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12588b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            ss5.m21709e0("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Integer m12589c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            bna.m3969q(j <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC1110a.m6362b(((j >> 24) & 255) ^ 255), AbstractC1110a.m6362b(j & 255), AbstractC1110a.m6362b((j >> 8) & 255), AbstractC1110a.m6362b((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            ss5.m21709e0("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
