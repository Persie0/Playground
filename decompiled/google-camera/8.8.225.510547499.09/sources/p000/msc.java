package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class msc {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f41534a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f41534a = iArr;
        try {
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f41534a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f41534a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f41534a[TimeUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f41534a[TimeUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f41534a[TimeUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f41534a[TimeUnit.DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
    }
}
