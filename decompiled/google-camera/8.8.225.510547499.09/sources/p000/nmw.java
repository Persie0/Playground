package p000;

import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class nmw {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f43918a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f43918a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f43918a[RoundingMode.FLOOR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f43918a[RoundingMode.CEILING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f43918a[RoundingMode.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f43918a[RoundingMode.UP.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f43918a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f43918a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f43918a[RoundingMode.HALF_DOWN.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
    }
}
