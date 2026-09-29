package p000;

import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: renamed from: qc */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3492qc {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57552a;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        f57552a = iArr;
        try {
            iArr[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f57552a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f57552a[OutputPrefixType.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f57552a[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
