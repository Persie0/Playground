package p000;

import com.kochava.tracker.payload.internal.PayloadMethod;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k67 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f46769a;

    static {
        int[] iArr = new int[PayloadMethod.values().length];
        f46769a = iArr;
        try {
            iArr[PayloadMethod.Post.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f46769a[PayloadMethod.Get.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
