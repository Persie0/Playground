package p000;

import com.airbnb.lottie.network.FileExtension;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class bk6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f8641a;

    static {
        int[] iArr = new int[FileExtension.values().length];
        f8641a = iArr;
        try {
            iArr[FileExtension.ZIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8641a[FileExtension.GZIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
