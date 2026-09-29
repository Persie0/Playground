package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabo extends RuntimeException {
    /* JADX INFO: renamed from: a */
    public static zzabo m5416a(String str, int i, int i2, String str2) {
        return new zzabo(m5420e(str, i, i2, str2));
    }

    /* JADX INFO: renamed from: b */
    public static zzabo m5417b(String str, int i, String str2) {
        return new zzabo(m5420e(str, i, i + 1, str2));
    }

    /* JADX INFO: renamed from: c */
    public static zzabo m5418c(String str, int i, String str2) {
        return new zzabo(m5420e(str, i, -1, str2));
    }

    /* JADX INFO: renamed from: d */
    public static zzabo m5419d(String str) {
        return new zzabo(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m5420e(String str, int i, int i2, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
