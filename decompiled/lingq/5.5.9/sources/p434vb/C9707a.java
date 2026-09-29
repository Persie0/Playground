package p434vb;

import android.os.Build;

/* JADX INFO: renamed from: vb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9707a {

    /* JADX INFO: renamed from: a */
    public static final int f49714a;

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 33554432;
        if (i10 < 31) {
            if (i10 >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
        }
        f49714a = i11;
    }
}
