package p000;

import com.google.zxing.qrcode.decoder.Mode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class wr2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67199a;

    static {
        int[] iArr = new int[Mode.values().length];
        f67199a = iArr;
        try {
            iArr[Mode.NUMERIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f67199a[Mode.ALPHANUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f67199a[Mode.BYTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f67199a[Mode.KANJI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
