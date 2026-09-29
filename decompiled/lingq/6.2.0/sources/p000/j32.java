package p000;

import coil.size.Scale;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j32 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f45001a;

    static {
        int[] iArr = new int[Scale.values().length];
        try {
            iArr[Scale.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Scale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f45001a = iArr;
    }
}
