package p021j$.time;

import p021j$.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: j$.time.h */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0460h {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f33002a;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f33002a = iArr;
        try {
            iArr[ChronoUnit.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33002a[ChronoUnit.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33002a[ChronoUnit.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f33002a[ChronoUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f33002a[ChronoUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f33002a[ChronoUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f33002a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
