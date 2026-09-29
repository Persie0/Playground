package p000;

import com.google.crypto.tink.proto.KeyStatusType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class yj4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f69910a;

    static {
        int[] iArr = new int[KeyStatusType.values().length];
        f69910a = iArr;
        try {
            iArr[KeyStatusType.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f69910a[KeyStatusType.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f69910a[KeyStatusType.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
