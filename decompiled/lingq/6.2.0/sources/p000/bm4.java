package p000;

import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class bm4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f8683a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f8684b;

    static {
        int[] iArr = new int[LanguageProgressPeriod.values().length];
        try {
            iArr[LanguageProgressPeriod.Today.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LanguageProgressPeriod.Last7Days.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LanguageProgressPeriod.Last14Days.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LanguageProgressPeriod.Last30Days.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LanguageProgressPeriod.ThisMonth.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LanguageProgressPeriod.LastMonth.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[LanguageProgressPeriod.Last3Months.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[LanguageProgressPeriod.Last6Months.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[LanguageProgressPeriod.AllTime.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f8683a = iArr;
        int[] iArr2 = new int[LanguageProgressInterval.values().length];
        try {
            iArr2[LanguageProgressInterval.Today.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[LanguageProgressInterval.Yesterday.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[LanguageProgressInterval.LastWeek.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[LanguageProgressInterval.LastTwoWeeks.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[LanguageProgressInterval.LastMonth.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[LanguageProgressInterval.LastThreeMonths.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[LanguageProgressInterval.LastSixMonths.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[LanguageProgressInterval.LastYear.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[LanguageProgressInterval.AllTime.ordinal()] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        f8684b = iArr2;
    }
}
