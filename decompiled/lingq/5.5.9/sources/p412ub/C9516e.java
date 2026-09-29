package p412ub;

import android.os.Build;

/* JADX INFO: renamed from: ub.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9516e {

    /* JADX INFO: renamed from: a */
    public static final int f49021a;

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
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
        f49021a = i11;
    }
}
