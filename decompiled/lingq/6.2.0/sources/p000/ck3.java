package p000;

import com.google.firebase.perf.p010v1.ApplicationProcessState;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ck3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10190a;

    static {
        int[] iArr = new int[ApplicationProcessState.values().length];
        f10190a = iArr;
        try {
            iArr[ApplicationProcessState.BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10190a[ApplicationProcessState.FOREGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
