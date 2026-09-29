package p000;

import com.facebook.FacebookRequestError;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class py2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f56976a;

    static {
        int[] iArr = new int[FacebookRequestError.Category.values().length];
        try {
            iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f56976a = iArr;
    }
}
