package p000;

import com.facebook.AccessTokenSource;

/* JADX INFO: renamed from: w2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3707w2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66236a;

    static {
        int[] iArr = new int[AccessTokenSource.values().length];
        try {
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f66236a = iArr;
    }
}
