package p521z1;

import androidx.compose.p017ui.window.SecureFlagPolicy;

/* JADX INFO: renamed from: z1.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10436j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52278a;

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
        f52278a = iArr;
    }
}
