package p000;

import com.lingq.core.domain.model.status.TokenStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class k75 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f46813a;

    static {
        int[] iArr = new int[TokenStatus.values().length];
        try {
            iArr[TokenStatus.Ignored.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TokenStatus.Known.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f46813a = iArr;
    }
}
