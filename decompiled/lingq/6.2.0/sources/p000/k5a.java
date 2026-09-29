package p000;

import com.lingq.core.domain.model.status.TokenStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class k5a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f46738a;

    static {
        int[] iArr = new int[TokenStatus.values().length];
        try {
            iArr[TokenStatus.New.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TokenStatus.Recognized.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TokenStatus.Familiar.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TokenStatus.Learned.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f46738a = iArr;
    }
}
