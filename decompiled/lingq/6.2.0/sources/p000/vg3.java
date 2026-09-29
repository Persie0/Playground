package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vg3 {

    /* JADX INFO: renamed from: a */
    public static final boolean f65344a;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f65344a = z;
    }
}
