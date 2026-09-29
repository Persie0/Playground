package p000;

import com.google.crypto.tink.proto.KeyStatusType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class r16 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58486a;

    static {
        int[] iArr = new int[KeyStatusType.values().length];
        f58486a = iArr;
        try {
            iArr[KeyStatusType.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f58486a[KeyStatusType.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f58486a[KeyStatusType.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
