package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class bxc {

    /* JADX INFO: renamed from: a */
    public static final C3275kv f9152a = new C3275kv(0);

    /* JADX INFO: renamed from: a */
    public static synchronized Uri m4222a() {
        C3275kv c3275kv = f9152a;
        Uri uri = (Uri) c3275kv.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c3275kv.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }

    /* JADX INFO: renamed from: b */
    public static String m4223b(Context context, String str) {
        if (str.contains("#")) {
            C3386nv.m17626m("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return AbstractC3393o1.m17739n(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }
}
