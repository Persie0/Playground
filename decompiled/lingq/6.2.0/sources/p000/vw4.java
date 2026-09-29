package p000;

import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vw4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66021a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f66022b;

    static {
        int[] iArr = new int[KeyData$KeyMaterialType.values().length];
        f66022b = iArr;
        try {
            iArr[KeyData$KeyMaterialType.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f66022b[KeyData$KeyMaterialType.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[OutputPrefixType.values().length];
        f66021a = iArr2;
        try {
            iArr2[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f66021a[OutputPrefixType.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f66021a[OutputPrefixType.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f66021a[OutputPrefixType.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
