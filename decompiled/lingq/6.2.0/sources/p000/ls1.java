package p000;

import com.lingq.core.domain.model.cup.CupPrizeSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ls1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f50067a;

    static {
        int[] iArr = new int[CupPrizeSource.values().length];
        try {
            iArr[CupPrizeSource.Reading.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CupPrizeSource.Listening.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CupPrizeSource.LingQ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f50067a = iArr;
    }
}
