package p000;

import androidx.work.NetworkType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class vp9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f65768a;

    static {
        int[] iArr = new int[NetworkType.values().length];
        f65768a = iArr;
        try {
            iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f65768a[NetworkType.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f65768a[NetworkType.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f65768a[NetworkType.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f65768a[NetworkType.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
