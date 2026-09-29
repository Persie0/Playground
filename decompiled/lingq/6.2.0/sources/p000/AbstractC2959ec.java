package p000;

import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: renamed from: ec */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2959ec {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f36987a;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        f36987a = iArr;
        try {
            iArr[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f36987a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f36987a[OutputPrefixType.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f36987a[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
