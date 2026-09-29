package p000;

import com.google.crypto.tink.KeyTemplate$OutputPrefixType;
import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ui4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f63958a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f63959b;

    static {
        int[] iArr = new int[KeyTemplate$OutputPrefixType.values().length];
        f63959b = iArr;
        try {
            iArr[KeyTemplate$OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f63959b[KeyTemplate$OutputPrefixType.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f63959b[KeyTemplate$OutputPrefixType.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f63959b[KeyTemplate$OutputPrefixType.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[OutputPrefixType.values().length];
        f63958a = iArr2;
        try {
            iArr2[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f63958a[OutputPrefixType.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f63958a[OutputPrefixType.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f63958a[OutputPrefixType.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
