package p000;

import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ip0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f44390a;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        f44390a = iArr;
        try {
            iArr[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f44390a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f44390a[OutputPrefixType.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f44390a[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
