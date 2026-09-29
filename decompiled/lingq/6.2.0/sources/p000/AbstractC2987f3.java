package p000;

import com.facebook.AccessTokenSource;

/* JADX INFO: renamed from: f3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2987f3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f38319a;

    static {
        int[] iArr = new int[AccessTokenSource.values().length];
        try {
            iArr[AccessTokenSource.INSTAGRAM_APPLICATION_WEB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccessTokenSource.INSTAGRAM_WEB_VIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f38319a = iArr;
    }
}
