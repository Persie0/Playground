package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: oc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0871oc {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f45416a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f45416a = iArr;
        try {
            iArr[TimeUnit.MILLISECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f45416a[TimeUnit.SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f45416a[TimeUnit.MINUTES.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f45416a[TimeUnit.HOURS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f45416a[TimeUnit.DAYS.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
