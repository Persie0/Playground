package p021j$.time;

import p021j$.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: j$.time.d */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0427d {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f32916a;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f32916a = iArr;
        try {
            iArr[ChronoUnit.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32916a[ChronoUnit.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32916a[ChronoUnit.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f32916a[ChronoUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
