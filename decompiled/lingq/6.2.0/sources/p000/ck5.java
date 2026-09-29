package p000;

import com.lingq.feature.onboarding.domain.LoginAuthType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ck5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10191a;

    static {
        int[] iArr = new int[LoginAuthType.values().length];
        try {
            iArr[LoginAuthType.FACEBOOK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoginAuthType.GOOGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LoginAuthType.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LoginAuthType.CODE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f10191a = iArr;
    }
}
