package p000;

import com.google.zxing.pdf417.encoder.Compaction;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class h17 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f41662a;

    static {
        int[] iArr = new int[Compaction.values().length];
        f41662a = iArr;
        try {
            iArr[Compaction.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f41662a[Compaction.BYTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f41662a[Compaction.NUMERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
