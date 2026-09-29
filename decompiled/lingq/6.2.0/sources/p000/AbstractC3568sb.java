package p000;

import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: renamed from: sb */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3568sb {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60605a;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        f60605a = iArr;
        try {
            iArr[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f60605a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f60605a[OutputPrefixType.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f60605a[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
