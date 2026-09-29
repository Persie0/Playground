package p000;

import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class x9b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67983a;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        f67983a = iArr;
        try {
            iArr[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f67983a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f67983a[OutputPrefixType.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f67983a[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
