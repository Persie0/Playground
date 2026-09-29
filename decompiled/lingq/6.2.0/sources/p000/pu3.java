package p000;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class pu3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f56805a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f56806b;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        f56806b = iArr;
        try {
            iArr[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f56806b[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f56806b[OutputPrefixType.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f56806b[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[HashType.values().length];
        f56805a = iArr2;
        try {
            iArr2[HashType.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f56805a[HashType.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f56805a[HashType.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f56805a[HashType.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f56805a[HashType.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
