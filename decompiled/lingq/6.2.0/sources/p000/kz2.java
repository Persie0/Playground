package p000;

import androidx.window.core.VerificationMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class kz2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f48793a;

    static {
        int[] iArr = new int[VerificationMode.values().length];
        try {
            iArr[VerificationMode.STRICT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerificationMode.LOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VerificationMode.QUIET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f48793a = iArr;
    }
}
