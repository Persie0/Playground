package p021j$.time;

import p021j$.time.temporal.EnumC0472a;

/* JADX INFO: renamed from: j$.time.n */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0466n {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f33019a;

    static {
        int[] iArr = new int[EnumC0472a.values().length];
        f33019a = iArr;
        try {
            iArr[EnumC0472a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33019a[EnumC0472a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
