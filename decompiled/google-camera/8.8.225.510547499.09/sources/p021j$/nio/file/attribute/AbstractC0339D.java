package p021j$.nio.file.attribute;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: j$.nio.file.attribute.D */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0339D {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f32836a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f32836a = iArr;
        try {
            iArr[TimeUnit.DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32836a[TimeUnit.HOURS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32836a[TimeUnit.MINUTES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f32836a[TimeUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f32836a[TimeUnit.MILLISECONDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f32836a[TimeUnit.MICROSECONDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f32836a[TimeUnit.NANOSECONDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
