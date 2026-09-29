package p000;

import androidx.work.NetworkType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class qk6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57870a;

    static {
        int[] iArr = new int[NetworkType.values().length];
        try {
            iArr[NetworkType.METERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkType.UNMETERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NetworkType.NOT_ROAMING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f57870a = iArr;
    }
}
