package p000;

import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gt4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f41297a;

    static {
        int[] iArr = new int[LazyThreadSafetyMode.values().length];
        try {
            iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f41297a = iArr;
    }
}
