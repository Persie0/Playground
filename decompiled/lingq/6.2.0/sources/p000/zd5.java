package p000;

import com.lingq.core.domain.model.user.LingQsOffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class zd5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f71387a;

    static {
        int[] iArr = new int[LingQsOffer.values().length];
        try {
            iArr[LingQsOffer.LimitOffer.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LingQsOffer.Day.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f71387a = iArr;
    }
}
