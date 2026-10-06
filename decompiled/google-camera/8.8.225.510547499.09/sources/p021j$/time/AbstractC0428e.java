package p021j$.time;

import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;

/* JADX INFO: renamed from: j$.time.e */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0428e {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f32917a;

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ int[] f32918b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f32918b = iArr;
        try {
            iArr[ChronoUnit.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32918b[ChronoUnit.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32918b[ChronoUnit.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f32918b[ChronoUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f32918b[ChronoUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f32918b[ChronoUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f32918b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f32918b[ChronoUnit.DAYS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[EnumC0472a.values().length];
        f32917a = iArr2;
        try {
            iArr2[EnumC0472a.NANO_OF_SECOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f32917a[EnumC0472a.MICRO_OF_SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f32917a[EnumC0472a.MILLI_OF_SECOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f32917a[EnumC0472a.INSTANT_SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
