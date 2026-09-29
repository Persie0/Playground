package p000;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: loaded from: classes.dex */
public final class C3103i8 {

    /* JADX INFO: renamed from: a */
    public final int f43665a;

    /* JADX INFO: renamed from: b */
    public final int f43666b;

    /* JADX INFO: renamed from: c */
    public final Uri[] f43667c;

    /* JADX INFO: renamed from: d */
    public final pu5[] f43668d;

    /* JADX INFO: renamed from: e */
    public final int[] f43669e;

    /* JADX INFO: renamed from: f */
    public final long[] f43670f;

    /* JADX INFO: renamed from: g */
    public final String[] f43671g;

    /* JADX INFO: renamed from: h */
    public final AbstractC3138j8[] f43672h;

    static {
        AbstractC3393o1.m17746u(0, 1, 2, 3, 4);
        AbstractC3393o1.m17746u(5, 6, 7, 8, 9);
        uma.m22828w(10);
        uma.m22828w(11);
    }

    public C3103i8(int i, int i2, int[] iArr, pu5[] pu5VarArr, long[] jArr, String[] strArr, AbstractC3138j8[] abstractC3138j8Arr) {
        Uri uri;
        int i3 = 0;
        bna.m3969q(iArr.length == pu5VarArr.length);
        bna.m3969q(iArr.length == abstractC3138j8Arr.length);
        this.f43665a = i;
        this.f43666b = i2;
        this.f43669e = iArr;
        this.f43668d = pu5VarArr;
        this.f43670f = jArr;
        this.f43667c = new Uri[pu5VarArr.length];
        while (true) {
            Uri[] uriArr = this.f43667c;
            if (i3 >= uriArr.length) {
                this.f43671g = strArr;
                this.f43672h = abstractC3138j8Arr;
                return;
            }
            pu5 pu5Var = pu5VarArr[i3];
            if (pu5Var == null) {
                uri = null;
            } else {
                mu5 mu5Var = pu5Var.f56811b;
                mu5Var.getClass();
                uri = mu5Var.f51852a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m13715a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f43669e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3103i8.class != obj.getClass()) {
            return false;
        }
        C3103i8 c3103i8 = (C3103i8) obj;
        return this.f43665a == c3103i8.f43665a && this.f43666b == c3103i8.f43666b && Arrays.equals(this.f43668d, c3103i8.f43668d) && Arrays.equals(this.f43669e, c3103i8.f43669e) && Arrays.equals(this.f43670f, c3103i8.f43670f) && Arrays.equals(this.f43671g, c3103i8.f43671g) && Arrays.equals(this.f43672h, c3103i8.f43672h);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f43672h) + ((((Arrays.hashCode(this.f43670f) + ((Arrays.hashCode(this.f43669e) + ((Arrays.hashCode(this.f43668d) + (((this.f43665a * 31) + this.f43666b) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f43671g)) * 31)) * 31;
    }
}
