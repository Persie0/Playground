package p000;

import androidx.compose.p002ui.window.SecureFlagPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class sa0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60573a;

    static {
        int[] iArr = new int[SecureFlagPolicy.values().length];
        try {
            iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f60573a = iArr;
    }
}
