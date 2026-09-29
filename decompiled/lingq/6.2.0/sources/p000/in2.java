package p000;

import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class in2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f44301a;

    static {
        int[] iArr = new int[DurationUnit.values().length];
        try {
            iArr[DurationUnit.DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DurationUnit.HOURS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DurationUnit.MINUTES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DurationUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DurationUnit.MILLISECONDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DurationUnit.NANOSECONDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DurationUnit.MICROSECONDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f44301a = iArr;
    }
}
