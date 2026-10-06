package p000;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jlx {

    /* JADX INFO: renamed from: b */
    public static jjn f34342b;

    /* JADX INFO: renamed from: a */
    public static final Object f34341a = new Object();

    /* JADX INFO: renamed from: c */
    public static boolean f34343c = false;

    public jlx(Context context) {
    }

    /* JADX INFO: renamed from: a */
    public static void m13344a(Context context, boolean z) {
        synchronized (f34341a) {
            if (f34343c) {
                return;
            }
            context.sendBroadcast(new Intent("com.google.android.gms.learning.REQUEST_FULL_FEATURE").setPackage("com.google.android.gms").putExtra("requester_package", context.getPackageName()).putExtra("module_loaded_successfully", z));
        }
    }
}
