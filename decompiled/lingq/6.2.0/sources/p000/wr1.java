package p000;

import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wr1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67198a;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        f67198a = iArr;
        try {
            iArr[OutputPrefixType.LEGACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f67198a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f67198a[OutputPrefixType.TINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f67198a[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
