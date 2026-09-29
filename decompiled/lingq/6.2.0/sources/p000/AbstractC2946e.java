package p000;

import coil.size.Precision;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2946e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f36477a;

    static {
        int[] iArr = new int[Precision.values().length];
        try {
            iArr[Precision.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Precision.INEXACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Precision.AUTOMATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f36477a = iArr;
    }
}
