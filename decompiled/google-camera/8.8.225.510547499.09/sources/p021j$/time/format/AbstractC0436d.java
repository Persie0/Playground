package p021j$.time.format;

/* JADX INFO: renamed from: j$.time.format.d */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0436d {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f32935a;

    static {
        int[] iArr = new int[EnumC0431B.values().length];
        f32935a = iArr;
        try {
            iArr[EnumC0431B.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32935a[EnumC0431B.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32935a[EnumC0431B.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f32935a[EnumC0431B.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
