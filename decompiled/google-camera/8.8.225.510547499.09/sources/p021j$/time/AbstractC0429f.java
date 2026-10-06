package p021j$.time;

import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;

/* JADX INFO: renamed from: j$.time.f */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0429f {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f32919a;

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ int[] f32920b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f32920b = iArr;
        try {
            iArr[ChronoUnit.DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32920b[ChronoUnit.WEEKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32920b[ChronoUnit.MONTHS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f32920b[ChronoUnit.YEARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f32920b[ChronoUnit.DECADES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f32920b[ChronoUnit.CENTURIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f32920b[ChronoUnit.MILLENNIA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f32920b[ChronoUnit.ERAS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[EnumC0472a.values().length];
        f32919a = iArr2;
        try {
            iArr2[EnumC0472a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f32919a[EnumC0472a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f32919a[EnumC0472a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f32919a[EnumC0472a.YEAR_OF_ERA.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f32919a[EnumC0472a.DAY_OF_WEEK.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f32919a[EnumC0472a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f32919a[EnumC0472a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f32919a[EnumC0472a.EPOCH_DAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f32919a[EnumC0472a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f32919a[EnumC0472a.MONTH_OF_YEAR.ordinal()] = 10;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f32919a[EnumC0472a.PROLEPTIC_MONTH.ordinal()] = 11;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f32919a[EnumC0472a.YEAR.ordinal()] = 12;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f32919a[EnumC0472a.ERA.ordinal()] = 13;
        } catch (NoSuchFieldError unused21) {
        }
    }
}
