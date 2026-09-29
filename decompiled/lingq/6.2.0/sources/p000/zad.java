package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zad {
    /* JADX INFO: renamed from: a */
    public static boolean m25536a(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }
}
