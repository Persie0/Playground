package dm;

import kotlin.reflect.KVariance;

/* JADX INFO: renamed from: dm.n */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5214n {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f33294a;

    static {
        int[] iArr = new int[KVariance.values().length];
        try {
            iArr[KVariance.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KVariance.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KVariance.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f33294a = iArr;
    }
}
