package p021j$.time.chrono;

import p021j$.time.temporal.EnumC0472a;

/* JADX INFO: renamed from: j$.time.chrono.e */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0423e {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f32914a;

    static {
        int[] iArr = new int[EnumC0472a.values().length];
        f32914a = iArr;
        try {
            iArr[EnumC0472a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32914a[EnumC0472a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
