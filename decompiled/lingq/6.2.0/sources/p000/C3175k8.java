package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: k8 */
/* JADX INFO: loaded from: classes.dex */
public final class C3175k8 {

    /* JADX INFO: renamed from: c */
    public static final C3175k8 f46839c = new C3175k8(new C3103i8[0]);

    /* JADX INFO: renamed from: d */
    public static final C3103i8 f46840d;

    /* JADX INFO: renamed from: a */
    public final int f46841a;

    /* JADX INFO: renamed from: b */
    public final C3103i8[] f46842b;

    static {
        C3103i8 c3103i8 = new C3103i8(-1, -1, new int[0], new pu5[0], new long[0], new String[0], new AbstractC3138j8[0]);
        int[] iArr = c3103i8.f43669e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c3103i8.f43670f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        pu5[] pu5VarArr = (pu5[]) Arrays.copyOf(c3103i8.f43668d, 0);
        String[] strArr = (String[]) Arrays.copyOf(c3103i8.f43671g, 0);
        AbstractC3138j8[] abstractC3138j8Arr = c3103i8.f43672h;
        f46840d = new C3103i8(0, c3103i8.f43666b, iArrCopyOf, pu5VarArr, jArrCopyOf, strArr, (AbstractC3138j8[]) Arrays.copyOf(abstractC3138j8Arr, Math.max(0, abstractC3138j8Arr.length)));
        uma.m22828w(1);
        uma.m22828w(2);
        uma.m22828w(3);
        uma.m22828w(4);
    }

    public C3175k8(C3103i8[] c3103i8Arr) {
        this.f46841a = c3103i8Arr.length;
        this.f46842b = c3103i8Arr;
    }

    /* JADX INFO: renamed from: a */
    public final C3103i8 m14950a(int i) {
        return i < 0 ? f46840d : this.f46842b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3175k8.class != obj.getClass()) {
            return false;
        }
        C3175k8 c3175k8 = (C3175k8) obj;
        return this.f46841a == c3175k8.f46841a && Arrays.equals(this.f46842b, c3175k8.f46842b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46842b) + (((this.f46841a * 29791) + 1) * 961);
    }

    public final String toString() {
        return AbstractC3393o1.m17734i("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
