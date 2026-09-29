package p000;

import com.google.crypto.tink.proto.HashType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ku3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f48427a;

    static {
        int[] iArr = new int[HashType.values().length];
        f48427a = iArr;
        try {
            iArr[HashType.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48427a[HashType.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48427a[HashType.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48427a[HashType.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48427a[HashType.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
