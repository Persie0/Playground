package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class osb {

    /* JADX INFO: renamed from: a */
    public static final int f54952a;

    static {
        f54952a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
