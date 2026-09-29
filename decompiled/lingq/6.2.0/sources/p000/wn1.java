package p000;

import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wn1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67090a;

    static {
        int[] iArr = new int[CoroutineStart.values().length];
        try {
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f67090a = iArr;
    }
}
