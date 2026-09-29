package p000;

import com.lingq.core.domain.model.cup.CupPrizeSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class at1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f7453a;

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
        try {
            iArr[CupPrizeSource.KnownWord.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CupPrizeSource.All.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CupPrizeSource.None.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f7453a = iArr;
    }
}
