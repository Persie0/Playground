package p000;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class p3b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f55536a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        f55536a = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f55536a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f55536a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
