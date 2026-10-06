package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lut {

    /* JADX INFO: renamed from: a */
    private static final lyz f39291a = new lyz("/");

    /* JADX INFO: renamed from: a */
    public static String m16027a(String str, String str2) {
        return (str2 == null || str2.isEmpty()) ? "" : String.format(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m16028b(Uri uri) {
        return m16027a("/%s", f39291a.m16215d(uri.getPathSegments())) + m16027a("?%s", uri.getQuery()) + m16027a("#%s", uri.getFragment());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16029c(String str) {
        return str.length() > 25;
    }
}
