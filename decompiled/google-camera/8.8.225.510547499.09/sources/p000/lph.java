package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lph {

    /* JADX INFO: renamed from: a */
    private static final C1109wy f38888a = new C1109wy();

    /* JADX INFO: renamed from: a */
    public static synchronized Uri m15821a(String str) {
        Uri uri;
        C1109wy c1109wy = f38888a;
        uri = (Uri) c1109wy.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
            c1109wy.put(str, uri);
        }
        return uri;
    }

    /* JADX INFO: renamed from: b */
    public static String m15822b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
        }
        return str + "#" + context.getPackageName();
    }
}
