package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2912y4 {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m8435a(int i10, int i11) {
        String strM8474a;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM8474a = C2925z4.m8474a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(C0166e.m761g("negative size: ", i11));
                }
                strM8474a = C2925z4.m8474a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM8474a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8436b(int i10, int i11, int i12) {
        String strM8437c;
        if (i10 >= 0 && i11 >= i10) {
            if (i11 <= i12) {
                return;
            }
        }
        if (i10 < 0 || i10 > i12) {
            strM8437c = m8437c("start index", i10, i12);
        } else {
            strM8437c = (i11 < 0 || i11 > i12) ? m8437c("end index", i11, i12) : C2925z4.m8474a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strM8437c);
    }

    /* JADX INFO: renamed from: c */
    public static String m8437c(String str, int i10, int i11) {
        if (i10 < 0) {
            return C2925z4.m8474a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C2925z4.m8474a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(C0166e.m761g("negative size: ", i11));
    }
}
