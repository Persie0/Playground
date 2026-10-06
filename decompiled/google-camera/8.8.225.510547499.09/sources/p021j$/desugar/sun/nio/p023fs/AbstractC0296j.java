package p021j$.desugar.sun.nio.p023fs;

import p021j$.nio.file.EnumC0386b;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.j */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0296j {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f32786a;

    static {
        int[] iArr = new int[EnumC0386b.values().length];
        f32786a = iArr;
        try {
            iArr[EnumC0386b.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32786a[EnumC0386b.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32786a[EnumC0386b.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
