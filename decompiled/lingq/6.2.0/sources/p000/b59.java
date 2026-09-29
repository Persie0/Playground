package p000;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b59 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f7975a;

    static {
        int[] iArr = new int[BufferOverflow.values().length];
        try {
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7975a = iArr;
    }
}
